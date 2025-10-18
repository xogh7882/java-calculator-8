package calculator;

import java.util.ArrayList;

public class Request {

    private String input;

    public Request(String input) {
        this.input = input;
    }

    public int[] separateNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            // input 구분자로 나누기
        }
        int[] result = new int[numbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
}
