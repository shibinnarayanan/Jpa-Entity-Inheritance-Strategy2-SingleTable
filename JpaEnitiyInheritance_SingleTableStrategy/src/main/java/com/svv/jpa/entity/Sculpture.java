package com.svv.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "SCULPTURE")
public class Sculpture extends ArtPiece {

	@Enumerated(value = EnumType.STRING)
	private Material material;
    private Double weight;
	public Sculpture() {
		super();
	}
	public Sculpture(String author, Material material, Double weight) {
		super(author);
		this.material = material;
		this.weight = weight;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
    
}
