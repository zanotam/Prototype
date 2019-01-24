/*
    loosely based off of Json. This is the 'readable code' half of the JSON (the property itself) and not the naming
    portion which could be implemented a variety of ways but in this project we choose to use string names to hook up
    to the string values.
 */
package Prototyping.Core;

public class PropertyAttribute extends PropertyBase
{
    public String value;
    protected Object origin;



    public PropertyAttribute (Object valuation)
    {
        this.origin = valuation;
        this.value = origin.toString();
        this.type = origin.getClass();
    }

    public String getValue() {
        return value;
    }
    /*atm this is bad code and I'm not sure if I need to modify it or exclude it.
    public void setValue(Object value) {
        this.value = type;
    }
    */
}
