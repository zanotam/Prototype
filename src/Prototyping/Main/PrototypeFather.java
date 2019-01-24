package Prototyping.Main;

import Prototyping.Core.PropertyAttribute;
import Prototyping.Core.PropertyObject;

import java.util.*;

/**
 * The default father object roughly equivalent to father == nill for prototype objects.
 */
public class PrototypeFather extends Prototype
{
    private static PrototypeFather ourInstance = new PrototypeFather();

    public static PrototypeFather getInstance() {
        return ourInstance;
    }


    private PrototypeFather() {
        parent = ourInstance;
        soul = new LinkedHashMap<Class, PropertyObject>();
        body = new LinkedHashMap<String, PropertyAttribute>();
        containerList = new Vector<Prototype>();
    }
}
