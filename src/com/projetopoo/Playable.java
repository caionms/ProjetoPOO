/**
 *  Interface para reprodução sonora.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo;

import java.util.List;

public interface Playable {

    List<Nota> getNotes();

    String getAudioPath();

    void play(int note);

}
