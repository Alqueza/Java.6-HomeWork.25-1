package com.company;

public class CarInfo {
    private int godVipuska;
    private String model;
    private int price;
    private String Color;

    public CarInfo(int godVipuska, String model, int price, String color) {
        this.godVipuska = godVipuska;
        this.model = model;
        this.price = price;
        Color = color;
    }

    public CarInfo() {
    }

    public int getGodVipuska() {
        return godVipuska;
    }

    public void setGodVipuska(int godVipuska) {
        this.godVipuska = godVipuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }


    @Override
    public String toString() {
        return "\n------------------Car Info------------------" +
                "\ngodVipuska: " + godVipuska +
                "\nmodel: " + model +
                "\nprice: " + price +
                "\nColor: " + Color;
    }
}