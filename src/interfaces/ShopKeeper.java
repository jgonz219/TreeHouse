package interfaces;

public class ShopKeeper extends Person implements Seller {
    public ShopKeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a ShopKeeper";
    }

    @Override
    public void sellGoods() {
        //TODO: Implement
    }
}
