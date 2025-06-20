import entities.Audio;
import entities.Multimedia;
import entities.Video;
import entities.enums.MultimediaType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of media do you want to create? Available choices: audio, video, image");
        MultimediaType userInputType = MultimediaType.valueOf(scanner.nextLine().toUpperCase());



        Multimedia[] multimedia = new Multimedia[5];

        if (userInputType == MultimediaType.VIDEO) {

            System.out.println("Insert video title: ");
            String title = scanner.nextLine();

            System.out.println("Insert video duration: ");
            int duration = scanner.nextInt();

            multimedia[multimedia.length - 1] = new Video(title, duration);

        } else if (userInputType == MultimediaType.AUDIO){
            System.out.println("Insert audio title: ");
            String title = scanner.nextLine();

            System.out.println("Insert audio duration: ");
            int duration = scanner.nextInt();

            multimedia[multimedia.length - 1] = new Audio(title, duration);
        } else {
            System.out.println("Media type not supported.");
        }

        scanner.close();
    }
}
