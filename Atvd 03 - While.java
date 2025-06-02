// Atividade: 03
// Autor: Enrico Hidalgo
// KATA: Vowel Count
// Data: 08/05/2025

// While (laço de repetição)

public class Vowels {
    public static int getCount(String str) {
        int count = 0;
        int i = 0; 
        
        if (str.length() == 0) return 0;
        
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            i++;
        }
        
        return count;
    }
}
