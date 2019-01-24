package Prototyping.Main;

import Prototyping.Core.PropertyAttribute;
import Prototyping.Core.PropertyObject;

import java.util.*;

/**
 * The main prototype class. Note that some of the relevant definitions and code are elsewhere in other classes,
 * but this is where it all comes together and forms the core of the package.
 */
public class Prototype extends PrototypeBase
{
    public List<Prototype> containerList; //= new Vector<Prototype>(); //

    /**
     * @param properties
     * @param subObjects
     */
    public Prototype(Map<String, PropertyAttribute> properties, Map<Class, PropertyObject> subObjects) {
        super(properties, subObjects);
        containerList = new Vector<Prototype>();
    }

    /**
     *
     * @param father
     */
    public Prototype(Prototype father) {
        super(father);
        containerList = new Vector<Prototype>();
    }

    /**
     *
     */
    public Prototype() {
        super(PrototypeFather.getInstance());
        containerList = new Vector<Prototype>();
    }

    //these return true if the write was successful, false if the write was unsuccessful
    //once a property has been made it must be manually removed from the hash then the replacement written for now

    /**
     * adds the property if it doesn't already exist.
     *
     * @param soulProperty
     * @return
     */
    public boolean writeSoul(PropertyObject soulProperty) {
        boolean success = false;

        return success;
    }

    /**
     *
     * @param bodyPropertyName
     * @param bodyProperty
     * @return
     */
    public boolean writeBody(String bodyPropertyName, PropertyAttribute bodyProperty) {
        boolean success = false;

        return success;
    }

    /**
     *
     * @param key
     * @return
     */
    public PropertyObject searchSoul(Class key) {
        PropertyObject answer;
        answer = this.soul.get(key);
        if (answer == null) //keep searching parents if key goes nowhere
        {
            if (this.parent != PrototypeFather.getInstance()) //check for stop searching
            {
                answer = this.parent.searchSoul(key);
            }
        }
        return answer;
    }

    /**
     *
     * @param key
     * @return
     */
    public PropertyAttribute searchBody(String key) {
        PropertyAttribute answer;
        answer = this.body.get(key);
        if (answer == null) //keep searching parents if key goes nowhere
        {
            if (this.parent != PrototypeFather.getInstance()) //check for stop searching
            {
                answer = this.parent.searchBody(key);
            }
        }
        return answer;
    }


}
