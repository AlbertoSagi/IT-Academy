package controller;

import java.util.ArrayList;

import Services.ConverterFactory;
import Services.IConverter;
import gui.Menu;
import model.Product;
import utilities.LecturaDatos;

public class Main {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();

		products.add(new Product("T-shirt", 8.50));
		products.add(new Product("Trousers Levis", 79.90));
		products.add(new Product("Jumper", 25.90));
		products.add(new Product("Skirt", 39.90));

		System.out.println("********** Products in € **********");
		for (Product prod : products) {
			System.out.println(prod);
		}
		System.out.println("\n");

		boolean follow = true;
		do {
			Menu.mostrarMenu();
			int choice = LecturaDatos.leerInt();
			switch (choice) {
			case 1: {
				System.out.println("******** Prices in American Dollars ******** \n");
				IConverter conv = ConverterFactory.create(ConverterFactory.TypeConverter.Dollars);
				for (Product pr : products) {
					double pDollar = conv.converter(pr.getPrice());
					pr.setPrice(pDollar);
					String simbolDollar = conv.simbol();
					pr.setSimbol(simbolDollar);
					System.out.println(pr);
				}
				System.out.println(" ");
				break;
			}
			case 2: {
				System.out.println("******** Prices in pounds ******** \n");
				IConverter conv = ConverterFactory.create(ConverterFactory.TypeConverter.Pounds);
				for (Product pr : products) {
					double pPound = conv.converter(pr.getPrice());
					pr.setPrice(pPound);
					String simbolPound = conv.simbol();
					pr.setSimbol(simbolPound);
					System.out.println(pr);
				}
				System.out.println(" ");
				break;
			}
			case 3: {
				System.out.println("******** Prices in Canadian Dollars ******** \n");
				IConverter conv = ConverterFactory.create(ConverterFactory.TypeConverter.Cad);
				for (Product pr : products) {
					double pCad = conv.converter(pr.getPrice());
					pr.setPrice(pCad);
					String simbolCad = conv.simbol();
					pr.setSimbol(simbolCad);
					System.out.println(pr);
				}
				System.out.println(" ");
				break;
			}
			case 0: {
				follow = false;
				break;
			}
			default:
				System.out.println("The chosen option is not valid");

			}
		} while (follow);

	}

}
