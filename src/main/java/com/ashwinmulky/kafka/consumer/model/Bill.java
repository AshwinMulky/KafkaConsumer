package com.ashwinmulky.kafka.consumer.model;

public class Bill {
    private String billNum;
    private int amount;

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billNum='" + billNum + '\'' +
                ", amount=" + amount +
                '}';
    }
}
