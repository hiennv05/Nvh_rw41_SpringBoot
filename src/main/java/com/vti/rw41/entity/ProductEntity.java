package com.vti.rw41.entity;

import com.vti.rw41.enumurations.ProductStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue(generator = "productIdSeq") // -> su sung seq
    //    @SequenceGenerator( // khai bao seq
    //            sequenceName = "productIdSeq", //-> ten cua sequence
    //            name = "productIdSeq",//-> ten cua sequence
    //            initialValue = 1, //gia tri dau tien
    //            allocationSize = 2) // buoc nhay
    @Column(name = "id")
    private Integer id;

    private String productName;

    private Double price;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;
}
