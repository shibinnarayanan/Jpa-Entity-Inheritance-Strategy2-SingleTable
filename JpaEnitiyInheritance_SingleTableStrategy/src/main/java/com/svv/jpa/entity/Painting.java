package com.svv.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "PAINTING")
public class Painting extends ArtPiece{
	
	@Enumerated(value = EnumType.STRING)
	private PaintingTechnique paintingtechnique;
	
	private Double width;
	private Double height;
	public Painting() {
		super();
	}
	public Painting(String author, PaintingTechnique paintingtechnique, Double width, Double height) {
		super(author);
		this.paintingtechnique = paintingtechnique;
		this.width = width;
		this.height = height;
	}
	public PaintingTechnique getPaintingtechnique() {
		return paintingtechnique;
	}
	public void setPaintingtechnique(PaintingTechnique paintingtechnique) {
		this.paintingtechnique = paintingtechnique;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}

}
