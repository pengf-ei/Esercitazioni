package vehicle;

public class TestVehicles {

	public static void main(String[] args) {
		Vehicle[] veh = new Vehicle[6];
		
		veh[0] = new Vehicle("ES562ED","Fiat","500",false);
		veh[1] = new Car("AB000BC","Fiat","500",false,"Normale");
		veh[2] = new Car("AB111CD","Fiat","500",true,"Normale");
		veh[3] = new Motocycle("DD123EE","Yamaha","600",false,50);
		veh[4] = new Vehicle("XX554YY","Toyota","456",true);
		veh[5] = new Motocycle("DD123EE","Yamaha","600",false,50);
		
		for(int i = 0; i < veh.length; i++) {
			if(veh[i].isGuasto())
				System.out.println("Veicolo guasto: " + veh[i].getTarga());
		}
		
	}

}
