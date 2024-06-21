package com.fyber.backend.mapper;


import com.fyber.backend.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM books")
    List<Book> findAll();

    @Select("SELECT * FROM books WHERE id = #{id}")
    Book findById(int id);

    @Insert("INSERT INTO books(title, author, published_date) VALUES(#{title}, #{author}, #{publishedDate})")
    void insert(Book book);



    @Update("UPDATE books SET title=#{title}, author=#{author}, published_date=#{publishedDate} WHERE id=#{id}")
    void update(Book book);

    @Delete("DELETE FROM books WHERE id = #{id}")
    void delete(int id);
}
