package assignment;

public class ques1 {

        public static void main(String[] args) {
            int[] arr = {4,5, 6, 5, 4, 3};

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {

                    int fi = 0, fj = 0;

                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == arr[i]) fi++;
                        if (arr[k] == arr[j]) fj++;
                    }

                    if (fi < fj || (fi == fj && arr[i] > arr[j])) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for (int x : arr) {
                System.out.print(x + " ");
            }

    }

}
