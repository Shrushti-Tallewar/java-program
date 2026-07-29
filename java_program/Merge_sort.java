import java.util.*;
public class Merge_sort 
{
	public static void main(String[] args) 
	{
	int [] array = {38,27,43,3,9,82,10};
	System.out.print("Original array : "+Arrays.toString(array));
	
	mergeSort(array,0,array.length-1);
	System.out.println("\nSorted array : " + Arrays.toString(array));
	}
	static void mergeSort(int [] array,int left ,int right)
	{
		if(left < right)
		{
			//Find the middle index
			int mid = (left+right)/2;
			// Sort left half - by using recursion
			mergeSort(array,left,mid);
			// Sort right half - by using recursion
			mergeSort(array,mid+1,right);
			//merge both sorted halves
			merge(array,left,mid,right);
		}
	}
	//Function to merge two sorted array
	static void merge(int [] array ,int left,int mid, int right)
	{
		//Size of the left array
		int n1 = mid - left + 1;
		//Size of the right array
		int n2 = right-mid;
		
		//Two temporary arrays
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		//Copy the data into left array
		for(int i =0 ; i<n1;i ++)
		{
			L[i]=array[left+i];
		}
		//Copy the data into right array
				for(int j =0 ; j<n2; j ++)
				{
					R[j]=array[mid+1+j];
				}
		//Three initial indices 
				int i = 0;                //for left SubArray
				int j = 0;                //for right SubArray
				int k = left;
				
		//compare and merge
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				array[k] = L[i];
				i++;
			}
			else
			{
				array[k] = R[j];
				j++;
			}
			k++;
		}
		//copy remaining elements of L[i]
		while (i <n1)
		{
			array[k]=L[i];
			i++;
			k++;
		}
		//copy remaining elements of R[i]
		while (j <n2)
				{
					array[k]=R[j];
					j++;
					k++;
				}
	}
}
                 









