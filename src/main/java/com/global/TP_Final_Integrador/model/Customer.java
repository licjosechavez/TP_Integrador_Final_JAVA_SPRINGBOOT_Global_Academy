package com.global.TP_Final_Integrador.model;

import java.time.LocalDate;

public class Customer extends User{

    private Long idCustomer;
    private int purchases;

    //constructs

    public Customer() {
    }

    public Customer(Long idUser, String userName, String password, String name, String surname, String dateOfBirth, String email, String userType, Long idCustomer, int purchases) {
        super(idUser, userName, password, name, surname, dateOfBirth, email, userType);
        this.idCustomer = idCustomer;
        this.purchases = purchases;
    }

    //getters y setters


    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getPurchases() {
        return purchases;
    }

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    //toString


    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", purchases=" + purchases +
                '}';
    }
}
