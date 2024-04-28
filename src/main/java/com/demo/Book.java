package com.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BookStore")
@NamedStoredProcedureQuery(
		name="getCountByAuthor",
		procedureName="get_Book_Count",
		parameters= {
				@StoredProcedureParameter(mode=ParameterMode.IN,name="auth",type=String.class),
				@StoredProcedureParameter(mode=ParameterMode.OUT,name="total",type=Integer.class)
		}
		)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String bookId;
	private String title;
	private String author;
	private double price;
	private String category;
	

}
