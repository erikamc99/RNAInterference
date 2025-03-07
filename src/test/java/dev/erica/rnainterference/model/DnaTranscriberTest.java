package dev.erica.rnainterference.model;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DnaTranscriberTest {

    private final DnaTranscriber transcriber = new DnaTranscriber();

    @Test
    @DisplayName("Test para comprobar el mapeo de las posibles cadenas de ADN")
    void mapTranscriptionTest() {
        Map<Character, Character> map = DnaTranscriber.getTranscriptionMap();

        assertEquals('C', map.get('G'));
        assertEquals('G', map.get('C'));
        assertEquals('A', map.get('T'));
        assertEquals('U', map.get('A'));
        assertNull(map.get('X'));
        assertNull(map.get(' '));
    }

    @Test
    @DisplayName("Test para comprobar que la interfaz está implementada")
    void transcriptionTest() {
        DNA sequence = new DNA("GCTA");
        assertEquals("CGAU", transcriber.transcribe(sequence));
    }
}
