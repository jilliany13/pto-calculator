


public class Pto {

    private int initialHours;
    private double accuralRate;
    private int weeks;
    private double total;

    public Pto() {

        initialHours = 0;
        accuralRate = 0;
        weeks = 0;
        total = 0;
    }

    public Pto(int ih, double ac, int w) {
        
        initialHours = ih;
        accuralRate = ac;
        weeks = w;
        total = ih + ac * w;
    }

    // Getters 
    public int getInitialHours() {

        return initialHours;
    }

    public double getAccrualRate() {

        return accuralRate;
    }

    public double getTotal() {

        return total;
    }
    
    // Setters 
    public void setInitialHours(int iH) {
        
        initialHours = iH;
    }

    public void setAccrualRate(int aC) {

        accuralRate = aC;
    }

    public void setTotal(double t) {
        
        total = t;
    }
}