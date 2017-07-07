package com.nomina.modal;
// Generated 04/07/2017 17:52:39 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ClEmpresas generated by hbm2java
 */
public class ClEmpresas  implements java.io.Serializable {


     private int idEmpresa;
     private ClCiudad clCiudad;
     private ClPais clPais;
     private ClProvincia clProvincia;
     private ClTiposIdentificacion clTiposIdentificacion;
     private String identificacion;
     private String razonSocial;
     private String direccion;
     private String telefonos;
     private String email;
     private Date fechaCreacion;
     private Date fechaActualizacion;
     private String estado;
     private String telfonos2;
     private String celular;
     private Integer sucursal;

    public ClEmpresas() {
    }

	
    public ClEmpresas(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public ClEmpresas(int idEmpresa, ClCiudad clCiudad, ClPais clPais, ClProvincia clProvincia, ClTiposIdentificacion clTiposIdentificacion, String identificacion, String razonSocial, String direccion, String telefonos, String email, Date fechaCreacion, Date fechaActualizacion, String estado, String telfonos2, String celular, Integer sucursal) {
       this.idEmpresa = idEmpresa;
       this.clCiudad = clCiudad;
       this.clPais = clPais;
       this.clProvincia = clProvincia;
       this.clTiposIdentificacion = clTiposIdentificacion;
       this.identificacion = identificacion;
       this.razonSocial = razonSocial;
       this.direccion = direccion;
       this.telefonos = telefonos;
       this.email = email;
       this.fechaCreacion = fechaCreacion;
       this.fechaActualizacion = fechaActualizacion;
       this.estado = estado;
       this.telfonos2 = telfonos2;
       this.celular = celular;
       this.sucursal = sucursal;
    }
   
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public ClCiudad getClCiudad() {
        return this.clCiudad;
    }
    
    public void setClCiudad(ClCiudad clCiudad) {
        this.clCiudad = clCiudad;
    }
    public ClPais getClPais() {
        return this.clPais;
    }
    
    public void setClPais(ClPais clPais) {
        this.clPais = clPais;
    }
    public ClProvincia getClProvincia() {
        return this.clProvincia;
    }
    
    public void setClProvincia(ClProvincia clProvincia) {
        this.clProvincia = clProvincia;
    }
    public ClTiposIdentificacion getClTiposIdentificacion() {
        return this.clTiposIdentificacion;
    }
    
    public void setClTiposIdentificacion(ClTiposIdentificacion clTiposIdentificacion) {
        this.clTiposIdentificacion = clTiposIdentificacion;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefonos() {
        return this.telefonos;
    }
    
    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaActualizacion() {
        return this.fechaActualizacion;
    }
    
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTelfonos2() {
        return this.telfonos2;
    }
    
    public void setTelfonos2(String telfonos2) {
        this.telfonos2 = telfonos2;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public Integer getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }




}


