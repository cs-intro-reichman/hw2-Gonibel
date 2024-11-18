public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code

        //String hours1 = args[0];
       // String minutes1 = args[2];
       // String moreminutes1 = args[3];

        //int hours = Integer.parseInt(hours1);
       // int minutes = Integer.parseInt(minutes1);
       // int moreminutes = Integer.parseInt(moreminutes1);

       int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
       int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
       int moreminutes = Integer.parseInt(args[1]);

        int totalminutes = hours * 60 + minutes + moreminutes;
        int totalhours = totalminutes / 60;
        int newhours = totalhours % 24;
        int newminutes = totalminutes - (totalhours * 60);

        if (newhours < 10 && newminutes >= 10) { System.out.println("0"+newhours + ":" + newminutes);}
        else{if(newminutes < 10 && newhours >= 10) { System.out.println(newhours + ":0" + newminutes);}}

        if(newhours < 10 && newminutes < 10) { System.out.println("0"+newhours + ":0" + newminutes);}
        else { System.out.println(newhours + ":" + newminutes);}
    }
}
