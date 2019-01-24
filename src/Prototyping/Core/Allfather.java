/*
    This provides the important first 'bottom' for the class hierarchy. Prototypes have their own version of allfather,
    but Properties do not so you may actually accidentally run into this class when iterating.
 */
package Prototyping.Core;

import org.jetbrains.annotations.Contract;

public class Allfather extends BaseClass
{
    private static Allfather ourInstance = new Allfather();
    @Contract(pure = true)
    public static Allfather getInstance()
    {
        return ourInstance;
    }



    protected Allfather()
    {
        parent = ourInstance;
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
