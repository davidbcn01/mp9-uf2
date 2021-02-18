package a3.potdegaletes;

public class Pare extends Thread {
    Pot p;

    public Pare(Pot pot, String nom) {
        super(nom);
        p = pot;
    }

    @Override
    public void run() {
        for (; ; ) {
            if (p.getNum() == 0) {
                System.out.println("Uy, no quedan galletas , que gordos son mis hijos");
                p.posarG();
                System.out.println("Ale, ya tienen pa comer");
                p.deixar();

            }
        }
    }
}
