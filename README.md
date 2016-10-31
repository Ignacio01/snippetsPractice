# snippetsPractice

This repository will store small snippets of java code from different problems.

  1) ReplaceProducts.java: This program replaces the value of every element in the array by the product of every
  element except by itself.
      - I did two methods, one that works with O(n^2) and the other with O(n).
  
  2) RemoveDuplicate.java: This code removes all the duplicates values in an array. The methods are created as generics, to different types of Data can use these methods.
      - The first method removeDuplicates(T[] elements), creates a HashSet to store the values not repeated in the array pased to the method removeDuplicates(). Using a Big O notation of O(n)
      - The second method removeDuplicatesSlow(T[] elements), replace the duplicate values in the array passed to the method by null. The Big O notation of this code is O(n^2).
