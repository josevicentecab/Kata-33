/*
José Vicente Cabañas
 */
package kata33;

public class KATA33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram <String> histograma = new Histogram<>();
        
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");

        HistogramDisplay histogram = new HistogramDisplay(histograma);
        
        histogram.execute();
    }
    
}
