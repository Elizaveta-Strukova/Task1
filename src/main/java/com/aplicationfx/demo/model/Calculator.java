package com.aplicationfx.demo.model;

public class Calculator {
    private Double n;
    private Double percent;
    private Double result;

    public Double getNum() {
        return n;
    }

    public void setNum(Double num) {
        this.n = n;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double calc() {
        result = (n / 100) * percent ;

        return result;
    }
}
