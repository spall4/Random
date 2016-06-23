//Name: Pallav Shah Title: wordcount.java
//Description: This program reads a .txt file from a computer and counts the number of words, characters,
//             sentences, lines, punctuations, and vowels in a file and prints it to the consol
//             as well as in the file named output.txt file that it creats.



package wordcount;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Wordcount {

    public static void main(String[] args) throws IOException {
             // checks if the file exists. if it doesn't, prints "The file is empty."
        try{
        File fr = new File("C:\\Users\\YasH\\Desktop\\Pallav IMP stuff\\NetBeans HW\\Try.txt");
        Scanner sc = new Scanner(fr);
        if(!sc.hasNext()){
        System.out.println("The file is empty.");
        System.exit(0);
        } else {
        
        int count = 0, lineCount = 0, SentCount = 0, VowCount = 0, PunCount = 0, cCount = 0;
        //counts number of words, characters, punctuations in the file
        while (sc.hasNext()) {
        String str = sc.next();
        count++;
        int cNum = str.length();
        cCount += cNum;
        for (int i = 0; i < str.length(); i++) {
        char num = str.charAt(i);
        
        if (num == '!' || num == '@' || num == '$' || num == '%' || num == '&'
        || num == '*' || num == '?'
        || num == ';' || num == '"' || num == ':' || num == '.'
        || num == '-'
        || num == '\\' || num == '=' || num == '+') {
        PunCount++;
        }
        }
        }
        System.out.println("Words in the file are : " + count);
        System.out.println("Alphanumeric characters in this file are: " + (cCount - PunCount));
        System.out.println("Punctuation characters in this file are: " + PunCount);
        
        //counts number of lines in the file
        
        sc = new Scanner(fr);
        while (sc.hasNext()) {
        sc.nextLine();
        lineCount++;
        }
        System.out.println("Lines in this file are :" + lineCount);
        
        // Counts number of Vowels in the file
        sc = new Scanner(fr);
       while (sc.hasNext()) {
        String string = sc.next().toLowerCase();
        for (int i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        VowCount++;
        }
        }
        }
        System.out.println("Vowels in this file are : " + VowCount);
        
        //counts number of sentences in a file
        sc = new Scanner(fr);
        while (sc.hasNext()) {
        String line = sc.next();
        
        if (line.endsWith(".") || line.endsWith("!") || line.endsWith("?")) {
        SentCount++;
        }
        
        }
        System.out.println("Sentences in this file are : " + SentCount);
     //Makes a file output.txt and prints all the values in the file.
        try (
        PrintWriter out = new PrintWriter(new FileWriter("Output.txt"))) {
        out.println("Words in the file are : " + count);
        out.println("Total characters in this file are: " + (cCount- PunCount));
        out.println("Lines in the file are : " + lineCount);
        out.println("Vowels in the file are : " + VowCount);
        out.println("Sentences in the file are : " + SentCount);
        out.println("Punctuation characters in this file are: " + PunCount);
        out.close();
        }
        }
        } catch (Exception e){
        System.out.println("File does not exist."); // Prints this if file is not found in the computer.
        }
        
        

}
    
    
    }




