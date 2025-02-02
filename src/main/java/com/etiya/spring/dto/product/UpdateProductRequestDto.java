package com.etiya.spring.dto.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductRequestDto {
    int id;
    private String name;
    private double unitPrice;
    private int unitsInStock;
}
