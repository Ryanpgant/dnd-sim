public class Character {
    private String name;
    private String classType; //This seems like a bad idea. Maybe classType should be its own object?
    private int level;
    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void useAbility(Ability ability) {

    }


}