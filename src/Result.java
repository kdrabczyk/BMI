public class Result {

    public void resultDisplay(double result){
        if(result < 18){
            System.out.println("You're under the norm");
            System.out.println("Please consider changing your diet.");
            System.out.println("You may start eat more caloric dishes");
        }
        if (result > 18 && result <25 || result == 18){
            System.out.println("You're in norm");
            System.out.println("Just keep it this way");
        }
        if (result >25  && result <30|| result==25 ){
            System.out.println("You are overweight");
            System.out.println("Please consider changing your everyday nourishment habits.");
            System.out.println("You should limit your portions or check their caloric values.");
        }
        if (result >30 || result==30 ){
            System.out.println("You're obese");
            System.out.println("You need to change your way of living");
            System.out.println("Start some sports, limit fast-food, sweets etc- because You need a radical change!");
        }
    }

}
