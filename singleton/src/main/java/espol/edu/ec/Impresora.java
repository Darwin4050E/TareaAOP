package espol.edu.ec;

public final class Impresora {
    private String nombre;
    private static Impresora impresora;
	private int NumeroPáginas;

    private Impresora(String nombre, int NumeroPáginas) {
        this.nombre=nombre;
        this.NumeroPáginas=NumeroPáginas;
	}
	public static Impresora getInstance(String nombre) {
		return impresora == null ? impresora = new Impresora(nombre,0) : impresora;
	}
	public void print(String text){
		System.out.println(text +
				"\nnúmero de páginas impresas hoy " + ++ NumeroPáginas +
				"\nnombre de la impresora: "+nombre+"\n---------");
	}
}
