package by.tc.task01.entity;

/**
 * Represents abstract appliance
 */
public abstract class Appliance {
    /**
     * Returns true if appliance satisfies the given search criteria
     * @param key field to satisfy for
     * @param value value of field
     * @return true if appliance satisfies the given criteria, false otherwise
     */
    public abstract boolean satisfy(String key, Object value);
}
