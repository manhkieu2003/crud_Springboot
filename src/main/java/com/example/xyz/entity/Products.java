package com.example.xyz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
  @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private float  price;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "Avaible")
    private  boolean Avaible;
  // đoạn này mối quan hệ giữa product và ordertail
    @OneToMany(mappedBy = "products")
    private List<OrderDetail> orderDetailList;

    // mối quan hệ giữa product và categories
    @ManyToOne()
    @JoinColumn(
            name = "CategoryId",
            referencedColumnName = "id"
    )
    private Category category;
}
