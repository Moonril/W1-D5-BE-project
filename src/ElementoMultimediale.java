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



//commento per me: si poteva fare anche un metodo astratto esegui(); inserito nella superclasse. poi sovrascritto nelle sottoclassi. questo mi evitava di usare 'instance of' e 'cast' nel main.