package TechnicalSkillsLecture;
public class TimeToEqualTheElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2};
        int max = arr[0];
        int value;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            value = max - arr[i];
            count = count + value;
        }
        System.out.println(count);
    }
}
