package hello.web

import hello.DAO.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/blogs/*")
class MainController {

    @Autowired
    TodoRepository blogDao;

    @RequestMapping("/")
    @ResponseBody
    def String index() {
        "Greetings from Spring Boot!"
    }

    @RequestMapping(value="/{id}", method= RequestMethod.POST)
    public String insertBlog(TodoRepository todo) {
        //blogDao.save(todo);
    }

    @RequestMapping(value="/find", method= RequestMethod.GET)
    @ResponseBody
    def String getBlogs() {
        blogDao.findAll();
    }

    @RequestMapping(value="/find/{id}", method= RequestMethod.GET)
    @ResponseBody
    def String getBlog(TodoRepository todo) {
        blogDao.findOne(todo.getId());
    }
}