package hust.soict.globalict.aims.store;

import java.util.ArrayList;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUM_DVD = 10000;
	private int dvdStored = 0;
	private static ArrayList<Media> itemsInStore = new ArrayList<Media> ();
	
	public int getDvdStored() {
		return dvdStored;
	}

	public void setDvdStored(int dvdStored) {
		this.dvdStored = dvdStored;
	}
	
	public void addDVD(DigitalVideoDisc dvd) {
		int count = this.getDvdStored();
		if (count >= MAX_NUM_DVD) {
			System.out.println("Het cho trong");
		} else {
			itemsInStore.add(dvd);
			System.out.println("Da them");
			this.setDvdStored(count + 1);
		}
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("Deleted!");
            this.setDvdStored(this.getDvdStored() - 1);
        } else {
            System.out.println("Cannot find!");
        }
	}

	public ArrayList<Media> getItemsInStore() {
		return new ArrayList<>(itemsInStore);
	}
}