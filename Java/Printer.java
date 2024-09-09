public class Printer {
    // write code here
    
    // fields
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    
    // constructors
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel < 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    
    
    // methods
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            
            return this.tonerLevel;
        }
        else return -1;
    }
    
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pagesToPrint + 1) / 2;
        }
        this.pagesPrinted += pagesToPrint;
        
        return pagesToPrint;
    }
    
    public int getPagesPrinted() {
        
        return this.pagesPrinted;
    }
}
