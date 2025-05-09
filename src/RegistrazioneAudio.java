public class RegistrazioneAudio extends ElementoMultimediale implements ElementoRiproducibile{
    //variabili
    private int durata;
    private int volume = 5;


    //costruttore

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo);
        //per non avere mai una durata negativa o troppo grande
        if (durata < 1 ) {
            throw new IllegalArgumentException("La durata deve essere un numero positivo!");
        } else if (durata > 10) {
            throw new IllegalArgumentException("Durata eccessiva, massimo 10 minuti!");
        }
        this.durata = durata;
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
