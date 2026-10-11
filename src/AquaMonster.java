public class AquaMonster extends DigitalMonster {

    public AquaMonster(String name, int level) {
        super(name, level, "Water");
    }

    @Override
    public void performAttack() {
        System.out.println(
            getName() + " (Level " + getLevel()
            + ") uses Water Blast!"
        );
    }
}