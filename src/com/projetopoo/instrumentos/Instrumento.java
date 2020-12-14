/**
 *  Classe abstrata que representa um instrumento.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo.instrumentos;

import com.projetopoo.Aplicacao;
import com.projetopoo.Playable;
import com.projetopoo.instrumentos.impl.Flauta;
import com.projetopoo.instrumentos.impl.Saxofone;
import com.projetopoo.instrumentos.impl.Violao;
import com.projetopoo.instrumentos.impl.Violino;

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
        this.tipo = tipo;
    }

    public String getNome(){
        return this.nome;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public static String getInstrumentData(Instrumento instrumento) throws Exception {
        if(instrumento instanceof Flauta) {
            return ((Flauta) instrumento).getFlautaInfo();
        }else if(instrumento instanceof Saxofone) {
            return ((Saxofone) instrumento).getSaxofoneInfo();
        }else if(instrumento instanceof Violao) {
            return ((Violao) instrumento).getViolaoInfo();
        }else if(instrumento instanceof Violino) {
            return ((Violino) instrumento).getViolinoInfo();
        }else{
            throw new Exception("Instumento não encontrado");
        }
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

    @Override
    public void play() {
        this.play(0);
    }

}
