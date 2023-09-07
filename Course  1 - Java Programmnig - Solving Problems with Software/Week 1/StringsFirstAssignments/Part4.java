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
            line = line.toLowerCase();
            if (line.contains("youtube.com")){
                  System.out.println(line);
            }
          
        }
    }
}
