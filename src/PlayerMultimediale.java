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
        ((RegistrazioneAudio) canzoneSantana).alzaVolume();
        ((RegistrazioneAudio) canzoneSantana).alzaVolume();
        ((RegistrazioneAudio) canzoneSantana).alzaVolume();
        ((RegistrazioneAudio) canzoneSantana).alzaVolume();
        ((RegistrazioneAudio) canzoneSantana).play();



        System.out.println(" ----- fine prova -----");


        // creazione istanze con Scanner + array


        ElementoMultimediale[] preferiti = new ElementoMultimediale[5];

        aggiungiPreferiti(preferiti);  // scommentare se si vuole ripopolare l'array

        //stampiamo i titoli
//        System.out.println("Titoli array:");
//        for (ElementoMultimediale elemento : preferiti) {
//            System.out.println("Preferito: " +elemento.getTitolo());
//        }

        //eseguiamo i preferiti

        riproduciPreferiti(preferiti);

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

    //metodo per riprodurre i preferiti
    public static void riproduciPreferiti(ElementoMultimediale[] preferiti){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Quale elemento vuoi riprodurre? (1 - 5, 0 per uscire)");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if(scelta == 0){
                System.out.println("Uscita dal player.");
                break;
            }

            if(scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = preferiti[scelta - 1];
                if (elemento instanceof Immagine) {
                    System.out.println("modifica la luminosità predefinita:");
                    int lum = scanner.nextInt();
                    ((Immagine) elemento).setLuminosita(lum);
                    ((Immagine) elemento).show();
                } else if(elemento instanceof Video) {
                    System.out.println("modifica la luminosità predefinita:");
                    int lum = scanner.nextInt();
                    ((Video) elemento).setLuminosita(lum);
                    System.out.println("modifica il volume predefinito:");
                    int vol = scanner.nextInt();
                    ((Video) elemento).setVolume(vol);
                    ((Video) elemento).play();
                } else if(elemento instanceof RegistrazioneAudio){
                    System.out.println("modifica il volume predefinito:");
                    int vol = scanner.nextInt();
                    ((RegistrazioneAudio) elemento).setVolume(vol);
                    ((RegistrazioneAudio) elemento).play();
                } else {
                    System.out.println("Tipo di elemento non riconosciuto.");
                }
            } else {
                System.out.println("Scelta non valida, riprova.");
            }


        }



    }
}