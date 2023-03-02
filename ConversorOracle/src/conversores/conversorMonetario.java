package conversores;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;



public class conversorMonetario {
	private double tasa;
	private double resultado;
	

	
	
	public double getResultado() {
		return resultado;
	}
	
	
	public void setURL() {
		
		
		try {
			
			URL url = new URL("https://v6.exchangerate-api.com/v6/5d6aa8a491d527e883c91bab/latest/USD");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			int responseCode = conn.getResponseCode();
			
			if(responseCode != 200) {
				throw new RuntimeException("Ocurrió un error:" + responseCode);
			}else {
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());
				
				
				while(scanner.hasNext()) {
					informationString.append(scanner.nextLine());
				}
				
				scanner.close();
				
				
				System.out.println(informationString);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void setTasa(double monto) {
		this.resultado = (tasa * monto);
	}
	
	public void setCambio(String monto, String cambio) {
		
		if(monto == "Peso Colombiano" && cambio == "Dolar") {
			this.tasa = 0.00021;
		}else if(monto == "Peso Colombiano" && cambio == "Euros") {
			this.tasa = 0.00019;
		}else if(monto == "Peso Colombiano" && cambio == "Libras Esterlinas") {
			this.tasa = 0.00017;
		}else if(monto == "Peso Colombiano" && cambio == "Yen Japones") {
			this.tasa = 0.028;
		}else if(monto == "Peso Colombiano" && cambio == "Won sur-coreano") {
			this.tasa = 0.27;
		}else if(monto == "Dolar" && cambio == "Peso Colombiano") {
			this.tasa = 4816.30;
		}else if(monto == "Euros" && cambio == "Peso Colombiano") {
			this.tasa = 5101.62;
		}else if(monto == "Libras Esterlinas" && cambio == "Peso Colombiano") {
			this.tasa = 5753.67;
		}else if(monto == "Yen Japones" && cambio == "Peso Colombiano") {
			this.tasa = 35.21;
		}else if(monto == "Won sur-coreano" && cambio == "Peso Colombiano"){
			this.tasa = 3.67;
		}else {
			System.out.println("Monto:" + monto + " cambio: " + cambio);
			this.tasa = 1;
		}
		
	}
	
	
}
