public class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria(){
        numeroCuenta = 0;
        saldo = 0;
        tipoCuenta = "desconocido";
    }

    public CuentaBancaria(int numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNumero de cuenta= " + numeroCuenta + "\nTipo de cuenta= " + tipoCuenta + "\nSaldo= " + saldo;

    }

}
