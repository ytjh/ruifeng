package com.ruifeng.pojo;

import com.ruifeng.core.plus.PageRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CmyDemo extends PageRequest {
    private Integer id;
    private String name;
}
