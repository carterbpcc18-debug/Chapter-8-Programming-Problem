public class EarthMonster extends DigitalMonster {

    public EarthMonster(String name, int level) {
        super(name, level, "Earth");
    }

    @Override
    public void performAttack() {
        System.out.println(
            getName() + " (Level " + getLevel()
            + ") uses Rock Smash!"
        );
    }
}