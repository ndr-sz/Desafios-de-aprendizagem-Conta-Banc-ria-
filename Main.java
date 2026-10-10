public class Main {
    public static void main (String[] args) {
        ContaBancaria c1 = new ContaBancaria("Carlos", 100);
        ContaPremium c2 = new ContaPremium("Andrey", 100);
        ContaBancaria c3 = new ContaPremium("Maria", 200);
        ContaBancaria c4 = new ContaBancaria("João", 100);
        
        System.out.println(c1.getTipo());
        System.out.println(c2.getTipo());
        System.out.println(c3.getTipo());
        ((ContaPremium) c3).bonus();
        System.out.println(c3.getSaldo());
        
        if( c3 instanceof ContaPremium premium) {
            premium.bonus();
        }
        if( c4 instanceof ContaPremium premium) {
            premium.bonus();
        }
       System.out.println(c3.getSaldo());
       System.out.println(c4.getSaldo());
    }
}
