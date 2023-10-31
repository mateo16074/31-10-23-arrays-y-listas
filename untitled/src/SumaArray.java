import java.lang.reflect.Array;
import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] arreglo = {1,2,3,4,5};
        System.out.println("ingresa la dimension del arreglo:");
        int [] arreglo = new int[in.nextInt()];
        in.nextLine();

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un numero para la posicion deseada: " + i + ":");
            arreglo[i] = in.nextInt();
            in.nextLine();
        }

        int resultado = sumaArray(arreglo);
        System.out.println("Resultado: "+ resultado);
    }

    public static int sumaArray(int[] arreglo){
        int suma  = 0;

        for (int numero : arreglo){
            suma += numero;
        }

        return suma;
    }
}
