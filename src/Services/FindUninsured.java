package Services;

import Models.Insurance;
import Models.Vehicle;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class FindUninsured {

    private ArrayList<Vehicle>  UninsuredVehicles;

    public FindUninsured(ArrayList<Vehicle> UninsuredVehicles) {
        UninsuredVehicles = UninsuredVehicles;


    }

    private boolean isUnsuredNaw (Insurance Insurance){
        Calendar calendar = Calendar.getInstance();
        if( Insurance.getInsurTo().before(calendar.getTime()) ){
            return true;
        }
        return false;
    }

    private boolean isUnsuredInDate (Insurance Insurance ,int x){
        Calendar calendar = Calendar.getInstance();
        if( Insurance.getInsurTo().before(calendar.add(Calendar.DAY_OF_MONTH, x))){
            return true;
        }
        return false;
    }
}
