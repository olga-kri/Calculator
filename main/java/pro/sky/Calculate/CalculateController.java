package pro.sky.Calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateServise calculateServise;

    public CalculateController(CalculateServise calculateServise) {
        this.calculateServise = calculateServise;
    }

    @GetMapping
    public String showGreeting(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/plus")
    public String additionNumbers(@RequestParam double num1, @RequestParam double num2){
        double result = calculateServise.addition (num1, num2);
        return showString (num1, '+', num2, result);
    }
    @GetMapping(path = "/minus")
    public String subtractionNumbers(@RequestParam double num1, @RequestParam double num2){
        double result = calculateServise.subtraction (num1, num2);
        return showString (num1, '-', num2, result);
    } @GetMapping(path = "/multiply")
    public String multiplicationNumbers(@RequestParam double num1, @RequestParam double num2){
        double result = calculateServise.multiplication (num1, num2);
        return showString (num1, '*', num2, result);
    } @GetMapping(path = "/divide")
    public String divisionNumbers(@RequestParam double num1, @RequestParam double num2){
        if (num2==0){
          return "На ноль делить нельзя!";
        }
        double result = calculateServise.division (num1, num2);
        return showString (num1,'/', num2, result);
    }
    public String showString (double num1, char symbol, double num2, double result){
        return String.format("%f %c %f = %f", num1,symbol,num2,result);
    }
}
