
package ordenamiento;

public class Arreglo {
    int arreglo [];
    
    public Arreglo(){
        arreglo = new int[10];
    }
      
    public void llenarArreglo(){
        for(int i =0; i<arreglo.length; i++){
            arreglo[i]= (int)(Math.random()*100);        
        }
    }
  
    public void imprimirBurbuja(){
        System.out.println("______Método Burbuja_______ ");
        Burbuja array = new Burbuja(arreglo);
        array.ordenamientoBurbuja();
        System.out.println("Arreglo ordenado");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }   
    }
    
    public void imprimirQuicksort(){
        System.out.println("______Método Quicksort_______ ");
        Quicksort array = new Quicksort(arreglo);
        array.ordenamientoQuicksort(0,arreglo.length-1);
        System.out.println("Arreglo ordenado");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }   
    }
    
}