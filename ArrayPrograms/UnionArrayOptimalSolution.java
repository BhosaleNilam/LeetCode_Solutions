import java.util.*;

class UnionArray {
    // Method to find the union of two arrays
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // Pointers for arr1 and arr2
        ArrayList<Integer> arrayList = new ArrayList<>(); // List to store the union

        // Traverse both arrays
        while (i < n && j < m) {
            // If arr1[i] is less than or equal to arr2[j]
            if (arr1[i] <= arr2[j]) {
                // Add the element to the union if it's not already present
                if (arrayList.size() == 0 || arrayList.get(arrayList.size() - 1) != arr1[i]) {
                    arrayList.add(arr1[i]);
                }
                i++;
            } else {
                // Add arr2[j] if it's not already present
                if (arrayList.size() == 0 || arrayList.get(arrayList.size() - 1) != arr2[j]) {
                    arrayList.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of arr1 (if any)
        while (i < n) {
            if (arrayList.get(arrayList.size() - 1) != arr1[i]) {
                arrayList.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2 (if any)
        while (j < m) {
            if (arrayList.get(arrayList.size() - 1) != arr2[j]) {
                arrayList.add(arr2[j]);
            }
            j++;
        }

        return arrayList;
    }

    // Main method
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length;
        int m = arr2.length;

        // Find the union of arr1 and arr2
        ArrayList<Integer> arrayList = FindUnion(arr1, arr2, n, m);

        // Print the union
        System.out.println("Union of arr1 and arr2 is:");
        for (int val : arrayList) {
            System.out.print(val + " ");
        }
    }
}
