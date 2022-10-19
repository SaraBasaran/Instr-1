package day18_PassByValue_DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //How to get current date in Java code
        LocalDate currentDate= LocalDate.now();
        System.out.println(currentDate); //2022-09-28

        //How to get "current time" by typing Java code
        LocalTime currentTime= LocalTime.now();
        System.out.println(currentTime);//18:05:03.103885900

        //How to get "current date and time" by Java
        LocalDateTime currentDateTime= LocalDateTime.now();
        System.out.println(currentDateTime);//2022-09-28T18:07:17.786758

        //How to get current date in another country by typing Java codes
        LocalDateTime currentDateTimeInJapan1= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan1);  //2022-09-28

        //How to get current date and time in another country
        LocalDateTime currentDateTimeInJapan2= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan2); //2022-09-29T00:15:17.167815900

        //How to go future in date
        LocalDate cd1= LocalDate.now();
        System.out.println(cd1);//2022-09-28

        LocalDate cd1Next= cd1.plusDays(120);
        System.out.println(cd1Next);//2023-01-26

        //How to add years for future dates in Java

        LocalDate localDateInFuture= cd1.plusYears(2).plusMonths(5).plusDays(120); //Method chain in Java
        System.out.println(localDateInFuture);//2025-06-28

        //How to go to a past date in Java
        LocalDate cd1Past= cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);//2019-07-23

        //Homework: Type code to learn how to go to future and past in time

        //How to get a specific part of the time

        LocalTime ct1= LocalTime.now(); //hour
        int hour = ct1.getHour();
        System.out.println(hour); //18

        int minute= ct1.getMinute();
        System.out.println(minute);//56

        //How to change the format of the date

        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MMM/yyyy"); //28/Eyl/2022==>MMM gives the date format
                                                                                          // with the acronym of the month name
        String formattedCurrentDate2= dateTimeFormatter.format(cd1);
        System.out.println(formattedCurrentDate2);  //"dd/MM/yyyy" //28/09/2022==>MM gives the month value as double character integer


        DateTimeFormatter dateTimeFormatter2= DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); //28/Eylül/2022==>MMM gives the date format
                                                                                           // with the full month name
        String formattedCurrentDate3= dateTimeFormatter2.format(cd1);
        System.out.println(formattedCurrentDate3);//28/Eyl�l/2022

        //How to change the format of time

        DateTimeFormatter mnr= DateTimeFormatter.ofPattern("hh:mm a");//07:09//hh uses 12 hours of format
        LocalTime lt= LocalTime.now();
        String formattedCurrentTime= mnr.format(lt);
        System.out.println(formattedCurrentTime);// HH uses 24 hours of format==> 19:08

        //How to create specific dates

        LocalDate dob1= LocalDate.of(2002, 10, 12);
        LocalDate dob2= LocalDate.of(2013, Month.MAY, 21);

        //How to compare 2 dates

       boolean isBefore= dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is= dob2.isBefore(dob1);
        System.out.println(is);//false



























    }


}
