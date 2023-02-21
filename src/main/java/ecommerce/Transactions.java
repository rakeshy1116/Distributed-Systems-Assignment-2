package ecommerce;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;


@DynamoDBTable(tableName="Transactions")
public class Transactions {
    private Long transactionId;
    private Long buyerId;

    private List<Item> userItems;

    public Transactions(Long transactionId, Long buyerId, List<Item> userItems) {
        this.transactionId = transactionId;
        this.buyerId = buyerId;
        this.userItems = userItems;
    }

    public Transactions() {
    }

    public Transactions(Long transactionId) {
        this.transactionId = transactionId;
    }
    @DynamoDBHashKey(attributeName="transactionId")
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public List<Item> getUserItems() {
        return userItems;
    }

    public void setUserItems(List<Item> userItems) {
        this.userItems = userItems;
    }
}

