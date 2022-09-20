package com.global.TP_Final_Integrador.model;

import java.time.LocalDate;

public class Seller extends User{
    private Long idSeller;
    private int sales;

    //constructs

    public Seller() {
    }

        public Seller(Long idUser, String userName, String password, String name, String surname, LocalDate dateOfBirth, String email, String userType, Long idSeller, int sales) {
        super(idUser, userName, password, name, surname, dateOfBirth, email, userType);
        this.idSeller = idSeller;
        this.sales = sales;
    }

    //getters y setters


    public Long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Long idSeller) {
        this.idSeller = idSeller;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    //toString

    @Override
    public String toString() {
        return "Seller{" +
                "idSeller=" + idSeller +
                ", sales=" + sales +
                '}';
    }
}
