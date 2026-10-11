public class StormBird extends DigitalMonster
        implements Flyable, Electric {

    public StormBird(String name, int level) {
        super(name, level, "Electric");
    }

    @Override
    public void performAttack() {
        System.out.println(
            getName() + " (Level " + getLevel()
            + ") uses Thunder Strike!"
        );
    }

    @Override
    public void fly() {
        System.out.println(getName() + " takes flight!");
    }

    @Override
    public void shock() {
        System.out.println(getName() + " releases electricity!");
    }
}