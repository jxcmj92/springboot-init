package com.springboot.entry.dto;

import com.springboot.service.ValidGroup;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * @description:
 * @author: chenmingjian
 * @date: 19-2-1 14:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TestDto {

    @NotBlank(message = "姓名不能为空")
    private String name;
}
