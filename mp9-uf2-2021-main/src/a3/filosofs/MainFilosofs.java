package a3.filosofs;

public class MainFilosofs {
    public static void main(String[] args) {
        Cobert c0 = new Cobert();
        Cobert c1 = new Cobert();
        Cobert c2 = new Cobert();
        Cobert c3 = new Cobert();

        Filosof f0 = new Filosof("Aristoteles",c3,c0);
        Filosof f1 = new Filosof("Socrates",c0,c1);
        Filosof f2 = new Filosof("Parmenides",c1,c2);
        Filosof f3 = new Filosof("Heraclito",c2,c3);

    }
}
