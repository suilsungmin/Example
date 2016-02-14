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

 

    @RequestMapping("todos")
    @ResponseBody
    def index() {
        Service.getAllTodoData();
    }

    @RequestMapping("todos/{id}")
    @ResponseBody
    def String getBlog(TodoRepository todo) {
        blogDao.findOne(todo.getId());
    }


}