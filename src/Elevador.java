public abstract class Elevador {
    protected int andarAtual;
    protected int totalAndares;
    protected int capacidade;
    protected int ocupacaoAtual;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0; // Consideramos o térreo como 0
        this.ocupacaoAtual = 0;
    }

    public abstract void irPara(int andar);

    public void entrar(int pessoas) {
        if (ocupacaoAtual + pessoas <= capacidade) {
            ocupacaoAtual += pessoas;
            System.out.println(pessoas + " pessoas entraram. Ocupação atual: " + ocupacaoAtual);
        } else {
            System.out.println("Capacidade excedida! Não podem entrar mais pessoas.");
        }
    }

    public void sair(int pessoas) {
        if (ocupacaoAtual - pessoas >= 0) {
            ocupacaoAtual -= pessoas;
            System.out.println(pessoas + " pessoas saíram. Ocupação atual: " + ocupacaoAtual);
        } else {
            System.out.println("Número de pessoas a sair inválido!");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getOcupacaoAtual() {
        return ocupacaoAtual;
    }
}
