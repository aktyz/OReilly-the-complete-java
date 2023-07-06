package Section7;

public class House {
    /**
     * Data at the class level are called fields
     * Specifically since each house gets its own instance/copy
     * we call these instance fields.
     */
    private int numStories;
    private int numWindows;
    private String color;

    /**
     * Instance/copy methods - that's why we do not add 'static' description
     * to them
     */
    public int getNumStories() {
        return numStories;
    }
    public void setNumStories(int numStories) {
        /**
         * name shadowing - using the 'this' keyword we don't need to come up with two different names
         * for the same parameter
         */
        this.numStories = numStories;
    }

    /**
     * Methods that set class values are called Mutators/Setters
     * Methods that get class values are called Accessors/Observers/Getters
     */
    public int getNumWindows() {
        return numWindows;
    }
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getColor() {
        return  color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * No-arg constructor (default constructor provided by Java for your class,
     * until you don't write any constructor in the class)
     */
    public House() {
        numStories = 1;
        numWindows = 4;
        color = "gray";
    }
    /**
     * Parametrized Constructor
     */
    public House(int numStories, int numWindows, String color) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    }
}
