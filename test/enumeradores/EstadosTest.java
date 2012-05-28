package enumeradores;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author joaoeduardorf
 */
public class EstadosTest {
    
    @Test
    public void TesteDeNomesDosEstadoss(){
        Assert.assertEquals("É esperado 'Acre' como Estado", "Acre", Estados.ACRE.getNome());
        Assert.assertEquals("É esperado 'Alagoas' como Estado", "Alagoas", Estados.ALAGOAS.getNome());
        Assert.assertEquals("É esperado 'Amapá' como Estado", "Amapá", Estados.AMAPA.getNome());
        Assert.assertEquals("É esperado 'Amazonas' como Estado", "Amazonas", Estados.AMAZONAS.getNome());
        Assert.assertEquals("É esperado 'Bahia' como Estado", "Bahia", Estados.BAHIA.getNome());
        Assert.assertEquals("É esperado 'Ceará' como Estado", "Ceará", Estados.CEARA.getNome());
        Assert.assertEquals("É esperado 'Distrito Federal' como Estado", "Distrito Federal", Estados.DISTRITOFEDERAL.getNome());
        Assert.assertEquals("É esperado 'Espírito Santo' como Estado", "Espírito Santo", Estados.ESPIRITOSANTO.getNome());
        Assert.assertEquals("É esperado 'Goiás' como Estado", "Goiás", Estados.GOIAS.getNome());
        Assert.assertEquals("É esperado 'Maranhão' como Estado", "Maranhão", Estados.MARANHAO.getNome());
        Assert.assertEquals("É esperado 'Mato Grosso' como Estado", "Mato Grosso", Estados.MATOGROSSO.getNome());
        Assert.assertEquals("É esperado 'Mato Grosso do Sul' como Estado", "Mato Grosso do Sul", Estados.MATOGROSSODOSUL.getNome());
        Assert.assertEquals("É esperado 'Minas Gerais' como Estado", "Minas Gerais", Estados.MINASGERAIS.getNome());
        Assert.assertEquals("É esperado 'Pará' como Estado", "Pará", Estados.PARA.getNome());
        Assert.assertEquals("É esperado 'Paraíba' como Estado", "Paraíba", Estados.PARAIBA.getNome());
        Assert.assertEquals("É esperado 'Paraná' como Estado", "Paraná", Estados.PARANA.getNome());
        Assert.assertEquals("É esperado 'Pernambuco' como Estado", "Pernambuco", Estados.PERNAMBUCO.getNome());
        Assert.assertEquals("É esperado 'Piauí' como Estado", "Piauí", Estados.PIAUI.getNome());
        Assert.assertEquals("É esperado 'Rio de Janeiro' como Estado", "Rio de Janeiro", Estados.RIODEJANEIRO.getNome());
        Assert.assertEquals("É esperado 'Rio Grande do Norte' como Estado", "Rio Grande do Norte", Estados.RIOGRANDEDONORTE.getNome());
        Assert.assertEquals("É esperado 'Rio Grande do Sul' como Estado", "Rio Grande do Sul", Estados.RIOGRANDEDOSUL.getNome());
        Assert.assertEquals("É esperado 'Rondônia' como Estado", "Rondônia", Estados.RONDONIA.getNome());
        Assert.assertEquals("É esperado 'Roraima' como Estado", "Roraima", Estados.RORAIMA.getNome());
        Assert.assertEquals("É esperado 'Santa Catarina' como Estado", "Santa Catarina", Estados.SANTACATARINA.getNome());
        Assert.assertEquals("É esperado 'São Paulo' como Estado", "São Paulo", Estados.SAOPAULO.getNome());
        Assert.assertEquals("É esperado 'Sergipe' como Estado", "Sergipe", Estados.SERGIPE.getNome());
        Assert.assertEquals("É esperado 'Tocantins' como Estado", "Tocantins", Estados.TOCANTINS.getNome());
    }
    
    @Test
    public void TesteDeSiglasDosEstadoss(){
        Assert.assertEquals("É esperado 'AC' como Estado", "AC", Estados.ACRE.getSigla());
        Assert.assertEquals("É esperado 'AL' como Estado", "AL", Estados.ALAGOAS.getSigla());
        Assert.assertEquals("É esperado 'AP' como Estado", "AP", Estados.AMAPA.getSigla());
        Assert.assertEquals("É esperado 'AM' como Estado", "AM", Estados.AMAZONAS.getSigla());
        Assert.assertEquals("É esperado 'BA' como Estado", "BA", Estados.BAHIA.getSigla());
        Assert.assertEquals("É esperado 'CE' como Estado", "CE", Estados.CEARA.getSigla());
        Assert.assertEquals("É esperado 'DF' como Estado", "DF", Estados.DISTRITOFEDERAL.getSigla());
        Assert.assertEquals("É esperado 'ES' como Estado", "ES", Estados.ESPIRITOSANTO.getSigla());
        Assert.assertEquals("É esperado 'GO' como Estado", "GO", Estados.GOIAS.getSigla());
        Assert.assertEquals("É esperado 'MA' como Estado", "MA", Estados.MARANHAO.getSigla());
        Assert.assertEquals("É esperado 'MT' como Estado", "MT", Estados.MATOGROSSO.getSigla());
        Assert.assertEquals("É esperado 'MS' como Estado", "MS", Estados.MATOGROSSODOSUL.getSigla());
        Assert.assertEquals("É esperado 'MG' como Estado", "MG", Estados.MINASGERAIS.getSigla());
        Assert.assertEquals("É esperado 'PA' como Estado", "PA", Estados.PARA.getSigla());
        Assert.assertEquals("É esperado 'PB' como Estado", "PB", Estados.PARAIBA.getSigla());
        Assert.assertEquals("É esperado 'PR' como Estado", "PR", Estados.PARANA.getSigla());
        Assert.assertEquals("É esperado 'PE' como Estado", "PE", Estados.PERNAMBUCO.getSigla());
        Assert.assertEquals("É esperado 'PI' como Estado", "PI", Estados.PIAUI.getSigla());
        Assert.assertEquals("É esperado 'RJ' como Estado", "RJ", Estados.RIODEJANEIRO.getSigla());
        Assert.assertEquals("É esperado 'RN' como Estado", "RN", Estados.RIOGRANDEDONORTE.getSigla());
        Assert.assertEquals("É esperado 'RS' como Estado", "RS", Estados.RIOGRANDEDOSUL.getSigla());
        Assert.assertEquals("É esperado 'RO' como Estado", "RO", Estados.RONDONIA.getSigla());
        Assert.assertEquals("É esperado 'RR' como Estado", "RR", Estados.RORAIMA.getSigla());
        Assert.assertEquals("É esperado 'SC' como Estado", "SC", Estados.SANTACATARINA.getSigla());
        Assert.assertEquals("É esperado 'SP' como Estado", "SP", Estados.SAOPAULO.getSigla());
        Assert.assertEquals("É esperado 'SE' como Estado", "SE", Estados.SERGIPE.getSigla());
        Assert.assertEquals("É esperado 'TO' como Estado", "TO", Estados.TOCANTINS.getSigla());
    }
}
