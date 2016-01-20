package hello.DAO

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

/**
 * Created by smpark on 2016-01-19.
 */
@Repository
class TodoRepository {
    @Autowired
    JdbcTemplate template;


}