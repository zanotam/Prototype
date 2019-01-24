package Prototyping.Core;

/**
 * The base class, just so there's a shared class among properties and prototypes.
 */
public abstract class BaseClass
{
    public BaseClass parent;



    //basic stuff
    public BaseClass getParent()
    {
        return parent;
    }
    //not sure this is a good idea to have, but whatever
    public void setParent(BaseClass parent)
    {
        this.parent = parent;
    }

    //do nothing
    public PropertyObject searchSoul(Class key)
    {
        return null;
    }
    //do nothing
    public PropertyAttribute searchBody(String key)
    {
        return null;
    }
}
