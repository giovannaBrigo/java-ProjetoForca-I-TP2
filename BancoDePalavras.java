// Danyelle Nogueira França 21232
// Julia Flausino da Silva  21241
// Giovanna do Amaral Brigo 21685

public class BancoDePalavras
{
    private static String[] palavras = 
    {
		"JAVA",
		"CLASSE",
		"OBJETO",
		"INSTANCIA",
		"PUBLICO",
		"PRIVATIVO",
		"METODO",
		"CONSTRUTOR",
		"SETTER",
		"GETTER",
		"LUZ",
		"PRAZER"
    };

    public static Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            palavra =
            new Palavra (BancoDePalavras.palavras[
            (int)(Math.random() * BancoDePalavras.palavras.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }
}
