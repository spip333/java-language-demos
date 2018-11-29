package org.nstern.demos.data;

import org.apache.commons.lang.builder.EqualsBuilder;

public class Car {

    Integer code;
    String mark;
    String model;
    Integer price;

    public Car() {
    }

    public Car(int c, String m, String mod) {
        code = Integer.valueOf(c);
        mark = m;
        model = mod;
    }

    public Car(int c, String m, String mod, int p) {
        this(c, m, mod);
        price = p;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(code).append(mark).append(model).append(price).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car)) {
            return false;
        }

        Car other = (Car) o;

        return new EqualsBuilder().append(code, other.getCode())
                .append(mark, other.getMark())
                .append(model, other.getModel())
                .append(price, other.getPrice())
                .isEquals();
    }

    public static class Builder {
        Car car = new Car();

        public Builder withCode(Integer code) {
            car.setCode(code);
            return this;
        }

        public Builder withPrice(Integer price) {
            car.setPrice(price);
            return this;
        }

        public Builder withMark(String mark) {
            car.setMark(mark);
            return this;
        }

        public Builder withModel(String model) {
            car.setModel(model);
            return this;
        }

        public Car build() {
            return car;
        }
    }


}