import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine().toLowerCase();
        
        int count = 0;
        for (char c : str.toCharArray()) 
            if ("aeiou".contains(c + "")) count++;
        
        System.out.println("Vowels: " + count);
    }
}
