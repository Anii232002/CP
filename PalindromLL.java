package CP;

import java.util.* ;
import java.io.*;
/****************************************************************

 Following is the class structure of the LinkedListNode class:



 *****************************************************************/

 class PalindromeLL {
   static  class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static void main(String[] args)
    {
        LinkedListNode<Integer> a = new LinkedListNode<>(1);
        LinkedListNode<Integer> b = new LinkedListNode<>(2);
        LinkedListNode<Integer> c = new LinkedListNode<>(3);
        LinkedListNode<Integer> d = new LinkedListNode<>(2);
        LinkedListNode<Integer> e = new LinkedListNode<>(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(isPalindrome(a));

    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        // Write your code here!

        LinkedListNode<Integer> prev = head;
        if(prev.next==null)
        {
            return true;
        }
        LinkedListNode<Integer> mid = prev.next;
        if(mid.next==null)
        {
            if(mid.data==prev.data)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        LinkedListNode<Integer> terminal = mid.next;

        int count =0;
        while(head.next!=null)
        {
            head = head.next;
            count++;
        }
        prev.next = null;
        int i = count;
        while(i<=(count/2)+1)
        {
            mid.next = prev;
            if(i==count/2+1)
            {
                break;
            }
            prev = mid;
            mid = terminal;
            terminal = terminal.next;
            i++;

        }
        if(count%2!=0)
        {
            terminal = terminal.next;
        }
        if(terminal!=null)
        {
            if(terminal.data!=mid.data)
            {
                return false;
            }
            terminal = terminal.next;
            mid = mid.next;
        }
        return true;
    }
}
