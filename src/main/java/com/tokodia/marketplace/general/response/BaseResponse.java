package com.tokodia.marketplace.general.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseResponse {
    private String code;
    private String description;
    private Map<String, Object> additionalEntity = new HashMap();

    public BaseResponse(String code, String description, Object additionalEntity) {
        HashMap resultMap = new HashMap();
        resultMap.put("result", additionalEntity);
        this.code = code;
        this.description = description;
        this.additionalEntity = resultMap;
    }
}
