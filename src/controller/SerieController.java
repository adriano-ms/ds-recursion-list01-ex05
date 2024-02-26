package controller;

public class SerieController {
	
	public SerieController() {
		super();
	}
	
	public double serie(int n) {
//		Se 'n' = 1, significa que chegou ao ultimo termo a ser somado
		if(n == 1) {
			return 1;
		} else {
//		Somado o termo atual a chamada do metodo com o termo anterior
			return 1.0/n + serie(n - 1);
		}
	}
}
