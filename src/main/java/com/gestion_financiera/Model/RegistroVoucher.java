package com.gestion_financiera.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Registro")
public class RegistroVoucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String nombre;

    @Column(length = 40)
    private String apellido;

    @Column(length = 40)
    private String correo;

    @Column(length = 3)
    private int edad;

    @Column(length = 50)
    private String direccion;

    @Column(length = 8)
    private String dni;

    @Enumerated(EnumType.STRING)
    private Procedencia procedencia;

    @Column(length = 20)
    private LocalTime horaOperacion;

    @Column(length = 20)
    private String numOperacion;


    @Column(length = 20)
    private BigDecimal monto;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private Tipo_Servicio tipoServicio;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private Metodo_pago metodoPago;

    @Column(length = 20)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaPago;

    @Column(length = 20)
    private String imagen;





}
