package hello.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by smpark on 2016-01-19.
 */
@Entity
public class blogs {
    @Id
    String id;

    String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
