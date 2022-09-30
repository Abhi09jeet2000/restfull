package com.rest.webservices.restfull.User;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rest.webservices.restfull.post.Post;

// import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "user_details")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message="Name should have atleast 2 characters")
    // @JsonProperty("user_name")
    private String name;
    
    @Past(message = "Birth Date should be in past")
    // @JsonProperty("birth_date")
    private LocalDate birthdate;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    public User() {
    }
    public User(Integer id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    @Override
    public String toString() {
        return "User [birthdate=" + birthdate + ", id=" + id + ", name=" + name + "]";
    }
    

    
    
}
