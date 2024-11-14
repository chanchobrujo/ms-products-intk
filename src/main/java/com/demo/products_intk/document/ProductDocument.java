package com.demo.products_intk.document;

import com.demo.products_intk.model.dto.ProductDto;
import lombok.Data;
import org.springframework.data.annotation.Id;

import static com.stater.intk.common.utils.GeneralUtils.generateId;
import static com.stater.intk.common.utils.MapperUtils.objectToObject;

@Data
public class ProductDocument {
    @Id
    private String id = generateId(25, false);
    private String name;
    private String type;

    public ProductDto toDto() {
        return objectToObject(this, ProductDto.class);
    }
}
