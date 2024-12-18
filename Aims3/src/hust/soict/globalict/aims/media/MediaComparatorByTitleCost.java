package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
    public int compare(Media o1, Media o2) {
        if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
            if (o1.getCost() > o2.getCost()) {
                return -1; // o1 is ranked higher
            } else if (o1.getCost() < o2.getCost()) {
                return 1; // o2 is ranked higher
            } else {
                return 0;
            }
        } else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
    
}