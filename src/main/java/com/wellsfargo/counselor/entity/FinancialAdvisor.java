package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column
    private String fullName;

    @Column
    private String emailId;

    @Column
    private String contact;

    @Column
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(Long advisorId, String fullName, String emailId,
                            String contact, LocalDate dateOfBirth,
                            List<Client> clients) {

        this.advisorId = advisorId;
        this.fullName = fullName;
        this.emailId = emailId;
        this.contact = contact;
        this.dateOfBirth = dateOfBirth;
        this.clients = clients;
    }

    public Long getAdvisorId() {
        return advisorId;
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

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
