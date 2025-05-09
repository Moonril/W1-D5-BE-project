import java.util.Scanner;

public class PlayerMultimediale {
    public static void main(String[] args) {

        // creiamo istanze per vedere se funzionano

        // immagini - video - audio

        System.out.println(" ----- prova -----");

        Immagine fotoGatto = new Immagine("Foto di un gatto rosso");
        ElementoMultimediale fotoCriceto = new Immagine("Foto di un criceto");

        fotoGatto.show();
        ((Immagine) fotoCriceto).show(); // cast per poter usare .show();


        ElementoMultimediale videoElezionePapa = new Video("Elezione del nuovo papa", 5);
        ElementoMultimediale videoGattoRosso = new Video("Gatto rosso che gioca", 2);

        ((Video) videoGattoRosso).play();


        ElementoMultimediale registrazioneRadio2 = new RegistrazioneAudio("Ruggito del Coniglio - Radio 2", 10);
        ElementoMultimediale canzoneSantana = new RegistrazioneAudio("Corazon Espinado - Santana", 4);
        ((RegistrazioneAudio) canzoneSantana).play();

        System.out.println(" ----- fine prova -----");


        // creazione istanze con Scanner + array


        ElementoMultimediale[] preferiti = new ElementoMultimediale[5];

        // aggiungiPreferiti(preferiti);  // scommentare se si vuole ripopolare l'array

        //stampiamo i titoli
        for (ElementoMultimediale elemento : preferiti) {
            System.out.println("Preferito: " +elemento.getTitolo());
        }

        //eseguiamo i preferiti


    }

    //metodo per creare un array di elementi
    public static void aggiungiPreferiti(ElementoMultimediale[] arrayPreferiti){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aggiungi " + arrayPreferiti.length + " elementi multimediali ai preferiti");

        for (int i = 0; i < arrayPreferiti.length; i++) {

            System.out.println("Elemento n." + (i + 1));
            System.out.println("Che tipo di elemento vuoi creare? (1 = Immagine, 2 = Video, 3 = Audio)");
            int scelta = scanner.nextInt();
            scanner.nextLine();



            switch(scelta) {
                case 1:
                    System.out.println("Inserisci il titolo: ");
                    String titoloImg = scanner.nextLine();
                    arrayPreferiti[i] = new Immagine(titoloImg);
                    System.out.println("Aggiunto ai preferiti");
                    break;
                case 2:
                    System.out.println("Inserisci il titolo: ");
                    String titoloVid = scanner.nextLine();
                    System.out.println("Inserisci la durata del video(max10min): ");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine();
                    arrayPreferiti[i] = new Video(titoloVid, durataVideo);
                    System.out.println("Aggiunto ai preferiti");
                    break;
                case 3:
                    System.out.println("Inserisci il titolo: ");
                    String titoloAud = scanner.nextLine();
                    System.out.println("Inserisci la durata della registrazione(max10min): ");
                    int duraraAudio = scanner.nextInt();
                    arrayPreferiti[i] = new RegistrazioneAudio(titoloAud, duraraAudio);
                    System.out.println("Aggiunto ai preferiti");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    //ritornare indietro?
                    i--;
            }

            //System.out.println("Aggiunto ai preferiti");


    }

    }

    public static void riproduciPreferiti(){

    }
}