/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AgendaDAO;
import Model.ModelAgendamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MEUPC
 */
public class ControllerAgenda {
    
    private AgendaDAO dao = new AgendaDAO();
    
    public boolean cadastrarAgenda(String nomeAgenda , String dataAgenda){
        if(nomeAgenda == null || nomeAgenda.trim().isEmpty()){
             System.err.println("Erro: Nome não pode ser vazio.");
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try{
        Date data = sdf.parse(dataAgenda);
        
        Calendar dataFinal = Calendar.getInstance();
        dataFinal.setTime(data);
        
         ModelAgendamento agenda = new ModelAgendamento( nomeAgenda , dataFinal);
         dao.salvar(agenda);
        }
        catch(ParseException error){
            System.err.println("Erro: data invalida!");
            return false;
        }
       
       
        return true;
    }
   
    
}
