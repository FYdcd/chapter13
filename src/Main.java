public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト", 40);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());

        King k = new King();
        k.talk(h);

        h.sleep();

        Matango m = new Matango('A', 50);
        h.attack(m);
    }
}
