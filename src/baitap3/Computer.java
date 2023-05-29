package baitap3;

public class Computer {
    private Computer []computer;
    private int code;
    private String name;
    private String HSX;
    private double configuration;
    private int price;
    private String status;
    private int count;
    public Computer(){
        computer= new Computer[0];
        count=0;
    }

    public Computer(int code, String name, String HSX, double configuration, int price, String status) {
        this.code = code;
        this.name = name;
        this.HSX = HSX;
        this.configuration = configuration;
        this.price = price;
        this.status = status;
    }
    public boolean addComputerToArray(){

        return true;
    }
}
