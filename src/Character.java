public abstract class Character implements Creature {
    private String name;
    private int hp;
    public Character(String name,int hp) {

        this.name = name;
        setHp(hp);
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
    }
    public void setHp(int hp) {// 妥当性チェック
        this.hp = hp;
    }
    public final boolean isAlive(){
        return this.hp>0;
    }
    public void showStatus(){
        System.out.println(this.getName() + ":HP "+ this.getHp());
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
}