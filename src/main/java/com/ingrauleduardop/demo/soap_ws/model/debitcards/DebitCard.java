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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para debitCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="debitCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero_tarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipo_usuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigo_estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigo_bloqueo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre_bloqueo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debitCard", propOrder = {
    "numeroTarjeta",
    "tipoUsuario",
    "codigoEstado",
    "codigoBloqueo",
    "nombreBloqueo"
})
public class DebitCard {

    @XmlElement(name = "numero_tarjeta", required = true)
    protected String numeroTarjeta;
    @XmlElement(name = "tipo_usuario", required = true)
    protected String tipoUsuario;
    @XmlElement(name = "codigo_estado", required = true)
    protected String codigoEstado;
    @XmlElement(name = "codigo_bloqueo", required = true)
    protected String codigoBloqueo;
    @XmlElement(name = "nombre_bloqueo", required = true)
    protected String nombreBloqueo;

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Define el valor de la propiedad tipoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUsuario(String value) {
        this.tipoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstado(String value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBloqueo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBloqueo() {
        return codigoBloqueo;
    }

    /**
     * Define el valor de la propiedad codigoBloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBloqueo(String value) {
        this.codigoBloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBloqueo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBloqueo() {
        return nombreBloqueo;
    }

    /**
     * Define el valor de la propiedad nombreBloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBloqueo(String value) {
        this.nombreBloqueo = value;
    }

}
