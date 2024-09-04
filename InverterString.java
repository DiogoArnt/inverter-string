import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        // Usando Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para ser invertida: ");
        String original = scanner.nextLine();
        
        // Convertendo a string original para um array de caracteres
        char[] caracteres = original.toCharArray();
        
        // Invertendo a string
        String invertida = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }
        
        // Exibindo a string invertida
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
}