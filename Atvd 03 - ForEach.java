// Atividade: 03
// Autor: Enrico Hidalgo
// KATA: Vowel Count
// Data: 08/05/2025

// For each (laço de repetição)

public class Vowels {
    public static int getCount(String str) {
        int count = 0;
        
        if (str.length() == 0) return 0;
        
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
