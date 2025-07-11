public class Wizard extends Character{
    int mp;
    public Wizard(String name,int hp,int mp){
        super(name,hp);
    }
    public void attack(Creature target) {
        System.out.println(this.getname + "火の玉を放った!");
        System.out.println(target.getname + "に3のダメージを与えた!");
        target.hp -= 3;
        this.mp -= 1;
    }
}