public class RegistrazioneAudio extends ElementoMultimediale implements ElementoRiproducibile{
    //variabili
    private int durata = 1;
    private int volume = 5;


    //costruttore

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo);
        //per non avere mai una durata negativa o troppo grande
        if (durata >= 1 && durata <= 10) {
            this.durata = durata;
        } else {
            System.out.println("Valore volume non valido (deve essere tra 1 e 10) Valore di default: 5.");
        }
    }


    //tostring

    @Override
    public String toString() {
        return "RegistrazioneAudio{" +
                "durata=" + durata +
                ", volume=" + volume +
                '}';
    }


    // get set

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 1 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Valore volume non valido (deve essere tra 1 e 10). Valore non modificato.");
        }
    }

    //metodi -play

    @Override
    public void play() {
        String esclamativi = "!".repeat(this.volume);
        for (int i = 0; i < durata; i++) {
            System.out.println("Riproduci audio: " + this.getTitolo()  + ", volume audio: " + esclamativi);
        }

    }

    // volume

    @Override
    public int alzaVolume() {
        if (this.volume == 10){
            System.out.println("Il volume è già al massimo!!!");
        } else {
            this.volume++;
        }
        return this.volume;
    }

    @Override
    public int abbassaVolume() {
        if (this.volume == 0){
            System.out.println("Il volume è già al minimo!!!");
        } else {
            this.volume++;
        }
        return this.volume;
    }
}
