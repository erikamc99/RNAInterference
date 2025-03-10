package dev.erica.rnainterference.controller;

import dev.erica.rnainterference.model.DNA;
import dev.erica.rnainterference.model.DnaTranscriber;
import dev.erica.rnainterference.model.Transcriber;

public class TranscriberController {
    private final Transcriber transcriber;

    public TranscriberController() {
        this.transcriber = new DnaTranscriber();
    }
    
    public String transcribeController(String sequence) {
        return transcriber.transcribe(new DNA(sequence));
    }
}