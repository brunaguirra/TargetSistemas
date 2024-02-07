import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma string para inverter:");
        String input = scanner.nextLine();
        
        String invertedString = inverterString(input);
        
        System.out.println("String invertida: " + invertedString);
    }
    
    public static String inverterString(String input) {
        char[] charArray = input.toCharArray();
        int length = charArray.length;
        
        // Inverte os caracteres
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }
        
        return new String(charArray);
    }
}
