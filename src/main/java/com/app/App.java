package com.app;

import com.model.OfficeTravel;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<OfficeTravel> officeTravels=OfficeTravel.getAllOfficesFromFile();

        officeTravels.forEach(x-> System.out.println(x));
    }
}
