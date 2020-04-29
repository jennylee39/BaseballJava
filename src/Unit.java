public abstract class Unit {
    public Unit(int hp)
    {
        this.hp = hp;
        speed = 3;
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

    protected int speed;

    protected String getUnitName(){
        return "John Doe";
    }

    public String getStatus(){
        return getUnitName() +  " HP:" + getHP();
    }
}