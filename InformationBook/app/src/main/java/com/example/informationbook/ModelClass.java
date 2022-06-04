package com.example.informationbook;

public class ModelClass {
    String categoryName;
    int categoryImage;

    public ModelClass(String categoryName, int categoryImage) {
        this.categoryName = categoryName;
        this.categoryImage = categoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryImage() {
        return categoryImage;
    }
}
