package com.was12.exampleandroidproject;

/**
 * Created by was12 on 08/11/2017.
 */

public class Objeto {
    private String nombre;
    private int foto;

    public Objeto() {
    }

    public Objeto(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
