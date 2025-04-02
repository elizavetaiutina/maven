package org.example;

public class Product {
    private String title;
    private String dateOfProduction;
    private String fabricator;
    private String countryOfOrigin;
    private int price;
    private Boolean statusOfBooking;

    public Product(String title, String dateOfProduction, String fabricator, String countryOfOrigin, int price, Boolean statusOfBooking) {
        this.title = title;
        this.dateOfProduction = dateOfProduction;
        this.fabricator = fabricator;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.statusOfBooking = statusOfBooking;
    }

    public void getInfo() {
        System.out.println("Название: " + title + "\nДата производства: " + dateOfProduction + "\nПроизводитель: " + fabricator + "\nСтрана происхождения: " + countryOfOrigin + "\nЦена: " + price + "\nСостояние бронирования покупателем: " + statusOfBooking);
    }
}
