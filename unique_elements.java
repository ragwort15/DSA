
import java.util.*;

public class Unique_Elements{
 public static void main(String[] args)[
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter size of array (N): ");
  int N= sc.nextLine();
  
  int[] arr= new int[N];
  System.out.println("Enter " + N + "elements:");
  for(int i=0;i<=N;i++){
  arr[i]=sc.nextLine();
}
Set<Integer> uniqueSet=new LinkedHashSet<>();
for(int num :arr){
  uniqueSet.add(num);
}

System.out.println("Unique elements in the array:");
for(int num: uniqueSet){
    System.out.println(num + " ");
	}
	sc.close();
	
 }
} 