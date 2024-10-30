package vn.hiuz.models;

import java.io.Serializable;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable{

	
	private static final long serialVersionUID = 3590877423972567141L;
	@Id	
	private Long id;
	@NotEmpty(message = "Không được bỏ trống")
	private String name;
	private int images;
	private int status;
	
	private Boolean isEdit = false;
}
