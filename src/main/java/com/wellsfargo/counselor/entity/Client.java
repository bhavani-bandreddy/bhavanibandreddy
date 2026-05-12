package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column
    private String fullName;

    @Column
    private String emailId;

    @Column
    private String contact;

    @Column
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor financialAdvisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client() {
    }

    public Client(Long clientId, String fullName, String emailId,
                  String contact, LocalDate dateOfBirth,
                  FinancialAdvisor financialAdvisor,
                  Portfolio portfolio) {

        this.clientId = clientId;
        this.fullName = fullName;
        this.emailId = emailId;
        this.contact = contact;
        this.dateOfBirth = dateOfBirth;
        this.financialAdvisor = financialAdvisor;
        this.portfolio = portfolio;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
