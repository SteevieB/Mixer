public class MixerSchnell implements Zustand{
    Mixer mixer;
    public MixerSchnell(Mixer mixer){
        this.mixer = mixer;
    }
    @Override
    public void einschalten() {
        System.out.println("Mixer ist bereits an!");
    }

    @Override
    public void ausschalten() {
        System.out.println("Mixer wird ausgeschaltet");
    }

    @Override
    public void knopfdruck1() {
        System.out.println("Knopf 1 wurde gedrückt");
    }

    @Override
    public void knopfdruck2() {
        System.out.println("Knopf 2 wurde gedrückt");
        runterschalten();
    }

    @Override
    public void raufschalten() {
        System.out.println("Mit dieser Aktion keine Zustandsänderung");
    }

    @Override
    public void runterschalten() {
        System.out.println("Geschwindigkeit wird verringert");
        mixer.setZustand(mixer.getLangsamZustand());
    }
}
