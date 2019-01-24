/*
    The object-based property class. These are used to hold objects that are used to create a multiple inheritance
    type of object via composition.
 */
package Prototyping.Core;

import Prototyping.Core.PropertyBase;

public class PropertyObject extends PropertyBase
{



    public PropertyObject(Object valuation)
    {
        this.value = valuation;
        this.type = value.getClass();
    }
}
