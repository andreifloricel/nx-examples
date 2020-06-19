package com.bmw.ptad.io.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity Property
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_PROPERTY")
public class Property {

    @Id
    private String GUID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "CHANGED")
    private Date changed;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Element element;
}
