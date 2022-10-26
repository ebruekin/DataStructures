public class HeapSort {
    public void sort(int arr[]){    
        int N = arr.length;       
        for (int i = N / 2 - 1; i >= 0; i--)        //Build heap (rearrange array)
            heapify(arr, N, i); 
        
        for (int i = N - 1; i > 0; i--) {           // One by one extract an element from heap
            int temp = arr[0];                      // Move current root to end
            arr[0] = arr[i];
            arr[i] = temp;          
                                            
            heapify(arr, i, 0);                  // call max heapify on the reduced heap
            
        }
    }

    void heapify(int arr[], int N, int i){         // To heapify a subtree rooted with node i which is
                                                    // an index in arr[]. n is size of heap
    
        int largest = i;                            // Initialize largest as root
        int l = 2 * i + 1;                          // left = 2*i + 1
        int r = 2 * i + 2;                          // right = 2*i + 2
 
        if (l < N && arr[l] > arr[largest])         // If left child is larger than root
            largest = l; 
                                                    // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r; 
        
        if (largest != i) {                          // If largest is not root
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap; 
            
            heapify(arr, N, largest);                 // Recursively heapify the affected sub-tree
        }
    }
 
    /* A utility function to print array of size n */
    public void printArray(int arr[])
    {
        int N = arr.length;
 
        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

