
package bank;



    import java.util.Queue;
public class customer {
    int TokenNum;
    int arrivaltime;
    int arrivalgap;
    int tellertime;
    int tellernmber;
    boolean visitedteller;
     
    public static void displayall(Queue<customer> CustQ) {
        System.out.println("Customer:   ArrivalTime :   ArrivalGap  : TellerTime");
        customer[] CurCustAr=new customer[CustQ.size()];
        CustQ.toArray(CurCustAr);
       
        for(int i=0;i<CurCustAr.length;i++) {
            System.out.println(CurCustAr[i].TokenNum+"\t:\t"+CurCustAr[i].arrivaltime+"\t:\t"+CurCustAr[i].arrivalgap+"\t:\t"+CurCustAr[i].tellertime);
        }
       
    }
    
}


