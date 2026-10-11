public abstract class DigitalMonster {
    private String name;
    private int level;
    private String element;

    public DigitalMonster(String name, int level, String element) {
        this.name = name;
        this.level = level;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getElement() {
        return element;
    }

    public abstract void performAttack();
}