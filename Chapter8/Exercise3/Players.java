import java.util.*;
class Players {
    private String name;
    List<Integer> score = new ArrayList<>(10);
    List<Integer> score2 = new ArrayList<>(10);
    List<Integer> scoretotal = new ArrayList<>(10);
    int towtal=0;
    
    public Players(String name){
        name = this.name;
    }

    public void Scoreadd (int score1){
        score.add(score1);
    }

    public void Scoreadd2 (int scoretwo){
        score2.add(scoretwo);
    }

    public void total (){
        for (int i = 0; i < score.size(); i++) {
            int calc = score.get(i)+score2.get(i);
            if(calc==10){
                if (score.get(i)==10) {
                    calc=20;
                } else {
                    calc=15;
                }

            }
            scoretotal.add(calc);
        }

        
    }
  
}