public class Predio {
    private Elevador elevador;

    public Predio(Elevador elevador) {
        this.elevador = elevador;
    }

    public void usarElevador(int operacao, int pessoas, int andar) {
        switch (operacao) {
            case 1:
                elevador.irPara(andar);
                break;
            case 2:
                elevador.entrar(pessoas);
                break;
            case 3:
                elevador.sair(pessoas);
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }

    public int getAndarAtual() {
        return elevador.getAndarAtual();
    }

    public int getOcupacaoAtual() {
        return elevador.getOcupacaoAtual();
    }
}
