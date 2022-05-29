
package ordenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class Ordenamiento {
    int opcion;
    Scanner op = new Scanner(System.in);
    Arreglo a = new Arreglo();
    
    public void menu(){
        a.llenarArreglo();
        boolean salir = false;        
        while(!salir){
           System.out.println("");
           System.out.println("------ORDENAR NÚMEROS-----"); 
           System.out.println("1. Método Burbuja"); 
           System.out.println("2. Método Quicksort");
           System.out.println("3. Salir");
           System.out.println("Ingresa una opción");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                a.imprimirBurbuja();
                break;
            case 2:
                a.imprimirQuicksort();
                break;          
            case 3:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public static void main(String[] args) {
       Ordenamiento objeto = new Ordenamiento(); 
        objeto.menu();
        
    }
    
}
