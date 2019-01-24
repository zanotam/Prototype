/*
    The base class so that you can refer to a property of unknown type.
 */
package Prototyping.Core;

import Prototyping.Core.Allfather;

public class PropertyBase extends Allfather
{
    public Class type;
    protected Object value;



    public Object getValue()
    {
        return value;
    }
}
