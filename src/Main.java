import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar rover.jar input.txt");
            return;
        }

        try {
            File inputFile = new File(args[0]);
            Scanner scanner = new Scanner(inputFile);

            int maxX = scanner.nextInt();
            int maxY = scanner.nextInt();
            Plateau plateau = new Plateau(maxX, maxY);

            while (scanner.hasNext()) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                char direction = scanner.next().charAt(0);

                Rover rover = new Rover(x, y, direction, plateau);

                String instructions = scanner.next();

                rover.instruction(instructions);

                System.out.println(rover.getPosition());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + args[0]);
            e.printStackTrace();
        }
    }
}
