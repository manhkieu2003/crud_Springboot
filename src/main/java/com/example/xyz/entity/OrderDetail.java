package com.example.xyz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Price")
    private float Price;
    @Column(name="Quantity")
    private int Quantity;

    // quan heej với order
    @ManyToOne()
    @JoinColumn(
            name = "orderid",
            referencedColumnName = ("id")
    )
    private Order order;
    // quan hệ với Product
    @ManyToOne()
    @JoinColumn(
            name = "Productid",
            referencedColumnName = "id"
    )
    private Products products;

}
