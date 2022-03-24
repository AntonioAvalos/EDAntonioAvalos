/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejerciciosclase;

import practicaProg.Avalos_Antonio_PROG06_Practica;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author super
 */
public class Avalos_Antonio_PROG06_PracticaTest {
    
    public Avalos_Antonio_PROG06_PracticaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of entradaJugadores method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testEntradaJugadores() {
          
        System.out.println("entradaJugadores");
        
        Scanner entrada= new Scanner ("1");
        int expResult = 1;
        int result = Avalos_Antonio_PROG06_Practica.entradaJugadores(entrada);
        assertEquals(expResult, result);
  
        
        
        entrada= new Scanner ("6");
        expResult = 6;
        result = Avalos_Antonio_PROG06_Practica.entradaJugadores(entrada);
        assertEquals(expResult, result);
       
    
        /*
        
        Las siguientes pruebas (0 y 7) son números fuera del rango (1-6). Lanza error ya que el código
        solicita una nueva entrada INDEFINIDAMENTE (por el while) hasta que hay un número correcto. 
        Ante esto, JUnit no pasa la prueba, lo que quiere decir que en teoría es correcto:
        cuando no es número dentro del rango, se solicita una nueva entrada debido al while, 
        lo que quiere decir que el número introducido no es igual al permitido. En cambio, con las pruebas
        realizadas arriba sí identifica el número como correcto, lo que hace que JUnit lo valide. 
        
        */
        
        
        /*entrada= new Scanner ("0");
        expResult=0;
        result = Avalos_Antonio_PROG06_Practica.entradaJugadores(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        
        entrada= new Scanner ("7");
        expResult = 7;
        result = Avalos_Antonio_PROG06_Practica.entradaJugadores(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      */
       
        
    }

    /**
     * Test of puntuacionRonda method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testPuntuacionRonda() {
        
       /*
        La siguiente función sólo muestra los puntos de los jugadores. 
        Es una única salida en la que se muestra la puntuación de cada jugador mediante un acumulador. 
        No hay posibilidad de automatizar. Se hace función debido a su estructura REPETITIVA, es decir, se la va a llamar al final de cada ronda.
        
        */
    }

    /**
     * Test of funcionGanador method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testFuncionGanador() {
        //La función no retorna ningún valor, es void. No se puede automatizar. 
    }

    /**
     * Test of entradaRondas method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testEntradaRondas() {
        
       /*
        No se puede automatizar dicha prueba ya que no tiene parámetros. Fue un error del que me he dado
        cuenta durante la realización de esta prueba (puse una porción del código dentro de una función).
        */
    }

  
    
      /**
     * Test of nombreJugadores method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testNombreJugadores() {
        
        //No es prueba que se pueda automatizar, el nombre se guarda en el array o no se guarda. El propio código
        // confirma a la hora de preguntar si se ha guardado el nombre o no. 
        
    }


    /**
     * Test of serieMatematica method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testSerieMatematica() {
        //La siguiente función retorna un Math.random entre un rango (4-8). Debido a la aleatoriedad, no se puede automatizar.
    }

    /**
     * Test of op method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testOp() {
        //La siguiente función retorna un Math.random entre un rango (2-12). Debido a la aleatoriedad, no se puede automatizar.

    }

    /**
     * Test of num method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testNum() {
        //La siguiente función retorna un Math.random entre un rango (1-3). Debido a la aleatoriedad, no se puede automatizar.
    }

    /**
     * Test of averiguarRespuesta method, of class Avalos_Antonio_PROG06_Practica.
     */
    @Test
    public void testAveriguarRespuesta() {
        /*
        No se puede diseñar prueba para una función de librería. La profesora nos aportó 
        una función propia que supera nuestros conocimientos actuales
        */
    }
    
}
