/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Include;

/**
 *
 * @author ALESSO
 */
public class Direccion {
    String Direccion;
    int IdDistri;
    int IdProvi;
    int IdDepar;
    int PoblacionPro;
    int PoblacionDis;

    public Direccion(String Direccion, int IdDistri, int IdProvi, int IdDepar, int PoblacionPro, int PoblacionDis, int PoblacionDepar) {
        this.Direccion = Direccion;
        this.IdDistri = IdDistri;
        this.IdProvi = IdProvi;
        this.IdDepar = IdDepar;
        this.PoblacionPro = PoblacionPro;
        this.PoblacionDis = PoblacionDis;
        this.PoblacionDepar = PoblacionDepar;
    }

    
    
    
    public int getPoblacionDis() {
        return PoblacionDis;
    }

    public void setPoblacionDis(int PoblacionDis) {
        this.PoblacionDis = PoblacionDis;
    }
    int PoblacionDepar;

 

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getIdDistri() {
        return IdDistri;
    }

    public void setIdDistri(int IdDistri) {
        this.IdDistri = IdDistri;
    }

    public int getIdProvi() {
        return IdProvi;
    }

    public void setIdProvi(int IdProvi) {
        this.IdProvi = IdProvi;
    }

    public int getIdDepar() {
        return IdDepar;
    }

    public void setIdDepar(int IdDepar) {
        this.IdDepar = IdDepar;
    }

    public int getPoblacionPro() {
        return PoblacionPro;
    }

    public void setPoblacionPro(int PoblacionPro) {
        this.PoblacionPro = PoblacionPro;
    }

    public int getPoblacionDepar() {
        return PoblacionDepar;
    }

    public void setPoblacionDepar(int PoblacionDepar) {
        this.PoblacionDepar = PoblacionDepar;
    }
    
}
