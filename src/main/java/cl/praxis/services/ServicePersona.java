package cl.praxis.services;

import cl.praxis.models.Persona;

import java.util.HashMap;
import java.util.Map;

public class ServicePersona {
  private Map<String, String> personasDB = new HashMap<>();

  public String crearPersona(Persona persona){
    if (persona!= null){
      personasDB.put(persona.getRut(), persona.getNombre());
      return "Creada";
    }

    return "No Creada";
  }
  public String actualizarPersona(Persona persona){
    if (persona!= null){
      personasDB.put(persona.getRut(), persona.getNombre());
      return "Actualizada";
    }

    return "No Actualizada";
  }

  public Map<String, String> listarPersonas(){
    return personasDB;
  }

  public String eliminarPersona(Persona persona){
    if (persona!= null){
      personasDB.remove(persona.getRut());
      return "Eliminada";
    }

    return "No Eliminada";
  }
}
