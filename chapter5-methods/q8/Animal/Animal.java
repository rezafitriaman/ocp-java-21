package Animal;

public class Animal {
    private final String type;
    private final String blood;
    private final boolean hasABackBone;
    // We use Constructor with Parameters becusae this instance variables is a constant and dont need to change.
    public Animal(String type, String blood, boolean hasABackBone) {
        this.type = type;
        this.blood = blood;
        this.hasABackBone = hasABackBone;
    }

    protected String getType() {
        return type;
    }

    public String getBlood() {
        return blood;
    }
}


// When to use Constructor with Parameters when:
// - All necessary information for the object is available at the time of creation.
// - You want to enforce the setting of certain fields to ensure the object is always in a valid state.
// - Creating immutable objects where fields should not change after initialization. - Ensure the object's immutability.

// Use Setter Methods when:
// - Fields are optional or their values may change over the object's lifecycle.
// - You need to perform validation or additional processing when setting a fields' value.
// - Allowing flexibility to modify the object's state after its creation is desired.
