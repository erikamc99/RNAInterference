package dev.erica.rnainterference.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TranscriberTest {
    @Test
    @DisplayName("Test para comprobar si la interfaz existe")
    public void transcriberInterfaceTest() {
        assertDoesNotThrow(() -> {
            Transcriber.class.getMethod("transcribe", DNA.class);
        });
    }
}