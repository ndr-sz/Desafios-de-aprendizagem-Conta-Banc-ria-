public class ContaBancaria {
    private String titular;
    private int saldo;
    private static int totalContas = 0;
    private boolean ativa = true;

    public ContaBancaria(String titular, int saldoInicial){
        this.titular = titular;
        totalContas++;
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        }else {
        saldo = 0;
        }
    }
    public boolean isAtiva(){
        return ativa;
    }
    public void encerrarConta() {
        if (saldo == 0) {
            ativa = false;
        }
    }
    public static int getTotalContas(){
        return totalContas;
    }
    public int getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String novoTitular){
        if(novoTitular != null && !novoTitular.trim().isEmpty()) {
            titular = novoTitular;
        }
    }
    public void depositar(int valor) {
        if (valor > 0 && ativa){
        this.saldo = this.saldo + valor;
        }
    }
    public static void transferir(ContaBancaria contaOrigem , ContaBancaria contaDestino, int valor) {
        if (valor > 0 && contaOrigem.saldo >= valor && contaOrigem.ativa && contaDestino.ativa) {
        contaOrigem.saldo -= valor;
        contaDestino.saldo += valor;
        }
    }
    public void sacar(int valor) {
        if(valor > 0 && saldo >= valor &&  ativa) {
            saldo = (saldo - valor);
        } else {
            System.out.println("Operação inválida.");
        }
    }
    public String getTipo() {
        return "Conta comum";
    }


}