/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */

package ClassesDeObjetos;


public class exercicio3partir1{
	
	String produto;
	int tipo;
	String valor;
	String N2;
		
	public void informarNumeroDeSerie()
	{
		if(this.N2.length()==14)
			System.out.println("N�mero de serie: "+this.N2);
		else
			System.out.println("Digitar o N�mero de barra do produto");
	}
	
	public void informartipo()
	{
		System.out.println("tipo: "+this.tipo);
	}
	
	public void informarproduto()
	{
		System.out.println("v: "+this.produto);
	}
	
	public void informarvalor()
	{
		if(this.valor.length()==7)
			System.out.println("N2: "+this.valor);
		else
			System.out.println("por favor digite o valor conforme tabela");
	}
}
