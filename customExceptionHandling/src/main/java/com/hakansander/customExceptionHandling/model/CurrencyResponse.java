package com.hakansander.customExceptionHandling.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;


@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "valid",
        "updated",
        "base"
})
public class CurrencyResponse {
    @JsonProperty("valid")
    private Boolean valid;
    @JsonProperty("updated")
    private Integer updated;
    @JsonProperty("base")
    private String base;
    @JsonProperty("rates")
    Map<String, Double> rates;
}
