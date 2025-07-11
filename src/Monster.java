public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public Monster(int hp, char suffix) {
        this.hp = hp;
        this.suffix = suffix;
    }
    public void setHp(int hp) {// 妥当性チェック
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.hp = hp;
    }
    public final boolean isAlive(){
        return this.hp>0;
    }
    public void showStatus(){
        System.out.println(this.name + ":HP "+ this.hp);
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public char getSuffix(){
        return suffix;
    }
}