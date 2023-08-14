package view;
//Realiza a somatória da série:
//S = 1 + (1/2) + (1/3)... + (1/N)
import controller.SerieController;

public class Principal_SerieSoma {

	public static void main(String[] args) {
		SerieController cSerie = new SerieController();
		int N = 5;	//Enésimo número da série;
		System.out.println("Soma da serie: "+cSerie.SerieSoma(N));
	}

}
