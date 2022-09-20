package com.global.TP_Final_Integrador.model;

import java.time.LocalDate;

public class Sale {

    private int idSale;
    private LocalDate creationDate;
    private LocalDate estimatedDelivery;
    private LocalDate effectiveDelivery;
    private String saleDetail;
    private int amountOfSales;
    private Seller seller;

    //constructs

    public Sale() {
    }

    public Sale(int idSale, LocalDate creationDate, LocalDate estimatedDelivery, LocalDate effectiveDelivery,
                String saleDetail, int amountOfSales, Seller seller) {
        this.idSale = idSale;
        this.creationDate = creationDate;
        this.estimatedDelivery = estimatedDelivery;
        this.effectiveDelivery = effectiveDelivery;
        this.saleDetail = saleDetail;
        this.amountOfSales = amountOfSales;
        this.seller = seller;
    }

    //getters y setters


    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getEstimatedDelivery() {
        return estimatedDelivery;
    }

    public void setEstimatedDelivery(LocalDate estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }

    public LocalDate getEffectiveDelivery() {
        return effectiveDelivery;
    }

    public void setEffectiveDelivery(LocalDate effectiveDelivery) {
        this.effectiveDelivery = effectiveDelivery;
    }

    public String getSaleDetail() {
        return saleDetail;
    }

    public void setSaleDetail(String saleDetail) {
        this.saleDetail = saleDetail;
    }

    public int getAmountOfSales() {
        return amountOfSales;
    }

    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    //toString

    @Override
    public String toString() {
        return "Sale{" +
                "idSale=" + idSale +
                ", creationDate=" + creationDate +
                ", estimatedDelivery=" + estimatedDelivery +
                ", effectiveDelivery=" + effectiveDelivery +
                ", saleDetail='" + saleDetail + '\'' +
                ", amountOfSales=" + amountOfSales +
                ", seller=" + seller +
                '}';
    }
}
