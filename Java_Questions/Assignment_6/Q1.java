import java.io.Console;

class Q1 {
    Console c = System.console();
    double sale, amo, com;

    void get_amount() {
        amo = Integer.parseInt(c.readLine("Enter the Sales amount: "));
    }

    void Commission() {
        if (amo <= 500)
            com = amo * 5 / 100;
<<<<<<< HEAD:Assignment_Questions/Assignment_6/Q1.java
        if (amo > 500 && amo <= 2000)
            com = amo * 10 / 100 + 35;
        if (amo > 2000 && amo <= 5000)
            com = amo * 12 / 100 + 185;
=======
        else if (amo > 500 && amo <= 2000)
            com = ((amo - 500) * 10 / 100) + 35;
        else if (amo > 2000 && amo <= 5000)
            com = ((amo - 2000) *12 / 100) + 185;
>>>>>>> d65a8e060dd9c9425d1a7b08ce5af197405f03c1:Java_Questions/Assignment_6/Q1.java
        if (amo > 5000)
            com = amo * 12.5 / 100;
    }

    void Show_result() {
        System.out.println("Commission is: " + com);
    }

    public static void main(String args[]) {
        Q1 ob = new Q1();
        ob.get_amount();
        ob.Commission();
        ob.Show_result();
    }
}