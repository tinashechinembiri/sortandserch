package com.business;

import com.funtionality.Constant;
import com.util.FileSetter;

public class SearchData implements interfaceBusinness {



    public  String [][] searchdata  (String search)
    {
        FileSetter setfile = new FileSetter();
        String arraySearch [] [] = new String[setfile.getYear().length][4];


        for (int i =0; i <= setfile.getYear().length-1; i++)
        {
            arraySearch[i][Constant.monthTable] = setfile.getMonth()[i];
            arraySearch[i][Constant.yearTable] = setfile.getYear()[i];
            arraySearch[i][Constant.sunTable] = setfile.getSun()[i];
            arraySearch[i][Constant.rainTbale] = setfile.getRain()[i];

        }

        int check = 0;
        for ( int i =0; i < setfile.getYear().length-1; i++)
        {
            if (arraySearch[i][Constant.monthTable].equals(search) )
            {

                System.out.printf(" %-20s %10s %10s  %10s \n", arraySearch[i][Constant.monthTable] ,arraySearch[i][Constant.yearTable] ,arraySearch[i][Constant.sunTable] , arraySearch[i][Constant.rainTbale]);

                check = 1;
            }
            if (arraySearch[i] [Constant.yearTable].equals( search) )
            {
                System.out.printf("  %-20s %10s %10s  %10s \n", arraySearch[i][Constant.monthTable] ,arraySearch[i][Constant.yearTable] ,arraySearch[i][Constant.sunTable] , arraySearch[i][Constant.rainTbale]);
                check = 1;
            }
            if (arraySearch [i] [Constant.sunTable].equals( search))
            {
                System.out.printf("  %-20s %10s %10s  %10s \n", arraySearch[i][Constant.monthTable] ,arraySearch[i][Constant.yearTable] ,arraySearch[i][Constant.sunTable] , arraySearch[i][Constant.rainTbale]);
                check = 1;
            }
            if (arraySearch[i] [Constant.rainTbale].equals( search))
            {
                System.out.printf("  %-20s %10s %10s  %10s \n", arraySearch[i][Constant.monthTable] ,arraySearch[i][Constant.yearTable] ,arraySearch[i][Constant.sunTable] , arraySearch[i][Constant.rainTbale]);
                check = 1;
            }
            if (check == setfile.getYear().length-1)
            break;
        }
        if (check == 0)
        {
            System.out.print("notthing found");
        }

        return arraySearch;
    }

}
