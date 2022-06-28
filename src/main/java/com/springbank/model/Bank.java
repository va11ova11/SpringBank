package com.springbank.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "balance")
    private float balance;
}
