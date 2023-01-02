/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaEntidades;

/**
 *
 * @author usuario
 */
public class CuentaEntidades {
    private String Nombre, Apellido;
    private int  NumeroCuenta;
    private int DNI;
    private int SaldoActual;

    public CuentaEntidades() {
    }

    public CuentaEntidades(String Nombre, String Apellido, int NumeroCuenta, int DNI, int SaldoActual) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    @Override
    public String toString() {
        return "CuentaEntidades{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", NumeroCuenta=" + NumeroCuenta + ", DNI=" + DNI + ", SaldoActual=" + SaldoActual + '}';
    }

    
    
    
    
}
