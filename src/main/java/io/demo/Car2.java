package io.demo;

public class Car2 {
    private String modelName;
    private int modelYear;
    private String color;

    Car2(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    public String getModel() {
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }

    public void accelerate(int speed, int second) {
        System.out.printf("%d 초간 속도를 시속 %d(으)로 가속함!!", second, speed);
    }
}
