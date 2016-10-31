import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ignacioojanguren on 31/10/16.
 * Remove the duplicate values in an array already sorted.
 * The difficulty of this program is to use the Big O notation to be O(n) and try not to
 * do a O(n^2).
 * I will do both of the notations. The O(n) will perform faster than O(n^2), so it is recomendable
 * to use O(n).
 *
 */
public class RemoveDuplicate {

    /**
     * Function using O(n) notation.
     *
     * Created a Generic Method that will allow to check if there is any duplicates in the array.
     * This method creates a HashSet that will store the non repeated values.
     *
     * @param elements
     *  This is an array T indicates it can be any type of value, like String, Integer, Double, ...
     * @return
     *  Returns the HashSet with the values non repeated
     */
    public static <T> HashSet<T> removeDuplicates(T[] elements){
        HashSet<T> withoutDuplicates = new HashSet<T>();

        for(T element: elements){
            if(!withoutDuplicates.contains(element)){
                withoutDuplicates.add(element);
            }
        }
        return withoutDuplicates;
    }

    /**
     * Function using O(n^2) notation.
     *
     * This method returns the array with the elements removed. However, it appears a null where the duplicate element was.
     * The array has an static dimension, making not possible to remove the position completely.
     * It is a generic method, which will admit any value for the array "elements"
     *
     * @param elements
     *  Element is a generic array that contains the duplicate elements.
     * @return
     *  return the array elements with the duplicates removed
     */
    public static <T> T[] removeDuplicatesSlow(T[] elements){
        for (int i = 0; i < elements.length; i++){
            for (int j = 0; j < elements.length; j++){
                if( i != j && elements[i].equals(elements[j])){
                    elements[i] = null;
                    break;
                }
            }
        }
        return elements;
    }

    public static void main(String[] args){
        //Testing with Strings
        HashSet<String> noDuplicateList = new HashSet<String>();
        String[] sortedList = {"Airplane", "Bicycle", "Bicycle", "Boat", "Car", "Car","Train"};
        noDuplicateList = removeDuplicates(sortedList);
        for(String element: noDuplicateList){
            System.out.print(element + " ");
        }

        System.out.println("\n -- ");

        //Testing with Integers
        HashSet<Integer> noDuplicateListInt = new HashSet<Integer>();
        noDuplicateListInt = new HashSet<Integer>();
        Integer[] sortedListInt = {1, 1, 1, 2, 3, 4, 5, 6, 7, 7};
        noDuplicateListInt = removeDuplicates(sortedListInt);
        for(Integer element: noDuplicateListInt){
            System.out.print(element + " ");
        }

        System.out.println("\n -- ");

        sortedList = new String[]{"Airplane", "Bicycle", "Bicycle", "Boat", "Car", "Car","Train"};
        sortedList = removeDuplicatesSlow(sortedList);
        for(String elements: sortedList){
            // Do not show if the value of the value of element[i] is null.
            if(elements!= null)System.out.print(elements + " ");
        }
    }


}
