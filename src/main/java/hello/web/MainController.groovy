package hello.web

import hello.DAO.*
import hello.service.TodoDataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestMapping

import javax.websocket.server.PathParam
@RequestMapping(value="/sungmin/*")
@Controller
class MainController {

    @Autowired
    private TodoDataService Service;

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
=======
    @RequestMapping("todos")
    @ResponseBody
    def index() {
        Service.getAllTodoData();
>>>>>>> cfdc990e9e53065cb2759d61f4e9c36fcabecff0
    }

    @RequestMapping("todos/{id}")
    @ResponseBody
<<<<<<< HEAD
    def String getBlog(TodoRepository todo) {
        blogDao.findOne(todo.getId());
=======
    def insertBlog(@PathVariable int id) {
        Service.getTodoData(id);
>>>>>>> cfdc990e9e53065cb2759d61f4e9c36fcabecff0
    }

}