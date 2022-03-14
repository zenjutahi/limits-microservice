package com.learning.microservices.limitsservice.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("limits-service")
public class Configuration {
    private int minimum;
    private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
