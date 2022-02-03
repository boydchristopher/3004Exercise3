public class Debit implements PaymentStrategy{
    @Override
    public int pay(Pizza p, int bal){
        int newBal = bal - p.cost;
        if(newBal < 0){
            System.out.println("You do not have enough money to pay for this pizza as you cannot go negative on a debit card. Hence, your order declined. Your Total Balance is: " + bal);
            return bal;
        }
        else{
            System.out.println("Pizza successfully ordered! Your balance is: " + newBal);
        }
        return newBal;
    }
}
