/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Include;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author LAB-USR-CAQP-C0204
 */
public class Persona {
    private int Id_persona;
    private String DNI;
    private String Clave;
    private String Nombres;
    private String Primer_APellido;
    private String Segundo_Apellido;
    private String Foto;
    private String Fecha_Nacimiento;
    private int Id_Direccion;
    private int Id_Estado_Civil;
    private String Sexo;
    private int Id_Tipo_Participante;
    private int Id_Mesas;
    private boolean Valudacion_Voto;
//Crear

    public Persona(String DNI, String Clave, String Nombres, String Primer_APellido, String Segundo_Apellido, String Foto, String Fecha_Nacimiento, int Id_Direccion, int Id_Estado_Civil, String Sexo, int Id_Tipo_Participante, int Id_Mesas, boolean Valudacion_Voto) {
        Date de = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");

        this.DNI = DNI;
        this.Clave = Clave;
        this.Nombres = Nombres;
        this.Primer_APellido = Primer_APellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Foto = Foto;
        this.Fecha_Nacimiento = sdf.format(Fecha_Nacimiento);
        this.Id_Direccion = Id_Direccion;
        this.Id_Estado_Civil = Id_Estado_Civil;
        this.Sexo = Sexo;
        this.Id_Tipo_Participante = Id_Tipo_Participante;
        this.Id_Mesas = Id_Mesas;
        this.Valudacion_Voto = Valudacion_Voto;

    }
//login
    public Persona(String DNI, String Clave) {
        this.DNI = DNI;
        this.Clave = Clave;
    }

//visualizar
    public Persona(String DNI){
        this.DNI=DNI;
    }
    

    public int getId_persona() {
        return Id_persona;
    }

    public void setId_persona(int Id_persona) {
        this.Id_persona = Id_persona;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getPrimer_APellido() {
        return Primer_APellido;
    }

    public void setPrimer_APellido(String Primer_APellido) {
        this.Primer_APellido = Primer_APellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }


    public int getId_Direccion() {
        return Id_Direccion;
    }

    public void setId_Direccion(int Id_Direccion) {
        this.Id_Direccion = Id_Direccion;
    }

    public int getId_Estado_Civil() {
        return Id_Estado_Civil;
    }

    public void setId_Estado_Civil(int Id_Estado_Civil) {
        this.Id_Estado_Civil = Id_Estado_Civil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getId_Tipo_Participante() {
        return Id_Tipo_Participante;
    }

    public void setId_Tipo_Participante(int Id_Tipo_Participante) {
        this.Id_Tipo_Participante = Id_Tipo_Participante;
    }

    public int getId_Mesas() {
        return Id_Mesas;
    }

    public void setId_Mesas(int Id_Mesas) {
        this.Id_Mesas = Id_Mesas;
    }

    public boolean isValudacion_Voto() {
        return Valudacion_Voto;
    }

    public void setValudacion_Voto(boolean Valudacion_Voto) {
        this.Valudacion_Voto = Valudacion_Voto;
    }
    
}
