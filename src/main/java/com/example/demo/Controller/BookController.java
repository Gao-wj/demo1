package com.example.demo.Controller;



import com.example.demo.Bean.Book;
import com.example.demo.Service.ServiceAct.BookServiceAct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookServiceAct bookServiceAct;

    @GetMapping("/BookOpt")
    public void bookOpt(){
        Book b1 = new Book();
        b1.setName("西厢记");
        b1.setAuthor("王实甫");
        int i = bookServiceAct.addBook(b1);
        System.out.println("addBook>>>" + i);

        Book b2 = new Book();
        b2.setId(1);
        b2.setName("朝花夕拾");
        b2.setAuthor("鲁迅.");
        int updateBook = bookServiceAct.updateBook(b2);
        System.out.println("updateBook>>" + updateBook);

        Book b3 = bookServiceAct.getBookById(1);
        System.out.println("getBookById>>>" + b3);
        int delete = bookServiceAct.deleteBookById(2);
        System.out.println("deleteBookById>>>" + delete);
        List<Book> allBooks = bookServiceAct.getAllBooks();
        System.out.println("getAllBooks>>>" + allBooks);


    }


}
