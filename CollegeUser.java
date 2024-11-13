import java.util.Scanner;
public class CollegeUser{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of users in the college: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaff = staffUsers / 3;
        int teachingStaff = staffUsers - nonTeachingStaff;
        int studentUsers = totalUsers - staffUsers;
        System.out.println("Number of non-teaching staff: " + nonTeachingStaff);
        System.out.println("Number of teaching staff: " + teachingStaff);
        System.out.println("Number of student users: " + studentUsers);
    }
}

