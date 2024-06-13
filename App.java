package br.com.danielsilva.annotations.tabela;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        myAnnotations();

    }

    private static void myAnnotations(){
        ClassAnnotations1 m = new ClassAnnotations1();
        Annotation [] annotations = m.getClass().getAnnotations();
        for (Annotation an : annotations){
            System.out.println(an.annotationType());

        }
        for (Constructor constructor: m.getClass().getConstructors()) {
            if (constructor.isAnnotationPresent(Teste4.class)) {
                Teste4 anno = (Teste4) constructor.getAnnotation(Teste4.class);
                System.out.println(anno.value());

            }
            for (Field field : m.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Tabela.class)) {
                    Tabela filds = field.getAnnotation(Tabela.class);
                    System.out.println(filds.value());
                }
            }
            for (Field field : m.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Teste4.class)) {
                    Teste4 filds = field.getAnnotation(Teste4.class);
                    System.out.println(filds.value());
                }
            }


        }

        }


}
