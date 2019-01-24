package Prototyping.Core;

/**
 * The object-based property class. These are used to hold objects that are used to create a multiple inheritance
 * type of object via composition.
 */
public class PropertyObject extends PropertyBase
{



    public PropertyObject(Object valuation)
    {
        this.value = valuation;
        this.type = value.getClass();
        this.parent = PropertyFather.getInstance();
    }
}
