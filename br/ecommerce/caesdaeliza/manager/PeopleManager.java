package br.ecommerce.caesdaeliza.manager;

import br.ecommerce.caesdaeliza.common.actors.PersonBase;
import br.ecommerce.caesdaeliza.exception.DataRegistryException;
import br.ecommerce.caesdaeliza.exception.DataRetrieveException;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/* @author Kopla-BR */
public final class PeopleManager {

    private static final Map<Integer, PersonBase> PERSON_REGISTRY;

    public static void RegistryPerson(@NotNull PersonBase object)
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

        if (PERSON_REGISTRY.containsKey(object))
        {
            throw new DataRegistryException("A product with ID " + object.getId() + " already exists.");
        }

        PERSON_REGISTRY.put(object.getId(), object);
    }

    public static boolean HasRegistry(int id)
    {
        return HasRegistry(id, null);
    }

    public static boolean HasRegistry(int id, Class<? extends PersonBase> type)
    {
        if (PERSON_REGISTRY.isEmpty() || !PERSON_REGISTRY.containsKey(id))
            return false;

        return type == null ? true : type.isInstance(PERSON_REGISTRY.get(id));
    }

    public static <T extends PersonBase> T GetPersonData(int id, @NotNull Class<T> type)
            throws DataRetrieveException
    {
        /* DB search routine. */

        if (PERSON_REGISTRY.isEmpty() || !PERSON_REGISTRY.containsKey(id))
            throw new DataRetrieveException("A client with a ID: " + id + " was not found.");

        PersonBase personBase = PERSON_REGISTRY.get(id);

        if (!type.isInstance(personBase)) {
            throw new DataRetrieveException("A incorrect type was specified to a person with ID: " + id);
        }

        return type.cast(personBase);
    }

    public static int GetNextRegistryID()
    {
        if (PERSON_REGISTRY.isEmpty())
            return 0;

        int number = 0;

        while (PERSON_REGISTRY.containsKey(number))
            number++;

        return number;
    }

    static {
        PERSON_REGISTRY = new HashMap<>();
    }
}
