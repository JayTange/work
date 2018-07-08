package com.json;

/**
 * @author tangj
 * @date 2018/7/8 15:13
 */
public class Constants {

    /**
     * 直道
     */
    public static RailModel grade = new RailModel("Gerade","das gerade Gleis");

    /**
     * 弯道
     */
    public static RailModel weiche = new RailModel("Weiche","ein Gleis mit eine Kurve");
    /**
     * 岔路
     */
    public static RailModel Abzweigung = new RailModel("Abzweigung","ein Abzweig von der Gleis");
    /**
     * 固定类型
     */
    public static RailModel Fest = new RailModel("Prellbock","ein Gleis mit eine Haltestelle in einer Seite");



}
