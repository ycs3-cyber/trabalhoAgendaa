package Model;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
    

public class AgendaDAO {

    private static final String NOME_ARQUIVO = "Agenda_db.txt";
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

  
    private ModelAgendamento parseAgendamento(String linha) {
        String[] partes = linha.split(";");

        try {
            if (partes.length == 5) {
                int id = Integer.parseInt(partes[0]);
                String titulo = partes[1];
                String descricao = partes[2];
                LocalDateTime dataHora = LocalDateTime.parse(partes[3], FORMATO);
                boolean finalizado = Boolean.parseBoolean(partes[4]);

                ModelAgendamento ag = new ModelAgendamento(id, titulo, descricao, dataHora);
                ag.setFinalizado(finalizado);
                return ag;
            }
        } catch (Exception e) {
            System.err.println("Linha ignorada por estar em formato inválido: " + linha);
        }

        return null;
    }

    public List<ModelAgendamento> listarTodos() {
        List<ModelAgendamento> agendamentos = new ArrayList<>();
        File arquivo = new File(NOME_ARQUIVO);

        if (!arquivo.exists() || arquivo.length() == 0) {
            return agendamentos; 
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;

                ModelAgendamento ag = parseAgendamento(linha);
                if (ag != null) {
                    agendamentos.add(ag);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo de agendamentos: " + e.getMessage());
        }

        return agendamentos;
    }

   
    public void salvar(ModelAgendamento agendamento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            writer.write(agendamento.toFileString());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao salvar agendamento: " + e.getMessage());
        }
    }

    public boolean atualizar(ModelAgendamento agendamentoAtualizado) {
        List<ModelAgendamento> lista = listarTodos();
        boolean encontrado = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == agendamentoAtualizado.getId()) {
                lista.set(i, agendamentoAtualizado);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            reescreverArquivo(lista);
            return true;
        }

        return false;
    }

   
    public boolean deletar(int id) {
        List<ModelAgendamento> lista = listarTodos();

        List<ModelAgendamento> restantes = lista.stream()
                .filter(a -> a.getId() != id)
                .collect(Collectors.toList());

        if (restantes.size() < lista.size()) {
            reescreverArquivo(restantes);
            return true;
        }

        return false;
    }


    private void reescreverArquivo(List<ModelAgendamento> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO, false))) {
            for (ModelAgendamento ag : lista) {
                writer.write(ag.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao reescrever arquivo: " + e.getMessage());
        }
        
   
    }
}


