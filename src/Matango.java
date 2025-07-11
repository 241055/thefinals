public class Matango extends Monster {
    public Matango(String name, int hp) {
        super(name, hp);
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + "は体当たり攻撃!" + target.getName() + "に6のダメージを与えた!");
        target.setHp(target.getHp()-6);
    }
}
