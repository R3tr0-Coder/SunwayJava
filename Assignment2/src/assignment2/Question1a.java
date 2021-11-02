package assignment2;

class Question1a {
    public static int smallestIndex(int[] numberArray, int arraySize) {
        int smallest = 0;
        
        for (int i = 0; i < arraySize; i++)
	{
		if (numberArray[i] < numberArray[smallest])
		{
                    smallest = i;
		}
	}
        return smallest;
}
    
    public static void main(String[] args) {
	final int MAX_ARRAY_SIZE = 10;
	int[] testArray = {4, 20, 80, 123, 356, 456, 40, 59, 69, 74};
	int smallestPosition = smallestIndex(testArray, MAX_ARRAY_SIZE);
	System.out.print("The smallest index was position: ");
	System.out.print(smallestPosition);
	System.out.print(" with a value of: ");
	System.out.print(testArray[smallestPosition]);
        System.out.println();
    }
}


