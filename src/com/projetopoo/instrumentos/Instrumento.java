/**
 *  Classe abstrata que representa um instrumento.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo.instrumentos;

import com.projetopoo.Aplicacao;
import com.projetopoo.Playable;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.BufferedInputStream;
import java.io.InputStream;

public abstract class Instrumento implements Playable {

    protected enum Tipo {
        SOPRO,
        PERCUSSAO,
        CORDAS,
        ELETRICO
    }

    protected String nome;
    protected Tipo tipo;

    public Instrumento(String nome, Tipo tipo) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    @Override
    public void play(int note) {
        new Thread(() -> {
            try {
                Clip clip = AudioSystem.getClip();
                String inputPath = this.getAudioPath() + "/" + note + "-" + getNotes().get(note).getLabel() + ".wav";
                InputStream inputStream = Aplicacao.class.getResourceAsStream(inputPath);
                InputStream bufferedStream = new BufferedInputStream(inputStream);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedStream);
                clip.open(audioStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

}
