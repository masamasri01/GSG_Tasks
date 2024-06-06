/*
 Task A.

Given an array representing heights of buildings. 
The array has buildings from left to right,
 count the number of buildings the person can see.
It is assumed that heights of all buildings are distinct.

Example:
Input: [1,7,4,5,8,2,10,9] 
Output: [1,7,8,10]
 */
public class GSGTask {
    static int[] func(int[] inputArray) {
    	int inputArrayLength = inputArray.length;
    	if(inputArrayLength==0) return null;
    	int outputArray[]= new int[inputArrayLength];// since its a static array, i've created it with the maximum size it could have.
    	int idx=0;
    	int firstHeight = inputArray[0];
    	 outputArray[idx++] = firstHeight;
    	int maximumSoFar = firstHeight;
    	for (int i : inputArray) {
    		if (i>maximumSoFar)
    			{
    			 maximumSoFar = i;
    			 outputArray[idx++] = i;
    			}
    	}
    	return outputArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = {1,7,4,5,8,2,10,9};
		int tmpOutputArray[] = func(inputArray);
		int countnoBuldings = 0;
		if (tmpOutputArray!= null)
		{
			for(int i :tmpOutputArray){
			if (i!=0) {
				System.out.println(i);
				countnoBuldings++;
			}
			
		    }
			System.out.println("number of buildings the person can see = "+countnoBuldings);
		}
		
		else System.out.println("No building can be seen");
		
		
		// to create an output array matching the requirement (not containing 0's):
		int OutputArray[]= new int [countnoBuldings];
		for (int i = 0 ; i<countnoBuldings ; i++ ) {
			OutputArray[i] = tmpOutputArray[i];
		}
	}

}
