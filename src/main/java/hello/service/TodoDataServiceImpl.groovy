package hello.service

import hello.DAO.TodoRepository
import hello.domain.Todo
import org.apache.ibatis.annotations.Param
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

/**
 * Created by smpark on 2016-02-01.
 */
@Service
public class TodoDataServiceImpl implements TodoDataService{

    @Autowired
    TodoRepository Dao;

    Todo getTodoData(@Param("id") int todoId){
        Dao.getTodoData(todoId)
    }
    List<Todo> getAllTodoData(){
        Dao.getAllTodoData()
    }
}
