public class Credit implements PaymentStrategy{
    @Override
    public int pay(Pizza p, int bal){
        int newBal = bal - p.cost;
        if(newBal < 0){
            System.out.println("Pizza successfully ordered! Please keep in mind that you owe more money than how much you have in the bank. You have a balance of: " + newBal);
        }
        else{
            System.out.println("Pizza successfully ordered! Your balance is: " + newBal);
        }
        return newBal;
    }
}