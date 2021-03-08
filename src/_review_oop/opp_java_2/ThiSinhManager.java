package _review_oop.opp_java_2;

import java.util.List;

public class ThiSinhManager {
    List<ThiSinh> thiSinhList;

    public ThiSinhManager(List<ThiSinh> thiSinhList) {
        this.thiSinhList = thiSinhList;
    }

    public List<ThiSinh> getThiSinhList() {
        return thiSinhList;
    }

    public void setThiSinhList(List<ThiSinh> thiSinhList) {
        this.thiSinhList = thiSinhList;
    }

    public void addThiSinh(ThiSinh thiSinh) {
        this.thiSinhList.add(thiSinh);
    }

    public void displayThiSinh() {
        for (ThiSinh ts : thiSinhList) {
            System.out.println(ts);
        }
    }

    public void searchByList(int list) {
        if (thiSinhList.size() == 0) {
            System.out.println(" Chưa có thí sinh nào trong danh sách ");
        } else {
            boolean flag = false;
            for (ThiSinh ts : thiSinhList) {
                if (ts.getIdStudent() == list) {
                    System.out.println(ts);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Không có thí sinh nào trùng với số báo danh " + getThiSinhList());
            }
        }
    }


}

