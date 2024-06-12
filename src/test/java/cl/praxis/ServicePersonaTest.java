package cl.praxis;

import cl.praxis.models.Persona;
import cl.praxis.services.ServicePersona;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;
import java.util.logging.Logger;

@DisplayName("Test clase ServicioPersona")
public class ServicePersonaTest {
  private static Logger logger = Logger.getLogger("cl.praxis.services.ServicePersona");
  private final ServicePersona servicePersona = new ServicePersona();

  @BeforeAll
  public static void init(){
    logger.warning("Esto se ejecuta ANTES de TODOS los test");
  }

  @BeforeEach
  public void initEach(){
    logger.info("-> Esto se ejecuta ANTES de cada test");
  }

  @AfterEach
  public void closeEach(){
    logger.info("-> Esto se ejecuta DESPUÉS de cada test");
  }

  @AfterAll
  public static void close(){
    logger.warning("-> Esto se ejecuta DESPUÉS de TODOS los test");

  }

  @Test
  public void testCrearPersona(){
    logger.info("Test Crear Persona");
    Persona p = new Persona("1-1", "Pepito");
    String result = servicePersona.crearPersona(p);
    assertEquals("Creada", result);
  }

  @Test
  public void testCrearPersonaWithReturnNull(){
    String result = servicePersona.crearPersona(null);
    assertEquals("No Creada", result);
  }
  @Test
  public void testActualizarPersona(){
    logger.info("Test Actualizar Persona");
    Persona p = new Persona("1-1", "Jaimito");
    String result = servicePersona.actualizarPersona(p);
    assertEquals("Actualizada", result);
  }

  @Test
  public void testListarPersonas(){
    logger.info("Test Listar Persona");
    Map<String, String> lista = servicePersona.listarPersonas();
    assertNotNull(lista);
  }
}
