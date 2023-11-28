package com.company.erp.dto;

import java.util.List;

public class ClientData {

    private Long id;
    private String clientName;
    private String personName;
    private String personEmail;
    private String personMobileNo;
    private String commercialRegNo;
    private String commercialReg;
    private String housing;
    private String transportation;
    private String costType;
    private List<String> profession;
    private List<String> nationality;
    private String taskApproval;

    public ClientData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonMobileNo() {
        return personMobileNo;
    }

    public void setPersonMobileNo(String personMobileNo) {
        this.personMobileNo = personMobileNo;
    }

    public String getCommercialRegNo() {
        return commercialRegNo;
    }

    public void setCommercialRegNo(String commercialRegNo) {
        this.commercialRegNo = commercialRegNo;
    }

    public String getCommercialReg() {
        return commercialReg;
    }

    public void setCommercialReg(String commercialReg) {
        this.commercialReg = commercialReg;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public List<String> getProfession() {
        return profession;
    }

    public void setProfession(List<String> profession) {
        this.profession = profession;
    }

    public List<String> getNationality() {
        return nationality;
    }

    public void setNationality(List<String> nationality) {
        this.nationality = nationality;
    }

    public String getTaskApproval() {
        return taskApproval;
    }

    public void setTaskApproval(String taskApproval) {
        this.taskApproval = taskApproval;
    }
}
