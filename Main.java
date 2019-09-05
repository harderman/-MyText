package Others;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*

给定一个单向链表和一个整数m，
将链表中小于等于m的节点移到大于m的节点之前，要求两部分中的节点各自保持原有的先后顺序
 */
public class Main1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能4 5 6 9 8 7 1 3
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        if(head == null){
            return head;
        }
        ListNode myHeadMin = new ListNode(-1);
        ListNode myHeadMax = new ListNode(-1);
        ListNode myCur = myHeadMin;
        ListNode myCurMax = myHeadMax;
        ListNode cur = head;
        while(cur != null){
            if(cur.val <= m){
                myCur.next = cur;
                myCur = myCur.next;
                //myCur.next = null;
            }else{
                myCurMax.next = cur;
                myCurMax = myCurMax.next;
            }
                cur = cur.next;
        }
        myCurMax.next = null;
        myCur.next = myHeadMax.next;
        return myHeadMin.next;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}
