package com.epam.saxsimple;

public enum StudentEnum {
    STUDENTS("student"),
    LOGIN("login"),
    FACULTY("daculty"),
    STUDENT("student"),
    NAME("name"),
    TELEPHONE("telephone"),
    COUNTRY("country"),
    CITY("city"),
    STREET("street"),
    ADDRESS("address");
    private String value;
    private StudentEnum(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
