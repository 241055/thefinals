public final class Slime extends Monster {
    public Slime(char suffix, int hp) {
        super(suffix,hp);
        super.setName("スライム");
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + "は体当たり攻撃!" + target.getName() + "に5のダメージを与えた!");
        target.setHp(target.getHp()-5);
    }
}