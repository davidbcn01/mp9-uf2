package a3.potdegaletes;

import a3.Comandament.MembreFamilia;

public class JuegosDelHambre {
    public static void main(String[] args) {
        Pot pot = new Pot();
        Fill Joan = new Fill(pot,"Joan");
        Fill Anna = new Fill(pot,"Anna");
        Fill Pere = new Fill(pot,"Pere");
        Pare Xiscu = new Pare(pot,"Xiscu");
        Joan.start();
        Anna.start();
        Pere.start();
        Xiscu.start();
    }
}
