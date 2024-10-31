package co.edu.eci.lambda.springrest;

public class BinarySearchA {
    public int binarySearch(String list, String value) {
        String[] listArray = list.split(",");
        int left = 0;
        int right = listArray.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (listArray[middle].equals(value)) {
                return middle;
            }
            if (listArray[middle].compareTo(value) < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
