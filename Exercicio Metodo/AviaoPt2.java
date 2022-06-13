package ExercicioMetodo;

public class AviaoPt2 {

	public static void main(String[] args) {
		
		 Aviao airbong = new Aviao();


		 	airbong.modelo = "AirBong";
		 	airbong.cor = "Branco e azul";
		 	airbong.ano = (String) "2011";
		 	airbong.legalizado = true;
		 	airbong.altitude = 1000;

	              	System.out.println("Modelo: " + airbong.modelo);
	                System.out.println("Cor: " + airbong.cor);
	                System.out.println("Ano: " + airbong.ano);
	                System.out.println("Legalizado: " + airbong.legalizado);

	                airbong.acelerar(100);
	                System.out.println("Altitude passada: " + airbong.altitude);

	                airbong.inclinar(40);
	                System.out.println("Altitude atual: " + airbong.altitude);

	}

}
