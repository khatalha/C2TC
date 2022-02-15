package Annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTv {
    String osi() default "Sumsung";
    int versions() default 8;
}

