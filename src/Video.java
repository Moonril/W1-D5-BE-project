public class Video extends ElementoMultimediale implements ElementoRiproducibile{
    //variabili
    private int durata;
    private int luminosita = 5;
    private int volume = 5;

    //costruttore

    public Video(String titolo, int durata) {
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
        return "Video{" +
                "durata=" + durata +
                ", luminosita=" + luminosita +
                ", volume=" + volume +
                '}';
    }


    // get set

    public int getDurata() {
        return durata;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public int getVolume() {
        return volume;
    }


    // metodi - play

    @Override
    public void play() {
        String stelle = "*".repeat(this.luminosita);
        String esclamativi = "!".repeat(this.volume);
        for (int i = 0; i < durata; i++) {
            System.out.println("Riproduci video: " + this.getTitolo() + ", con luminosità: " + stelle + ", volume audio: " + esclamativi);
        }

    }


    // luminosità

    public int alzaLuminosita(){

        if (this.luminosita == 10){
            System.out.println("Luminosità immagine già al massimo!!!");
        } else {
            this.luminosita++;
        }
        return this.luminosita;
    }

    public int abbassaLuminosita(){
        if (this.luminosita == 0){
            System.out.println("Luminosità al minimo!!");
        } else {
            this.luminosita--;
        }
        return this.luminosita;
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

    //
}
