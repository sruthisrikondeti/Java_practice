import java.util.*;

public class LCA {
    int data;
    LCA left, right;

    LCA(int d) {
        data = d;
        left = null;
        right = null;
    }

    LCA add(Scanner sc) {
        Queue<LCA> q = new LinkedList<>();
        int d = sc.nextInt();
        LCA root = new LCA(d);
        q.add(root);
        while (!q.isEmpty()) {
            LCA curr = q.remove();
            d = sc.nextInt();
            if (d != -1) {
                curr.left = new LCA(d);
                q.add(curr.left);
            }
            d = sc.nextInt();
            if (d != -1) {
                curr.right = new LCA(d);
                q.add(curr.right);
            }
        }
        return root;
    }

    LCA lowestLCA(LCA root, int a, int b) {
        if (root == null || root.data == a || root.data == b) {
            return root;
        }

        LCA leftLCA = lowestLCA(root.left, a, b);
        LCA rightLCA = lowestLCA(root.right, a, b);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rootValue = sc.nextInt();
        LCA obj = new LCA(rootValue);
        LCA root = obj.add(sc);

        System.out.println("Give Two values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        LCA result = obj.lowestLCA(root, a, b);
        if (result != null) {
            System.out.println(result.data);
        } 
        
    }
}
