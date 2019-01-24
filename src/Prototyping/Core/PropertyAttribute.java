package Prototyping.Core;

/**
 * loosely based off of Json. This is the 'readable code' half of the JSON (the property itself)
 * and not the naming portion which could be implemented a variety of ways but in this project we choose to use string
 * names to hook up to the string values.
 */
public class PropertyAttribute extends PropertyBase
{
    protected String value;

    /**
     * @param valuation
     */
    public PropertyAttribute(Object valuation) {
        this.value = valuation.toString();
        this.type = value.getClass();
        this.parent = PropertyFather.getInstance();
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return value;
    }
}
