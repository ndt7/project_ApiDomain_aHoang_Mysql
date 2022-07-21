package com.example.check_registration_domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class StatusDomain {


    @Id
    public String status;
    public String nameDomain;

    public StatusDomain(String status, String nameDomain) {
        this.status = status;
        this.nameDomain = nameDomain;
    }

    public StatusDomain() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameDomain() {
        return nameDomain;
    }

    public void setNameDomain(String nameDomain) {
        this.nameDomain = nameDomain;
    }
}
