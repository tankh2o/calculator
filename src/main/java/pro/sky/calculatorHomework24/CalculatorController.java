package pro.sky.calculatorHomework24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*Написать 5 методов, которые при вызове из браузера делают следующее:
1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.

3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.

4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.

5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.*/
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private NumberService numberService = new NumberService();

    @GetMapping()
    public String greeting() {
        return numberService.greeting();
    }
    @GetMapping(path = "plus")
    public String plus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Вы забыли написать входное значение.";
        }
    return numberService.plus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String minus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Вы забыли написать входное значение.";
        }
        return numberService.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Вы забыли написать входное значение.";
        }
        return numberService.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divide(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Вы забыли написать входное значение.";
        }
        if (num2 == 0) {
            return ("Ошибка! Делить на ноль нельзя.");
        }
        return numberService.divide(num1,num2);
    }

}
