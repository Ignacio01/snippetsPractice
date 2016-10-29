/**
 * Created by ignacioojanguren on 29/10/16.
 *
 * This program replaces the each value in the array by the product of all the values in the array.
 * The product of the array doesn't include itself.
 *
 */
public class ReplaceProducts implements Cloneable{
    public static void main(String[] args) {
        int[] valuesReplace = {1,5,4,6,5};
        // O(n^2)
        valuesReplace = replaceProducts(valuesReplace);
        for (int val: valuesReplace){
            System.out.println(val);
        }

        // O(n)
        valuesReplace = new int[]{1,5,4,6,5};
        valuesReplace = replaceProductsOn(valuesReplace);
        for (int val: valuesReplace){
            System.out.println(val);
        }
    }

    /**
     * This function calculates the product of each number in the array without including the number itself.
     * This function uses O(n^2) to go over the array.
     * @param valuesReplace
     *  Values replace is the integer array that has to be replaced
     * @return
     *  int[] changesValues, which it is a clone to the valuesReplace. This is because if we replace the value
     *  in valuesReplace the next operations will use the new value of the number.
     */
    public static int[] replaceProducts(int[] valuesReplace){
        int total = 1;
        int[] changesArray = valuesReplace.clone();
        for(int i = 0; i < valuesReplace.length; i++){
            total = 1;
            for(int j = 0; j < valuesReplace.length; j++){
                if(j != i){
                    total = total * valuesReplace[j];
                }
            }
            changesArray[i] = total;
        }
        return changesArray;
    }

    /**
     * However to do the code faster we could use a O(n).
     * This code goes over the array multiplying all the values. Then after for each spot in the array, it
     * would be divided by the number in that place and replaced by the total.
     * @param valuesReplace
     *  The array of int that need to be sorted.
     * @return
     *  The array of integers with the values sorted.
     */
    public static int[] replaceProductsOn(int[] valuesReplace){
        int[] changesArray = new int[valuesReplace.length];
        int total = 1;

        for(int i = 0; i < valuesReplace.length; i++){
            total = total * valuesReplace[i];
        }
        for (int i = 0; i < valuesReplace.length;i++){
            changesArray[i] = total / valuesReplace[i];
        }
        return changesArray;
    }
}
