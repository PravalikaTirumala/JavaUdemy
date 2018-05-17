public class EncapsuledPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EncapsuledPlayer(String name, int health, String weapon) {
        this.name = name;
        //w e can do valisdation
        if (health > 0 && health <= 100) {
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void lossOFHEalth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
