package oop;

public class FabricadeAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// quiero crear mi primer objeto de la clase Auto
		Auto fiatUno = new Auto(300f, "AUTO", new Motor("motor",300f));

		fiatUno.encender();
		fiatUno.verVelocidad(); // 0
		
		//System.out.println("velocidad actual =" + fiatUno.velocidad); 
		fiatUno.acelerar();
		fiatUno.verVelocidad(); //1
		
		fiatUno.acelerar();
		fiatUno.verVelocidad(); //2
		
		fiatUno.frenar();
		fiatUno.verVelocidad();
		
		fiatUno.apagar(); 
		fiatUno.verVelocidad(); //0
		
		System.out.println("FIN");

	}

}
