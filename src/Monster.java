public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public Monster(char suffix,int hp) {
        this.setSuffix(suffix);
        this.setHp(hp);
        if(hp<0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
    }
    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }
    public int getHp(){
        return hp;
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
    public char getSuffix(){
        return suffix;
    }
    public final boolean isAlive(){
        return this.hp>0;
    }
    public void setSuffix(char suffix){
        this.suffix = suffix;
    }
}