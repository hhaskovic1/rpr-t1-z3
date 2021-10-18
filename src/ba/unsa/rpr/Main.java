package ba.unsa.rpr;

class Sat {
    int sati,minute,sekunde;
    public
    Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
    void Postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }
    void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
		else for (int i=0; i<-pomak; i++) Prethodni();
    }
    final int DajSate()  { return sati; }
    final int DajMinute()  { return minute; }
    final int DajSekunde()  { return sekunde; }

    final void Ispisi()  {
        System.out.print(sati+":"+sekunde+":"+sekunde+"\n");
    }
}

public class Main {

    public static void main(String[] args) {
        Sat s = new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();

    }
}
