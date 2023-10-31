//Crear una baraja de cartas y mostrarla de manera aleatoria
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class JuegoDeCartas {

    public static void main(String[] args) {
        List<String> baraja = new ArrayList<>();
        String[] palos = {"Corazon", "Diamante", "Picas", "Trebol"};
        String[] valores = {"2","3","4","5","6","7","8","9","10","Jota","Reina","Rey","As"};

        //Crear una baraja completa

        for(String palo : palos){
            for(String valor : valores){
                baraja.add(valor + " de "+palo);
            }
        }
        //BARAJAR LA BARAJA
        Collections.shuffle(baraja);

        //Repartir
        int manosSize = 5;
        List<String> mano = new ArrayList<String>();
        for (int i = 0; i< manosSize; i++){
            mano.add(baraja.remove(0));
        }
        //Mostrar la mano
        System.out.println("Mano del jugador: "+ mano);
    }


}
