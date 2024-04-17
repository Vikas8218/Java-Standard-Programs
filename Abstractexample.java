abstract class Bank {
    abstract void Aadhar();
    abstract void PanCard();

    void UserName() {
        System.out.println("MY User Name");
    }

    Bank() {
        System.out.println("Bank Constructor");
    }
}

class Child extends Bank {
    Child() {
        System.out.println("Child Constructor");
    }

    void Aadhar() {
        System.out.println("Aadhar Card");
    }

    void PanCard() {
        System.out.print("PanCard");
    }

    public static void main(String args[]) {
        Child ac1 = new Child();
        ac1.Aadhar();
        ac1.PanCard();
        ac1.UserName();
    }
}
