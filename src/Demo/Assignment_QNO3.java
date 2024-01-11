package Demo;
import java.util.Random;
import java.util.Arrays;
public class Assignment_QNO3 {

	public static void main(String[] args) {
		int [] randomNumbers = new int[10]; 
		 Random random = new Random();
		 for(int i =0; i<10; i++){
		 int randomInteger = random.nextInt(1001);
		 randomNumbers[i] = randomInteger; 
		}
		 System.out.println("Array in Random order : "+Arrays.toString(randomNumbers));
		 System.out.println("Array in Ascending order :"+Arrays.toString(getAscendingOrder(randomNumbers)));
		 System.out.println("Array in Descending order : "+Arrays.toString(getDescendingOrder(randomNumbers)));
		 }
		 public static int[] getAscendingOrder(int [] samplearray){
		 int i, j, temp;
		 for ( i = 0; i < samplearray.length - 1; i ++ ) 
		 {
		 for ( j = i + 1; j <samplearray.length; j ++ )
		 {
		 if( samplearray[ i ] > samplearray[ j ] )
		 {
		 temp = samplearray[ i ];
		 samplearray[ i ] = samplearray[ j ];
		 samplearray[ j ] = temp; 
		 } 
		 }
		 }
		 return samplearray;
		 }
		 public static int[] getDescendingOrder(int [] samplearray){
		 int i, j, temp;
		 for ( i = 0; i < samplearray.length - 1; i ++ ) 
		 {
		 for ( j = i + 1; j < samplearray.length; j ++ )
		 {
		 if( samplearray[ i ] < samplearray[ j ] )
		 {
		 temp = samplearray[ i ];
		 samplearray[ i ] = samplearray[ j ];
		 samplearray[ j ] = temp; 
		 } 
		 }
		 }
		 return samplearray;
		 }
}