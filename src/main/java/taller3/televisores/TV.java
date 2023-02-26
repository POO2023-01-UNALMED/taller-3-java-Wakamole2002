package taller3.televisores;

public class TV {
    
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;
    
    
    //Sertters
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setControl(Control control) {
        this.control = control;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public void setVolumen(int volumen) {
        if(estado && (0<= volumen) && (volumen <=7)){
            this.volumen = volumen;
            }
    }
    public void setCanal(int canal) {
        if(estado && (1<= canal) && (canal <=120)){
            this.canal = canal;
        }
    }

    //Getters
    public Marca getMarca() {
        return marca;
    }
    public int getCanal() {
        return canal;
    }
    public int getPrecio() {
        return precio;
    }
    public int getVolumen() {
        return volumen;
    }
    public Control getControl() {
        return control;
    }
    public static int getNumTV(){
        return numTV;
    }

    //Constructor
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
        numTV++;
    }

    //Encendido, apagado y estado del TV
    public void turnOn(){
        estado = true;
    }
    public void turnOff(){
        estado = false;
    }
    public boolean getEstado(){
        return estado;
    }

    //Cambiar canales
    public void canalUp(){
        if(estado && (1<= canal) && (canal <120)){
            canal++;
        }
    }
    public void canalDown(){
        if(estado && (1< canal) && (canal <=120)){
            canal--;
        }
    }


    //Cambiar volumen
    public void volumenUp(){
        if(estado && (0<= volumen) && (volumen <7)){
            volumen++;
        }
    }
    public void volumenDown(){
        if(estado && (0< volumen) && (volumen <=7)){
            volumen--;
        }
    }



}
