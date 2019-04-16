package com.atguigu.java;

public enum Season {
    SPRING("spring", "春暖花开"),
    SUMMER("summer","夏日炎炎"),
    AUTUMN("autumn","秋高气爽"),
    WINTER("winter","白雪皑皑");
    private String seasonName;
    private String seasonDesc;

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
