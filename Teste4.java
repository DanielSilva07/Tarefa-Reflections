package br.com.danielsilva.annotations.tabela;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD,ElementType.CONSTRUCTOR})

public @interface Teste4 {

    String value();
}



