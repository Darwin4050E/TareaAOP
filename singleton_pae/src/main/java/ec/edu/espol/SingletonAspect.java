package ec.edu.espol;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SingletonAspect {

    @Pointcut("execution(public static ec.edu.espol.Singleton ec.edu.espol.Singleton.getInstancia(String))")
    public void creacionInstanciaSingleton(){}

    @AfterReturning("creacionInstanciaSingleton()")
    public void registroInstanciaSingleton(){
        System.out.println("Se ha registrado una instancia Singleton.");
    }

}