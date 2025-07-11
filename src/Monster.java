public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public Monster(char suffix,int hp) {
        this.suffix = suffix;
        this.setHp(hp);
        this.name = "モンスター";
    }
    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.hp = hp;
    }
    public final boolean isAlive(){
        return this.hp>0;
    }
    public void showStatus(){
        System.out.println(this.getName() + this.getSuffix()+ ":HP "+ this.getHp());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHp(){
        return hp;
    }
    public void setSuffix(char suffix){
        this.suffix = suffix;
    }
    public char getSuffix(){
        return suffix;
    }
}