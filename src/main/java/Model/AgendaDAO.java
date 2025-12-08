/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author MEUPC
 */
public class AgendaDAO {

    private static final String NOME_ARQUIVO = "Agenda_db.txt";

    public void salvar(ModelAgendamento agendamento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            writer.write(agendamento.toFileString());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao salvar agendamento no arquivo: " + e.getMessage());
        }
    }

}
