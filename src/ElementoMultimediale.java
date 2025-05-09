public abstract class ElementoMultimediale {
    //variabili
    private String titolo;

    //costruttore

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }


    //tostring

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }


    // get set
    //per ora solo getter di titolo. non credo serva il setter


    public String getTitolo() {
        return titolo;
    }
}
