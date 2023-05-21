package phamchautuan.demo;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import phamchautuan.demo.Entity.Book;
import phamchautuan.demo.services.BookService;

import java.util.List;

@Controller
@RequestMapping
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public String showAllBooks(Model model){
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "book/list";
    }

}
