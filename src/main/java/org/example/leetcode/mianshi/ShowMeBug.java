package org.example.leetcode.mianshi;

//现在数据库有一张表，用来存储一个多叉树，id为主键，pid 表示父节点的 id，已知 "-1" 表示根节点，现在要求打印出从根节点到每个子节点的路径（可以是无序的）。
//
// | id      | pid    |
// |---------|--------|
// | "A"     | "-1"   |
// | "A-1"   | "A"    |
// | "A-2"   | "A"    |
// | "A-3"   | "A"    |
// | "A-2-1" | "A-2"  |
// | "A-2-2" | "A-2"  |
// | "A-2-3" | "A-2"  |
//
// Input: [
//   {
//       "id": "A",
//       "pid": "-1"
//   },
//   {
//       "id": "A-1",
//       "pid": "A"
//   },
//   {
//       "id": "A-2",
//       "pid": "A"
//   },
//   {
//       "id": "A-3",
//       "pid": "A"
//   },
//   {
//       "id": "A-2-1",
//       "pid": "A-2"
//   },
//   {
//       "id": "A-2-2",
//       "pid": "A-2"
//   },
//   {
//       "id": "A-2-3",
//       "pid": "A-2"
//   }
// ]
// Output: [
//   "/A",
//   "/A/A-1",
//   "/A/A-2",
//   "/A/A-3",
//   "/A/A-2/A-2-1",
//   "/A/A-2/A-2-2",
//   "/A/A-2/A-2-3",
// ]

import java.util.*;

class Node {
    Node(String ID, String PID) {
        this.ID = ID;
        this.PID = PID;
    }
    public String ID; // 节点ID
    public String PID; // 父节点ID
}



public class ShowMeBug {

    void print2(){
        
    }

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node("A", "-1"));
        // nodes.add(new Node("B", "-1"));
        nodes.add(new Node("A-1", "A"));
        nodes.add(new Node("A-2", "A"));
        nodes.add(new Node("A-3", "A"));
        nodes.add(new Node("A-2-1", "A-2"));
        nodes.add(new Node("A-2-2", "A-2"));
        nodes.add(new Node("A-2-3", "A-2"));
        nodes.add(new Node("A-2-4", "A-2"));
        print(nodes);
//        nodes.contains()
    }

    private static void print(List<Node> nodes) {
        Map<String, String> hashMap = new HashMap<>();
        String string = null;
        for (int i = 0; i < nodes.size(); i++) {
            String s1 = nodes.get(i).ID;
            String s2 = nodes.get(i).PID;
            hashMap.put(s1,s2);
        }
        for (int i = 0; i < nodes.size(); i++) {
            String s=nodes.get(i).ID;
            String s2="";
            while (!s.equals("-1")){
                s2 ="/"+s+s2;
                s = hashMap.get(s);
            }
            System.out.println(s2);
        }

    }

}

