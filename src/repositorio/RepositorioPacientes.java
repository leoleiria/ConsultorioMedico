package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Paciente;

/**
 *
 * @author lhries
 */
public class RepositorioPacientes {

    private List<Paciente> pacientes;
    private static RepositorioPacientes instance = null;
    
    private RepositorioPacientes() {
        pacientes = new ArrayList<Paciente>();
    }

    public static RepositorioPacientes getInstance() {
        if(instance == null) instance = new RepositorioPacientes();
        return instance;
    }
    
    

    public boolean add(Paciente paciente) {
        return (pacientes.add(paciente));
    }
    
    public boolean estaVazio(){
        return pacientes.isEmpty();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public boolean pacienteExiste(String rg) {
        for (Paciente paciente : pacientes) {
            if (paciente.getRg().equals(rg)) {
                return true;
            }
        }
        return false;
    }

    public Paciente buscarPaciente(String rg) {
        for (Paciente paciente : pacientes) {
            if (paciente.getRg().equals(rg)) {
                return paciente;
           }
        }
        return null;
    }
} 
