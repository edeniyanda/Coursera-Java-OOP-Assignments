import edu.duke.*;

/**
 * Write a description of Part4 here.
 * 
 * @author (Eden Iyanda) 
 * @version (a version number or a date)
 */
public class Part4 {
    public static void main(String[] args) {
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String line : ur.lines()) {
            int indexPos = (line.toLowerCase()).indexOf("youtube.com");
            if (indexPos != -1){
              int startIndex = line.lastIndexOf("\"", indexPos);
              int stopIndex = line.indexOf("\"", indexPos +1);
              String link = line.substring(startIndex + 1, stopIndex);
              System.out.println(link);
            }
          
        }
    }
}
