package com.example.xyz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    private Integer id;
    // để integer chứ ko phải để int vì khi chạy dữ liệu chưa có Interger sẽ là nulll còn int sẽ là 0
    @Column(name = "name")
    private String name;

    // mối quan heej giữa categories và product
    @OneToMany(mappedBy = "category")
    private List<Products> productsList;


}
