// Danyelle Nogueira França 21232
// Julia Flausino da Silva  21241
// Giovanna do Amaral Brigo 21685

classe TesteControladorDeErros
{
	public static void main (String[] args)
    {	
		ControladorDeErros c1 = new ControladorDeErros(null);
		ControladorDeErros c2 = new ControladorDeErros(-2);
		ControladorDeErros c3 = new ControladorDeErros(3);
		ControladorDeErros c4 = new ControladorDeErros(5);
		ControladorDeErros c5 = new ControladorDeErros(5);
		ControladorDeErros c6 = new ControladorDeErros(6);

		
		// teste 1 --> 
		// construtor passando null
		try 
		{
			System.out.println ("TESTE 1");
			System.out.println ("Deu certo construir um ControladorDeErros null");
		}
		catch (Exception erro)
		{
			System.err.println ("Não deu certo construir um ControladorDeErros null");
		}
		
		// teste 2 --> 
		// construtor passando < 0 com resultado esperado == FALSE
		try 
		{
			System.out.println ("TESTE 2");
            System.out.println ("Deu certo construir um ControladorDeErros < 0 --> ERRADO " + c2);
		}
		catch (Exception erro)
		{
			System.err.println ("Deu erro construir um ControladorDeErros E ERA PRA DAR MESMO ");
		} 
		
		// teste 3 --> 
		// construtor passando > 0 com resultado esperado == TRUE
		try 
		{
			System.out.println ("TESTE 3");
            System.out.println ("Deu certo construir um ControladorDeErros --> " + c3);
		}
		catch (Exception erro)
		{
			System.err.println ("Deu erro construir ControladorDeErros > 0");
		}
		
		// teste 4 -->  TRY CACTH
		// registreUmErro
		// comparando se qtdErro == qtdMax com resultado esperado == TRUE
		
		try
		{
			System.out.println ("TESTE 4");
			// c4.registreUmErro(5); ou
			System.out.println ("É " + c4.registreUmErro()==c5.registreUmErro() + " que conseguimos registrar um novo erro" ); 
		} 
		catch (Exception erro)
		{
			System.err.println ("2.Foi atingido o limite máximo de erros!");
		}
		
		// teste 5 -->  TRY CATCH
		// registreUmErro
		// comparando se qtdErro == qtdMax com resultado esperado == FALSE
		
		try 
		{
			System.out.println ("TESTE 5");
			// c5.registreUmErro(c6); ou
			System.out.println ("É " + c5.registreUmErro()==c6.registreUmErro() + " que conseguimos registrar um novo erro" );
		}
		catch (Exception erro)
		{
			System.err.println ("Foi atingido o número máximo de erros E ERA PRA DAR MESMO");
		}
		
		
		// teste 6 --> 
		// isAtingidoMaximoDeErros
		// comparando se qtdErro == qtdMax com resultado esperado == TRUE
		
		System.out.println ("TESTE 6");
		// c4.isAtingidoMaximoDeErros(c5); ou
		System.out.println ("A verificação da quantidade máxima de erros deu " + c4.isAtingidoMaximoDeErros()==c5.isAtingidoMaximoDeErros() ); 
		
		// teste 7 --> 
		// isAtingidoMaximoDeErros
		// comparando se qtdErro == qtdMax com resultado esperado == FALSE
		
		System.out.println ("TESTE 7");
		// c5.isAtingidoMaximoDeErros(c6); ou
		System.out.println ("A verificação da quantidade máxima de erros deu " + c5.isAtingidoMaximoDeErros()==c6.isAtingidoMaximoDeErros() );
		
		// teste 8 --> 
		// equals com resultado esperado == TRUE
		
		System.out.println ("TESTE 8");
        System.out.println ("É "+c4.equals(c5)+" que 5 é igual (pelo equals) a 5");
        
        // teste 9 --> 
        // equals com resultado esperado == FALSE
        System.out.println ("TESTE 9");
        System.out.println ("É "+c5.equals(c6)+" que 5 é igual (pelo equals) a 6");
		
		// teste 10 --> 
		// hashCode com resultado esperado == TRUE
		
		System.out.println ("TESTE 10");
        System.out.println ("É "+(c4.hashCode()==c5.hashCode())+" que o hashCode de 5 é igual ao hashCode de outro 5");
        
		// teste 11 --> 
		// hashCode com resultado esperado == FALSE
		
		System.out.println ("TESTE 11");
		System.out.println ("É "+(c5.hashCode()==c6.hashCode())+" que o hashCode de 5 é igual ao hashCode de 6");

		
		// teste 12 --> 
		// construtor de cópia(?)
		try 
		{
			System.out.println ("TESTE 12");
		}
		catch (Exception erro)
		{
			System.err.println ("");
		}
		
		// teste 13 --> 
		// clone
		try 
		{
			System.out.println ("TESTE 13");
		}
		catch (Exception erro)
		{
			System.err.println ("");
		}
		
		
      
    }
}
