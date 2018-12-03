package com.business;

import com.sorts.FunctionSorts;
import com.funtionality.Constant;
import com.funtionality.FunctionalityInterface;
import com.funtionality.MainOutput;
import com.sorts.SortInterface;

import java.text.DecimalFormat;

public class Case2  implements interfaceBusinness {
    FunctionalityInterface function = new MainOutput();
    String [] year  ;
    String [] month ;
    String [] tMax ;
    String [] tmin;
    String [] AF;
    String [] Rain ;
    String [] sun;
    double [] [] all_data ;

    SortInterface sort = new FunctionSorts();

    public  Case2 ()
    {

    }

    public void sortbymonths()
    {
        try {
            this.year = new String[function.FileReader(Constant.url_year).length];
            this.month = new String[function.FileReader(Constant.url_month).length];
            this.sun = new String[function.FileReader(Constant.url_month).length];
            this.Rain = new String[function.FileReader(Constant.url_month).length];

            for (int i = 0; i < function.FileReader(Constant.url_month).length; i++) {

                this.year[i] = function.FileReader(Constant.url_year)[i];
                this.month[i] = function.FileReader(Constant.url_month)[i];
                this.sun[i] = function.FileReader(Constant.sun)[i];
                this.Rain[i] = function.FileReader(Constant.ws1rai)[i];
            }

            all_data = new double[this.year.length][4];
            for (int i = 0; i < this.month.length; i++) {
                all_data[i] [Constant.monthTable] = function.MonthstoDouble(this.month)[i];
                all_data[i][Constant.yearTable] = Double.parseDouble(this.year[i]);
                all_data[i][Constant.sunTable] = Double.parseDouble(this.sun[i]);
                all_data[i][Constant.rainTbale] = Double.parseDouble(this.Rain[i]);
            }
            sort.quicksort(all_data, 0, this.month.length-1, Constant.monthTable);
            DecimalFormat format = new DecimalFormat("0.#");

            for (int j = 0; j < this.month.length; j++) {
                System.out.printf("%-20s %10s %10s  %10s \n", function.ChangeMothstostring(all_data,Constant.monthTable)[j] ,format.format(this.all_data[j][Constant.yearTable] ),this.all_data[j][Constant.sunTable] , this.all_data[j][Constant.rainTbale]);
            }
        }
        catch (NullPointerException E)
        {

        }

    }
}
