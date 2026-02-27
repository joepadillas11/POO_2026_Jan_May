package process;


public class Switch {

    private boolean isOn;

    public void prender_switch(){
        this.isOn = true;
    } 

    public void apagar_switch(){
        this.isOn = false;
    }

    public boolean isOn(){
        return this.isOn;
    }
    
}



