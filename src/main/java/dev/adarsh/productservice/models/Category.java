package dev.adarsh.productservice.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {
    private String name;
    private String description;
    @OneToMany(mappedBy = "category")
    List<Product> products;
}
