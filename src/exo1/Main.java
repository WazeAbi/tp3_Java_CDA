package exo1;

public class Main {
    public static void main(String[] args) {
        Chien toutou = new Chien();
        toutou.setName("michel");
        System.out.println(toutou.Cri());
        System.out.println(toutou.getName());
        System.out.println(toutou.toString());
        Chat minou = new Chat();
        minou.setName("Robert");
        System.out.println(minou.Félin());
    }
}
