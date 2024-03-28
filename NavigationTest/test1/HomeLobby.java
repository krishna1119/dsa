package test1;

import java.util.ArrayList;
import java.util.List;

public class HomeLobby {
    public static ArrayList<AnchorItem> anchors;
    public static List<String> RESULT;
    public static void main(String[] args){
        AnchorItem anchor1 = new AnchorItem("aaaaa","anchir1");
        AnchorItem anchor2 = new AnchorItem("bbbbb","anchir2");
        AnchorItem anchor3 = new AnchorItem("ccccc","anchir3");
        AnchorItem anchor4 = new AnchorItem("ddddd","anchir4");

        anchor1.DistanceUpdate("bbbbb",2f);
        anchor1.DistanceUpdate("ccccc",10f);

        anchor2.DistanceUpdate("aaaaa",2f);
        anchor2.DistanceUpdate("ccccc",2f);
        anchor2.DistanceUpdate("ddddd",10f);

        anchor3.DistanceUpdate("aaaaa",10f);
        anchor3.DistanceUpdate("bbbbb",2f);
        anchor3.DistanceUpdate("ddddd",2f);

        anchor4.DistanceUpdate("bbbbb",10f);
        anchor4.DistanceUpdate("ccccc",2f);

        anchors = new ArrayList<AnchorItem>();
        anchors.add(anchor1);
        anchors.add(anchor2);
        anchors.add(anchor3);
        anchors.add(anchor4);

        NavigationManager nav = new NavigationManager("ddddd", "aaaaa", anchors);

        RESULT = nav.findShortestPath();

        System.out.print(RESULT);










    }
}
