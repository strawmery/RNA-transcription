package org.factoriaf5.rna_transcription;


public class RnaTranscription {
    
    static String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for(int i = 0; i < dnaStrand.length(); i++) {
            char nucleotide = dnaStrand.charAt(i);
            switch(nucleotide){
                case 'A': rnaStrand.append('U'); 
                        break;
                case 'T': rnaStrand.append('A');
                        break;
                case 'C': rnaStrand.append('G');
                        break;
                case 'G': rnaStrand.append('C');
                        break;
            }
        }
            return rnaStrand.toString();
    }

}
