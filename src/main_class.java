import java.util.HashMap;
import java.util.Scanner; // Importerar klassen Scanner




public class main_class {

   private static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      Lines lines = new Lines();

      System.out.println("Write words and write stop to finish");
      while (!lines.isStopped()) {
         String input = sc.nextLine();
         lines.calculate(input);
      }

      System.out.println(lines.getResult());
   }

}

    public static void main(String[] args) {

            Scanner tangentbord = new Scanner(System.in);  // Skapar ett Scanner objekt som jag kallar för tangentbord
            System.out.println("Skriv in text som ska översättas till morse kod");
            String textstycke = tangentbord.nextLine();  // Läser in text från tangentbordet och sparar den i variabeln textstycke

            //MorseKod morseKod = new MorseKod(); //Skapar ett objekt av klassen MorseKod
            //String translatedWord = morseKod.returnera(); // Metod i klassen Morsekod som bör ge mig ett översatt ord
            //System.out.println(translatedWord); //Skriver ut det översatta ordet i morsekod


     HashMap<Character, String> map = new HashMap<>(); //Skapar en HashMap och sparar tecken och den internationella morsekod beteckningen

        map.put('A', "*_");
        map.put('B', "_***");
        map.put('C', "_*_*");
        map.put('D', "_**");
        map.put('E', "*");
        map.put('F', "**_*");
        map.put('G', "__*");
        map.put('H', "****");
        map.put('I', "**");
        map.put('J', "*___");
        map.put('K', "_'_");
        map.put('L', "*_**");
        map.put('M', "__");
        map.put('N', "_*");
        map.put('O', "___");
        map.put('P', "*__*");
        map.put('Q', "__*_");
        map.put('R', "*_*");
        map.put('S', "***");
        map.put('T', "_");
        map.put('U', "**_");
        map.put('V', "***_");
        map.put('W', "*__");
        map.put('X', "_**_");
        map.put('Y', "_*__");
        map.put('Z', "__**");
        map.put('1', "*____");
        map.put('2', "**___");
        map.put('3', "***__");
        map.put('4', "***_");
        map.put('5', "*****");
        map.put('6', "_****");
        map.put('7', "__***");
        map.put('8', "___**");
        map.put('9', "____*");
        map.put('0', "_____");
        map.put('.', "*_*_*_");
        map.put(',', "__**__");
        map.put('?', "**__**");
        map.put(' ', " ");

        int lnt = textstycke.length();
        System.out.println(lnt);

        for(int i=0; i<lnt; i++){

            System.out.print(map.get(textstycke.charAt(i)) + " ");

        }

    }
}
