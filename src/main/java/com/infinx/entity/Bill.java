package com.infinx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "bill_number")
    private String billNumber;
    @Column(name = "billed_to")
    private String billedTo;
    @Column(name = "billed_date")
    private LocalDate billedDate;
    @Column(name = "due_date")
    private LocalDate dueDate;
    private double amount;
    private double tax;
    @Column(name = "total_amount")
    private double totalAmount;
}
