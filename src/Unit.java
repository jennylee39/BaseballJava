public abstract class Unit {
    public Unit(int hp) {
        this.hp = hp;
    }

    private int hp;

    public int getHP() {
        return hp;
    }

    public void getDamaged(int damage){
        while (damage > 0 && hp > 0){
            damage--;
            hp--;
        }
    }
}