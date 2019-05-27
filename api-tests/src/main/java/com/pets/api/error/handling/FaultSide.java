package com.pets.api.error.handling;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("JavadocType")
public class FaultSide {

    private int faultStatusCode;
    private String faultMessage;

    public int getFaultStatusCode() {
        return faultStatusCode;
    }

    public void setFaultStatusCode(int faultStatusCode) {
        this.faultStatusCode = faultStatusCode;
    }

    public String getFaultMessage() {
        return faultMessage;
    }

    public void setFaultMessage(String faultMessage) {
        this.faultMessage = faultMessage;
    }

    @Override
    public String toString() {
        return "FaultSide{" +
                "faultStatusCode=" + faultStatusCode +
                ", faultMessage='" + faultMessage + '\'' +
                '}';
    }
}
