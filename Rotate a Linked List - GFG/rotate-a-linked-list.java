// { Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(head == null)
        {
            return head;
        }
        int l = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            l++;
        }
        if(l == k)
            return head;
        k = l - k + 1;
        Node rev = reverse(head, null);
        int i = 1;
        Node c1 = rev;
        while(i < k){
            i++;
            c1 = c1.next;
        }
        Node part1 = reverse(rev, c1);
        Node part2 = reverse(c1, null);
        c1 = part1;
        while(c1.next != null){
            c1 = c1.next;
        }
        c1.next = part2;
        return part1;
    }
    
    public Node reverse(Node curr, Node end){
        Node prev = null;
        Node next = null;
        while(curr != end){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}


