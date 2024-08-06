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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "address")
    private String address;

    // mỗi quan hệ giữa 2 bảng order và user: 1 user se nhiều order
    @ManyToOne()
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id"  // khóa ngoai user_id sẽ tham chiếu đến cột id bên user

    )
    private User user;

    // mối quan heej vs orderdetail
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList;



}
