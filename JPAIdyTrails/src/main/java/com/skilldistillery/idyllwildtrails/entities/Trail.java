package com.skilldistillery.idyllwildtrails.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "idy_trail")
public class Trail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "trail_name")
	private String name;

	private String description;

	private double distance;

	@Column(name = "max_elevation")
	private Integer maxElevation;

	@Column(name = "elevation_gain")
	private double elevationGain;

	@Column(name = "elevation_loss")
	private double elevationLoss;

	@Column(name = "dog_friendly")
	private boolean dogFriendly;

	@Column(name = "permit_req")
	private boolean needPermit;

	@Column(name = "trail_head_latitude")
	private double headLat;

	@Column(name = "trail_head_longitude")
	private double headLong;

//	methods

	public Trail(int id, String name, String description, double distance, int maxElevation, double elevationGain,
			double elevationLoss, boolean dogFriendly, boolean needPermit, double headLat, double headLong) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.distance = distance;
		this.maxElevation = maxElevation;
		this.elevationGain = elevationGain;
		this.elevationLoss = elevationLoss;
		this.dogFriendly = dogFriendly;
		this.needPermit = needPermit;
		this.headLat = headLat;
		this.headLong = headLong;

	}

	public Trail() {
		super();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getMaxElevation() {
		return maxElevation;
	}

	public void setMaxElevation(int maxElevation) {
		this.maxElevation = maxElevation;
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

	public boolean isDogFriendly() {
		return dogFriendly;
	}

	public void setDogFriendly(boolean dogFriendly) {
		this.dogFriendly = dogFriendly;
	}

	public boolean isNeedPermit() {
		return needPermit;
	}

	public void setNeedPermit(boolean needPermit) {
		this.needPermit = needPermit;
	}

	public double getHeadLat() {
		return headLat;
	}

	public void setHeadLat(double headLat) {
		this.headLat = headLat;
	}

	public double getHeadLong() {
		return headLong;
	}

	public void setHeadLong(double headLong) {
		this.headLong = headLong;
	}

	@Override
	public String toString() {
		return "Trail [id=" + id + ", name=" + name + ", description=" + description + ", distance=" + distance
				+ ", maxElevation=" + maxElevation + ", elevationGain=" + elevationGain + ", elevationLoss="
				+ elevationLoss + ", dogFriendly=" + dogFriendly + ", needPermit=" + needPermit + ", headLat=" + headLat
				+ ", headLong=" + headLong + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, distance, dogFriendly, elevationGain, elevationLoss, headLat, headLong, id,
				maxElevation, name, needPermit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trail other = (Trail) obj;
		return Objects.equals(description, other.description)
				&& Double.doubleToLongBits(distance) == Double.doubleToLongBits(other.distance)
				&& dogFriendly == other.dogFriendly
				&& Double.doubleToLongBits(elevationGain) == Double.doubleToLongBits(other.elevationGain)
				&& Double.doubleToLongBits(elevationLoss) == Double.doubleToLongBits(other.elevationLoss)
				&& Double.doubleToLongBits(headLat) == Double.doubleToLongBits(other.headLat)
				&& Double.doubleToLongBits(headLong) == Double.doubleToLongBits(other.headLong)
				&& Objects.equals(id, other.id) && Objects.equals(maxElevation, other.maxElevation)
				&& Objects.equals(name, other.name) && needPermit == other.needPermit;
	}

}
