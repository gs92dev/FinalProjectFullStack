package com.facetogether.finalproject.controller.dto;

public class ItemDto
{

    private String name;

    private String description;

    private String imgUrl;
    private double price;



    public ItemDto(String name, String description, double price, String imageUrl )
    {
        this.name = name;
        this.description = description;
        this.imgUrl = imageUrl;
        this.price = price;
        System.out.println(imgUrl);
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
