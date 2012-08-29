package Test;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestManejadorBD {
    
    private ManejadorBD mbd = ManejadorBD.getInstancia();
    
    @Test
    public void selectJugador(){
        String[] esperado = {"Lucas", "Lucas Miranda", "1992-02-24", "Uruguayo", "Defensa", "1.75", "70"};
        String [] obtenido = new String[7];
        ResultSet res = mbd.selectJugador(1);
        try {
            res.next();
            for (int i=0; i<7; i++){
                obtenido[i] = res.getString(i+2);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void selectJugadoresEquipos(){
        
    }
}
