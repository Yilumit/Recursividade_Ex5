package controller;
//S = 1 + (1/2) + (1/3)... + (1/N)
public class SerieController {

	public SerieController() {
		super();
	}
    public double SerieSoma(int num){
        
        if (num>1) { //A condiçao de parada da funçao foi definida quando o número recebido como parâmetro for o primeiro nº da série
        	
            return (1/(double) num) + SerieSoma(num-1); // Realiza a soma do valor retornado pela chamada da funçao pelo termo atual da série

        }
        return 1; //retorna o primeiro valor da série
    }

}
