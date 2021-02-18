package a3.potdegaletes;

public class Pot {
    boolean libre;
    int num;

    public Pot() {
        libre = true;
        num = 10;
    }

    public  synchronized int getNum() {
        return num;
    }
    public synchronized void agafarG(){
        try {
            while(!libre) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        libre = false;
        num--;
        notifyAll();

    }

    public synchronized void posarG(){
        try {
            while(!libre) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        libre = false;

            num = num + 10;

        notifyAll();
    }

    public synchronized void deixar() {
        libre = true;

        notifyAll();
    }
}

