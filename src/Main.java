//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        enum Weekday {
            Monday,
            Tuesday,
            Wednesday,
            Thursday,
            Friday,
            Saturday,
            Sunday;

            boolean isWeekDay(Weekday wd)
            {
               if(wd == Weekday.Monday ||
                  wd == Weekday.Tuesday ||
                  wd == Weekday.Wednesday ||
                  wd == Weekday.Thursday ||
                  wd == Weekday.Friday )
                   return true;

               else
                   return false;
            }

            boolean isHolyDay(Weekday wd)
            {
                if(wd == Weekday.Saturday ||
                   wd == Weekday.Sunday )
                    return true;

                else
                    return false;
            }
        }

        for (Weekday wdType: Weekday.values()) {
            System.out.println(wdType.name() + " " + wdType.ordinal());
            System.out.println("isWeekDay: " + wdType.isWeekDay(wdType));
            System.out.println("isHolyDay: " + wdType.isHolyDay(wdType));
        }
    }
}
