package Homework16_2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CalculatorAnnotation {
    double firstNum() default 100;
    double secondNum() default 200;
}
