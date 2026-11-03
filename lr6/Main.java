public static void main(String[] args) {
        Ticket ticket = new Ticket("Концерт", 15, 100.0);

        System.out.println("Мероприятие: " + ticket.getEvent());
        System.out.println("Место: " + ticket.getSeatNumber());
        System.out.println("Цена до скидки: " + ticket.getPrice());

        ticket.applyDiscount();

        System.out.println("Цена после скидки: " + ticket.getPrice());
}