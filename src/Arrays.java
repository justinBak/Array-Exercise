
public class Arrays {
	
	public static int[] toPower(int size, int power) {
		//int[] returnValue = new int[size];
		
		//return returnValue;
		int[] result = new int[size+1];  // use "n+1" otherwise it will throw exception
	    int i = 0;
	    while (i <= size) 
	    {
	        result[i] = power;
	        power *= 2;
	        i++;        // increments "i" otherwise its an infinite loop
	    }
	    return result;
	}

	public static void main(String[] args) {
		
		System.out.println("Question 1");
		int [] array = {0,1,2,3,4};
		int sum = 0;
		int index = 0;
		for(int i = 1; i < array.length; ++i) {
				sum += array[i];
		}
		System.out.println(sum);
		
		System.out.println("Question 2");
		double[ ] exampleArray = {1,5,6,5,4,1};
		
		double maximum = exampleArray[0];
		
		int index2 = 0;
		
		for (int i = 1; i<exampleArray.length; i++){
			if (exampleArray[ i ] > maximum) {
		
				//maximum = exampleArray[ i ];
		
				index2 = i;
		
			}
		
		}

         System.out.println(index2);
         
         System.out.println("^^It returns the index of the largest number in the array.^^");
         
	}
	

}
