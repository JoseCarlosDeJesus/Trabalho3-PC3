package testes;

public class ClasseAtividade3 {
	public void metodoComInnerClass(){
		int numero = 123;
		class ClasseInternaComoVariavelLocal{
			public void imprimir(){
			System.out.println("M�todo da inner class exibindo o valor da vari�vel local: "+numero);
			}
		}
		ClasseInternaComoVariavelLocal civl = new ClasseInternaComoVariavelLocal();
		civl.imprimir();
		
    }

}
