package Prototyping.Core;

/**
 * The base parent for properties so they don't have to use AllFather.
 */
public class PropertyFather extends PropertyBase
{
    private static PropertyFather ourInstance = new PropertyFather();

    /**
     *
     */
    private PropertyFather() {
        this.value = this;
        this.type = this.value.getClass();
        this.parent = this;
    }

    /**
     * @return
     */
    public static PropertyFather getInstance() {
        return ourInstance;
    }
}
