public class Matango {
    private int hp;
    private final int LEVEL = 10;
    private char suffix;

    public Matango(char suffix, int hp) {
        this.suffix = suffix;
        this.hp = hp;
    }

    public char getSuffix() {
        return this.suffix;
    }

    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
