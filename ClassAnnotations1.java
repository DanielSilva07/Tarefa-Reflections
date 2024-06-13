package br.com.danielsilva.annotations.tabela;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@Tabela("teste3")
public class ClassAnnotations1 {

    @Tabela(value = "Minha Tabela")
    private String nome;

    @Teste4("myCodigo")
    private Long codigo;

    @Teste4("AnnotationContructor")
    public ClassAnnotations1(){

    }


    public  static void myMethodAnootation(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
