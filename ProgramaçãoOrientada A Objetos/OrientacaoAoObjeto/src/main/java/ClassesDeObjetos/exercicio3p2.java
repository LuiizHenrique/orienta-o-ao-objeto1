
/*
 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */

package ClassesDeObjetos;

public class exercicio3p2 {

		String marca,cor;
		float peso;
		float quantidade;
		private float qualidade;
		
		public exercicio3p2 (String marca,String cor,float qualidade,int quantidade)
		{
			this.marca=marca;
			this.cor=cor;
			this.qualidade=qualidade;
			this.quantidade=quantidade;
		}
		
		public void mostrarinformacao() 
		{
			System.out.println("_______________________________");
			System.out.println("Marca: "+marca);
			System.out.println("Cor: "+cor);
			System.out.println("Qualidade: "+quantidade+"kg");
			System.out.println("Variedade de Produtos: "+quantidade);
		}
		
		
}

