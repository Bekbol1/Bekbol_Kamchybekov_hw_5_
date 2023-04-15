public class Boss {
    private int healthBoss;
    private int damageBoss;
    private String typeOfDefendBoss;

    public Boss() {
    }

    public String getTypeOfDefendBoss() {
        return this.typeOfDefendBoss;
    }

    public void setTypeOfDefendBoss(String typeOfDefendBoss) {
        this.typeOfDefendBoss = typeOfDefendBoss;
    }

    public int getHealthBoss() {
        return this.healthBoss;
    }

    public void setHealthBoss(int healthBoss) {
        this.healthBoss = healthBoss;
    }

    public int getDamageBoss() {
        return this.damageBoss;
    }

    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }
}
