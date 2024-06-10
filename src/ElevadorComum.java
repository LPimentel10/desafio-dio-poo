public class ElevadorComum extends Elevador {
    public ElevadorComum(int totalAndares, int capacidade) {
        super(totalAndares, capacidade);
    }

    @Override
    public void irPara(int andar) {
        if (andar >= 0 && andar <= totalAndares) {
            andarAtual = andar;
            System.out.println("Elevador comum indo para o andar: " + andarAtual);
        } else {
            System.out.println("Andar inválido.");
        }
    }
}