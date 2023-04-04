public class PersonagemNivelMaximo implements Personagem {

    public float atributo;

    public PersonagemNivelMaximo() {
    }

    public PersonagemNivelMaximo(float atributo) {
        this.atributo = atributo;
    }

    public float getAtributo() {
        return atributo;
    }

    public String getHabilidade() {
        return "Avada Kedavra";
    }
}
