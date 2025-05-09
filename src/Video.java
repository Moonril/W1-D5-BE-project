public class Video extends ElementoMultimediale implements ElementoRiproducibile{
    //variabili
    private int durata = 1;
    private int luminosita = 5;
    private int volume = 5;

    //costruttore

    public Video(String titolo, int durata) {
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

    public void setLuminosita(int luminosita) {
        if (luminosita >= 1 && luminosita <= 10) {
            this.luminosita = luminosita;
        } else {
            System.out.println("Valore luminosità non valido (deve essere tra 1 e 10). Valore di default: 5.");
        }
    }

    public void setVolume(int volume) {
        if (volume >= 1 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Valore volume non valido (deve essere tra 1 e 10). Valore di default: 5.");
        }
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
