package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer( 50, false);
        System.out.println("initial pages count: "+ printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(3);
        System.out.println("pages added to print : "+ pagesPrinted + "  and the total printed pages is : "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(12);
        System.out.println("pages added to print : "+ pagesPrinted + "  and the total printed pages is : "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(4);
        System.out.println("pages added to print : "+ pagesPrinted + "  and the total printed pages is : "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(1);
        System.out.println("pages added to print : "+ pagesPrinted + "  and the total printed pages is : "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(100);
        System.out.println("pages added to print : "+ pagesPrinted + "  and the total printed pages is : "+ printer.getPagesPrinted());

    }
}
