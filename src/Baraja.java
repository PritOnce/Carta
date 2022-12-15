import java.util.Arrays;
/*
author: Navpreet Estuardo Gojlia Once
fecha: 15/12/2022
 */
public class Baraja {

    /*llamamos a la clase Carta*/
    Carta c1 = new Carta();
    /*instaciomos el tamaño y su interior*/
    Carta [] numero = new Carta[12];
    String [] cuello ={"oros","copas","espadas","bastos"};

    public Baraja(){

    }
    /*creamos la baraja y la mostramos por pantalla*/
    public void crearCarta(){
        for (int i=0 ; i< cuello.length;i++){
            for (int j=0 ; j< numero.length;j++){
                System.out.println(j+1 + " de " + cuello[i]);
            }
        }
    }
}
