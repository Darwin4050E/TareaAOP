package ec.edu.espol;

public class Singleton {

    private static Singleton instancia;
    public String valor;

    private Singleton(String valor){

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        this.valor = valor;

    }

    public static Singleton getInstancia(String value){

        if(instancia == null){
            instancia = new Singleton(value);
        }

        return instancia;

    }

}