package J17_Interfaces.z_Ejercicio_1;

import java.time.LocalDate;

public interface EsAlimento {
    
    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public int getCalorias();
    
}
