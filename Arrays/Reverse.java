//Reverse the given Array
public class Reverse {
    static void reverseArray(int a[]) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 2, 1 };
        reverseArray(a);
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");

        }

    }

}
