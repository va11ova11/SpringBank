package com.springbank.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fondname")
    private String fondName;

    @Column(name = "amountfond")
    private int fondAmount;

    @Column(name = "summafond")
    private float fondSum;

    @Column(name = "fondprice")
    private float fondPrice;

}
