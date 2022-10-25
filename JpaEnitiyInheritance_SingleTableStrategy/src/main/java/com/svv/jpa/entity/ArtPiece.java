package com.svv.jpa.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(

		name = "ART_PIECE_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class ArtPiece {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String author;

	public ArtPiece() {
		super();
	}

	public ArtPiece(String author) {
		super();
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
