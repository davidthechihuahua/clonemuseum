package com.jazz.android.clonemuseum;

public class CategoryItem {
    String CategoryText;
    int CategoryImage;

    public CategoryItem(String categoryText, int categoryImage) {
        this.CategoryText = categoryText;
        this.CategoryImage = categoryImage;
    }

    public String getCategoryText() {
        return CategoryText;
    }
    public int getCategoryImage() {
        return CategoryImage;
    }

}
