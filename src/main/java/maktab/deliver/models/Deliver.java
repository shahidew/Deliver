package maktab.deliver.models;

import maktab.deliver.enums.Status;
import maktab.deliver.enums.TypeOfTransport;

public class Deliver {
    private String originAddress;
    private String destinationAddress;
    private String receiverName;
    private String receiverFamily;
    private String receiverPhone;
    private Number weight;
    private Number issueTracking;
    private Status status;
    private TypeOfTransport typeOfTransport;
    private String packageContent;
    private Number packageLength;
    private Number packageWidth;
    private Number packageHeight;
    private Customer customer;

    public Deliver() {
    }

    public Deliver(String originAddress, String destinationAddress, String receiverName, String receiverFamily, String receiverPhone, Number weight, Number issueTracking, Status status, TypeOfTransport typeOfTransport, String packageContent, Number packageLength, Number packageWidth, Number packageHeight) {
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.receiverName = receiverName;
        this.receiverFamily = receiverFamily;
        this.receiverPhone = receiverPhone;
        this.weight = weight;
        this.issueTracking = issueTracking;
        this.status = status;
        this.typeOfTransport = typeOfTransport;
        this.packageContent = packageContent;
        this.packageLength = packageLength;
        this.packageWidth = packageWidth;
        this.packageHeight = packageHeight;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverFamily() {
        return receiverFamily;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public Number getWeight() {
        return weight;
    }

    public Number getIssueTracking() {
        return issueTracking;
    }

    public Status getStatus() {
        return status;
    }

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport;
    }

    public String getPackageContent() {
        return packageContent;
    }

    public Number getPackageLength() {
        return packageLength;
    }

    public Number getPackageWidth() {
        return packageWidth;
    }

    public Number getPackageHeight() {
        return packageHeight;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
