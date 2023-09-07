package Seminar3HW;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Category> subcategories;
    private List<Product> products;

    public Category(String name) {

        this.name = name;

        this.subcategories = new ArrayList<>();

        this.products = new ArrayList<>();
    }

    public void addSubcategory(Category category) {

        subcategories.add(category);
    }

    public void addProduct(Product product) {

        products.add(product);
    }

    public List<Category> getSubcategories() {

        return subcategories;
    }


    public List<Product> getProducts() {

        return products;
    }
}
