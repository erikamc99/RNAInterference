package dev.erica.rnainterference.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class DnaTranscriber {
    @Test
    void transcriptionTest() {
        Map<Character, Character> map = DnaTranscriber.getTranscriptionMap();

        assertEquals('C', map.get('G'));
        assertEquals('G', map.get('C'));
        assertEquals('A', map.get('T'));
        assertEquals('U', map.get('A'));
    }
}
