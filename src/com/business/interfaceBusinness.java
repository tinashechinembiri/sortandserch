package com.business;



public interface interfaceBusinness {
     default  void sortbymonths()
     {

     }

     default String [][] searchdata (String search)
     {
         SearchData nm = new SearchData();
         return nm.searchdata(search) ;
     }

}
