package pro.sky.calculatorHomework24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
