package devdojo.enumeracao2;

public enum TipoPagamento {
	
	DEBITO{
		
		
		@Override
		public double calcularDesconto(double valor) {
			return valor-(valor * 0.10);
		}
	
	},
	CREDITO{
		@Override
		public double calcularDesconto(double valor) {
			return valor-(valor * 0.05);
		}
		
	};
	
	public abstract double calcularDesconto(double valor);
}