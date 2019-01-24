package Prototyping.Main;

import Prototyping.Core.BaseClass;
import Prototyping.Core.PropertyAttribute;
import Prototyping.Core.PropertyObject;

import java.util.*;

/**
 * Basically an abstract class for most intents and purposees, but with some basic implementation included
 * in case someone else wants to use this and doesn't want the containerList field in the Prototype class.
 */
public abstract class PrototypeBase extends BaseClass {
    public PrototypeBase parent;
    public Map<Class, PropertyObject> soul; //sorta like.... supertypes with instantiation. Or implemented interfaces
    public Map<String, PropertyAttribute> body; //inspired by JSON but for now just the equivalent of String->String



    public PrototypeBase(Map<String, PropertyAttribute> properties, Map<Class, PropertyObject> subObjects)
    {
        this.parent = PrototypeFather.getInstance();
        this.soul = subObjects;
        this.body = properties;
    }
    public PrototypeBase(PrototypeBase father)
    {
        this.parent = father;
        soul = new LinkedHashMap<Class, PropertyObject>();
        body = new LinkedHashMap<String, PropertyAttribute>();

    }
    public PrototypeBase()
    {
        parent = PrototypeFather.getInstance();
        soul = new LinkedHashMap<Class, PropertyObject>();
        body = new LinkedHashMap<String, PropertyAttribute>();
    }


    public abstract boolean writeSoul(PropertyObject soulProperty);

    public abstract boolean writeBody(String bodyPropertyName, PropertyAttribute bodyProperty);


    public abstract PropertyObject searchSoul(Class key);

    public abstract PropertyAttribute searchBody(String key);

}
