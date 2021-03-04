package com.fxz.poi;

/**
 * 描述：学生Excel实体类
 *
 * @author Fang
 * @date 2021-02-07 17:58:33
 */
@Excel(name = "学生标签页")
public class Student {

    private String name;

    private boolean male;

    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
