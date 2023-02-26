package taller3.televisores;

public class Control {
    
    private TV tv;
    
    //Set
    public void setTv(TV tv){
        this.tv = tv;
    }
    //Get
    public TV getTv() {
        return tv;
    }

    //enlazar el control con el Tv
    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
        
    }

    //Apagar y encender el TV
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }

    //Cambiar canales
    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void setCanal(int canal){
        tv.setCanal(canal);
    }

    //subir y bajar volumen
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
}
