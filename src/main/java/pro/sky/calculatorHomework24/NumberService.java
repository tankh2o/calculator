package pro.sky.calculatorHomework24;

import org.springframework.stereotype.Service;
@Service
public class NumberService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        String plus = String.valueOf(num1 + num2);
        return plus;
    }

    public String minus(int num1, int num2) {
        String minus = String.valueOf(num1 - num2);
        return minus;
    }

    public String multiply(int num1, int num2) {
        String multiply = String.valueOf(num1 * num2);
        return multiply;
    }

    public String divide(int num1, int num2) {
        String divide = String.valueOf(num1 / num2);
        return divide;
    }
}
