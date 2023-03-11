package com.skilldistillery.idyllwildtrails.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "idy_trail")
public class Trail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private double distance;
	
	@Column(name = "elevation_gain")
	private double elevationGain;
	
	@Column(name = "elevation_loss")
	private double elevationLoss;
	
	
	
//	private String imageURL;
	
//	methods

	public Trail(int id, String name, double distance, double elevationGain, double elevationLoss) {
		super();
		this.id = id;
		this.name = name;
		this.distance = distance;
		this.elevationGain = elevationGain;
		this.elevationLoss = elevationLoss;
	}
	
	
	public Trail() {
		super();
	}

	public double getElevationGain() {
		return elevationGain;
	}

	public void setElevationGain(double elevationGain) {
		this.elevationGain = elevationGain;
	}

	public double getElevationLoss() {
		return elevationLoss;
	}

	public void setElevationLoss(double elevationLoss) {
		this.elevationLoss = elevationLoss;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Trail [id=" + id + ", name=" + name + ", distance=" + distance + ", elevationGain=" + elevationGain
				+ ", elevationLoss=" + elevationLoss + "]";
	}



	
	
}
