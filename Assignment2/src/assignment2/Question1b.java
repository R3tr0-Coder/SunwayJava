package assignment2;

public class Question1b {
    public static int lastLargestIndex(int[] numberArray, int arraySize) {
	int largestIndex = 0;

	for (int i = 0; i < arraySize; i++)
	{
            if (numberArray[i] >= largestIndex)
            {
                largestIndex = i;
            }
        }
    
    return largestIndex;
}
    public static void main(String[] args) {
	final int MAX_ARRAY_SIZE = 10;
	int[] testArray = {51, 22, 56, 13, 12, 46, 1, 78, 77, 78};
	int largestIndexPos = lastLargestIndex(testArray, MAX_ARRAY_SIZE);
	System.out.print("The largest index was position: ");
	System.out.print(largestIndexPos);
	System.out.print(" with a value of: ");
	System.out.print(testArray[largestIndexPos]);
        System.out.println();
    }
}