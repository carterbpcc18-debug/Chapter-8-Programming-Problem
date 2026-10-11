import java.util.ArrayList;

public class CyberDexApp {

    public static void main(String[] args) {
        FlameMonster flame =
            new FlameMonster("Blaze", 5);

        AquaMonster aqua =
            new AquaMonster("Splash", 4);

        StormBird storm =
            new StormBird("Thunderwing", 8);

        EarthMonster earth =
            new EarthMonster("Boulder", 6);

        ArrayList<DigitalMonster> monsters =
            new ArrayList<>();

        monsters.add(flame);
        monsters.add(aqua);
        monsters.add(storm);
        monsters.add(earth);

        System.out.println("Cyber-Dex Monster Catalog");
        System.out.println("-------------------------");

        for (DigitalMonster monster : monsters) {
            monster.performAttack();
        }

        System.out.println();
        System.out.println("Ability Scanner");
        System.out.println("---------------");

        for (DigitalMonster monster : monsters) {
            if (monster instanceof Flyable) {
                System.out.println(
                    monster.getName()
                    + " is capable of flight!"
                );

                ((Flyable) monster).fly();
            }
        }
    }
}