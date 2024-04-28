package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
	//use procedure name as method name
	@Procedure
	int get_Book_Count(String author);
	@Procedure
	List<Book> get_books_by_Author(String author);
	@Procedure
	List<Book> get_books_by_price(int price);
	
	//using @procedure with diffrent method name
	//use attributes to pass procedurename
	@Procedure(procedureName="get_Book_Count")
	int getCountBook(String author);
	
	//using @NamedStoredProcedureQuery annotation
	@Procedure(name="getCountByAuthor")
	int getCount(@Param("auth")String author);
	
	//using @Query Annotaion
	@Query(value="call get_books_by_Author(:author)",nativeQuery=true)
	List<Book> getBookByAuthor(@Param("author") String author);
	

}
