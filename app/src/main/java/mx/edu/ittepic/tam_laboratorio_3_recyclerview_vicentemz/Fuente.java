package mx.edu.ittepic.tam_laboratorio_3_recyclerview_vicentemz;

/**
 * Created by vicen on 24/02/2018.
 */

public class Fuente {
    String nombre;
    String ncontrol;
    String carrera;
    int imagen;
    int color;

    public Fuente(String nombre, String ncontrol, String carrera, int imagen,int color) {
        this.nombre = nombre;
        this.ncontrol = ncontrol;
        this.carrera = carrera;
        this.imagen = imagen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNcontrol() {
        return ncontrol;
    }

    public void setNcontrol(String ncontrol) {
        this.ncontrol = ncontrol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
