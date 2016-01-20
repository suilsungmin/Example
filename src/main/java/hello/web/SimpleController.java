package hello.web;

import hello.domain.*;
import hello.DAO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogs/*")
public class SimpleController {

    @Autowired
    BlogDao blogDao;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(value="/{id}", method= RequestMethod.POST)
    public String insertBlog(blogs blog) {
        blogDao.save(blog);
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(value="/find", method= RequestMethod.GET)
    @ResponseBody
    public String getBlogs() {
        blogDao.findAll();
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(value="/find/{id}", method= RequestMethod.GET)
    @ResponseBody
    public String getBlog(blogs blog) {
        blogDao.findOne(blog.getId());
        return "Greetings from Spring Boot!";
    }
}