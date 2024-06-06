/*
Task B.

Given an array of integers nums sorted in ascending order, write the code to to achieve this: 
remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.(code required)

Example

Input: nums = [0,0,1,1,2,2,3,3,4,4,5,5,5] Output: 5, nums = [0,1,2,3,4,5,_,_,_,_,_,_,_]
 */
public class GSGTask {
    static int[] func(int[] inputArray) {
    	int inputArrayLength = inputArray.length;
    	if(inputArrayLength==0) return null;
    	int numOfDuplicates = 0;
    	int element = inputArray[0];
    	for (int i=1 ; i<inputArrayLength-numOfDuplicates ; i++) { // we dont have to exchange the duplicates with each others so we stop once we reach them
    		if (inputArray[i]==element) { //duplicate
    			for (int j=i ; j< inputArray.length-1-numOfDuplicates ; j++) { // we dont have to exchange the duplicates with each others so we stop once we reach them
    				inputArray[j] = inputArray[j+1];
    			}
    			numOfDuplicates++;
    			inputArray[inputArray.length-numOfDuplicates] = -1; // we'l' replace duplicates by -1, we must use a number thats not in the range of numbers in the array
    			i--; // since the next number is shifted to current index, we'll check it again
    		
    		}
    		else { // if its not duplicate, hold it to check if there's duplicate next
    			element = inputArray[i];
    			
    		}
    			
    	}
    	return inputArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = {0,1,1,1,2,2,3,3,3,3,4,5,5};
		int tmpOutputArray[] = func(inputArray);
		
		if (tmpOutputArray!= null)
		{
			for(int i :inputArray){
				System.out.println(i);
			 }
			
		}
		else System.out.println("Empty array");
		
	}

}
