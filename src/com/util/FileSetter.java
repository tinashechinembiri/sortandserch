package com.util;

import com.funtionality.Constant;
import com.funtionality.FunctionalityInterface;
import com.funtionality.MainOutput;

public class FileSetter {

    String [] year  ;
    String [] month ;
    String [] Rain ;
    String [] sun;

    public  FileSetter()
    {
        FunctionalityInterface save = new MainOutput();
        this.year = save.FileReader(Constant.url_year);
        this.month = save.FileReader(Constant.url_month);
        this.Rain = save.FileReader(Constant.ws1rai);
        this.sun = save.FileReader(Constant.sun);
    }

    public String[] getYear() {
        return year;
    }

    public String[] getMonth() {
        return month;
    }

    public String[] getRain() {
        return Rain;
    }

    public String[] getSun() {
        return sun;
    }
}
