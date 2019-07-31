import java.util.Scanner;
public class AuthoringAssistant {

public static int getNumOfWords(final String usrStr) {
    int count = 1;
    int i = 0;
  
    for (i = 1; i < usrStr.length(); ++i) {
      if ( (Character.isWhitespace(usrStr.charAt(i)) == true) &&
          (Character.isWhitespace(usrStr.charAt(i - 1))) == false) {
        ++count;
      }
    }
  
    return count;
  
}
public static int getNumOfNonWSCharacters(final String usrStr) {
    int count = 0;
    int i = 0;
  

    for(i=0; i < usrStr.length(); i++){
      if (!Character.isWhitespace(usrStr.charAt(i))){
        ++count;
      }
    }
    return count;
}

public static int findText(final String toFind, String usrStr) {
    int count = 0;
    int where = 0;
  

    do {

      where = usrStr.indexOf(toFind);
      
 
      if (where != -1)
      {
       count++;
       usrStr = usrStr.substring(where + toFind.length() - 1);
      }

    }while(where != -1); 
  
    return count;
}

public static String replaceExclamation(String usrStr) {
    return usrStr.replaceAll("!", ".");
}

public static String shortenSpace(String usrStr) {

    String space = " ";
    String space2 = space + space;
  
    while (usrStr.indexOf(space2) != -1) {

      usrStr=usrStr.replace(space2, space);
    }
    return usrStr;
}

public static char printMenu(Scanner scnr) {
    char menuOp = ' ';
  
    System.out.println("\nMENU");

    System.out.println("c - Number of non-whitespace characters");
    System.out.println("w - Number of words");
    System.out.println("f - Find text");
    System.out.println("r - Replace all !'s");
    System.out.println("s - Shorten spaces");
    System.out.println("q - Quit");
    System.out.print("\n");
  
  
    while (menuOp != 'c' && menuOp != 'w' && menuOp != 'f' &&
           menuOp != 'r' && menuOp != 's' && menuOp != 'o' &&
           menuOp != 'q') {
      System.out.println( "Choose an option:");
      menuOp = scnr.nextLine().charAt(0);
    }
  
    return menuOp;
}

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String inputString = "";
    char menuChoice = ' ';
    String toFind = "";
  

  
    System.out.println("Enter a sample text:");
    inputString = scnr.nextLine();
  
    System.out.println("\nYou entered: " + inputString);
  
  

    while (menuChoice != 'q'){
       menuChoice = printMenu(scnr);
    
      if (menuChoice == 'c') {
        System.out.println("Number of non-whitespace characters: " + getNumOfNonWSCharacters(inputString));

      }
    

      else if (menuChoice == 'w') {
        System.out.println("Number of words: " + getNumOfWords(inputString));
      
      }
    
      else if (menuChoice == 'f'){
        System.out.println("Enter a word or phrase to be found:");
        toFind = scnr.nextLine();
        System.out.println("\"" + toFind + "\" instances: " + findText(toFind, inputString));
      
      }
    
      else if (menuChoice == 'r') {
        System.out.println("Edited text: " + replaceExclamation(inputString));
      }
    
      else if (menuChoice == 's') {
        System.out.println("Edited text: " + shortenSpace(inputString));
      
      
      }
    
    }
    return;
}
}


