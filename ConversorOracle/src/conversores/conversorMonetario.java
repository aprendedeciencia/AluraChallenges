package conversores;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;



public class conversorMonetario {
	private double tasa;
	private String resultado;
	

	
	
	public String getResultado() {
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
		DecimalFormat df = new DecimalFormat("#.00");
		double form = tasa * monto;
		this.resultado = df.format(form);
				;
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
		}else if(monto == "Libras Esterlinas" && cambio == "Dolar"){
			this.tasa = 1.20;
		}else if(monto == "Libras Esterlinas" && cambio == "Euros"){
			this.tasa = 1.13;
		}else if(monto == "Libras Esterlinas" && cambio == "Won sur-coreano"){
			this.tasa = 1562.57;
		}else if(monto == "Libras Esterlinas" && cambio == "Yen Japones"){
			this.tasa = 163.45;
		}else if(monto == "Dolar" && cambio == "Libras Esterlinas"){
			this.tasa = 0.84;
		}else if(monto == "Dolar" && cambio == "Euros"){
			this.tasa = 0.94;
		}else if(monto == "Dolar" && cambio == "Won sur-coreano"){
			this.tasa = 1306.10;
		}else if(monto == "Dolar" && cambio == "Yen Japones"){
			this.tasa = 136.62;
		}else if(monto == "Yen Japones" && cambio == "Libras Esterlinas"){
			this.tasa = 0.0061;
		}else if(monto == "Yen Japones" && cambio == "Dolar"){
			this.tasa = 0.0073;
		}else if(monto == "Yen Japones" && cambio == "Euros"){
			this.tasa = 0.0069;
		}else if(monto == "Yen Japones" && cambio == "Won sur-coreanos"){
			this.tasa = 9.55;
		}else if(monto == "Won sur-coreano" && cambio == "Libras Esterlinas"){
			this.tasa = 0.00064;
		}else if(monto == "Won sur-coreano" && cambio == "Dolar"){
			this.tasa = 0.00077;
		}else if(monto == "Won sur-coreano" && cambio == "Euros"){
			this.tasa = 0.00072;
		}else if(monto == "Won sur-coreano" && cambio == "Yen Japones"){
			this.tasa = 0.10;
		}else if(monto == "Euros" && cambio == "Dolar"){
			this.tasa = 1.06;
		}else if(monto == "Euros" && cambio == "Libras Esterlinas"){
			this.tasa = 0.89;
		}else if(monto == "Euros" && cambio == "Yen Japones"){
			this.tasa = 144.90;
		}else if(monto == "Euros" && cambio == "Won sur-coreano"){
			this.tasa = 1380.14;
		}else {
			System.out.println("Monto:" + monto + " cambio: " + cambio);
			this.tasa = 1;
		}
		
	}
	
	
}
