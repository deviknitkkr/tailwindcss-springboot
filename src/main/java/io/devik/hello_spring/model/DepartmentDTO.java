package io.devik.hello_spring.model;

import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DepartmentDTO {

    private Long id;

    @Size(max = 255)
    private String name;

}
