package hello.service

import hello.DAO.TodoRepository
import hello.domain.Todo
import org.apache.ibatis.annotations.Param
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by smpark on 2016-02-01.
 */
public interface TodoDataService {
    Todo getTodoData(@Param("id") int todoId)
    List<Todo> getAllTodoData()

}
