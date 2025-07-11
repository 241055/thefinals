public class Slime {
    public Slime(String name, int hp) {
        super(name, hp);
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + "は体当たり攻撃!" + target.name + "に5のダメージを与えた!");
        target.hp -= 5;
    }
}
