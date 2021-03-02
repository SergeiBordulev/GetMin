public class GetMin {
    public static int getMin(int[] array, int start) {
        int position = start;
        int min = array[position];

        for (int i = start; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                position = i;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        int[] array = {3, 16, 5, 14, 13, 12, 11, 15, 4, 17};

        System.out.println("The index of the minimum value: " + getMin(array, 1));
    }
}
