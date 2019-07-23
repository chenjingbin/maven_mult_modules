package org.chenjingbin.multdemo.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mxd on 2017/7/14.
 */
public class DayRange {

    private List list;

    private int range;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public List<String> getDateRange(List list, int range) {
        switch (range) {
            case 1:
                for (int i = 0; i < 24; i++) {
                    Map<String, Object> map6 = new HashMap<String, Object>();
                    map6.put("content", "0" + (0 + i) + ":00" + "-" + "0" + (i + 1) + ":00");
                    if (i > 9) {
                        map6.put("content", (0 + i) + ":00" + "-" + (i + 1) + ":00");
                    }
                    if (i == 9) {
                        map6.put("content", "0" + (0 + i) + ":00" + "-" + (i + 1) + ":00");
                    }
                    if (i == 23) {
                        map6.put("content", (0 + i) + ":00" + "-" + "00:00");
                    }
                    list.add(map6);
                }
                break;
            case 2:
                for (int i = 0; i < 23; i++) {
                    Map<String, Object> map6 = new HashMap<String, Object>();
                    if (i % 2 == 0) {
                        map6.put("content", "0" + (0 + i) + ":00" + "-" + "0" + (i + 2) + ":00");
                        if (i > 9) {
                            map6.put("content", (0 + i) + ":00" + "-" + (i + 2) + ":00");
                        }
                        if (i == 8) {
                            map6.put("content", "0" + (0 + i) + ":00" + "-" + (i + 2) + ":00");
                        }
                        if (i == 22) {
                            map6.put("content", (0 + i) + ":00" + "-" + "00:00");
                        }
                        list.add(map6);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 23; i++) {
                    Map<String, Object> map6 = new HashMap<String, Object>();
                    if (i % 3 == 0) {
                        map6.put("content", "0" + (0 + i) + ":00" + "-" + "0" + (i + 3) + ":00");
                        if (i > 9) {
                            map6.put("content", (0 + i) + ":00" + "-" + (i + 3) + ":00");
                        }
                        if (i == 9) {
                            map6.put("content", "0" + (0 + i) + ":00" + "-" + (i + 3) + ":00");
                        }
                        if (i == 21) {
                            map6.put("content", (0 + i) + ":00" + "-" + "00:00");
                        }
                        list.add(map6);
                    }
                }
                break;
            case 4:
                for (int i = 0; i < 23; i++) {
                    Map<String, Object> map6 = new HashMap<String, Object>();
                    if (i % 4 == 0) {
                        map6.put("content", "0" + (0 + i) + ":00" + "-" + "0" + (i + 4) + ":00");
                        if (i > 9) {
                            map6.put("content", (0 + i) + ":00" + "-" + (i + 4) + ":00");
                        }
                        if (i == 8) {
                            map6.put("content", "0" + (0 + i) + ":00" + "-" + (i + 4) + ":00");
                        }
                        if (i == 20) {
                            map6.put("content", (0 + i) + ":00" + "-" + "00:00");
                        }
                        list.add(map6);
                    }
                }
                break;
            case 6:
                for (int i = 0; i < 23; i++) {
                    Map<String, Object> map6 = new HashMap<String, Object>();
                    if (i % 6 == 0) {
                        map6.put("content", "0" + (0 + i) + ":00" + "-" + "0" + (i + 6) + ":00");
                        if (i > 9) {
                            map6.put("content", (0 + i) + ":00" + "-" + (i + 6) + ":00");
                        }
                        if (i == 6) {
                            map6.put("content", "0" + (0 + i) + ":00" + "-" + (i + 6) + ":00");
                        }
                        if (i == 18) {
                            map6.put("content", (0 + i) + ":00" + "-" + "00:00");
                        }
                        list.add(map6);
                    }
                }
                break;
            case 8:
                for (int i = 0; i < 23; i++) {
                    Map<String, Object> map6 = new HashMap<String, Object>();
                    if (i % 8 == 0) {
                        map6.put("content", "0" + (0 + i) + ":00" + "-" + "0" + (i + 8) + ":00");
                        if (i > 9) {
                            map6.put("content", (0 + i) + ":00" + "-" + (i + 8) + ":00");
                        }
                        if (i == 16) {
                            map6.put("content", (0 + i) + ":00" + "-" + "00:00");
                        }
                        list.add(map6);
                    }
                }
                break;
        }
        return list;
    }

    public List<String> getDateRange(int range) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        switch (range) {
            case 1:
                for (int i = 0; i < 24; i++) {
                    temp = "0" + (0 + i) + ":00" + "-" + "0" + (i + 1) + ":00";
                    if (i > 9) {
                        temp = (0 + i) + ":00" + "-" + (i + 1) + ":00";
                    }
                    if (i == 9) {
                        temp = "0" + (0 + i) + ":00" + "-" + (i + 1) + ":00";
                    }
                    if (i == 23) {
                        temp = (0 + i) + ":00" + "-" + "00:00";
                    }
                    list.add(temp);
                }
                break;
            case 2:
                for (int i = 0; i < 23; i++) {
                    Map<String, Object> map6 = new HashMap<String, Object>();
                    if (i % 2 == 0) {
                        temp = "0" + (0 + i) + ":00" + "-" + "0" + (i + 2) + ":00";
                        if (i > 9) {
                            temp = (0 + i) + ":00" + "-" + (i + 2) + ":00";
                        }
                        if (i == 8) {
                            temp = "0" + (0 + i) + ":00" + "-" + (i + 2) + ":00";
                        }
                        if (i == 22) {
                            temp = (0 + i) + ":00" + "-" + "00:00";
                        }
                        list.add(temp);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 23; i++) {
                    if (i % 3 == 0) {
                        temp = "0" + (0 + i) + ":00" + "-" + "0" + (i + 3) + ":00";
                        if (i > 9) {
                            temp = (0 + i) + ":00" + "-" + (i + 3) + ":00";
                        }
                        if (i == 9) {
                            temp =  "0" + (0 + i) + ":00" + "-" + (i + 3) + ":00";
                        }
                        if (i == 21) {
                            temp =  (0 + i) + ":00" + "-" + "00:00";
                        }
                        list.add(temp);
                    }
                }
                break;
            case 4:
                for (int i = 0; i < 23; i++) {
                    if (i % 4 == 0) {
                        temp =  "0" + (0 + i) + ":00" + "-" + "0" + (i + 4) + ":00";

                        if (i > 9) {
                            temp = (0 + i) + ":00" + "-" + (i + 4) + ":00";

                        }
                        if (i == 8) {
                            temp = "0" + (0 + i) + ":00" + "-" + (i + 4) + ":00";
                        }
                        if (i == 20) {
                            temp = (0 + i) + ":00" + "-" + "00:00";
                        }
                        list.add(temp);
                    }
                }
                break;
            case 6:
                for (int i = 0; i < 23; i++) {
                    if (i % 6 == 0) {
                        temp = "0" + (0 + i) + ":00" + "-" + "0" + (i + 6) + ":00";
                        if (i > 9) {
                            temp =  (0 + i) + ":00" + "-" + (i + 6) + ":00";
                        }
                        if (i == 6) {
                            temp =  "0" + (0 + i) + ":00" + "-" + (i + 6) + ":00";
                        }
                        if (i == 18) {
                            temp =  (0 + i) + ":00" + "-" + "00:00";
                        }
                        list.add(temp);
                    }
                }
                break;
            case 8:
                for (int i = 0; i < 23; i++) {
                    if (i % 8 == 0) {
                        temp =  "0" + (0 + i) + ":00" + "-" + "0" + (i + 8) + ":00";
                        if (i > 9) {
                            temp = (0 + i) + ":00" + "-" + (i + 8) + ":00";
                        }
                        if (i == 16) {
                            temp = (0 + i) + ":00" + "-" + "00:00";
                        }
                        list.add(temp);
                    }
                }
                break;
        }
        return list;
    }

}
