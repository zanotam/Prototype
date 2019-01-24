package Prototyping.Core;

import org.jetbrains.annotations.Contract;

/**
 * This provides the important first 'bottom' for the class hierarchy. Prototypes have their own version of allfather,
 * but Properties do not so you may actually accidentally run into this class when iterating.
 */

public class AllFather extends BaseClass {
    private static AllFather ourInstance = new AllFather();

    protected AllFather() {
        parent = ourInstance;
    }

    @Contract(pure = true)
    public static AllFather getInstance()
    {
        return ourInstance;
    }



    @java.lang.Override
    public BaseClass getParent()
    {
        return parent;
    }
    @java.lang.Override
    public void setParent(BaseClass parent)
    {
        /* do nothing! */
        return;
    }
}
