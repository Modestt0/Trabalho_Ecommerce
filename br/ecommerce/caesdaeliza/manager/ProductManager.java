package br.ecommerce.caesdaeliza.manager;

import br.ecommerce.caesdaeliza.common.product.ProductBase;
import br.ecommerce.caesdaeliza.exception.DataRegistryException;
import br.ecommerce.caesdaeliza.exception.DataRetrieveException;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/* @author Kopla-BR */
public final class ProductManager {

    private static final Map<Integer, ProductBase> PRODUCT_REGISTRY;

    public static void RegistryProduct(@NotNull ProductBase object)
            throws DataRegistryException
    {
        if (object == null)
        {
            throw new DataRegistryException("A null product was specified.");
        }

        if (object.getId() < 0)
        {
            throw new DataRegistryException("A product with a invalid ID was specified.");
        }

        if (PRODUCT_REGISTRY.containsKey(object.getId()))
        {
            throw new DataRegistryException("A product with ID " + object.getId() + " already exists.");
        }

        PRODUCT_REGISTRY.put(object.getId(), object);
    }

    public static boolean HasRegistry(int id) {
        return HasRegistry(id, null);
    }

    public static boolean HasRegistry(int id, Class<? extends ProductBase> type)
    {
        if (PRODUCT_REGISTRY.isEmpty() || !PRODUCT_REGISTRY.containsKey(id))
            return false;

        return type == null ? true : type.isInstance(PRODUCT_REGISTRY.get(id));
    }

    public static <T extends ProductBase> T GetProductData(int id, Class<T> type)
            throws DataRetrieveException
    {
        /* DB search routine. */

        if (PRODUCT_REGISTRY.isEmpty() || !PRODUCT_REGISTRY.containsKey(id))
            throw new DataRetrieveException("A product with a ID: " + id + " was not found.");

        ProductBase productBase = PRODUCT_REGISTRY.get(id);

        if (!type.isInstance(productBase)) {
            throw new DataRetrieveException("A incorrect type was specified to a product with ID: " + id);
        }

        return type.cast(productBase);
    }

    public static int GetNextRegistryID()
    {
        if (PRODUCT_REGISTRY.isEmpty())
            return 0;

        int number = 0;

        while (PRODUCT_REGISTRY.containsKey(number))
            number++;

        return number;
    }

    static {
        PRODUCT_REGISTRY = new HashMap<>();
    }
}
