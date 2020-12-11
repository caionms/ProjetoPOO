package com.projetopoo.instrumentos;

import com.projetopoo.Aplicacao;
import com.projetopoo.Playable;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
                InputStream inputStream = Aplicacao.class.getResourceAsStream(this.getAudioPath() + "/" + note + ".wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
                clip.open(audioStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

}
