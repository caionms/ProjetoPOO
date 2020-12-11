package com.projetopoo;

import java.util.List;

public interface Playable {

    List<Nota> getNotes();

    String getAudioPath();

    void play(int note);

}
