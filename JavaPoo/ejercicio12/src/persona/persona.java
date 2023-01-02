/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 */
package persona;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class persona {
    //atributos 
    private String Nombre;
    private String Apellido;
    private int edad, ano,mes,dia;
    private Date fecha;

    public persona() {
    }

    public persona(String Nombre, String Apellido, int edad, int ano, int mes, int dia, Date fecha) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
    
}
    