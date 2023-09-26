
/**
 * Write a description of Part3 here.
 * 
 * @author (Eden Iyanda) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int count = 0;
        int index = stringb.indexOf(stringa);
        boolean result;
        
        while (index != -1){
            count ++;
            index = stringb.indexOf(stringa, index + 1 );
        }
        
        if (count >= 2) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    public String lastPart(String stringa, String stringb) {
        String last;
        int lenofa = stringa.length();
        int lenofb = stringb.length();
        int indexofa = stringb.indexOf(stringa);
        if (indexofa == -1){
            last = stringb;
        } else {
            last = stringb.substring(indexofa+(lenofa));
        }
        return last;
    }
    
    public void testing(){
        String sa = "edn";
        String sb = "eden eden is a good eden";
       
        boolean ans = twoOccurrences(sa, sb);
        System.out.println("Outcome " + ans);
        System.out.println();

        String sa2 = "ini";
        String sb2 = "inioluwa";
        String lastpartofstr = lastPart(sa2, sb2);
        System.out.println("The part of the string after " + sa2 + " in " + sb2 +  " is " + lastpartofstr );
    }
}
