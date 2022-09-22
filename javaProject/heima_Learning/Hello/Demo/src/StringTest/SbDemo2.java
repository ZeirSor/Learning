package StringTest;

public class SbDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder().append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i] + "]");
            } else {
                sb.append(arr[i] + ", ");
            }
        }

        return sb.toString();
    }
}
