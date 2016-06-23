
package bank;


    import java.util.LinkedList;
	public class teller {
	    boolean isFree;
	    int totalcustomers;
	    int timespent;
	    int curcusttime;
	    int busyuntil;
	    
	    public static void displayall(LinkedList<teller> TelrList) {
	        System.out.println("Teller# :      isFree?  :    TotalCust  : LastCustTime  :   BusyUntil   : TotalTimeSpent");
	        for (int i=0;i<TelrList.size();i++) {
	            System.out.println(i+"\t:\t"+TelrList.get(i).isFree+"\t:\t"+TelrList.get(i).totalcustomers+"\t:\t"+TelrList.get(i).curcusttime+"\t:\t"+TelrList.get(i).busyuntil+"\t:\t"+TelrList.get(i).timespent);
	        }
	    }
	}
