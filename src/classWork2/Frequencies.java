package classWork2;
import lab1.map.*;
import lab1.list.node.*;
import lab1.list.*;
import lab1.map.mapPair.MapPair;
import java.util.Scanner;

public class Frequencies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ");
        Map aMap = new Map();
        for (String word : words) {
            Node tmp = aMap.keyNode(word);
            if (tmp != null) {
                int newCount = ((int)((MapPair)tmp.data).value) + 1;
                aMap.put(word, newCount);
            }
            else
                aMap.put(word, 1);
        }
        aMap.printMap();
    }
}