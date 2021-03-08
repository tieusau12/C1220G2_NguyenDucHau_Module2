package _12_java_collection_framework.exrcises.product_manager;

import _12_java_collection_framework.exrcises._04_review.Person;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double costProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double costProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(double costProduct) {
        this.costProduct = costProduct;
    }

    @Override
    public String toString() {
        return "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", costProduct=" + costProduct +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }

        Product otherProduct = (Product) obj;
        if (this.nameProduct.equals(otherProduct.nameProduct)) {
            return true;
        }
        return false;
    }
}
