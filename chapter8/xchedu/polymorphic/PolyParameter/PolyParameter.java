package com.xchedu.polymorphic.PolyParameter;

public class PolyParameter {
    public static void main(String[] args) {
        Staff staff = new Staff("staff", 24000);
        Manager manager = new Manager("manager",50000,500000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(staff);
        polyParameter.showEmpAnnual(manager);
        System.out.println();
        polyParameter.testWork(staff);
        polyParameter.testWork(manager);

        "hello".equals("acs");
    }

    // 透過父類來接收 -> 父類引用可以指向子類對象 多態參數
    // 每個類中都有 getAnnual() ，透過動態綁定去呼叫該類的方法
    public void showEmpAnnual(Employee e){
        System.out.println(e.getName() + " 的薪水為 " + e.getAnnual());
    }

    //透過父類來接收 -> 父類引用可以指向子類對象 多態參數
    public void testWork(Employee e){
        //判斷傳進來是 Staff 還是 Manager
        if(e instanceof Staff){
            ((Staff) e).work(); //向下轉型
        }else if(e instanceof Manager){
            ((Manager) e).manage(); //向下轉型
        }
    }
}
