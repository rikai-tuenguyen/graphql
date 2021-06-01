package com.example.demo.model;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="author") 
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "name", nullable = false)
  @NotNull
	@Size(min=2, max=3, message = "asvasvsavsa")
  private String name;

  @Column(name = "age")
  private Integer age;
  
  @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
  private List<Track> tracks;

  public Author() {
  }

  public Author(Integer id) {
    this.id = id;
  }

  public Author(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
  }

}