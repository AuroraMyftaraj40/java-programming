package day17_ternary_nested_conditions;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate >45) ? "accept" : "deny";
        System.out.println("reply = " + reply);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim/Murodil" : "Saim/Nadir";
        System.out.println("Today's teacher = " + teacher);
        
        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "has DL, can drive" : "no Dl, can not drive";
        System.out.println("driving = " + driving);

    }
}
