public class Teste
{
    public static void main (String[] args)
    {
	////////////////////////////////
        // TESTES DA CLASSE TRACINHOS //
        ////////////////////////////////
        
        System.out.println ("Testes da classe Tracinhos");
        System.out.println (" ");
        
	// TESTES CONSTRUTOR 
        // TESTE 1
        Tracinhos t1 = null;
        try 
        {
			System.out.println ("TESTE 1");
			t1 = new Tracinhos (null);
			System.out.println ("Deu certo construir tracinhos null!");
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 2
		try 
        {
			System.out.println ("TESTE 2");
			Tracinhos t2 = new Tracinhos (-1);
			System.out.println ("Deu certo construir tracinhos com numero de posicoes negativa!");
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
	    // TESTE 3
		try 
        {
			System.out.println ("TESTE 3");
			Tracinhos t3 = new Tracinhos (0);
			System.out.println ("Deu certo construir tracinhos com numero de qtd = 0!");
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 4
		Tracinhos t4 = null;
		try 
        {
			System.out.println ("TESTE 4");
			t4 = new Tracinhos (5);
			System.out.println ("Deu certo construir tracinhos com numero de posicoes = 5!");
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
	    
		// TESTES REVELE E TO STRING
		// TESTE 5
		try
		{
			System.out.println ("TESTE 5");
			t4.revele(-1,'C');
			System.out.println ("Deu certo revelar o caractere 'C' na posicao  -1;");
			System.out.println ("A string de tracinhos esta desse jeito: " + t4.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 6
		try
		{
			System.out.println ("TESTE 6");
			t4.revele(6,'A');
			System.out.println ("Deu certo revelar o caractere 'A' na posicao 6;");
			System.out.println ("A string de tracinhos esta desse jeito: " + t4.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 7
		try
		{
			System.out.println ("TESTE 7");
			t4.revele(5,'A');
			System.out.println ("Deu certo revelar o caractere 'A' na posicao 5;");
			System.out.println ("A string de tracinhos esta desse jeito: " + t4.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 8
		try
		{
			System.out.println ("TESTE 8");
			t4.revele(2,'I');
			System.out.println ("Deu certo revelar o caractere 'I' na posicao 2;");
			System.out.println ("A string de tracinhos esta desse jeito: " + t4.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
	        // TESTES IS AINDA COM TRACINHOS
		// TESTE 9
		System.out.println ("TESTE 9");
		System.out.println ("Eh " + t4.isAindaComTracinhos() + " que t4 ainda esta com tracinhos.");
		System.out.println ("A string de tracinhos esta desse jeito: " + t4.toString());
		
		// TESTE 10
		try
		{
			System.out.println ("TESTE 10");
			t4.revele(0,'C');
			t4.revele(1,'O');
			t4.revele(3,'S');
			t4.revele(4,'A');
			System.out.println ("O vetor texto de tracinhos esta assim: "+ t4.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 11
		System.out.println ("TESTE 11");
		System.out.println ("Eh " + t4.isAindaComTracinhos() + " que t4 ainda esta com tracinhos.");
		System.out.println ("A string de tracinhos esta desse jeito: " + t4.toString());
		
		// TESTES DO EQUALS
		// TESTE 12 - INSTANCIANDO E PREENCHENDO T5 - TEXTO = C O I S A
		Tracinhos t5 = null;
		try 
        {
			System.out.println ("TESTE 12");
			t5 = new Tracinhos (5);
			System.out.println ("Deu certo construir tracinhos com numero de posicoes = 5!");
			t5.revele(0,'C');
			t5.revele(1,'O');
			t5.revele(2,'I');
			t5.revele(3,'S');
			t5.revele(4,'A');
			System.out.println ("O vetor texto de t5 esta assim: "+ t5.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		
		// TESTE 13 - INSTANCIANDO E PREENCHENDO T6 - TEXTO = T E S T E
		Tracinhos t6 = null;
		try 
        {
			System.out.println ("TESTE 13");
			t6 = new Tracinhos (5);
			System.out.println ("Deu certo construir tracinhos com numero de posicoes = 5!");
			t6.revele(0,'T');
			t6.revele(1,'e');
			t6.revele(2,'S');
			t6.revele(3,'t');
			t6.revele(4,'E');
			System.out.println ("O vetor texto de t6 esta assim: "+ t6.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 14 - EQUALS T4 E T5 -> DEVE DAR TRUE
		System.out.println ("TESTE 14");
		System.out.println ("Eh " + t4.equals(t5) + " que t4 eh equals de t5.");
		System.out.println ("O texto de t4 eh: " + t4.toString());
		System.out.println ("O texto de t5 eh: " + t5.toString());
		
		// TESTE 15 - EQUALS T4 E T6 -> DEVE DAR FALSE
		System.out.println ("TESTE 15");
		System.out.println ("Eh " + t4.equals(t6) + " que t4 eh equals de t6.");
		System.out.println ("O texto de t4 eh: " + t4.toString());
		System.out.println ("O texto de t6 eh: " + t6.toString());
		
		// TESTE 16 - EQUALS T4 COM STRING "COISA" -> DEVE DAR FALSE
		System.out.println ("TESTE 16");
		System.out.println ("Eh " + t4.equals("COISA") + " que t4 eh equals de String 'COISA'.");
		
		// TESTE 17 - EQUALS T4 COM T1 -> DEVE DAR FALSE
		System.out.println ("TESTE 17");
		System.out.println ("Eh " + t4.equals(t1) + " que t4 eh equals de t1.");
		System.out.println ("t1 eh nulo.");
		
		// TESTE 18 - EQUALS T4 COM T4 -> DEVE DAR TRUE
		System.out.println ("TESTE 18");
		System.out.println ("Eh " + t4.equals(t4) + " que t4 eh equals dele mesmo.");
		
		// TESTES DE HASHCODE
		// TESTE 19 - HASHCODE DE T4 É EQUALS DE HASHCODE DE T5? -> DEVE DAR TRUE
		System.out.println ("TESTE 19");
		System.out.println ("Eh " + (t4.hashCode()==t5.hashCode()) + " que o hashCode de t4 eh igual ao de t5.");
		
		// TESTE 20 - HASHCODE DE T4 É EQUALS DE HASHCODE DE T5? -> DEVE DAR FALSE
		System.out.println ("TESTE 20");
		System.out.println ("Eh " + (t4.hashCode()==t6.hashCode()) + " que o hashCode de t4 eh igual ao de t6.");
		
		// TESTES DE CONSTRUTOR DE CÓPIA
		// TESTE 21 - TEM QUE DAR EXCEPTION
		Tracinhos t7 = null;
		Tracinhos t8 = null;
		try 
        {
			System.out.println("TESTE 21");
			t7 = new Tracinhos (t8);
			System.out.println("A copia de t8 foi realizada e t8 eh null!");
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		// TESTE 22 - CONSTRUTOR DE CÓPIA QUE TEM COMO PARÂMETRO UM OBJETO 
		//            INSTANCIADO DA CLASSE TRACINHOS
		System.out.println("TESTE 22");
		Tracinhos t9 = null;
		try 
        {
			t9 = new Tracinhos (4);
			System.out.println("Deu certo criar tracinhos com vetor de qtd = 4.");
			t9.revele(0,'J');
			t9.revele(1,'A');
			t9.revele(2,'v');
			t9.revele(3,'A');
			System.out.println("O vetor de t9 esta assim: " + t9.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
		try 
        {
			t7 = new Tracinhos (t9);
			System.out.println("A copia (t7) de t9 foi realizada!");
			System.out.println("O vetor de t7 esta assim: " + t7.toString());
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
		}
		
	        // TESTE DE CLONE
		// TESTE 23
		
		System.out.println("TESTE 23");
		Tracinhos t10 = null;
		t10 = (Tracinhos) t4.clone();
		System.out.println("O vetor de t4 esta assim : " + t4.toString());
		System.out.println("O vetor de t10 esta assim: " + t10.toString(
        
        ///////////////////////////////////////////
        // TESTES DA CLASSE CONTROLADOR DE ERROS //
        ///////////////////////////////////////////
        
        /////////////////////////////////////////////////////////
        // TESTES DA CLASSE CONTROLADOR DE LETRAS JA DIGITADAS //
        /////////////////////////////////////////////////////////
    }
}
