package Homework16_2;

@CalculatorAnnotation
public class Calculator {


    double firstNum;
    double secondNum;

    /**
     *
     * @param firstNum
     * @param secondNum
     */
    public Calculator(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    /**
     *
     * @return sum of two nums
     */
    double sum () {
        return firstNum + secondNum;
    }

    /**
     *
     * @return difference of two nums
     */
    double sub () {
        return firstNum - secondNum;
    }

    /**
     *
     * @return product of two nums
     */
    double mul () {
        return firstNum * secondNum;
    }

    /**
     *
     * @return fraction of two nums
     */
    double div () {
        if (secondNum != 0) {
            return firstNum / secondNum;
        }
        return Integer.MAX_VALUE;
    }
}