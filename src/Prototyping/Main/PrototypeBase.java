/*
    Basically an abstract class for most intents and purposees, but with some basic implementation included
    in case someone else wants to use this and doesn't want the containerList field in the Prototype class.
 */
package Prototyping.Main;

import java.util.*;

import Prototyping.Core.*;

public class PrototypeBase extends Allfather
{
    public BaseClass parent;
    public Map<Class, PropertyObject> soul; //sorta like.... supertypes with instantiation
    public Map<String, PropertyAttribute> body; //basically just JSON data but... heavier.



    public PrototypeBase(Map<String, PropertyAttribute> properties, Map<Class, PropertyObject> subObjects)
    {
        this.parent = Allfather.getInstance();
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
        parent = Allfather.getInstance();
        soul = new LinkedHashMap<Class, PropertyObject>();
        body = new LinkedHashMap<String, PropertyAttribute>();
    }



    //add event that fires telling the object involved that it's being put in the soul
    public void writeSoul(PropertyObject soulProperty)
    {

    }// see above
    public void writeSoul(PrototypeBase soulProperty)
    {

    }

    public void writeBody(String bodyPropertyName, PropertyAttribute bodyProperty)
    {

    }
    public void writeBody(String bodyPropertyName, Object bodyProperty)
    {

    }


    public PropertyObject searchSoul(Class key)
    {
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

    public PropertyAttribute searchBody(String key)
    {
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
