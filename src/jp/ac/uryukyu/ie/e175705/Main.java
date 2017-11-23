package jp.ac.uryukyu.ie.e175705;

public class Main {
    public static void  main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());

        }catch (NullPointerException e){
            System.out.println("例外が発生しました");
            System.out.println(e.getMessage());
        }
    }
}
