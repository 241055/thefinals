import java.util.ArrayList;

public class GameMaster {
    private ArrayList<Character> party = new ArrayList<>();
    private ArrayList<Monster> monsters = new ArrayList<>();
    public void startGame() {
        Hero hero = new Hero("勇者", 100);
        Wizard wizard = new Wizard("魔法使い", 60);
        Thief thief = new Thief("盗賊", 70);

        party.add(hero);
        party.add(wizard);
        party.add(thief);

        monsters.add(new Goblin("お化けキノコA",45));
        monsters.add(new Matango("ゴブリンA", 50));
        monsters.add(new Slime("スライムA", 40));

        System.out.println("---味方パーティ---");
        for (Character c : party) {
            c.showStatus();
        }
        System.out.println("---敵グループ---");
        for (Monster m : monsters) {
            m.showStatus();
        }
        System.out.println("\n味方の総攻撃!");
        for (Character c : party) {
            for (Monster m : monsters) {
                if (m.isAlive()) {
                    c.attack(m);
                }
            }
        }
        System.out.println("\n敵の総攻撃!");
        for (Monster m : monsters) {
            for (Character c : party) {
                if (c.isAlive()) {
                    m.attack(c);
                }
            }
        }
        System.out.println("\n=== クラスチェンジイベント ===");
        SuperHero superHero = new SuperHero(hero.getName(), hero.getHp(), hero.getPower() + 20);
        party.set(0, superHero);
        // SuperHeroによる再攻撃
        System.out.println("\n=== SuperHeroの強力な攻撃 ===");
        for (Monster m : monsters) {
            if (m.isAlive()) {
                superHero.attack(m);
            }
        }
        System.out.println("\n=== 最終ステータス ===");
        System.out.println("味方：");
        for (Character c : party) {
            c.showStatus();
            System.out.println(c.isAlive() ? "→ 生存" : "→ 戦闘不能");
        }
        System.out.println("敵：");
        for (Monster m : monsters) {
            m.showStatus();
            System.out.println(m.isAlive() ? "→ 生存" : "→ 討伐済み");
        }
    }
    public static void main(String[] args) {
        GameMaster gm = new GameMaster();
        gm.startGame();
    }
}
