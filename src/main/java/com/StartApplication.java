package com;

import com.json.Constants;
import com.json.GsonUtil;

import java.util.Scanner;

/**
 *
 */
public class StartApplication {

    private static String menu = "please input cmd:" +
            "1:all RailModel£º" +
            "2£ºGerade" +
            "3£ºWeiche"+
            "4: Abzweigung" +
            "5: Prellbock" +
            "6: exit program";

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.err.println(menu);
            String cmdStr = scanner.nextLine();
            switch (cmdStr){
                case "1":
                    System.out.println(GsonUtil.toJsonString(Constants.grade));
                    System.out.println(GsonUtil.toJsonString(Constants.weiche));
                    System.out.println(GsonUtil.toJsonString(Constants.Fest));
                    System.out.println(GsonUtil.toJsonString(Constants.Abzweigung));
                    break;
                case "2":
                    System.out.println("-----------");
                    System.out.println(GsonUtil.toJsonString(Constants.grade));
                    System.out.println("-----------");
                    break;
                case "3":
                    System.out.println("-----------");
                    System.out.println(GsonUtil.toJsonString(Constants.weiche));
                    System.out.println("-----------");
                    break;
                case "4":
                    System.out.println("-----------");
                    System.out.println(GsonUtil.toJsonString(Constants.Abzweigung));
                    System.out.println("-----------");
                    break;
                case "5":
                    System.out.println("-----------");
                    System.out.println(GsonUtil.toJsonString(Constants.Fest));
                    System.out.println("-----------");
                    break;
                case "6":
                    System.exit(-1);
                default:
                    break;

            }

        }
    }
}
