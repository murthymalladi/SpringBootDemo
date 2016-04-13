package com.jpa.data.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author dmalladi
 */

@Entity
public class Book implements Serializable {

   private static final long serialVersionUID = 1L;
   // @GeneratedValue ( strategy = GenerationType.AUTO)
     @Id
     int id;

    @Column(name = "name")
     String name;

    @Column(name = "price")
     int price;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
