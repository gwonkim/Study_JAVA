package net.skhu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;
    String author;
    int price;
    String publisher;

    @ManyToOne
    @JoinColumn(name = "categoryid") // categoryId -> error : SQLGrammarException: could not extract ResultSet
    // 위 에러는 spring.jpa.hibernate.naming.physical-strategy의 설정을 application.properties에 작성을 안 해서 발생
    Category category;
}

