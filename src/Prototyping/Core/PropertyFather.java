/*
    The base parent for properties so they don't have to use AllFather.
 */
package Prototyping.Core;

public class PropertyFather extends PropertyBase
{
    private static PropertyFather ourInstance = new PropertyFather();

    private PropertyFather() {
        this.value = this;
        this.type = this.value.getClass();
    }

    public static PropertyFather getInstance() {
        return ourInstance;
    }
}
