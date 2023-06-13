package br.ecommerce.caesdaeliza.manager;

import br.ecommerce.caesdaeliza.common.transaction.Transaction;
import br.ecommerce.caesdaeliza.exception.DataRetrieveException;
import br.ecommerce.caesdaeliza.exception.DataRegistryException;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/* @author Kopla-BR */
public final class TransactionManager {

    private static final Map<Integer, Transaction> TRANSACTION_REGISTRY;

    public static void RegistryTransaction(@NotNull Transaction object)
            throws DataRegistryException
    {
        if (object == null)
        {
            throw new DataRegistryException("A null transaction object was specified.");
        }

        if (object.getId() < 0)
        {
            throw new DataRegistryException("A transaction with a invalid ID was specified.");
        }

        if (TRANSACTION_REGISTRY.containsKey(object.getId()))
        {
            throw new DataRegistryException("A transaction with ID " + object.getId() + " already exists.");
        }

        TRANSACTION_REGISTRY.put(object.getId(), object);
    }

    public static boolean HasRegistry(int id)
    {
        return TRANSACTION_REGISTRY.containsKey(id);
    }

    public static Transaction GetTransactionData(int id)
            throws DataRetrieveException
    {
        /* DB search routine. */

        if (TRANSACTION_REGISTRY.isEmpty() || !TRANSACTION_REGISTRY.containsKey(id))
            throw new DataRetrieveException("A transaction with a ID: " + id + " was not found.");

        return TRANSACTION_REGISTRY.get(id);
    }

    public static int GetNextRegistryID()
    {
        if (TRANSACTION_REGISTRY.isEmpty())
            return 0;

        int number = 0;

        while (TRANSACTION_REGISTRY.containsKey(number))
            number++;

        return number;
    }

    static {
        TRANSACTION_REGISTRY = new HashMap<>();
    }
}
