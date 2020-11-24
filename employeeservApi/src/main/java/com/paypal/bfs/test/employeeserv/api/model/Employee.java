package com.paypal.bfs.test.employeeserv.api.model;

import javax.validation.constraints.NotEmpty;

public class Employee {
    @NotEmpty
    private Integer id;

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
