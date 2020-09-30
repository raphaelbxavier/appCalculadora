import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CalculadoraTest {

    //Criação de variáveis locais com seus tipos específicos
    private Calculadora calculadora;
    private double firstNumber;
    private double secondNumber;
    private double result;

    //Método que será executado antes dos testes
    @Before
    public void initTest() {
        //Instância de Objeto
        calculadora = new Calculadora();
        //Valor 1 Mockado
        firstNumber = 10;
        //Valor 2 Mockado
        secondNumber = 2;
    }


    //Método de soma testado de forma unitária
    @Test
    public void testAddittion() {
        // chamada do método de adição do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.addittion(firstNumber, secondNumber);
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(12, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        // chamada do método de subtração do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.subtraction(firstNumber, secondNumber);
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(8, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        // chamada do método de multiplicação do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.multiplication(firstNumber, secondNumber);
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(20, result, 0.0001);
    }

    @Test
    public void testDivition() {
        // chamada do método de divisão do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.divition(firstNumber, secondNumber);
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(5, result, 0.0001);
    }

    //Método que será executado após os testes unitários
    @After
    public void afterTest(){
        // Deixar o objeto vazio
        calculadora = null;
    }

}

