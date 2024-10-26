package espol.edu.ec;

public class Empleado {
    private final String nombre;
	private final String posicion;
	private final String NombreImpresora;
	public Empleado(String nombre, String posicion, String NombreImpresora) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.NombreImpresora = NombreImpresora;
	}
	public void printCurrentFunción(){
		Impresora impresora = Impresora.getInstance(NombreImpresora);
		impresora.print("empleado: " + nombre + "\n" +
			"Posición: " + posicion + "\n"
			);
	}
}
