package co.edu.eci.lambda.springrest;

public class LinearSearchA {
    public static int linearSearch(String list, String value) {
        String[] listArray = list.split(",");
        for (int i = 0; i < listArray.length; i++) {
            if (listArray[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}
