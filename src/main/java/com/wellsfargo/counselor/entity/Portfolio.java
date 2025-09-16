package com.wellsfargo.counselor.entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @Column(nullable = false)
    private String name;

    protected Portfolio() {
    }

    public Portfolio(Client client, String name) {
        this.client = client;
        this.name = name;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        this.client = client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
