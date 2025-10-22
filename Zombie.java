public class Zombie extends Character{
    
    public Zombie(String name) {
        super(name, 12);
    }

    @Override 
    public void printDetails() {
        System.out.println("A zombie " + name + "with " + hitPoints + " HP");
    }

    @Override
    public void attack(Character target) {
        int damage;
        if (hitPoints == 12) {
            damage = 8; }
        else if (hitPoints < 12 && hitPoints >= 6) {
            damage = 5;
        }
        else { damage = 3 ;}
        System.out.println("Zombie " + name + " bites " + target.name + " for " + damage + " damage!");
    }
}

