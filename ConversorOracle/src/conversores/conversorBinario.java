package conversores;
public class conversorBinario {
	private boolean comprobacionPar;
	private int memoria;
	private double decimal;
	private String resultado = "";
	
	
	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	
	public String getResultado() {
		return this.resultado;
	}
	public void setBinario(int numero) {
		
		memoria = numero;
		this.setComprobacion(memoria);
		
		if(this.getComprobacion()) {
			this.resultado = "0";
		}else {
			this.resultado = "1";
		}
		
		
		while(memoria>=2){
			if(memoria >= 2) {
				memoria = (memoria / 2);
				this.setComprobacion(memoria);
				
				if(this.getComprobacion()) {
					this.resultado = this.resultado + "0";
				}else {
					this.resultado = this.resultado + "1";
				}
			}
		}
		 
	}
	
	
	public void setDecimal(String decimal) {
		
		int indice = decimal.length();
		int cuadrado;
		double resultado = 0;
		char[] aCaracter = decimal.toCharArray();

		for(int i = 0; i < decimal.length(); i++) {
			indice = indice - 1;
			char caracter = aCaracter[i];
			cuadrado = Character.getNumericValue(caracter);
			
			if(cuadrado == 1) {	
				
				resultado = resultado + Math.pow(2,indice);
				
			}
		
		}
		
		this.decimal = resultado;
		
	}
	
	public double getDecimal() {
		return this.decimal;
	}
	
	public void setComprobacion(int numero) {
		int par = numero % 2;
		if(par == 0) {
			this.comprobacionPar = true; 
		}else {
			this.comprobacionPar = false;
		}
	}
	
	
	public boolean getComprobacion() {
		return this.comprobacionPar;
	}
	
	
	
	
	
}
