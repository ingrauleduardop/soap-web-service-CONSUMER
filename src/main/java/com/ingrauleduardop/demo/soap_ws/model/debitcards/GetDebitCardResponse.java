//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.30 a las 09:58:04 AM GMT-04:00 
//


package com.ingrauleduardop.demo.soap_ws.model.debitcards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="debitCard" type="{http://ingrauleduardop.com/demo/soap-ws/model/debitCards}debitCard"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "debitCard"
})
@XmlRootElement(name = "getDebitCardResponse")
public class GetDebitCardResponse {

    @XmlElement(required = true)
    protected DebitCard debitCard;

    /**
     * Obtiene el valor de la propiedad debitCard.
     * 
     * @return
     *     possible object is
     *     {@link DebitCard }
     *     
     */
    public DebitCard getDebitCard() {
        return debitCard;
    }

    /**
     * Define el valor de la propiedad debitCard.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCard }
     *     
     */
    public void setDebitCard(DebitCard value) {
        this.debitCard = value;
    }

}
