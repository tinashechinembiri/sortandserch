
import com.business.Case2;
import com.business.DescendingData;
import com.business.SearchData;
import com.funtionality.FunctionalityInterface;
import com.funtionality.MainOutput;
import com.business.interfaceBusinness;
import java.util.Scanner;

public class MainClass {

    public static void main (String [] args )
    {

        interfaceBusinness sortmonths = new Case2();
        interfaceBusinness searchdata = new SearchData();
        interfaceBusinness descsort = new DescendingData();


        FunctionalityInterface show_data = new MainOutput();
        System.out.print("1) show data "+ "2) Sort data by months"+ "3)search data");
        int name =  new Scanner(System.in).nextInt();

        switch (name)
        {
            case 1:
             show_data.ShowFiles();

                break;

            case 2:
                int check =  new Scanner(System.in).nextInt();
                switch (check) {
                    case 1:
                        sortmonths.sortbymonths();
                        break;

                    case 2:

                        descsort.sortbymonths();
                    break;
                }
                break;
            case 3:
                System.out.print("Search by month, year, sun, rain");
                String search = new Scanner(System.in).nextLine();
                searchdata.searchdata(search);

                break;

        }

    }
}
