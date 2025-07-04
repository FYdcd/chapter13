public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.hp = 40;
        h.name = "ミナト";
        System.out.println(h.name + "の現在のHP: " + h.hp);

        Inn i = new Inn();
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        System.out.println(h.name + "の現在のHP: " + h.hp);

        King k = new King();
        k.talk(h);
    }
}
