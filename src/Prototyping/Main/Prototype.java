/*
    The main prototype class. Note that some of the relevant definitions and code are elsewhere in other classes,
    but this is where it all comes together and forms the core of the package.
 */
package Prototyping.Main;

import Prototyping.Core.PropertyAttribute;
import Prototyping.Core.PropertyObject;

import java.util.*;

public class Prototype extends PrototypeBase
{
    public Prototype parent;
    public List<Prototype> containerList //= new Vector<Prototype>(); //



    public Prototype(Map<String, PropertyAttribute> properties, Map<Class, PropertyObject> subObjects) {
        super(properties, subObjects);
        parent = PrototypeFather.getInstance();
        containerList = new Vector<Prototype>();
    }
    public Prototype(Prototype father)
    {
        super(father);
        containerList = new Vector<Prototype>();
    }
    public Prototype()
    {
        super();
        parent = PrototypeFather.getInstance();
        containerList = new Vector<Prototype>();
    }



    public void writeSoul(Prototype soulProperty)
    {
        super.writeSoul(soulProperty);
    }

}
