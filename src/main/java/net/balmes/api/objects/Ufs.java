package net.balmes.api.objects;

public class Ufs {
	
	private String modulo;
	private int tiempo;
	private int alumnosReg;
	
	public Ufs(String modulo, int tiempo, int alumnosReg) {
		super();
		this.modulo = modulo;
		this.tiempo = tiempo;
		this.alumnosReg = alumnosReg;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getAlumnosReg() {
		return alumnosReg;
	}

	public void setAlumnosReg(int alumnosReg) {
		this.alumnosReg = alumnosReg;
	}

	@Override
	public String toString() {
		return "Ufs [Modulo=" + modulo + ", Tiempo=" + tiempo + ", Alumnos Registrados =" + alumnosReg + "]";
	}
	
	
}
