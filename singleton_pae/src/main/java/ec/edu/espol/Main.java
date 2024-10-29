package ec.edu.espol;

public class Main {
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstancia("Soy el primero!");
        Singleton otroSingleton = Singleton.getInstancia("Soy el segundo!");

        System.out.println(singleton.valor);
        System.out.println(otroSingleton.valor);

    }
}