package org.pzd.behavioral.command;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
