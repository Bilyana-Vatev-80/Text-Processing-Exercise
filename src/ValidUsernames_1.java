import java.util.Scanner;

public class ValidUsernames_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        for (String s : input) {
          if(isValidUsernames(s)){
              System.out.println(s);
          }
        }

    }

    private static boolean isValidUsernames(String s) {
       if(s.length() < 3 || s.length() > 16){
           return false;
       }
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}
