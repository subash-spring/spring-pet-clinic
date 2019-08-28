package application.model;


/**
 * Created by subash on 8/25/19.
 */
public class PetType extends BaseEntity {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
