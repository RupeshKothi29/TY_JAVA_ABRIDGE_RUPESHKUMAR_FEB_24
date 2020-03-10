package com.capgemini.assignment.array;

public class TestItems {
public static void main(String[] args) {
		
		Items[] items = new Items[4];
		Items i1 = new Items("U S polo", "Pepe Jeans", "Fast track");
		Items i2 = new Items("Buffalo", "Denium", "Quartz");
		Items i3 = new Items("IZOD", "Arrow", "Timex");
		Items i4 = new Items("Levis", "Flying Machine", "Fossil");
		items[0] = i1;
		items[1] = i2;
		items[2] = i3;
		items[3] = i4;
		System.out.println("AMAZON");
		System.out.println("---------");
		printItemDetails(items);
		System.out.println("FLIPKART");
		System.out.println("----------");
		Items[] item = getItemDetails();
		printItemDetails(item);

	}

	

	static void printItemDetails(Items[] ite) {

		for (int i = 0; i < ite.length; i++) {
			System.out.println("shirt :" + ite[i].shirt);
			System.out.println("pant :" + ite[i].pant);
			System.out.println("watch :" + ite[i].watch);
			System.out.println("**********************");

		}
	}

	static Items[] getItemDetails() {
		Items[] items = new Items[4];
		Items i1 = new Items("Pepe Jeans", "U S polo", "Titan");
		Items i2 = new Items("Wrangler", "Buffalo", "Rolex");
		Items i3 = new Items("Twils", "Denium", "Timex");
		Items i4 = new Items("Lee", "Twils", "Puma");
		items[0] = i1;
		items[1] = i2;
		items[2] = i3;
		items[3] = i4;
		return items;
	}

}
