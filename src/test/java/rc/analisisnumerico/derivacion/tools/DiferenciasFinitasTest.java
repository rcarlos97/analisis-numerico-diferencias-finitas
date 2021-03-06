/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.analisisnumerico.derivacion.tools;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcarlos
 */
public class DiferenciasFinitasTest {
    
    public DiferenciasFinitasTest() {
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
     * Test of AdelantePrimeraOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden1() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000018;
        double result = instance.adelantePrimeraOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelantePrimeraOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -4.4408920985006255E-14;
        double result = instance.adelantePrimeraOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelantePrimeraOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 8.88178419700125E-13;
        double result = instance.adelantePrimeraOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelantePrimeraOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -2.664535259100375E-13;
        double result = instance.adelantePrimeraOrden4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden1() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000018;
        double result = instance.adelanteSegundaOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 0.0;
        double result = instance.adelanteSegundaOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -4800.000000000003;
        double result = instance.adelanteSegundaOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -1.4210854715202E-10;
        double result = instance.adelanteSegundaOrden4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasPrimeraOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasPrimeraOrden1() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -2.0000000000000018;
        double result = instance.atrasPrimeraOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasPrimeraOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasPrimeraOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 0.0;
        double result = instance.atrasPrimeraOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasPrimeraOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasPrimeraOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 4.440892098500625E-13;
        double result = instance.atrasPrimeraOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasPrimeraOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasPrimeraOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 1.5543122344752188E-11;
        double result = instance.atrasPrimeraOrden4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasSegundaOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasSegundaOrden1() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 1.9999999999999996;
        double result = instance.atrasSegundaOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasSegundaOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasSegundaOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 4.4408920985006255E-14;
        double result = instance.atrasSegundaOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasSegundaOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasSegundaOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 8.88178419700125E-12;
        double result = instance.atrasSegundaOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of atrasSegundaOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAtrasSegundaOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 7.105427357601E-11;
        double result = instance.atrasSegundaOrden4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaPrimeraOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaPrimeraOrden1() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000004;
        double result = instance.centradaPrimeraOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaPrimeraOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaPrimeraOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.2204460492503128E-14;
        double result = instance.centradaPrimeraOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaPrimeraOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaPrimeraOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -2.2204460492503126E-13;
        double result = instance.centradaPrimeraOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaPrimeraOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaPrimeraOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -4.440892098500625E-12;
        double result = instance.centradaPrimeraOrden4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaSegundaOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaSegundaOrden1() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000004;
        double result = instance.centradaSegundaOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaSegundaOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaSegundaOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 4.070817756958906E-14;
        double result = instance.centradaSegundaOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaSegundaOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaSegundaOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 49.99999999999953;
        double result = instance.centradaSegundaOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of centradaSegundaOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testCentradaSegundaOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -2.5905203907920317E-11;
        double result = instance.centradaSegundaOrden4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of cincoPuntosPrimera method, of class DiferenciasFinitas.
     */
    @Test
    public void testCincoPuntosPrimera() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000164;
        double result = instance.cincoPuntosPrimera();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of cincoPuntosSegunda method, of class DiferenciasFinitas.
     */
    @Test
    public void testCincoPuntosSegunda() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000004;
        double result = instance.cincoPuntosSegunda();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of tresPuntos method, of class DiferenciasFinitas.
     */
    @Test
    public void testTresPuntos() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.000000000000004;
        double result = instance.tresPuntos();
        assertEquals(expResult, result, 0.0);
    }
    
}
