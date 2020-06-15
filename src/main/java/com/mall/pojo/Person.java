package com.mall.pojo;

public class Person {
    private Integer id;
    private String name;
    private Integer carid;

    public Person(Integer id, String name, Integer carid) {
        this.id = id;
        this.name = name;
        this.carid = carid;
    }

    public Person(){super();}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }
}
