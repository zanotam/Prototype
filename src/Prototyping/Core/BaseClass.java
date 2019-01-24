package Prototyping.Core;

/**
 * The base class, just so there's a shared class among properties and prototypes.
 */
public abstract class BaseClass
{
    public BaseClass parent;

    /**
     * basic stuff
     *
     * @return
     */
    public BaseClass getParent()
    {
        return parent;
    }

    /**
     * not sure this is a good idea to have, but whatever
     * @param parent
     */
    public void setParent(BaseClass parent)
    {
        this.parent = parent;
    }
}
