
package ordenamiento;


public class Burbuja {
   int[] array;
   
   public Burbuja(int[] arreglo){
       this.array = arreglo;
   }
    public void ordenamientoBurbuja() {
        int temp = 0;
        for(int i=0; i < array.length; i++){
             for(int j=1; j < (array.length-i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
             }
        }
    }
}
