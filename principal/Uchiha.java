package principal;

import principal.Ninja;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e minha habilidade especial é " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
