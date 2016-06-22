/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Moustaid
 */
public class DateGetter {
            private Calendar cal;
            private int dayOfWeek,dayOfMonth,month,year;
            private String dayName;
            
            public DateGetter()
            {
        cal=Calendar.getInstance(Locale.getDefault());
        dayOfMonth=cal.get(Calendar.DATE);
        month=cal.get(Calendar.MONTH)+1;
        year=cal.get(Calendar.YEAR);
        dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);     
            }
            public String getTime(){
            Date gc=new Date();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
               return format.format(gc); 
            }
            public String getDateNow()
            {
            String annee=Integer.toString(year);
            String mois=(month<10)?"0"+Integer.toString(month):Integer.toString(month);
            String jour=(dayOfMonth<10)?"0"+Integer.toString(dayOfMonth):Integer.toString(dayOfMonth);
            String date=annee+"-"+mois+"-"+jour;
            return date;
            }
            
            public String getDayName()
            {
            switch(dayOfWeek)
        {
            case 1:{dayName="Dimanche";break;}
            case 2:{dayName="Lundi";break;}
            case 3:{dayName="Mardi";break;}
            case 4:{dayName="Mercredi";break;}
            case 5:{dayName="Jeudi";break;}
            case 6:{dayName="Vendredi";break;}
            case 7:{dayName="Samedi";break;}
            default:dayName="Erreur Date";
        }
            return dayName;
            }
}
