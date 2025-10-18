package calculator;

public class Calculator {
    // 덧셈 기능
    public int add(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // 확장성 고려 ( 뺄셈, 곱셈, 나눗셈 추가시 바로 사용 가능)
}
