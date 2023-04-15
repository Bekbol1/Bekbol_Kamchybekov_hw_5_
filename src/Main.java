public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealthBoss(100);
        boss.setDamageBoss(25);
        boss.setTypeOfDefendBoss("armor");
        System.out.println("boss health: " + boss.getHealthBoss());
        System.out.println("boss damage: " + boss.getDamageBoss());
        System.out.println("boss defense type: " + boss.getTypeOfDefendBoss());
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("hero health: " + hero.getHealthHero());
            System.out.println("hero damage: " + hero.getDamageHero());
            System.out.println("hero superskill: " + hero.getSkillOfHero());
        }
    }

    public static Hero[] createHeroes() {
        Hero heroGandalf = new Hero(100, 20, "Magic");
        Hero heroLegolas = new Hero(80, 30, "BowShooting");
        Hero heroAragorn = new Hero(120, 15);
        return new Hero[]{heroAragorn, heroLegolas, heroGandalf};
    }
}