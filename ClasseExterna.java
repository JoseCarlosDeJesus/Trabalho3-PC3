package testes;

public class ClasseExterna{
	 private Integer numero;
	 public void MostrarInnerClass() {
		 ClasseInterna ci= new ClasseInterna();
		 ci.imprimir();
	 }
	 
	 
	 private class ClasseInterna{
		 public void imprimir() {
			 System.out.println("Dentro do m�todo da inner class");
		 }
	 }
}
