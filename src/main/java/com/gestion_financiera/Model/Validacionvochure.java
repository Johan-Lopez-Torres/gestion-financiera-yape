package com.gestion_financiera.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@Table(name = "validacionVouc")
public class Validacionvochure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 20)
    private String nombre;

    @Column(length = 40)
    private String apellido;

    @Column(length = 8)
    private String dni;

    @Column(length = 20)
    private LocalTime horaOperacion;

    @Column(length = 20)
    private String numOperacion;

    @Column(length = 20)
    private BigDecimal monto;

    @Enumerated(EnumType.STRING)
    private TipoServicio tipoServicio;

    @Column(length = 20)
    private String metodoPago;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaPago;

    @Column(length = 20)
    private String imagen;

    public enum Procedencia {
        ESTUDIANTE_UNS,
        TRABAJADOR,
        PUBLICO_EN_GENERAL
    }

    public enum TipoServicio {
        CERTIFICACION,
        CURSO
    }

}
