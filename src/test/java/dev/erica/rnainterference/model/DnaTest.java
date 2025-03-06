package dev.erica.rnainterference.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DnaTest {
    @Test
    @DisplayName("Test para obtener la secuencia de ADN")
    public void getSequenceTest() {
        DNA sequence = new DNA("GCTA");

        assertEquals("GCTA", sequence.getSequence());
    }

    @Test
    @DisplayName("Test para compronar que no se puede introducir una secuencia vacía")
    public void emptySequenceTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new DNA(""));
        assertEquals("❌ La secuencia de ADN no puede estar vacía.", exception.getMessage());
    }

    @Test
    @DisplayName("Test para comprobar que no se puede introducir una secuencia null")
    public void nullSequenceTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new DNA(null));
        assertEquals("❌ La secuencia de ADN no puede estar vacía.", exception.getMessage());
    }
}