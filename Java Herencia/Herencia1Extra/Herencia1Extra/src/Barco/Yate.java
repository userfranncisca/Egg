/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barco;

/**
 *
 * @author usuario
 */
public class Yate extends Barco {
    protected int potenciaCV;
    protected int Ncamarotes;

    public Yate() {
    }

    public Yate(int potenciaCV, int Ncamarotes) {
        this.potenciaCV = potenciaCV;
        this.Ncamarotes = Ncamarotes;
    }

    public Yate(int Matricula, int Eslora, int Afabricacion) {
        super(Matricula, Eslora, Afabricacion);
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNcamarotes() {
        return Ncamarotes;
    }

    public void setNcamarotes(int Ncamarotes) {
        this.Ncamarotes = Ncamarotes;
    }

  public void yate(){
      Yate y = new Yate(20, 10);
  }
    }
    

