package com.bmw.ptad.io.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * Entity Association
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_ASSOCIATION")
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "CHANGED")
    private Date changed;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "GUID1")
    private Element element1;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "GUID2")
    private Element element2;
}
