
/**
 * Write a description of Part1 here.
 * 
 * @author (Eden Iyanda) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
        String dnaCode = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1){
            return dnaCode;
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1){
            return dnaCode;
        }
        
        if ((stopIndex - startIndex) % 3 == 0) {
            dnaCode = dna.substring(startIndex, stopIndex+3);
        } else {
            return dnaCode;
        }
        
        return dnaCode;
    }
    public void testSimpleGene() {
        // Test case 1: DNA with no "ATG"
        String dnaNoStartCodon = "CGTAGCTAATCTAAGCTA";
        String gene1 = findSimpleGene(dnaNoStartCodon);
        System.out.println("DNA code in " + dnaNoStartCodon + " is " + gene1);
    
        // Test case 2: DNA with no "TAA"
        String dnaNoStopCodon = "ATGGTAGCGTAAAGCTG";
        String gene2 = findSimpleGene(dnaNoStopCodon);
        System.out.println("DNA code in " + dnaNoStopCodon + " is " + gene2);
    
        // Test case 3: DNA with no "ATG" or "TAA"
        String dnaNoStartOrStopCodon = "CGTGGCTGCCGTTGCGT";
        String gene3 = findSimpleGene(dnaNoStartOrStopCodon);
        System.out.println("DNA code in " + dnaNoStartOrStopCodon + " is " + gene3);
    
        // Test case 4: DNA with a valid gene
        String dnaWithGene = "ATGCGTAGCTAATGACGTAAAGCTG";
        String gene4 = findSimpleGene(dnaWithGene);
        System.out.println("DNA code in " + dnaWithGene + " is " + gene4);
    
        // Test case 5: DNA with ATG, TAA, but the gene is not a multiple of 3
        String dnaInvalidGene = "ATGCGTAGCTAATGACGTAAAGCT";
        String gene5 = findSimpleGene(dnaInvalidGene);
        System.out.println("DNA code in " + dnaInvalidGene + " is " + gene5);
}

}
