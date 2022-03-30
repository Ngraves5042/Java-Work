public class Char {


    public static void main(String[] args) {
        
        char dash = '-';
        System.out.printf("Dash:%c\n", dash);
        
        char a = 'a';
        char letter = a;
        char b = ++letter;
        char c = ++letter;
        letter += 2;
        char e = letter;
        System.out.printf("Letter:%c a:%c b:%c c:%c e:%c\n", letter, a, b, c, e);
        
        char copyrightSign = '\u00a9';
        int copyrightSignInt = (int) copyrightSign;
        System.out.printf("Copyright sign: %c %d %X\n", copyrightSign, copyrightSignInt, copyrightSignInt);
    
        char yen = '\u00a5';
        int yenInt = (int) yen;
        System.out.printf("Yen: %c %d %X", yen, yenInt, yenInt);
    }
    
}