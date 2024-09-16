package org.example.juegodados;

public class Personaje {
    private String nombre;
    private int vida;
    Personaje(String n, int v){
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

    public static void main(String[] args) {
        Personaje prota=new Personaje("Prota",10 );
        Personaje enemigo=new Personaje("Prota",10 );
        int numProta=0,numEnemigo=0;
        while(prota.getVida()>0 && enemigo.getVida()>0){
            numProta= (int) (Math.random()*6)+1;
            numEnemigo= (int) (Math.random()*6)+1;
            if(numEnemigo>numProta){
                prota.setVida(prota.getVida()-1);
            }
            if(numEnemigo<numProta){
                enemigo.setVida(enemigo.getVida()-1);
            }
        }
    }
}
