package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModelAgendamento {

    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataHora;
    private boolean finalizado;

    public ModelAgendamento(int id, String titulo, String descricao, LocalDateTime dataHora) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.finalizado = false;
    }

    

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id;
    }

    public String getTitulo() { 
        return titulo; 
    }
    
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    public String getDescricao() { 
        return descricao; 
    }
    
    public void setDescricao(String descricao) {
            this.descricao = descricao; 
    }

    public LocalDateTime getDataHora() { 
        return dataHora;
    }
    
    public void setDataHora(LocalDateTime dataHora) { 
        this.dataHora = dataHora;
    }

    public boolean isFinalizado() { 
        return finalizado;
    }
    
    public void setFinalizado(boolean finalizado) { 
        this.finalizado = finalizado; 
    }

    
    
    public String toFileString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return id + ";" + titulo + ";" + descricao + ";" + dataHora.format(fmt) + ";" + finalizado;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return titulo + " - " + dataHora.format(fmt);
    }
}
