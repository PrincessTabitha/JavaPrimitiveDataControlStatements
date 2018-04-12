package com.prs.business.purchaserequest;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Purchaserequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int userID;
		private String description;
		private String justification;
		private Date dateNeeded;
		private String deliveryMode;
		private String status;
		private double total;
		//JsonFormat (Shape =JSONFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SS")
		private Timestamp submittedDate;
		//private ArrayList<PRLI>prlis;
		private String reasonForRejection;
		
		public static final String STATUS_NEW = "New";
		public static final String STATUS_REVIEW = "Review";
		public static final String STATUS_EDIT = "Edit";
		public static final String STATUS_APPROVED = "Approved";
		public static final String STATUS_REJECTED = "Rejected";
		
		public Purchaserequest() {
			super();
		}
		public Purchaserequest(int id, int userID, String description, String justification, Date dateNeeded,
				String deliveryMode, String status, double total, Timestamp submittedDate, String reasonForRejection) {
			super();
			this.id = id;
			this.userID = userID;
			this.description = description;
			this.justification = justification;
			this.dateNeeded = dateNeeded;
			this.deliveryMode = deliveryMode;
			this.status = status;
			this.total = total;
			this.submittedDate = submittedDate;
			this.reasonForRejection = reasonForRejection;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getUserID() {
			return userID;
		}
		public void setUserID(int userID) {
			this.userID = userID;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getJustification() {
			return justification;
		}
		public void setJustification(String justification) {
			this.justification = justification;
		}
		public Date getDateNeeded() {
			return dateNeeded;
		}
		public void setDateNeeded(Date dateNeeded) {
			this.dateNeeded = dateNeeded;
		}
		public String getDeliveryMode() {
			return deliveryMode;
		}
		public void setDeliveryMode(String deliveryMode) {
			this.deliveryMode = deliveryMode;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public Timestamp getSubmittedDate() {
			return submittedDate;
		}
		public void setSubmittedDate(Timestamp submittedDate) {
			this.submittedDate = submittedDate;
		}
		public String getReasonForRejection() {
			return reasonForRejection;
		}
		public void setReasonForRejection(String reasonForRejection) {
			this.reasonForRejection = reasonForRejection;
		}
	
}
