package Kata3;

public class KATA3 {

    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
