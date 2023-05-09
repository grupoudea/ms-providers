package com.proyecto.integrador.msproviders.dto;


import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class ProviderDto {

    private Integer id;

    @NotBlank
    @Pattern(regexp = "(^[0-9]+$)")
    private String nit;

    private String name;

    private String address;

    @Pattern(regexp = "(^[0-9]+$)")
    private String phone;
}
