package com.coshmex.store.model;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class ProductoFacebook {

@CsvBindByPosition(position = 0)
@CsvBindByName(column = "id")
    public String id = "";
    @CsvBindByPosition(position = 1)
    @CsvBindByName(column = "title")
    public String title = "";
    @CsvBindByPosition(position = 2)
    @CsvBindByName(column = "link")
    public String link = "";
    @CsvBindByPosition(position = 3)
    @CsvBindByName(column = "product_type")
    public String product_type = "";
    @CsvBindByPosition(position = 4)
    @CsvBindByName(column = "condition")
    public String condition = "";
    @CsvBindByPosition(position = 5)
    @CsvBindByName(column = "availability")
    public String availability = "";
    @CsvBindByPosition(position = 6)
    @CsvBindByName(column = "description")
    public String description = "";
    @CsvBindByPosition(position = 7)
    @CsvBindByName(column = "price")
    public String price = "";
    @CsvBindByPosition(position = 8)
    @CsvBindByName(column = "brand")
    public String brand = "";
    @CsvBindByPosition(position = 9)
    @CsvBindByName(column = "mpn")
    public String mpn = "";
    @CsvBindByPosition(position = 10)
    @CsvBindByName(column = "shipping")
    public String shipping = "";
    @CsvBindByPosition(position = 11)
    @CsvBindByName(column = "google_product_category")
    public String google_product_category = "";

    public ProductoFacebook(String id) {
        this.id = id;
    }
    public ProductoFacebook( ) {

    }
    public ProductoFacebook(String id, String title, String link, String product_type, String condition, String availability, String description, String price, String brand, String mpn, String shipping, String google_product_category) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.product_type = product_type;
        this.condition = condition;
        this.availability = availability;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.mpn = mpn;
        this.shipping = shipping;
        this.google_product_category = google_product_category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getGoogle_product_category() {
        return google_product_category;
    }

    public void setGoogle_product_category(String google_product_category) {
        this.google_product_category = google_product_category;
    }
}
