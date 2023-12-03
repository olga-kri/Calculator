package pro.sky.Calculate;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiseImpl implements CalculateServise {
    public double addition (double num1, double num2){
        return num1+num2;
    }
    public double subtraction  (double num1, double num2){
        return num1-num2;
    }
    public double multiplication  (double num1, double num2){
        return num1*num2;
    }
    public double division (double num1, double num2){
        return num1*num2;
    }

}
