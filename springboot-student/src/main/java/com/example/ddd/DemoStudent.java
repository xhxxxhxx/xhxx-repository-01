package com.example.ddd;

import org.springframework.beans.factory.annotation.Value;


public class DemoStudent {

    private String name;

    private String date1 = "1111-11-11";

    private String date2 = "2222-11-11";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate1() {
        if (date1 == null || date1.length() == 0){
            date1 = "1111-11-11" ;
            return date1;
        }else {
            return date1;
        }
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        if(date2 == null || date2.length() == 0){
            date2 = "2222-11-11";
            return date2;
        }else {
            return date2;
        }
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }
}
