package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta ContaDoWill = new Conta();
		
		ContaDoWill.saldo = 100;
		
		ContaDoWill.deposita(50);
		
		System.out.println(ContaDoWill.saldo);
		
		ContaDoWill.sacar(20);
		
		System.out.println(ContaDoWill.saldo);
		
		Conta ContaDaRani = new Conta();
		
		ContaDaRani.deposita(100);
		
		System.out.println(ContaDaRani.saldo);
		
		ContaDoWill.transfere(40, ContaDaRani);
		
		System.out.println(ContaDaRani.saldo);
		System.out.println(ContaDoWill.saldo);
		
		

	}

}
