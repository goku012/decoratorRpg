public abstract class PersonagemDecorator implements Personagem {

    private Personagem personagem;
    public String habilidade;

    public PersonagemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public abstract float getPercentualAtributo();

    public float getAtributo() {
        return this.personagem.getAtributo() * (1 + (this.getPercentualAtributo() / 100));
    }

    public abstract String getNomeHabilidade();

    public String getHabilidade() {
        return this.personagem.getHabilidade() + "/" + this.getNomeHabilidade();
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}