package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name="track") 
public class Track {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "title", nullable = false)
  private String title;

  @ManyToOne
  @JoinColumn(name = "author_id")
  private Author author;

  @Column(name = "image")
  private String image;

  
  public Integer getId() {
  	return id;
  }

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

	@Override
  public String toString() {
    return "User [id=" + id + ", title=" + title + ", image=" + image + "]";
  }

}