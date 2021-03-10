package _17_banary_stream.exrcises;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manuFacturer;
    private Double cost;
    private String other;

    public Product() {
    }

    public Product(int id, String name, String manuFacturer, Double cost, String other) {
        this.id = id;
        this.name = name;
        this.manuFacturer = manuFacturer;
        this.cost = cost;
        this.other = other;
    }

    public int getId() {
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

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Sản phẩm có : \n" +
                " ID " + id +
                "\n Tên sản phẩm :" + name +
                "\n Hãng sản xuất : " + manuFacturer +
                "\n Có giá : " + cost +
                "\n Mô tả khác của sản phẩm : " + other
                +"\n ----------------------";
    }
}
