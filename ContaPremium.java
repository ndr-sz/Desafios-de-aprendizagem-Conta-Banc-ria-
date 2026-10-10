public class ContaPremium extends ContaBancaria{
    
    public ContaPremium(String titular, int saldoInicial) {
        super(titular , saldoInicial);
    }
    public void bonus(){
        depositar(50);
    }
    @Override
    public String getTipo(){
        return "Conta Premium";
    }
}
