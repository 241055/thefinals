public class Wizard extends Character{
    int mp;
    public Wizard(String name,int hp,int mp){
        super(name,hp);
    }
    public void attack(Creature target) {
        System.out.print(this.getName() + "火の玉を放った!");
        System.out.println(target.getName() + "に3のダメージを与えた!");
        target.setHp(target.getHp()-3);
        this.mp -= 1;
    }
}