package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Coche")
public class Coche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcoche")
	private Long id;
	@Column(name="matricula")
	private String matricula;
	@Column(name="num puertas")
	private String num_puertas;

	
	@ManyToOne
	@JoinColumn(name="marca_idmodelo", nullable = false)
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="modelo_idmarca", nullable = false)
	private Modelo modelo;

}
