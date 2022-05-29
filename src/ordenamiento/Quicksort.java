
package ordenamiento;


public class Quicksort {
    int array [];
    
    public Quicksort(int arreglo []){
        this.array = arreglo;
    }
    
    public int ordenamientoQuicksort(int inicio, int fin){
        int pivote = array[inicio];     //El primer elemento del arreglo será el pivote
        int aux;                 
        while (true){
            while (array[inicio] < pivote){                //busca el elemento mayor del pivote
                inicio ++;               
            }
            while (array[fin] > pivote){                   //busca el elemento menor del pivote
                fin --;
            }
            if (inicio >= fin){                              //Si el inicio es mayor o igual al fin se rompe el ciclo
                break;
            }
            else {                                           //Sino hace el intercambio de dato para ordenar el arreglo
                aux = array[inicio];
                array[inicio] = array[fin];
                array[inicio]= aux;
                inicio ++;
                fin --;               
            }
        }
        return 0;
                
    }
    
}
