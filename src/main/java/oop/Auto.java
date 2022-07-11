package oop;
// nombre de la clase
public class Auto {
	//atributos de la clase, deben ser privados
	private String color;
	private int anio;
	private long serie;
	private String marca;
	private String modelo;
	private float velocidad;
	private float velocidadMaxima;
	private boolean encendido;
	private Motor motor; 
	
	
	//CUANDO NACE EL OBJETO: CONSTRUCTOR  
	
	public Auto(float velocidadMaxima, String marca, Motor motor){
		
		this.setVelocidad(0);
		this.setAnio(2022);
		marca = "sin marca";
		modelo = "sin modelo";	
		this.setEncendido(false);
		velocidadMaxima = 3;
		this.setMotor(motor);
	}
	// metodos
	
	public void encender() {
		if (!this.isEncendido()) {
			this.setEncendido(true);
			System.out.println("se ha encendido el auto");
		} else {
			System.out.println("no se piede entender dos veces");
		}
		
	}
	
	public void setMotor (Motor motor) {
		if (motor == null) {
			Motor motorInterno = new Motor ("default", 100f);
			this.motor = motorInterno; 
		}else {
		
		this.motor = motor;
	}
	}
	
	public Motor getMotor() {
		return this.motor;
	
	}

	public void apagar() {
		if (this.isEncendido()) {
			
			while (this.getVelocidad() > 0) {
				frenar (); 
			}
		
			this.setEncendido(false);
			System.out.println("se ha apagado correctamente");
		}else {
			System.out.println("no se puede apagar dos veces");
		}
	}
		
	
	public void acelerar() {
		// if encendido == true
		if (this.isEncendido()){
			if (this.getVelocidad() < this.getVelocidadMaxima()) {
				this.setVelocidad(this.getVelocidad()+1);
				
		}else{
			System.out.println("error; no puede superar la velocidad maxima");
		
	}
		}else {
			System.out.println();
		}
	}
	public void frenar() {
		if (this.isEncendido()) {
			if (this.getVelocidad() > 0) {
				
				this.setVelocidad(this.getVelocidad() - 1);
			}
		
			}else {
				System.out.println("error, auto apagado");
		}
		
	}
	
	void verVelocidad() {
		System.out.println(velocidad);
	}
	public String getMarca() {
	// esto es la logica en el mundo exterior
		// wrappers son las clases que guardan dentro un tipo de dato primitivo en particular, dems tienen metodos
		//Long Float Double
		// Byte Short Integer
		// sus objetos valen null si no se les asigna un valor
		//ejemplo
		////String algo; // vale null
		//integer otraCosa; //vale null
		//int algoInt; // vale 0
		// tipos de datos primitivos en java
		// byte< short< int < long< float < double
		// boolean
		//chart
		
	
	return marca == null ? "" : marca; // null "" algo
	}
	
	public void setMarca (String marca) {
		
		this.marca = marca; 
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	private void setAnio(int anio) {
		this.anio = anio;
	}

	public long getSerie() {
		return serie;
	}

	private void setSerie(long serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidad() {
		return velocidad;
	}

	private void setVelocidad(float velocidad) {
		if (velocidad < 0) {
		this.velocidad = 0;
		}else{ 
			this.velocidad = velocidad;
		}
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isEncendido() {
		return encendido;
	}

	private void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	

}
	
/// alt+shit+s


