package com.xchedu.exception_;

public class EcmDef {
    public static void main(String[] args) {

        try {
            if(args.length!=2){
                throw new ArrayIndexOutOfBoundsException("參數個數錯誤");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println(EcmDef.call(n1,n2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("參數型態錯誤");
        }catch (ArithmeticException e){
            System.out.println("出現 / 0");
        }

    }
    public static double call(int n1,int n2){
        return n1 / n2;
    }
}
