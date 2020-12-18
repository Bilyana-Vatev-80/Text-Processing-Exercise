import java.util.Scanner;

public class ExtractFile_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String path = scanner.nextLine();

        int slashIndex = path.lastIndexOf('\\');
        int pointIndex= path.lastIndexOf('.');

        String fileName = path.substring(slashIndex +1,pointIndex);
        String extension = path.substring(pointIndex +1);

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s%n",extension);
    }
}
