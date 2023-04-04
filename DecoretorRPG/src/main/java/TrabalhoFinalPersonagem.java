public class TrabalhoFinalPersonagem extends PersonagemDecorator {

    public TrabalhoFinalPersonagem(Personagem personagem) {
        super(personagem);
    }

    public float getPercentualAtributo() {
        return 30.0f;
    }

    public String getNomeHabilidade() {
        return "Expelliarmus";
    }
}
