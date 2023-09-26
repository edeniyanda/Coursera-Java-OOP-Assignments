
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String dnaCode = "";
        String uppercasedna = dna.toUpperCase();
        String lowercasedna = dna.toLowerCase();
        
        if (dna.equals(uppercasedna)) {
            int startIndex = dna.indexOf(startCodon.toUpperCase());
            if (startIndex == -1){
                return dnaCode;
            }
            int stopIndex = dna.indexOf(stopCodon.toUpperCase(), startIndex+3);
            if (stopIndex == -1){
                return dnaCode;
            }
            if ((stopIndex - startIndex) % 3 == 0) {
                dnaCode = dna.substring(startIndex, stopIndex+3);
            } else {
                return dnaCode;
            }
        
        } else if (dna.equals(lowercasedna)){
            int startIndex = dna.indexOf(startCodon.toLowerCase());
            if (startIndex == -1){
                return dnaCode;
            }
            int stopIndex = dna.indexOf(stopCodon.toLowerCase(), startIndex+3);
            if (stopIndex == -1){
                return dnaCode;
            }
            if ((stopIndex - startIndex) % 3 == 0) {
                dnaCode = dna.substring(startIndex, stopIndex+3);
            } else {
                return dnaCode;
            }
        }
        return dnaCode;
    }
        public void testSimpleGene() {
        // Test case 1: DNA with no "ATG"
        String dnaNoStartCodon = "CGTAGCTAATCTAAGCTA";
        String gene1 = findSimpleGene(dnaNoStartCodon, "ATG", "TAA");
        System.out.println("DNA code in " + dnaNoStartCodon + " is " + gene1);
    
        // Test case 2: DNA with no "TAA"
        String dnaNoStopCodon = "atggtagcgtaaagctg";
        String gene2 = findSimpleGene(dnaNoStopCodon,"ATG", "TAA");
        System.out.println("DNA code in " + dnaNoStopCodon + " is " + gene2);
    
        // Test case 3: DNA with no "ATG" or "TAA"
        String dnaNoStartOrStopCodon = "CGTGGCTGCCGTTGCGT";
        String gene3 = findSimpleGene(dnaNoStartOrStopCodon, "ATG", "TAA");
        System.out.println("DNA code in " + dnaNoStartOrStopCodon + " is " + gene3);
    
        // Test case 4: DNA with a valid gene
        String dnaWithGene = "ATGCGTAGCTAATGACGTAAAGCTG";
        String gene4 = findSimpleGene(dnaWithGene, "ATG", "TAA");
        System.out.println("DNA code in " + dnaWithGene + " is " + gene4);
    
        // Test case 5: DNA with ATG, TAA, but the gene is not a multiple of 3
        String dnaInvalidGene = "ATGCGTAGCTAATGACGTAAAGCT";
        String gene5 = findSimpleGene(dnaInvalidGene, "ATG", "TAA");
        System.out.println("DNA code in " + dnaInvalidGene + " is " + gene5);
}

}
