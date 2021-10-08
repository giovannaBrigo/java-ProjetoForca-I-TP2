public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
		// verifica se qtd não é positiva, lançando uma exceção.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).
		// --> gi
		if(qtd < 0)
		    throw new Exception ("Quantidade inválida!(?)");
		    
		this.texto[] = new char[qtd]; // buguei (ou tipo this.texto[] = new texto[qtd];(?))
		
		for(int i = 0; i <= qtd; i++)
		this.texto[i] = "_"; // talvez(?)
    }

    public void revele (int posicao, char letra) throws Exception
    {
		// verifica se posicao é negativa ou então igual ou maior
		// do que this.texto.length, lançando uma exceção.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
		// --> gi
		
		if (posicao < 0) || (posicao >= this.texto.length)
		    throw new Exception ("Quantidade inválida!(?)");
		    
	    this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
        
    }

    public String toString ()
    {
        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
        // --> gi
        
        string aux = "";
        
        for(int i = 0; i < this.texto.length(); i++)
        aux = this.texto[i] + " "; // talvez? não sei
        
        return aux;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        // --> gi
        
        if(this.texto == obj)
            return true;
        else
            return false;
    }
    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        
        int ret = 5;
        
//if (this.texto != null) ?->seria impossível ele ser nulo?. Se possível, retornaria ret?
// gi--> não existe null em tipo primitivo, então nem precisa verificar

		ret = 5*ret + new String(this.texto).hashCode(); // como é tipo primitivo, 
		                                                // temos q transformar em obj
        
        if(ret < 0) ret = - ret;
        
        return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copiar o conteúdo de t.texto para this.texto
        
        if (t == null)
			throw new Exception ("O objeto passado como parâmetro não foi instanciado.");
        
        this.texto = new char[t.texto.length];
        
        for (int i = 0; i < t.texto.length - 1; i++)
        {
			this.texto[i] = t.texto[i];
		}
    }

    public Object clone ()
    {
        // retornar uma copia de this
        // --> gi
        
        Object copia = new Tracinhos(this.texto); // object ou char ou tracinhos?
        
        return copia;
    }
}
