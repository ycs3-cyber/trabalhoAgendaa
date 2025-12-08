/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author MEUPC
 */
public class ModelAgendamento {
    
    private String nomeAgenda;
    private Calendar dataAgenda;
    
    
    public ModelAgendamento(String nomeAgenda , Calendar dataAgenda){
        this.nomeAgenda = nomeAgenda;
        this.dataAgenda = dataAgenda;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
       
    }
    
      public String toFileString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        return nomeAgenda +  ";" + sdf.format(dataAgenda.getTime());
        
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public Calendar getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(Calendar dataAgenda) {
        this.dataAgenda = dataAgenda;
    }
    
}
