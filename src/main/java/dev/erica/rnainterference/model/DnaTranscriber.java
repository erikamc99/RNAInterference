package dev.erica.rnainterference.model;

import java.util.Map;

public class DnaTranscriber {
    private static final Map<Character, Character> TRANSCRIPTION_MAP = Map.of(
        'G', 'C', 'C', 'G', 'T', 'A', 'A', 'U'
    );

    public static Map<Character, Character> getTranscriptionMap() {
        return TRANSCRIPTION_MAP;
    }
}
