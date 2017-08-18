/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Solicitud {
    private int emisor;
    private int recepetor;

    public Solicitud() {
    }

    public Solicitud(int emisor, int recepetor) {
        this.emisor = emisor;
        this.recepetor = recepetor;
    }

    public int getEmisor() {
        return emisor;
    }

    public void setEmisor(int emisor) {
        this.emisor = emisor;
    }

    public int getRecepetor() {
        return recepetor;
    }

    public void setRecepetor(int recepetor) {
        this.recepetor = recepetor;
    }

}
