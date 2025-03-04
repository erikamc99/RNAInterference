package dev.erica.rnainterference.model;

public class DNA {
    private final String sequence;

    public DNA(String sequence) {
        if (sequence.isEmpty()) {
            throw new IllegalArgumentException("❌ La secuencia de ADN no puede estar vacía.");
        }
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }
}