package Homework16_3;

import java.lang.annotation.*;
import java.util.ArrayList;

//@Inherited объявляется только для анотаций
@Deprecated
@SuppressWarnings("unchecked")
public class Engine {
    @SafeVarargs
    static void markEngine(int... marks){
        ArrayList<Integer> someMarks = new ArrayList<>();
        for (int mark : marks) {
            for (int someMark : someMarks) {
                if (mark != someMark) {
                    someMarks.add(mark);
                }
            }
        }
    }
}

@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface EngineAnnotation{

}