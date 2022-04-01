
public class Arrays {
	
	public static double[] toPower(int size, int power) {
		
		double[] returnValue = new double[size];
		
		for(int index=0; index<size; index++) {
			returnValue[index] = Math.pow(index, power);
		}
		return returnValue;
	
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
         
         System.out.println("Question 3");
         
         double[] values = toPower(4, 2);
         
         for(double value:values) {
        	 System.out.println(value);
         }
         
	}
	

}
