package hello.DAO

import hello.domain.Todo
import org.apache.ibatis.annotations.Param
import org.springframework.stereotype.Repository

/**
 * Created by smpark on 2016-01-19.
 */
@Repository
public interface TodoRepository {
   Todo getTodoData(@Param("id") int todoId);
   List<Todo> getAllTodoData();
}