public class Immagine extends ElementoMultimediale{
    //variabili
    private int luminosita = 5;

    //costruttore

    public Immagine(String titolo) {
        super(titolo);

    }


    //tostring

    @Override
    public String toString() {
        return "Immagine{" +
                "luminosita=" + luminosita +
                '}';
    }


    // get set

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        if (luminosita >= 1 && luminosita <= 10) {
            this.luminosita = luminosita;
        } else {
            System.out.println("Valore luminosità non valido (deve essere tra 1 e 10). Valore di default: 5.");
        }
    }
//metodi - show

    public void show(){
        String stelle = "*".repeat(this.luminosita);
        System.out.println("Mostra immagine: " + this.getTitolo() + ", luminosità: " + stelle);
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


}
