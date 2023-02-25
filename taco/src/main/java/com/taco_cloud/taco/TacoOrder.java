package com.taco_cloud.taco;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class TacoOrder {
    
    @NotBlank(message = "Наименование доставки обязательно для заполнения")
    private String deliveryName;

    @NotBlank(message = "Улица доставки обязательно для заполнения")
    private String deliveryStreet;

    @NotBlank(message = "Город доставки обязательно для заполнения")
    private String deliveryCity;

    @CreditCardNumber
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
             message="Формат MM/YY")
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Неправильный CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }
}
