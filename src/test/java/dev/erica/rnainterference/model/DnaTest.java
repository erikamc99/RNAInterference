package dev.erica.rnainterference.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DnaTest {
    @Test
    @DisplayName("Test para obtener la secuencia de ADN")
    public void getSequence() {
        DNA sequence = new DNA("GCTA");

        assertEquals("GCTA", sequence.getSequence());
    }
}
