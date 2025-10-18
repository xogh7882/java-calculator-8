package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        // 입력
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        Request requestDto = new Request(Console.readLine());

        // 결과 계산
        Calculator calculator = new Calculator();
        int result = calculator.add(requestDto.separateNumbers());

        //출력
        System.out.println("결과 : " + result);
        Console.close();
    }
}
