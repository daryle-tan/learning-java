public class ChallengeTwo {
    public static double employeeSalary(double hrsPerWeek, double amtPerHour, int vacationDays) {
        if(hrsPerWeek < 0) {
            return -1;
        }

        if(amtPerHour < 0) {
            return -1;
        }

        double unpaidTime = vacationDays * amtPerHour * 8;
        double grossYearlySalary = (hrsPerWeek * amtPerHour) * 48 - unpaidTime;
        return grossYearlySalary;
    }
    public static void main(String[] args) {
        System.out.println(employeeSalary(40, 20, 10));
    }
}
