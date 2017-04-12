/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtrocatelas1;

/**
 *
 * @author matheus
 */
public class Prova{
    
    private String nomeProva;
    private String disciplinaProva;
    private String mediaProva;
    private String pesoProva;
    private String notaProva;
   
    public Prova(String nomeProva, String disciplinaProva, String mediaProva, String pesoProva, String notaProva){
        this.nomeProva = nomeProva;
        this.disciplinaProva = disciplinaProva;
        this.mediaProva = mediaProva;
        this.pesoProva = pesoProva;
        this.notaProva = notaProva;
    }
    
    public String getNomeProva() {
        return nomeProva;
    }

    public void setNomeProva(String nomeProva) {
        this.nomeProva = nomeProva;
    }

    public String getDisciplinaProva() {
        return disciplinaProva;
    }

    public void setDisciplinaProva(String disciplinaProva) {
        this.disciplinaProva = disciplinaProva;
    }

    public String getMediaProva() {
        return mediaProva;
    }

    public void setMediaProva(String mediaProva) {
        this.mediaProva = mediaProva;
    }

    public String getPesoProva() {
        return pesoProva;
    }

    public void setPesoProva(String pesoProva) {
        this.pesoProva = pesoProva;
    }

    public String getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(String notaProva) {
        this.notaProva = notaProva;
    }
}
