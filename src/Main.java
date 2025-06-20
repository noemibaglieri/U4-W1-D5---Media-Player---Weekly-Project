import entities.Audio;
import entities.Image;
import entities.Multimedia;
import entities.Video;
import entities.enums.MultimediaType;
import interfaces.Player;
import interfaces.Shower;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Multimedia[] multimedia = new Multimedia[5];

        for (int i = 0; i < multimedia.length; i++) {
            // Avevo creato una "classe" enums ma mi sono resa conto che in caso di errore si bloccava il programma, anche con gli else. Penso
            // sia necessario un try catch, ma non sono sicura di come implementarlo, così ho scelto di usare le stringhe, per via del tempo limitato.
            System.out.println("What type of media do you want to create? Available choices: audio, video, image");
            String userInput = scanner.nextLine().toLowerCase();

            switch (userInput) {
                case "audio":
                    System.out.println("What's your audio title?");
                    String audioTitle = scanner.nextLine();

                    System.out.println("How long is this audio?");
                    int audioDuration = Integer.parseInt(scanner.nextLine());

                    multimedia[i] = new Audio(audioTitle, audioDuration);
                    break;

                case "video":
                    System.out.println("What's your video title?");
                    String videoTitle = scanner.nextLine();

                    System.out.println("How long is this video?");
                    int videoDuration = Integer.parseInt(scanner.nextLine());

                    multimedia[i] = new Video(videoTitle, videoDuration);
                    break;

                case "image":
                    System.out.println("What's your image title?");
                    String imageTitle = scanner.nextLine();

                    multimedia[i] = new Image(imageTitle);
                    break;

                default:
                    System.out.println("Media type not supported. Try again...");
                    i--;
                    break;
            }
        }

        while (true) {
            System.out.println("Choose a media to play or show (1-5), otherwise type 0 to quit:");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                break;
            }

            if (choice >= 1 && choice <= 5) {
                Multimedia selected = multimedia[choice - 1];

                if (selected != null) {
                    if (selected instanceof Player) {
                        ((Player) selected).play();
                    } else {
                        ((Shower)selected).show();
                    }
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println(Arrays.toString(multimedia));
        scanner.close();
    }
}
