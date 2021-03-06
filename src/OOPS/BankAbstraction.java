package OOPS;
abstract class BankAbstraction {

    public abstract void denomination();

}

class CanaraBank extends BankAbstraction {

    CanaraBank() {
        System.out.println("Welcome to Canara Bank");
    }

    public void denomination() {
        System.out.println("Denomination of 100 is available");
    }

}

class SBI extends BankAbstraction {
    SBI() {
        System.out.println("Welcome to SBI Bank");
    }

    public void denomination() {
        System.out.println("Denomination of 500 is available");
    }
}

class HDFC extends BankAbstraction {

    HDFC()
    {
        System.out.println("Welcome to HDFC Bank");

    }
    public void denomination() {
        System.out.println("Denomination of 2000 is available");
    }
}

class ApplicationBank {
    public static void main(String[] args) {

        BankAbstraction objet =new CanaraBank();
        objet.denomination();

        SBI sbiobject = new SBI();
        sbiobject.denomination();

        HDFC hdfcobj = new HDFC();
        hdfcobj.denomination();

    }
}
