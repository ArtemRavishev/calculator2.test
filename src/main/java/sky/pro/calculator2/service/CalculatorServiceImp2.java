package sky.pro.calculator2.service;

import org.springframework.stereotype.Service;
import sky.pro.calculator2.exeptions.DivByZeroExeption;

@Service
class СalculatorServiceImpl2 implements СalculatorService2 {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }


    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2)
    {   if (num2==0){
        throw new DivByZeroExeption();
    }
        return num1 / num2;
    }
}