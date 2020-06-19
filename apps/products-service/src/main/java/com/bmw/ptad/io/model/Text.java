package com.bmw.ptad.io.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * Entity Text
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_TEXT")
public class Text {

    @Id
    private BigInteger UID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "CHANGED")
    private Date changed;

    @Column(name = "LANG")
    private String lang;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "TEXT_SHORT")
    private String textShort;

    @Column(name = "TEXT_LONG")
    private String textLong;

    @ManyToOne
    @JoinColumn(name = "GUID")
    private Element element;
}
