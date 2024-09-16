package org.example.juegodados;

public class Enemigo {
    private String nombre;
    private int vida;
    Enemigo(String n, int v){
        this.nombre=n;
        this.vida=v;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
