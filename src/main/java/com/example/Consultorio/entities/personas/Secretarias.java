package com.example.Consultorio.entities.personas;
import jakarta.persistence.*;

@Entity
public class Secretarias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//============================================ASOCIACIONES============================================
    /*@OneToOne
    @JoinColumn(name = "usuario_pk",
        foreignKey = @ForeignKey(name = "fk_Usuarios_Secretaria"))
    Usuarios usuario;*/
}
