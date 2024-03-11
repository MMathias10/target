package perguntas;

public class Ex5 {

	public static void main(String[] args) {
        String original = "mateus"; 
        String invertida = inverterString(original); 
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    
    public static String inverterString(String string) {
        char[] caracteres = string.toCharArray(); 
        int inicio = 0;
        int fim = string.length() - 1;

        
        while (inicio < fim) {
            
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            
            inicio++;
            fim--;
        }

        
        return new String(caracteres);
    }
}
