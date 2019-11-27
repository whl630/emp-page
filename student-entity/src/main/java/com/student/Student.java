package com.student;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public Student(Integer id, String name, Integer age, String adress, int state) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.state = state;
    }

    private String adress;
    private int state;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", state=" + state +
                '}';
    }
}
