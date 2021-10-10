public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
    	// verifica se qtdMax fornecida não é positiva, lançando
	// uma exceção.
	// armazena qtdMax fornecida em this.qtdMax.
		
	if (qtdMax >= 0)
		throw new Exception ("Quantidade inválida!");
		
	this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
        
        if (this.qtdErr == this.qtdMax)
			throw new Exception ("A quantidade máxima de erros já foi atingida!");
			//               ou  "Impossível registrar/incrementar mais um erro!"
		
	this.qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrario.
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
        
        if (c==null)
		throw new Exception ("Modelo ausente!");
		// o que coloca como mensagem da Exception?
			
	this.qtdMax = c.qtdMax;
	this.qtdErr = c.qtdErr;        
    }

    public Object clone ()
    {
        // retornar uma cópia de this
        
        ControladorDeErros c=null;
        
        try
        {
		c = new ControladorDeErros(this);
	}
        catch (Exception erro)
        {} // temos certeza que não dará erro, visto
	   // que estamos passando this como parâmetro
	   // e this é o objeto chamador do método, 
	   // portanto ele não é nulo
        
        return c; 
    }
}
