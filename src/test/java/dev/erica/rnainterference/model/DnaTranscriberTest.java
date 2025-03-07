package dev.erica.rnainterference.model;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DnaTranscriberTest {
    @Test
    void transcriptionTest() {
        Map<Character, Character> map = DnaTranscriber.getTranscriptionMap();

        assertEquals('C', map.get('G'));
        assertEquals('G', map.get('C'));
        assertEquals('A', map.get('T'));
        assertEquals('U', map.get('A'));
    }
}
