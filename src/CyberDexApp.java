public class CyberDexApp {

    public static void main(String[] args) {
        FlameMonster flame =
            new FlameMonster("Blaze", 5);

        AquaMonster aqua =
            new AquaMonster("Splash", 4);

        StormBird storm =
            new StormBird("Thunderwing", 8);

        System.out.println("Cyber-Dex Monster Attacks");
        System.out.println("-------------------------");

        flame.performAttack();
        aqua.performAttack();
        storm.performAttack();

        System.out.println();
        System.out.println("Special Abilities");
        System.out.println("-----------------");

        storm.fly();
        storm.shock();
    }
}