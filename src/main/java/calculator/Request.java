package calculator;

import java.util.ArrayList;

public class Request {

    private String input;

    public Request(String input) {
        this.input = input;
    }

    public int[] separateNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        separate(numbers);
        int[] result = new int[numbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }

    public void separate(ArrayList<Integer> numbers) {
        String[] numbersArray = input.split(",|:");
        for (String number : numbersArray) {
            numbers.add(Integer.parseInt(number));
        }
    }
}
