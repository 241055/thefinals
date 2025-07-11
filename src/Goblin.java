public class Goblin extends Monster{
    public Goblin(char suffix, int hp) {
        super(char,int);
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + "はナイフで切り付けた!" + target.getname + "に8のダメージを与えた!");
        target.setHp(target.getHp()-8);
    }
}
