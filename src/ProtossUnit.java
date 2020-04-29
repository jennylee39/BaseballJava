public class ProtossUnit extends Unit {
    public ProtossUnit(int hp, int shield) {
        super(hp);
        this.shield = shield;
    }

    private int shield;

    public int getShield() {
        return shield;
    }

    @Override
    public void getDamaged(int damage) {
        while (damage >0 && shield > 0){
            damage--;
            shield--;
        }

        super.getDamaged(damage);
    }
}