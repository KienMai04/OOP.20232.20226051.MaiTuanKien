package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, String director, int length, float cost){
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = id; 
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already exists!");
        } else {
            authors.add(authorName);
            System.out.println("Author added!");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed!");
        } else {
            System.out.println("Author does not exist!");
        }
    }
}

