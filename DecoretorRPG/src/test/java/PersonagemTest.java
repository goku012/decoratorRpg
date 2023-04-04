
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {
    @Test
    void deveRetornarAtributoPersonagem() {
        Personagem personagem = new PersonagemNivelMaximo(1000.0f);

        assertEquals(1000.0f, personagem.getAtributo());
    }

    @Test
    void deveRetornarAtributoPersonagemComTreinamento() {
        Personagem personagem = new Treinamento(new PersonagemNivelMaximo(1000.0f));

        assertEquals(1100.0f, personagem.getAtributo());
    }

    @Test
    void deveRetornarAtributoPersonagemComMissaoSecundaria() {
        Personagem personagem = new MissaoSecundaria(new PersonagemNivelMaximo(1000.0f));

        assertEquals(1200.0f, personagem.getAtributo());
    }

    @Test
    void deveRetornarAtributoPersonagemComTrabalhoFinalPersonagem() {
        Personagem personagem = new TrabalhoFinalPersonagem(new PersonagemNivelMaximo(1000.0f));

        assertEquals(1050.0f, personagem.getAtributo());
    }

    @Test
    void deveRetornarAtributoPersonagemComTreinamentoMaisMissaoSecundaria() {
        Personagem personagem = new Treinamento(new MissaoSecundaria(new PersonagemNivelMaximo(1000.0f)));

        assertEquals(1380.0f, personagem.getAtributo());
    }

    @Test
    void deveRetornarAtributoPersonagemComTreinamentoMaisTrabalhoFinalPersonagem() {
        Personagem personagem = new Treinamento(new TrabalhoFinalPersonagem(new PersonagemNivelMaximo(1000.0f)));

        assertEquals(1560.0001f, personagem.getAtributo());
    }

    @Test
    void deveRetornarAtributoPersonagemComMissaoSecundariaMaisTrabalhoFinalPersonagem() {
        Personagem personagem = new MissaoSecundaria(new TrabalhoFinalPersonagem(new PersonagemNivelMaximo(1000.0f)));

        assertEquals(1495.0f, personagem.getAtributo());
    }

    @Test
    void deveRetornarAtributoPersonagemComTreinamentoMaisMissaoSecundariaMaisTrabalhoFinalPersonagem() {
        Personagem personagem = new Treinamento(new MissaoSecundaria(new TrabalhoFinalPersonagem(new PersonagemNivelMaximo(1000.0f))));

        assertEquals(1794.0001f, personagem.getAtributo());
    }

    @Test
    void deveRetornarHabilidadePersonagem() {
        Personagem personagem = new PersonagemNivelMaximo();

        assertEquals("Avada Kedavra", personagem.getHabilidade());
    }

    @Test
    void deveRetornarHabilidadePersonagemComTreinamento() {
        Personagem personagem = new Treinamento(new PersonagemNivelMaximo());

        assertEquals("Avada Kedavra/magias", personagem.getHabilidade());
    }

    @Test
    void deveRetornarHabilidadePersonagemComMissaoSecundaria() {
        Personagem personagem = new MissaoSecundaria(new PersonagemNivelMaximo());

        assertEquals("Avada Kedavra/Expecto Patronum", personagem.getHabilidade());
    }

    @Test
    void deveRetornarHabilidadePersonagemComTrabalhoFinalPersonagem() {
        Personagem personagem = new TrabalhoFinalPersonagem(new PersonagemNivelMaximo());

        assertEquals("Avada Kedavra/Expelliarmus", personagem.getHabilidade());
    }

    @Test
    void deveRetornarHabilidadePersonagemComTreinamentoMaisMissaoSecundaria() {
        Personagem personagem = new Treinamento(new MissaoSecundaria (new PersonagemNivelMaximo()));

        assertEquals("Avada Kedavra/Expecto Patronum/magias", personagem.getHabilidade());
    }

    @Test
    void deveRetornarHabilidadePersonagemComTreinamentoMaisTrabalhoFinalPersonagem() {
        Personagem personagem = new Treinamento(new TrabalhoFinalPersonagem (new PersonagemNivelMaximo()));

        assertEquals("Avada Kedavra/Expelliarmus/magias", personagem.getHabilidade());
    }

    @Test
    void deveRetornarHabilidadePersonagemComMissaoSecundariaMaisTrabalhoFinalPersonagem() {
        Personagem personagem = new MissaoSecundaria(new TrabalhoFinalPersonagem (new PersonagemNivelMaximo()));

        assertEquals("Avada Kedavra/Expelliarmus/Expecto Patronum", personagem.getHabilidade());
    }

    @Test
    void deveRetornarHabilidadePersonagemComTreinamentoMaisMissaoSecundariaMaisTrabalhoFinalPersonagem() {
        Personagem personagem = new Treinamento (new MissaoSecundaria(new TrabalhoFinalPersonagem (new PersonagemNivelMaximo())));

        assertEquals("Avada Kedavra/Expelliarmus/Expecto Patronum/magias", personagem.getHabilidade());
    }
}
