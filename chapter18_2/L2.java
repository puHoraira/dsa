package chapter18_2;

public class L2 {
    public static void main(String[] args) {
        BankAccount abu = new BankAccount();
        abu.name = "Abu Horaira";
        abu.setPass("12345678");
        abu.Balance = 43;
        abu.print();
        System.out.println();
        System.out.println(abu.myBalance());
    }
}

class BankAccount {
    private String password;
    public String name;
    public int Balance = 0;

    void setPass(String password) {
        this.password = password;
    }

    void print() {
        System.out.println("Name is: " + name + " and password is: " + password);
    }

    int myBalance() {
        return Balance;
    }
}