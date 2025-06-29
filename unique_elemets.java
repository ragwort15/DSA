
import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        String[] originalArray = {"apple", "banana", "apple", "orange", "banana", "grape"};

        
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(originalArray));

        
        String[] uniqueArray = uniqueSet.toArray(new String[0]);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Unique Elements (Set): " + uniqueSet);
        System.out.println("Unique Elements (Array): " + Arrays.toString(uniqueArray));
