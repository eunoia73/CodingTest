import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
         if (s.equals(" ")) { 
            System.out.println(0);
        }else{
            String trimmed = s.trim();
            String[] splited = trimmed.split(" ");
            System.out.println(splited.length);
        }
    }
}
