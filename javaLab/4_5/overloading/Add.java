package college;

class Add {
    private int a,b;
    Add(int a,int b) {
        this.a = a;
        this.b = b;
    }

    Add() {}

    void setData(int a,int b) {
        this.a = a;
        this.b = b;
    }

    final int getSum() {
        return a+b;
    }

    static double doSum(double a,double b) {
        return a+b;
    }

    static int doSum(int a,int b) {
        return a+b;
    }
}
