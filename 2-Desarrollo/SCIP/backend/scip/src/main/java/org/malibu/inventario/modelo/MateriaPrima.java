package org.malibu.inventario.modelo;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import org.openxava.annotations.*;

import lombok.*;
@Entity
@Getter
@Setter
public class MateriaPrima {

    @Id
    @Column(length = 9,name = "codigo") // Cambia el nombre del atributo
    int codigo; // Cambia el nombre del atributo

    @Column(length = 50)
    @Required
    @NotEmpty
    String descripcion;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @DescriptionsList
    Proveedor nombreProveedorDescripcion;

}