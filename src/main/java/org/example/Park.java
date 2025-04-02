package org.example;

public class Park {

    public class Attraction {
        private String title;
        private String workingTime;
        private int price;

        public Attraction(String title, String workingTime, int price) {
            this.title = title;
            this.workingTime = workingTime;
            this.price = price;
        }

        public void getInfoAboutAttraction() {
            System.out.println("Название аттракциона: " + title + "\nВремя работы: " + workingTime + "\nСтоимость: " + price);
        }
    }
}

