import java.util.*;
public class UserInput {

    Scanner input = new Scanner(System.in);
    HashMap map = new HashMap();
    public void getInput() {
        char a;
        System.out.println("\"Enter m for Morse to English or e for English to Morse.\"");
        a = input.next().charAt(0);
        if (a == 'm') {
            translateMorse();
        }
        else if (a == 'e') {
            translateEnglish();
        }
        else {
            System.out.println("Your input is not valid.");
        }
    }
    Scanner input1 = new Scanner(System.in);
    public void translateEnglish() {
        System.out.println("Enter a phrase in English.");
        String englishToMorse = input1.nextLine();
        englishToMorse = englishToMorse.toLowerCase();

        int i = 0;

        while (i < englishToMorse.length()) {
             if(englishToMorse.charAt(i) == ' '){
                 System.out.print("  ");
             }
            else{System.out.print(map.translate(englishToMorse.charAt(i)) + ' ');}
            i++;
        }
    }

    Scanner input2 = new Scanner(System.in);
    public  void translateMorse()
    {
        System.out.println("Enter a phrase in Morse Code.");
        String morseToEnglish = input2.nextLine();
        //morseToEnglish = morseToEnglish.toLowerCase();
        map.invertMap();

       String[] words = morseToEnglish.split( "\\s{3,}");

       for(int i = 0; i < words.length; i++){

           String[] letter = words[i].split(" ");
           for(int j = 0; j < letter.length; j++){
               System.out.print(map.translateMorse(letter[j]));
           }
           System.out.print(" ");
       }




    }
}
