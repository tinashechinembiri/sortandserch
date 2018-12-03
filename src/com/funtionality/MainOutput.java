package com.funtionality;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainOutput implements  FunctionalityInterface{

    String [] year  ;
    String [] month ;
    String [] tMax ;
    String [] tmin;
    String [] AF;
    String [] Rain ;
    String [] sun;
    String [] [] all_data ;


public String []  FileReader (String file)
{
    String Fildata [] = {} ;
    try {
        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> lines = new ArrayList<String>();
        String line ;
        while ((line = br.readLine()) != null)
        {
               lines.add(line);
        }


    Fildata= lines.toArray(new String[] {});
        return  lines.toArray(new String[] {});

    }
    catch (Exception e )
    {
        e.printStackTrace();

    }

return Fildata;
}

public void ShowFiles ()
        {

            try
        {

            this.month = FileReader(Constant.url_month);
            this.year = FileReader(Constant.url_year);
            this.sun = FileReader(Constant.sun);
            this.Rain = FileReader(Constant.ws1rai);
            //System.out.print(main_check(Constant.test).length());
            all_data = new String[this.year.length][4];

            for (int i = 0; i < this.year.length-1; i++) {

                    this.all_data[i][Constant.monthTable] = this.month[i];
                    this.all_data[i][Constant.yearTable] = this.year[i].toString();
                    this.all_data[i][Constant.sunTable] = this.sun[i].toString();
                    this.all_data[i][Constant.rainTbale] = this.Rain[i].toString();


            }

            for (int i = 0; i < this.year.length; i++) {


               System.out.printf("  %-20s %10s %10s  %10s \n", this.all_data[i][Constant.monthTable] ,this.all_data[i][Constant.yearTable] ,this.all_data[i][Constant.sunTable] , this.all_data[i][Constant.rainTbale]);

            }


        }  catch (NullPointerException e)
        {
            e.printStackTrace();
        }


}

    public double [] MonthstoDouble (String [] month)
    {
        double [] return_value = new double[month.length];
        for (int j = 0; j < month.length-1; j++)
        {

            if (month[j].equals("January"))
            {
                month[j] = "1.1";
            }
            if (month[j].equals("February"))
            {
                month[j] = "2.1";

            }
            if (month[j].equals("March"))
            {
                month[j] = "3.1";
            }
            if (month[j].equals("April"))
            {
                month[j] = "4.1";
            }
            if (month[j].equals( "May"))
            {
                month[j] = "5.1";
            }
            if (month[j].equals( "June"))
            {
                month[j] = "6.1";
            }
            if (month[j].equals( "July"))
            {
                month[j] = "7.1";
            }
            if (month[j].equals( "August"))
            {
                month[j] = "8.1";

            }
            if (month[j].equals("September"))
            {
                month[j] = "9.1";
            }
            if (month[j].equals( "October"))
            {
                month[j] = "10.1";
            }
            if (month[j].equals( "November"))
            {
                month[j] = "11.1";
            }
            if (month[j].equals("December"))
            {
                month[j] = "12.1";

            }

          //  System.out.print(month[j]+ "\n");
            return_value [j] = Double.parseDouble(month[j]);

        }

        return return_value;
    }

    public String[] ChangeMothstostring (double [][] month, int size) {

    String [] months = new String[month.length];
        for (int j = 0; j < month.length-1; j++)
        {

            if (month[j][size]== 1.1)
            {
                months[j] = "January";
            }
            if (month[j][size]== 2.1)
            {
                months[j] = "February";

            }
            if (month[j][size] == 3.1)
            {
                months[j] = "March";
            }
            if (month[j][size] == (4.1))
            {
                months[j] = "April";
            }
            if (month[j][size] == 5.1)
            {
                months[j] = "May";
            }
            if (month[j][size] ==  6.1)
            {
                months[j] = "June";
            }
            if (month[j][size] == 7.1)
            {
                months[j] = "July";
            }
            if (month[j][size] ==  8.1)
            {
                months[j] = "August";

            }
            if (month[j][size] == 9.1)
            {
                months[j] = "September";
            }
            if (month[j][size] ==  10.1)
            {
                months[j] = "October";
            }
            if (month[j][size] == 11.1)
            {
                months[j] = "November";
            }
            if (month[j][size] == 12.1)
            {
                months[j] = "December";

            }

            //  System.out.print(month[j]+ "\n");


        }
        return months;
    }
}
