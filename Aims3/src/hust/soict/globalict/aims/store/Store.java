package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUM_DVD = 10000;
	private int dvdStored = 0;
	private DigitalVideoDisc itemsInStore[] =  new DigitalVideoDisc[MAX_NUM_DVD];
	
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
			this.itemsInStore[count] = dvd;
			System.out.println("Da them");
			count = count + 1;
			this.setDvdStored(count);
		}
	}
	public void removeDVD(DigitalVideoDisc dvd) {
		DigitalVideoDisc itemsTempStored[] = new DigitalVideoDisc[this.getDvdStored()-1];
		for (int i = 0, j = 0; i < this.getDvdStored(); i++) {
			if (!this.itemsInStore[i].getTitle().equals(dvd.getTitle())) {
				itemsTempStored[j] = this.itemsInStore[i];
				j++;
			}
		}
		for (int k = 0; k < this.getDvdStored() - 1; k++) {
			this.itemsInStore[k] = itemsTempStored[k];
		}
		System.out.println("Da xoa");
		this.setDvdStored(this.getDvdStored() - 1);
	}
}