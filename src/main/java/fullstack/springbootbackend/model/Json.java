package fullstack.springbootbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Json implements Serializable {
    private int id;
    private String image;
    private String name;
    private int price;
}
