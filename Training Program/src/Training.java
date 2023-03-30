public class Training {
    private int burpee;
    private int pushup;
    private int situp;
    private int squat;

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }

    public Training(int burpee, int pushup, int situp, int squat) {
        this.burpee = burpee;
        this.pushup = pushup;
        this.situp = situp;
        this.squat = squat;

    }
    public void move(String type, int count){
        if(type.equals("burpee")) {
            doBurpee(count);

        } else if (type.equals("pushup")) {
            doPushup(count);

        } else if (type.equals("situp")) {
            doSitup(count);

        } else if (type.equals("squat")) {
            doSquat(count);

        }else {

            System.out.println("invalid action");

        }
    }

    public void doBurpee(int count){
        if (burpee == 0) {
            System.out.println("You reached your goal");
        } if (burpee-count<0){
            System.out.println("Congratulations , you are over your goals");
            burpee=0;
            System.out.println("Left"+burpee);
        }else {
            burpee-=count;
            System.out.println("burpee left " +burpee);
        }
    }
    public void doPushup(int count){
        if (pushup == 0) {
            System.out.println("You reached your goal");
        } if (pushup-count<0){
            System.out.println("Congratulations , you are over your goals");
            pushup=0;
            System.out.println("Left"+pushup);
        }else {
            pushup-=count;
            System.out.println("pushup left " +pushup);
        }
    }
    public void doSitup(int count){
        if (situp == 0) {
            System.out.println("You reached your goal");
        } if (situp-count<0){
            System.out.println("Congratulations , you are over your goals");
            situp=0;
            System.out.println("Left"+situp);
        }else {
            situp-=count;
            System.out.println("situp left " +situp);
        }
    }
    public void doSquat(int count){
        if (squat == 0) {
            System.out.println("You reached your goal");
        } if (squat-count<0){
            System.out.println("Congratulations , you are over your goals");
            squat=0;
            System.out.println("Left"+squat);
        }else {
            squat-=count;
            System.out.println("squat left " +squat);
        }
    }
    public boolean isTrainingOver() {
        return (burpee== 0) && (pushup==0)&&(situp==0)&&(squat==0);
    }

}
