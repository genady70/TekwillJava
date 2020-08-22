import javax.sound.midi.Soundbank;

public class Angajat {
    String nume="Ion";
    int virsta=25;

    public String getNume() {
        return nume;
    }

    public int getVirsta() {
        return virsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVirsta(int virsta) {
        this.virsta = virsta;
    }
    void printNume(){
        System.out.print(nume+"  "+virsta);
    }
}
