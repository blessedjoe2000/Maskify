package Practice;

/**
 * Created by UGIAGBE JOSEPH on 07/01/2022
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class maskify
{
   public static String maskify(String str)
   {
      //declaring variables
      String newWord, encryptWord = "";
      String visibleWord, password;
      char letter;

      //set visibleWord to extract the last 4 letters of the given string
      visibleWord = str.substring(str.length()-4);

      for(int index = 0; index < str.length()-4; index++)
      {
         //replacing each letters of the string with #
         newWord = str.replace(str.charAt(index), '#');
         //extracting the index letter converted to # from newWord
         letter = newWord.charAt(index);
         //adding each extracted # letter to form a string
         encryptWord = encryptWord + letter;
      }//for
      //concatenating encryptWord and visibleWord
      password = encryptWord.concat(visibleWord);

      return password;
   }

   public static void main(String[] args)
   {

      System.out.println(maskify("beautiful"));


   }//main
}//class
