package com.mycode.designpatternsstructuraladapter.entities.files;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class XMLFile {
    private String name;
    private Integer size;
}
