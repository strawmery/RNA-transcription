package org.factoriaf5.rna_transcription;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println(RnaTranscription.transcribe("ACGTT"));
    }
}
