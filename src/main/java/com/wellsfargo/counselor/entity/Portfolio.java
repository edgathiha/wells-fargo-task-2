package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String createdDate;

    protected Portfolio(){

    }

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Portfolio(long portfolioId){
        this.portfolioId = portfolioId;
    }

    public long getPortfolioId() { return portfolioId; }

    public String getCreatedDate() { return createdDate; }

    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }
}
