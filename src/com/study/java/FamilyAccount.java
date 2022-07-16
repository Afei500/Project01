package com.study.java;

/**
 * Created with IntelliJ IDEA.
 * Description:家庭收支
 * User: zhao
 * Date: 2022-07-16
 * Time: 17:10
 */
public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag=true;
        int totalMoney=10000;
        int income=0;
        int outcome=0;
        String inExplain="";
        String outExplain="";
        while (isFlag){
            System.out.println("--------家庭收支记账软件--------");
            System.out.println("1 收支明细");
            System.out.println("2 登记收入");
            System.out.println("3 登记支出");
            System.out.println("4 退    出");
            System.out.println("请选择(1-4)");
            char c=Utility.readMenuSelection();
            if(c=='1'){
                System.out.println("------------当前收支明细记录-----------");
                System.out.println("收支\t账户金额\t收支金额\t说明");
                System.out.println("收入\t"+totalMoney+"\t"+income+"\t"+inExplain);
                System.out.println("支出\t"+totalMoney+"\t"+outcome+"\t"+outExplain);
            }else if (c=='2'){
                System.out.print("本次收入金额:");
                income=Utility.readNumber();

                System.out.print("本次收入说明:");
                inExplain = Utility.readString();
                totalMoney+=income;
            }else if (c=='3'){
                System.out.print("本次支出金额:");
                outcome=Utility.readNumber();
                System.out.print("本次支出说明:");
                outExplain = Utility.readString();
                totalMoney-=outcome;
            }else if(c=='4'){
                System.out.print("确认是否退出(Y/N):");
                char c1=Utility.readConfirmSelection();
                if (c1=='Y'){
                    break;
                }else{
                }
            }

            }

        }

    }

