package com.example.tgBot.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/указать значение поля
@XmlRootElement(name = "GetCursOnDateXML", namespace = "http://web.cbr.ru/")
@Data //Геттеры и сеттеры
public class GetCursOnDateXml {
    @XmlElement(name = "On_date", required = true, namespace = "http://web.cbr.ru/") //Указание на то, в каком теге XML должно быть данное поле
    protected XMLGregorianCalendar onDate;
}
