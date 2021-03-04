/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Homed
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({calculadora.CalculadorasTestresta.class, calculadora.CalculadorasTestmultiplica.class, calculadora.CalculadorasTestsuma.class, calculadora.CalculadorasTestdivide.class})
public class CalculadoraSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
