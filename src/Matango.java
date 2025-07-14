public class Matango extends Monster {
    public Matango(char suffix, int hp) {
        super(suffix, hp);
        super.setName("お化けキノコ");
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + "は体当たり攻撃!" + target.getName() + "に6のダメージを与えた!");
        target.setHp(target.getHp()-6);
    }
}