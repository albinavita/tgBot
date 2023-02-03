package com.example.tgBot.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/указать значение поля
@XmlRootElement(name = "ValuteCursOnDate") //Корневой элемент
@Data //Генерируем геттеры и сеттеры
public class ValuteCursOnDate {
    @XmlElement(name = "Vname") //Название XML тэгу
    private String name;

    @XmlElement(name = "Vnom") //Название XML тэгу
    private int nominal;

    @XmlElement(name = "Vcurs") //Название XML тэгу
    private double course;

    @XmlElement(name = "Vcode") //Название XML тэгу
    private String code;

    @XmlElement(name = "VchCode") //Название XML тэгу
    private String chCode;
}
