package hello.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import hello.domain.blogs;
/**
 * Created by smpark on 2016-01-19.
 */
public interface BlogDao extends CrudRepository<blogs,String>{

}