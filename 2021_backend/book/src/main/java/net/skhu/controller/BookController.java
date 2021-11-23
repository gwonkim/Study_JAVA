package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.entity.Book;
import net.skhu.entity.Category;
import net.skhu.repository.BookRepository;
import net.skhu.repository.CategoryRepository;

@Controller
@RequestMapping("book")
public class BookController {

    @Autowired BookRepository bookRepository;
    @Autowired CategoryRepository categoryRepository;

    @RequestMapping("list")
    public String list(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "book/list";
    }

    /*
         @RequestMapping("list")
    public List<Book> list(Model model) {
        List<Book> book = bookRepository.findAll();
        // model.addAttribute("book", book);
        return book;
    }
     */

    @GetMapping("create")
    public String create(Model model) {
        Book book = new Book();
        List<Category> category = categoryRepository.findAll();
        model.addAttribute("book", book);
        model.addAttribute("category", category);
        return "book/edit";
    }

    @PostMapping("create")
    public String create(Model model, Book book) {
        bookRepository.save(book);
        return "redirect:list";
    }

    @GetMapping("edit")
    public String edit(Model model, @RequestParam("id") int id) {
        Book book = bookRepository.findById(id).get();
        List<Category> category = categoryRepository.findAll();
        model.addAttribute("book", book);
        model.addAttribute("category", category);
        return "book/edit";
    }

    @PostMapping("edit")
    public String edit(Model model, Book book) {
        bookRepository.save(book);
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(Model model, @RequestParam("id") int id) {
        bookRepository.deleteById(id);
        return "redirect:list";
    }


    // Collection Valued Association
    @RequestMapping("list1")
    public String list1(Model model) {
        model.addAttribute("categoris", categoryRepository.findAll());
        return "book/list1";
    }

}

