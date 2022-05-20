public class Mixer {
    Zustand MixerAus;
    Zustand MixerLangsam;
    Zustand MixerSchnell;

    Zustand zustand;

    Boolean behaelterGeschlossen = true;

    public Mixer(){
        MixerAus     = new MixerAus(this);
        MixerLangsam = new MixerLangsam(this);
        MixerSchnell = new MixerSchnell(this);

        zustand = MixerAus;
    }

    public void setZustand(Zustand z){
        this.zustand = z;
    }

    public Zustand getAusZustand() { return MixerAus; }
    public Zustand getLangsamZustand() { return MixerLangsam; }
    public Zustand getSchnellZustand() { return MixerSchnell; }

    public void umschalten(Zustand z){}
    public void knopfdruck1(){
        zustand.knopfdruck1();
    }
    public void knopfdruck2(){
        zustand.knopfdruck2();
    }
    public void einschalten(){
        zustand.einschalten();
    }
    public void ausschalten(){
        zustand.ausschalten();
    }
}
