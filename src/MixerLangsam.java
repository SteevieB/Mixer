public class MixerLangsam implements Zustand{
    Mixer mixer;
    public MixerLangsam(Mixer mixer){ this.mixer = mixer; }
    @Override
    public void einschalten() {
        System.out.println("Mixer ist bereits an!");
    }

    @Override
    public void ausschalten() {
        System.out.println("Mixer wird ausgeschaltet");
        mixer.setZustand(mixer.getAusZustand());
    }

    @Override
    public void knopfdruck1() {
        System.out.println("Knopf 1 wurde gedrückt");
        ausschalten();
    }

    @Override
    public void knopfdruck2() {
        System.out.println("Knopf 2 wurde gedrückt");
        raufschalten();
    }

    @Override
    public void raufschalten() {
        System.out.println("Geschwindigkeit wird erhöht");
        mixer.setZustand(mixer.getSchnellZustand());
    }

    @Override
    public void runterschalten() {
        ausschalten();
    }
}
