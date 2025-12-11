package Controller;

import Model.AgendaDAO;
import Model.ModelAgendamento;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControllerAgenda {

    private AgendaDAO dao = new AgendaDAO();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    
    // cadastra funcionando
    
    public boolean cadastrarAgenda(String titulo, String descricao, String dataHoraTexto) {

        if (titulo == null || titulo.trim().isEmpty()) {
            System.err.println("Erro: título vazio.");
            return false;
        }

        try {
            System.out.println("Valor recebido da data/hora: [" + dataHoraTexto + "]");
            
            dataHoraTexto = dataHoraTexto.trim();
            LocalDateTime dataHora = LocalDateTime.parse(dataHoraTexto, formato);

            // ainda não tem sistema de id tem q fazer dps
            int id = gerarIdProvisorio();

            ModelAgendamento ag = new ModelAgendamento(id, titulo, descricao, dataHora);

            dao.salvar(ag);
            return true;

        } catch (Exception e) {
            System.err.println("Erro ao cadastrar agenda: data/hora inválida.");
            return false;
        }
    }

   // to usando um id falso so pra testar
    private int gerarIdProvisorio() {
    //tem q fazer gerar um id aí
        return (int) (Math.random() * 100000); // dps a gente muda isso
    }

   
    // listar tem q fazer
   
    public void listarAgendamentos() {
        //bota a logica aq
    }

    //editar tem q fazer dps
    public boolean editarAgenda(int id, String novoTitulo, String novaDescricao, String novaDataHora) {
        // tem q buscar o agendamento e atualizar
        return false;
    }

  
    // deletar tbm
    public boolean deletarAgenda(int id) {
        // deleya
        return false;
    }

    // finalizar yuri faz
    public boolean finalizarAgenda(int id) {
        // tem q marcar o finalizar com o check list la e chamar o atualizar pta funfar
        return false;
    }

}
