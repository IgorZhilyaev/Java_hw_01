public class Task02 {
    public static void main(String[] args) {

        System.out.println(GetDiv(215));
    }

    public static int GetDiv(int num) {

        if (num < 11) {
            return num;

        } else {
            int count = 0;
            while (num != 0){
                count += num % 10;
                num /= 10;
            }
            return count;
        }
    }
}