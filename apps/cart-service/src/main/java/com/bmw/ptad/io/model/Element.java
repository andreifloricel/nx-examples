package com.bmw.ptad.io.model;

import lombok.*;

import javax.persistence.*;

/**
 * Entity Element
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_ELEMENT")
public class Element {

    @Id
    String GUID;

    @Transient
    @OneToOne(mappedBy = "element", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Techname techname;
}
