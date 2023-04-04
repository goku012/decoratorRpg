public class MissaoSecundaria extends PersonagemDecorator {
    public MissaoSecundaria(Personagem personagem) {
        super(personagem);
    }

    public float getPercentualAtributo() {
        return 15.0f;
    }

    public String getNomeHabilidade() {
        return "Expecto Patronum";
    }
}
