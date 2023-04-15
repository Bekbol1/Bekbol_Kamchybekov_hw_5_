public class Hero {
    private final int healthHero;
    private final int DamageHero;
    private String skillOfHero;

    public int getHealthHero() {
        return this.healthHero;
    }

    public int getDamageHero() {
        return this.DamageHero;
    }

    public String getSkillOfHero() {
        return this.skillOfHero;
    }

    public Hero(int health, int damage, String superpower) {
        this.healthHero = health;
        this.DamageHero = damage;
        this.skillOfHero = superpower;
    }

    public Hero(int health, int damage) {
        this.healthHero = health;
        this.DamageHero = damage;
    }
}