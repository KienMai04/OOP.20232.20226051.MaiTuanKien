package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store CHplay = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geore Lucas", 87, 24.95f);
		CHplay.addDVD(dvd1);
		CHplay.removeDVD(dvd1);
	}
}
