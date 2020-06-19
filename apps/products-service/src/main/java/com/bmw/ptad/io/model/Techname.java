package com.bmw.ptad.io.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * Entity Techname
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_TECHNAME")
public class Techname {

    @Id
    private BigInteger UID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "CHANGED")
    private Date changed;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GUID")
    private Element element;
}
