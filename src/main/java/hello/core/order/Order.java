package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int imtemPrice;
    private int discountPrice;

    public Order(Long memberId, String itemName, int imtemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.imtemPrice = imtemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return imtemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getImtemPrice() {
        return imtemPrice;
    }

    public void setImtemPrice(int imtemPrice) {
        this.imtemPrice = imtemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }


    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", imtemPrice=" + imtemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
