import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //declare variables
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;
        birthYear = SafeInput.getRangedInt(in, "What is your birth year?", 1950, 2010);
        birthMonth = SafeInput.getRangedInt(in, "What is your birth Month?", 1, 12);
        // certain months have certain amount of days
        switch (birthMonth)
        {
            case 2:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 29);
                break;
            case 4:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 30);
                break;
            case 6:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 30);
                break;
            case 9:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 30);
                break;
            case 11:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 30);
                break;
            case 1:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 31);
                break;
            case 3:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 31);
                break;
            case 5:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 31);
                break;
            case 7:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 31);
                break;
            case 8:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 31);
                break;
            case 10:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 31);
                break;
            case 12:
                birthDay = SafeInput.getRangedInt(in, "What is your birth Day?", 1, 31);
                break;
        }

        birthHour = SafeInput.getRangedInt(in, "What is your birth Hour?", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "What is your birth Minute?", 1, 59);
        // output birthday
        System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " and " + birthHour + " hours and " + birthMinute + " minutes.");




    }
}
