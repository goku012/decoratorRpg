public class Treinamento  extends PersonagemDecorator {

    public Treinamento(Personagem personagem) {
        super(personagem);
    }

    public float getPercentualAtributo() {
        return 20.0f;
    }

    public String getNomeHabilidade() {
        return "magias";
    }
}
