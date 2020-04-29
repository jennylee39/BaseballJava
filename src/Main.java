import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Unit m1 = new Marine();
        Unit f1 = new Firebat();
        Unit z1 = new Zealot();


        getDamagedSeveralTimes(z1, 3);
        getDamagedSeveralTimes(f1, 3);
    }

    private static void getDamagedSeveralTimes(Unit unit, int times) {
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            int damage = random.nextInt(3) + 1;
            System.out.print("[D]" + damage + " -> ");
            unit.getDamaged(damage);

            if (unit.getHP() == 0) {
                System.out.println("dead");
                break;
            } else {
                if (unit instanceof ProtossUnit){
                    ProtossUnit protossUnit = (ProtossUnit) unit;
                    System.out.println(unit.getHP() + "/" + protossUnit.getShield());
                }
                else
                    System.out.println(unit.getHP());
            }
        }
    }
}