package com.demo.products_intk.document;

import com.demo.products_intk.model.dto.ProductDto;
import lombok.Data;
import org.springframework.data.annotation.Id;

import static com.stater.intk.util.GeneralUtil.generateId;
import static com.stater.intk.util.MapperUtils.objectToObject;

@Data
public class ProductDocument {
    @Id
    private String id = generateId(25);
    private String name;
    private String type;

    public ProductDto toDto() {
        return objectToObject(this, ProductDto.class);
    }
}
