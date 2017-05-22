package com.he.java8.temp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by heyanjing on 2017/4/26 9:51.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple {
    private  String color;
    private  int weigth;

//    public Apple() {
//    }
//
//    public Apple(String color, int weigth) {
//
//        this.color = color;
//        this.weigth = weigth;
//    }
//    @Override
//    public String toString() {
//        return "Apple{" +
//                "color='" + color + '\'' +
//                ", weigth=" + weigth +
//                '}';
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getWeigth() {
//        return weigth;
//    }
//
//    public void setWeigth(int weigth) {
//        this.weigth = weigth;
//    }
}
