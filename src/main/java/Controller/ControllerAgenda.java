package Controller;

import Model.AgendaDAO;
import Model.ModelAgendamento;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ControllerAgenda {

    private AgendaDAO dao = new AgendaDAO();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    
    // controller feito por yuri
    
    public boolean cadastrarAgenda(String titulo, String descricao, String dataHoraTexto) {

        if (titulo == null || titulo.trim().isEmpty()) {
            System.err.println("Erro: título vazio.");
            return false;
        }

        try {    
            dataHoraTexto = dataHoraTexto.trim();
            LocalDateTime dataHora = LocalDateTime.parse(dataHoraTexto, formato);

            
            int id = gerarIdProvisorio();

            ModelAgendamento ag = new ModelAgendamento(id, titulo, descricao, dataHora);

            dao.salvar(ag);
            return true;

        } catch (Exception e) {
            System.err.println("Erro ao cadastrar agenda: data/hora inválida.");
            return false;
        }
    }

   
    private int gerarIdProvisorio() {
        return (int) (Math.random() * 100000);
    }

   
   
   
    public List<ModelAgendamento> listarAgendamentos() {
        try {
            return dao.listarTodos(); 
        } catch (Exception e) {
            System.err.println("Erro ao listar agendamentos: " + e.getMessage());
            e.printStackTrace();
            return new ArrayList<>(); 
        }
    }

    
    public boolean editarAgenda(int id, String novoTitulo, String novaDescricao, LocalDateTime novaDataHora) {
        ModelAgendamento agendaAtualizada = new ModelAgendamento(id ,novoTitulo ,  novaDescricao , novaDataHora);
        return dao.atualizar(agendaAtualizada);
        
    }

  
  
    public boolean deletarAgenda(int id) {
        return dao.deletar(id);
    }

    
    public boolean finalizarAgenda(int id) {
       return dao.marcarComoFinalizado(id);
        
    }

    public boolean alternarStatusFinalizacao(int id, boolean novoStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
