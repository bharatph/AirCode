package com.thing.aircode.helper;

class VoiceInput {
    private static final VoiceInput ourInstance = new VoiceInput();

    static VoiceInput getInstance() {
        return ourInstance;
    }

    private VoiceInput() {
    }
}
