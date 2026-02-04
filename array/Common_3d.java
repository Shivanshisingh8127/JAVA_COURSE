import java.util.ArrayList;
public class Common_3d{
    public static void main(String args[]){
        int[] a={2,4,8};
        int[] b={2,3,4,8,10,16};
        int[] c={2,8,14,40};
        int x=0;
        int y=0;
        int z=0;
        ArrayList<Integer> al =new ArrayList<>();
        while(x<a.length && y<b.length && z<c.length){
            if(a[x]==b[y] && b[y]==c[z]){
                al.add(a[x]);
                x++;
                y++;
                z++;
            }
            else if(a[x]<b[y]){
                x++;
            }
             else if(b[y]<c[z]){
                y++;
            }
            else{
                z++;
            }
        }
        for(int no:al){
            System.out.println(no);
        }
    }
}