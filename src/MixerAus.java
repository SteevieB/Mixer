public class MixerAus implements Zustand {
    Mixer mixer;

    public MixerAus(Mixer mixer){
        this.mixer = mixer;
    }
    @Override
    public void einschalten() {
        if(mixer.behaelterGeschlossen){
            System.out.println("Mixer wird eingeschaltet");
            mixer.setZustand(mixer.getLangsamZustand());
        } else {
            System.out.println("Bitte Behälter schließen!");
        }
    }

    @Override
    public void ausschalten() {
        System.out.println("Mixer ist bereits aus!");
    }

    @Override
    public void knopfdruck1() {
        System.out.println("Knopf 1 wurde gedrückt");
        einschalten();
    }

    @Override
    public void knopfdruck2() {
        System.out.println("Knopf 2 wurde gedrückt");
        runterschalten();
    }

    @Override
    public void raufschalten() {
        System.out.println("Geschwindigkeit wird erhöht");
    }

    @Override
    public void runterschalten() {
        System.out.println("Mit dieser Aktion keine Zustandsänderung");
    }
}
