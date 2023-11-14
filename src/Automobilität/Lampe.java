package Automobilität;

public class Lampe {

    private boolean leuchtet;
    public void Lampe() {
        this.leuchtet = false;
    }

    public void anschalten() {
        this.leuchtet = true;
    }

    public void ausschalten() {
        this.leuchtet = false;
    }

    public boolean getLeuchtet() {
        return this.leuchtet;
    }

}
