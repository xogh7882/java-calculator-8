package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Request {

    private final String input;
    private final List<String> list = Arrays.asList("?", "*", "+", "(", ")", "[", "]", "{", "}", ".", "\\");

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
        String separator = ",|:";
        String inputNum = input;

        // input이 0 or null 인 경우
        if (input.isEmpty() || input.equals("0")) {
            return;
        }

        // Custom 구분자 존재 여부 확인
        if (input.startsWith("//")) {
            int endIdx = input.indexOf("\\n");
            if (endIdx == -1) {
                throw new IllegalArgumentException("Error");
            }
            String newSeparator = input.substring(2, endIdx);
            if (list.contains(newSeparator)) {
                separator += "|\\" + newSeparator;
            } else {
                separator += "|" + newSeparator;
            }

            inputNum = input.substring(endIdx + 2);
        }

        String[] numbersArray = inputNum.split(separator);
        try{
            for (String number : numbersArray) {
                if(Integer.parseInt(number) < 0) throw new IllegalArgumentException("Error");
                numbers.add(Integer.parseInt(number));
            }
        }catch(Exception e){
            throw new IllegalArgumentException("Error");
        }

    }
}
