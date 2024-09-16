package org.example.juegodados;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class Juego extends Application {
    Text numProta;
    Text numEnemigo;
    Text vidaProta;
    Text vidaEnemigo;
    Text perdedor;
    Personaje prota=new Personaje("Beñat",7);
    Enemigo enemigo=new Enemigo("Hanfrig",7);
    Button botonRoll;
    @Override
    public void start(Stage stage) throws IOException {
        Text protaTxt=new Text(prota.getNombre());
        Text enemigoTxt=new Text(enemigo.getNombre());
        Text txtVacio=new Text("\t");
        HBox nombres=new HBox(protaTxt,txtVacio,enemigoTxt);
         vidaProta=new Text("Vida: "+prota.getVida());
         vidaEnemigo=new Text("Vida: "+enemigo.getVida());
        Text txtVacio3=new Text("\t");
        HBox vida=new HBox(vidaProta,txtVacio3,vidaEnemigo);
        numProta=new Text();
        numEnemigo=new Text();
        Text txtVacio2=new Text("\t\t");
        HBox numeros=new HBox(numProta,txtVacio2,numEnemigo);
        botonRoll=new Button("TIRAR DADO");
        botonRoll.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tirarDados();
            }
        });
        perdedor=new Text();
        VBox principal=new VBox(nombres,vida,numeros,botonRoll,perdedor);
        Scene scene = new Scene(principal,200,150);
        stage.setScene(scene);
        stage.show();
    }

    private EventHandler<ActionEvent> tirarDados() {

            int numProtaD= (int) (Math.random()*6)+1;
            int numEnemigoD= (int) (Math.random()*6)+1;
            if(numEnemigoD>numProtaD){
                prota.setVida(prota.getVida()-1);
            }
        if(numEnemigoD<numProtaD){
            enemigo.setVida(enemigo.getVida()-1);
        }
         vidaProta.setText("Vida: "+prota.getVida());
         vidaEnemigo.setText("Vida: "+enemigo.getVida());
            numProta.setText(String.valueOf(numProtaD));
            numEnemigo.setText(String.valueOf(numEnemigoD));
        if(prota.getVida()<=0){
            botonRoll.setDisable(true);
            perdedor.setText("El perdedor es: "+prota.getNombre().toUpperCase());
        }
        if(enemigo.getVida()<=0) {
            botonRoll.setDisable(true);
            perdedor.setText("El perdedor es: "+enemigo.getNombre().toUpperCase());
        }
        return null;
    }

    public static void main(String[] args) {
        launch();
    }
}