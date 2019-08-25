package model;

import java.io.Serializable;

/**
 * Created by subash on 8/25/19.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
