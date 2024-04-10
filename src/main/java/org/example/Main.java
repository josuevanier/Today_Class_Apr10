package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<friendMarks> friendMarksTreeSet = new LinkedHashSet<>();

        friendMarksTreeSet.add(new friendMarks("c", "e", 65));
        friendMarksTreeSet.add(new friendMarks("b", "f", 95));
        friendMarksTreeSet.add(new friendMarks("a", "g", 45));

        TreeSet<friendMarks> treeSet0 = new TreeSet<>(new marksCompare());

        treeSet0.addAll(friendMarksTreeSet);
        for (friendMarks tree : treeSet0) {
            System.out.print(tree + " ");
        }
    }

    public static class friendMarks {
        String name;
        String nickName;
        int marks;

        public friendMarks(String name, String nickName, int marks) {
            this.name = name;
            this.nickName = nickName;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public String getNickName() {
            return nickName;
        }

        public int getMarks() {
            return marks;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "friendMarks{" +
                    "name='" + name + '\'' +
                    ", nickName='" + nickName + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }

    public static class nameCompare implements Comparator<friendMarks> {
        public int compare(friendMarks friendMark1s, friendMarks friendMark2s) {
            return friendMark1s.getName().compareTo(friendMark2s.getName());
        }
    }

    public static class NickNameCompare implements Comparator<friendMarks> {
        public int compare(friendMarks friendMark1s, friendMarks friendMark2s) {
            return friendMark1s.getNickName().compareTo(friendMark2s.getNickName());
        }
    }

    public static class marksCompare implements Comparator<friendMarks> {
        public int compare(friendMarks friendMarks1, friendMarks friendMark2s) {
            if (friendMarks1.getMarks() > friendMark2s.getMarks()) return 1;
            else if (friendMarks1.getMarks() == friendMark2s.getMarks()) return 0;
            else return -1;
        }
    }
}