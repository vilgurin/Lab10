package atm;
import lombok.Getter;
@Getter
public abstract class DefaultBill implements Bill{
    private int billAmount;
    private Bill next;

    public DefaultBill(int billAmount){
        this.billAmount = billAmount;
    }
    @Override
    public void setNext(Bill next) {
        this.next = next;
    }

    @Override
    public void process(int amount) {
        if (this.next != null){
            next.process(amount % billAmount);
        }
        else if (amount % billAmount > 0){
            throw new IllegalArgumentException();
        }
        System.out.println("Please receive "+amount/billAmount+" of "+ billAmount +" UAH bills");

    }
}
