package view;

import controller.SerieController;

public class Main {

	public static void main(String[] args) {
		
		SerieController sc = new SerieController();
		
		System.out.println(sc.serie(10));

	}
}
