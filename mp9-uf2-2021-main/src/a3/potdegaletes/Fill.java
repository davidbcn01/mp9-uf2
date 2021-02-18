package a3.potdegaletes;

public class Fill extends  Thread {
    Pot p;

    public Fill(Pot pot, String nom) {
        super(nom);
        p = pot;
    }

    @Override
    public void run() {
        for (;;) {
            if (p.getNum() > 0) {
                System.out.println("Tengo hambre, voy a comerme una galletita");
                p.agafarG();
                try {
                    Thread.sleep((long) (Math.random() * 3000) + 2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.deixar();
            }
        }
    }
}
