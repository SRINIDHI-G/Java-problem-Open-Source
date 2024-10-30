 
class SelectionSort 
{ 
static void minMaxSelectionSort(int[] arr, int n) 
{ 
	for (int i = 0, j = n - 1; i < j; i++, j--) 
	{ 
		int min = arr[i], max = arr[i]; 
		int min_i = i, max_i = i; 
		for (int k = i; k <= j; k++) 
		{ 
			if (arr[k] > max) 
			{ 
				max = arr[k]; 
				max_i = k; 
			} 
			
			else if (arr[k] < min) 
			{ 
				min = arr[k]; 
				min_i = k; 
			} 
		} 

	
		swap(arr, i, min_i); 
 
		if (arr[min_i] == max) 
			swap(arr, j, min_i); 
		else
			swap(arr, j, max_i); 
	} 
} 

static int[] swap(int []arr, int i, int j) 
{ 
	int temp = arr[i]; 
	arr[i] = arr[j]; 
	arr[j] = temp; 
	return arr; 
} 


public static void main(String[] args) 
{ 
	int arr[] = { 23, 78, 45, 8, 32, 56, 1 }; 
	int n = arr.length; 
	minMaxSelectionSort(arr, n); 
	System.out.printf("Sorted array:\n"); 
	for (int i = 0; i < n; i++) 
		System.out.print(arr[i] + " "); 
	System.out.println(""); 
} 
} 

 
