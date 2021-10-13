// Danyelle Nogueira França 21232
// Julia Flausino da Silva  21241
// Giovanna do Amaral Brigo 21685

public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
		// verifica se qtd não é positiva, lançando uma exceção.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).
		
		if(qtd <= 0)
		    throw new Exception ("Tracinhos inválidos");
		    
		this.texto = new char[qtd]; // buguei (ou tipo this.texto[] = new texto[qtd];(?))
		
		for(int i = 0; i <= qtd; i++) // < qtd ou <= qtd
			this.texto[i] = '_';
    }

    public void revele (int posicao, char letra) throws Exception
    {
		// verifica se posicao é negativa ou então igual ou maior
		// do que this.texto.length, lançando uma exceção.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
		
		if ((posicao < 0) || (posicao >= this.texto.length))
		    throw new Exception ("Posição inválida!");
		    
	    this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
        
        for (int i = 2; i < this.texto.length - 1; i++)
        {
			if (this.texto[i] == '_')
				return true;
		}      
		
		return false;  
    }

    @Override
    public String toString ()
    {
        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
        
        String strTodos = "";
        
        for(int i = 0; i < this.texto.length; i++)
			strTodos += this.texto[i] + " "; // talvez? não sei
        
        return strTodos;
    }

    @Override
    public boolean equals (Object obj) // !!!
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        
        if(this.texto == obj)
            return true;
            
        // ver do professor !!!
            
        return false;
    }
    
    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        
        int ret = 5;
	
                // ret = 5*ret this.texto.hashCode(); (?)
		ret = 5*ret + new String(this.texto).hashCode(); 
        
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
        
        Object copia=null;
        
        try
        {
			copia = new Tracinhos(this); // object ou char ou tracinhos?
		}
		catch (Exception erro)
		{}
        
        return copia;
    }
}
