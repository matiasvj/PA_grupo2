package Clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControlDeFecha {
    
    private static ControlDeFecha instancia = null;
    private Calendar calendario;

    public static ControlDeFecha getInstancia(){
        if(instancia == null){
            instancia = new ControlDeFecha();
        }
        return instancia;
    }
    public ControlDeFecha(){
        calendario = new GregorianCalendar(2010,9,1,15,00,00);
    }
    
    public Calendar getCalendario(){
        return calendario;
    }
    
    public String getFecha(){
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int anio = calendario.get(Calendar.YEAR);
        String fecha = dia+"/"+mes+"/"+anio;
        
        return fecha;
    }
    
    public String getHora(){
        int hora = calendario.get(Calendar.HOUR);
        int minutos = calendario.get(Calendar.MINUTE);
        String hhmm = hora+":"+minutos;
        
        return hhmm;
    }
    
    public void setFecha(int dia, int mes, int anio){
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.YEAR, anio);
    }
}
