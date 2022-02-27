// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        second = reverse(second);
        Node res = new Node(0);
        Node curr = res;
        int carry = 0;
        while(first != null && second != null){
            
            int sum = first.data + second.data + carry;
            
            if(sum > 9){
                carry = 1;
                sum = sum % 10;
            }
            else{
                carry = 0;
            }
            curr.next = new Node(sum);
            first = first.next;
            second = second.next;
            curr = curr.next;
        }
        while(first != null){
            
            int sum = first.data + carry;
            if(sum > 9){
                carry = 1;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            curr.next = new Node(sum);
            first = first.next;
            curr = curr.next;
        }
        while(second != null){
            
            int sum = second.data + carry;
            
            if(sum > 9){
                carry = 1;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            curr.next = new Node(sum);
            second = second.next;
            curr = curr.next;
        }
        if(carry == 1){
            curr.next = new Node(1);
        }
        res = res.next;
        res = reverse(res);
        return res;
        
    }
    static Node reverse(Node start){
        Node prev = null;
        Node curr = start;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}