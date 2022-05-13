package com.company;

public class Printer {
    private int pagesPrinted;
    private boolean duplex;
    private int tonerLevel;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel : -1;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount<= 100) {
            if (tonerAmount + tonerLevel > 100)
                return -1;
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else
            return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
            if (duplex) {
                pagesToPrint = pages / 2 + pages % 2;
                System.out.println("Printing in duplex mode");
            }
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
