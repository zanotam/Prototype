package Prototyping.Core;

/**
 * The base class so that you can refer to a property of unknown type.
 */
public abstract class PropertyBase extends BaseClass
{
    public Class type;
    //basically lets property data be immutable... well not quite... but you can't change what the value points to.
    protected Object value;



    public Object getValue()
    {
        return value;
    }

    public Class getType() {
        return type;
    }
}
