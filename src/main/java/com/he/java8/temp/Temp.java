package com.he.java8.temp;

import com.he.java8.temp.bean.Apple;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by heyanjing on 2017/4/26 9:33.
 * demo都在为知笔记java8上面
 */
public class Temp {

    @FunctionalInterface
    public interface AppleFilter {
        boolean filter(Apple apple);
    }

    public static List<Apple> findApple(List<Apple> appleList, AppleFilter filter) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (filter.filter(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LocalDate temp = LocalDate.now();

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonth().getValue());
        System.out.println(dt.getDayOfMonth());

        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
        long l3 = timestamp.toInstant().toEpochMilli();
        System.out.println(l3);
        Date date = new Date();
        long l1 = date.getTime();
        System.out.println(l1);
        Instant instant = Instant.now();
        long l2 = instant.toEpochMilli();
        System.out.println(l2);
         timestamp = Timestamp.valueOf(LocalDateTime.now());
        long l4 = timestamp.toInstant().toEpochMilli();
        System.out.println(l4);

        Instant instant1 = Instant.ofEpochMilli(l1);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println(format);
        instant1 = Instant.ofEpochMilli(l2);
        localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println(format);
        instant1 = Instant.ofEpochMilli(l3);
        localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println(format);
    }
}
