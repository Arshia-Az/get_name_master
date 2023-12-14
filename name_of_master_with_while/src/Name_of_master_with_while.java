import java.util.*;

public class Name_of_master_with_while {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many master work in faculty?:");
        int totalmaster = in.nextInt();
        in.nextLine();
        String mastername[] = new String[totalmaster];

        int i = 0;
        while (i < mastername.length) {
            int x = i;
            System.out.format("Enter name for master %d:", x += 1);
            mastername[i] = in.nextLine();
            i++;
        }

        System.out.print("enter a name for search:");
        String search = in.nextLine();

        boolean found = false;
        i = 0;
        while (i < mastername.length) {
            if (mastername[i].contentEquals(search)) {
                System.out.format("master '%s' exist\n", search);
                found = true;
                break;
            }
            i++;
        }

        if (!found) {
            System.out.print("the master not found!!!\n");
        }
    }
}
