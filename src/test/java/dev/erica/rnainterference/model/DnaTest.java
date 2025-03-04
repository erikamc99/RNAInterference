package dev.erica.rnainterference.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DnaTest {
    @Test
    @DisplayName("Test para obtener la secuencia de ADN")
    public void getSequence() {
        DNA sequence = new DNA("GCTA");

        assertEquals("GCTA", sequence.getSequence());
    }

    @Test
    @DisplayName("Test para compronar que no se puede introducir una secuencia vacía")
    public void testEmptySequence() {
        assertThrows(IllegalArgumentException.class, () -> new DNA(""));
    }
}
