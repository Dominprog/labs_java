public class Ticket {
    private String event;
    private int seatNumber;
    private double price;

    private int col;

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Ticket(String event, int seatNumber, double price, int col) {
        this(event,seatNumber,price);
        this.col = col;
    }


    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount() {
        price = price * 0.9;
    }
}