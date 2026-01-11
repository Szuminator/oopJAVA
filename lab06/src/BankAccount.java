public record BankAccount(String numerKonta, double saldo) {
    public BankAccount {
        if(numerKonta == null ||numerKonta.isBlank()){
            throw new IllegalArgumentException("Pusty numer konta");
        }
    }

    public BankAccount(String numerKonta){
        this(numerKonta, 0.0);
    }

    public BankAccount withInterest(double percentage){
        double add = saldo + (saldo*(percentage/100));
        return new BankAccount(numerKonta, add);
    }
}
