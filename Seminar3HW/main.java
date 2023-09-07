package Seminar3HW;

public class main {
    public static void main(String[] args) {

        OnlineShop shop = new OnlineShop();

        Category electronics = new Category("Electronics");
        Category phones = new Category("Phones");
        Category tvs = new Category("TVs");

        shop.addCategory(electronics);
        electronics.addSubcategory(phones);
        electronics.addSubcategory(tvs);
        Product iphone = new Product("iPhone", 999.99, 10);
        Product samsung = new Product("Samsung Galaxy", 799.99, 5);
        Product lg = new Product("LG TV", 1499.99, 2);
    
        phones.addProduct(iphone);
        phones.addProduct(samsung);
        tvs.addProduct(lg);

        try {
            Product foundProduct = shop.findProduct("Samsung Galaxy");
            System.out.println("Found product: " + foundProduct.getName());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
