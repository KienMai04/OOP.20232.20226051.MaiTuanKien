package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private int id;
    private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;

	
	public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }
	
    public DigitalVideoDisc(String title) {
        super(title, "Other", 0.0f, nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String category, String title, float cost) {
        super(title, category, cost, nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(title, category, cost, nbDigitalVideoDiscs);
        this.director = director;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, nbDigitalVideoDiscs);
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, float cost, int id) {
        super(title, category, cost, id);
        nbDigitalVideoDiscs++;
    }
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD Length: " + this.getLength());
	}
}
