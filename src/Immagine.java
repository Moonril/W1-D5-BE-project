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
        this.luminosita = luminosita;
    }

    //metodi - show

    public void show(){
        String stelle = "*".repeat(this.luminosita);
        System.out.println("Mostra immagine: " + this.getTitolo() + " , luminosità: " + stelle);
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
