public class cleanCode {

    // stores min and max of an integer array
    static class intArrayMinMax {

        int min;
        int max;
        
    }

    // returns the min and max of inputted integer array
    static intArrayMinMax getMinMaxOfArray(int arr[], int length) {
        intArrayMinMax minMax = new intArrayMinMax();
        int i;

        if (length == 1) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }

        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        for (i = 2; i < length; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            } else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }

        return minMax;
    }

    public static void main(String args[]) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int length = 6;
        intArrayMinMax minMax = getMinMaxOfArray(arr, length);
        System.out.printf("\nmin is %d", minMax.min);
        System.out.printf("\nmax is %d", minMax.max);
    }
}