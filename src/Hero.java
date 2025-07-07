public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public Hero(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp =hp;
    }
    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    public void seppuku() {
        System.out.println(this.name + "は切腹した！");
        this.die();
    }
    void sleep() {
        setHp(100);
        System.out.println("宿屋で回復中...");
        System.out.println(this.name + "の現在のHP: " + this.hp);
        System.out.println(this.name + "は眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けキノコ" + m.getSuffix() + "から100ポイントの反撃を受けた");
        setHp(getHp() - 100);
        if (getHp() <= 0) {
            die();
        }
    }
}
