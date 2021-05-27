import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    @Test
    public void GivenDistanceandTime_shouldReturnTotalFare(){
        InvoiceGenerator invoice =new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare=invoice.calculateFare(distance,time);
        Assertions.assertEquals(25,fare,0.0);
    }
    //to return min fare
    @Test
    public void givenLessDistanceorTime_shouldReturnMinFare(){
        InvoiceGenerator invoice =new InvoiceGenerator();
        double distance=0.1;
        int time=5;
        double fare=invoice.calculateFare(distance,time);
        Assertions.assertEquals(5,fare,0.0);
    }
    @Test
    public void GivenMultipleRides_should_ReturnTotalFare(){
        InvoiceGenerator invoice =new InvoiceGenerator();
        Ride[] rides = {    new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceSummary invoiceSummary = invoice.calculateFare(rides);
        Assertions.assertEquals(30,invoiceSummary.getTotalFare(),0.0);


    }







}
