package com.facetogether.finalproject.repository.entity;

import com.facetogether.finalproject.controller.dto.ItemDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private String description;
    private double price;
    private String imgUrl;
    private Date createdAt = new Date();

    public Item() {
        System.out.println(this.imgUrl);
    }
    public Item( ItemDto item) {
        name =item.getName();
        imgUrl=item.getImgUrl();
        price = item.getPrice();
        description = item.getDescription();

    }

    public Item(String name, String description, double price, String imgUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item items)) return false;
        return Double.compare(items.getPrice(), getPrice()) == 0 && Objects.equals(getId(), items.getId()) && Objects.equals(getName(), items.getName()) && Objects.equals(getDescription(), items.getDescription()) && Objects.equals(getImgUrl(), items.getImgUrl()) && Objects.equals(getCreatedAt(), items.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getPrice(), getImgUrl(), getCreatedAt());
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imgUrl='" + imgUrl + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}