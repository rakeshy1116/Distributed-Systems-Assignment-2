package ecommerce;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException;

import java.util.List;

@DynamoDBTable(tableName="Seller")
public class Seller {

    private String sellerName;
    private Long sellerId;

    private List<Integer> feedback; //first int will be thumbs up, second will be thumbs down
    private int itemsSold;
    private String password;
    private boolean loggedin;

    public Seller(String sellerName, Long sellerId, List<Integer> feedback, int itemsSold, String password) {
        this.sellerName = sellerName;
        this.sellerId = sellerId;
        this.feedback = feedback;
        this.itemsSold = itemsSold;
        this.password = password;
        this.loggedin = false;
    }

    public boolean isLoggedin() {
        return this.loggedin;
    }

    public void setLoggedin(boolean loggedin) {
       this.loggedin = loggedin;
    }


    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Seller() {
    }

    public Seller(Long sellerId) {
        this.sellerId = sellerId;
    }

    @DynamoDBHashKey(attributeName="SellerId")
    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }


    public List<Integer> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<Integer> feedback) {
        this.feedback = feedback;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(int itemsSold) {
        this.itemsSold = itemsSold;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
