package org.example.juegodados;

public class Personaje {
    /**
     * Atributos de los personajes
     */
    private String nombre;
    private int vida;
    Personaje(String n, int v){
        this.nombre=n;
        this.vida=v;
    }
    /**
     * Getter del nombre del personaje
     *
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Getter de la vida del personaje
     *
     */
    public int getVida() {
        return vida;
    }

    /**
     * Setter de la vida del personaje, nunca mayor de 10
     * @param vida la cantidad de vida que recibe
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
}
