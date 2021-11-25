public class Homework09{
    public static void main(String[] args) {
        Music m = new Music("ddd",500);
        m.play();
        System.out.println(m.getInfo());
    }
}

class Music{
    String name;
    int time;

    public Music(String name , int time){
        //用this來區分變數
        this.name = name;
        this.time = time;
    }

    public void play(){
        System.out.println(name + " is palying");
    }

    public String getInfo(){
        return name + "\t" + time;
    }
}