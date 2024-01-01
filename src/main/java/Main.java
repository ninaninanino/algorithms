import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t = sc.nextLine().split(" ");

        int hh = Integer.parseInt(t[0]);
        int mm = Integer.parseInt(t[1]);

        if ( hh <0 || hh >24 || mm <0 || mm >59){
            return;
        }

        if (mm<=45){
            if (hh>1) {
                int hhh = hh-1;
                int mmm = mm+15;
                System.out.println(hhh + " " + mmm);
            }
            else { // hh가 0일때
                int hhh = hh+23;
                int mmm = mm+15;
                System.out.println(hhh + " " + mmm);
            }
        }
        else {
            int mmm = mm-15;
            System.out.println(hh + " " + mmm);
        }
    }
}