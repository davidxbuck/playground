public class InsertionSort {
}
    public static int[] insertionSort(int[] A) {
        for (int j = 2; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] < key) {
                A[i+1] = A[i];
                i = i - 1;
                A[i+1] = key;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {41, 23, 16, 35, 47, 19, 12};
        System.out.println(insertionSort(A));
    }
    

    
    
//INSERTION-SORT(A)
// for j = 2 to A.length
//     key = A[j]
//     // Insert A[j] into sorted sequence A[1... j-1]
//     i = j - 1
//     while i > 0 and A[i] > key
//         A[i+1] = A[i]
//         i = i-1
//     A[i-1] = key

//        def insertion_sort(A):
//        for j in range(2, len(A)):
//        key = A[j]
//// Insert A[j] into sorted sequence A[1... j-1]
//        i = j - 1
//        while i >= 0 and A[i] > key:  # reverse the second condition for descending sequence
//        A[i + 1] = A[i]
//        i = i - 1
//        A[i + 1] = key
//        return A
//
//
//