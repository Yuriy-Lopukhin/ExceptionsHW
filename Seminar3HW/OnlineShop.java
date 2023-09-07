package Seminar3HW;

import java.util.List;

public class OnlineShop {
    private Category rootCategory;

    public OnlineShop() {
        this.rootCategory = new Category("All");
    }



    public void addCategory(Category category) {
        rootCategory.addSubcategory(category);
    }



    public Product findProduct(String name) throws ProductNotFoundException {

        for (Category category : rootCategory.getSubcategories()) {
            for (Product product : category.getProducts()) {
                if (product.getName().equals(name)) {
                    return product;
                }
            }
        }
        throw new ProductNotFoundException("Product not found: " + name);
    }


    public List<Category> getCategories() {
        return rootCategory.getSubcategories();
    }
}
