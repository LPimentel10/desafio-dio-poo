public class ElevadorDeCarga extends Elevador {
    public ElevadorDeCarga(int totalAndares, int capacidade) {
        super(totalAndares, capacidade);
    }

    @Override
    public void irPara(int andar) {
        if (andar >= 0 && andar <= totalAndares) {
            andarAtual = andar;
            System.out.println("Elevador de carga indo para o andar: " + andarAtual);
        } else {
            System.out.println("Andar inválido.");
        }
    }
}