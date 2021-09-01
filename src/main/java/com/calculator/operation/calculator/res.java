package com.calculator.operation.calculator;

public class res {
    private int x;
    private int y;
    
    private int result;

    public res(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public static Integer add(int i, int j) {
        return i+j;
    }
    
    public static Integer mul(int i, int j) {
        return i+j;
    }
    
    public static Integer div(int i, int j) {
        return i+j;
    }
    
    public static Integer sub(int i, int j) {
        return i+j;
    }
    
    

}
