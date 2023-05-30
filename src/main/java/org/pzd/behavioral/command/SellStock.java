package org.pzd.behavioral.command;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
