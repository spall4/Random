package justatry;
public class JustaTry{
  public static void main(String [] args){

  String [] words = {"what8l.", "t.his", "whatis", "47thkk", "nowthis558859", "4858"};
    // can you see this now ?
    int alphanumCount = 0;
    int numericCount = 0;
    int alphaCount = 0;
    int puncCount = 0;
    String apattern = "^[a-zA-Z0-9]*$";
    String allpunc = "!@$%&*()?;\":.-][{}\\=+";
    for(int i = 0; i < words.length -1; i++){ // loop through the array first
      for(int x = 0; x < words[i].length(); x++){ // loop through each word in the array.. i.e first we loop through "what8l"
        String cutOff = String.valueOf(words[i].charAt(x)); // hmmmmm I think something is wrong...  // here we get each character of the word
        if(allpunc.contains(cutOff)){
          puncCount++;
          break; // maybe we shouldn't break but I will test for this first
        }

      }
    }
    System.out.println(puncCount);
  }
}


