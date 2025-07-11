public class Hero extends Character{
    String weapon;
    public Hero(String name,int hp,String weapon){
        super(name,hp);
        this.setWeapon(weapon);
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void attack(Creature target){
        System.out.println(this.getName() + "は" + this.weapon + "で攻撃!" + target.getName() + "に10のダメージを与えた!");
        target.hp -= 10;
    }
    public void heal(){
        System.out.println(this.getName() + "は回復呪文を唱えた!HPが20回復した!");
        this.hp += 20;
    }
}
