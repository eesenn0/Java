public class DatingApp {

    public static void main(String[] args) {
        // Create a new SimpleDate object representing Friday, February 13th, 2015
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        // Calculate the date 7 days (1 week) after the starting date, and print it
        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);

            // Calculate the date 1 week after the current date, and update the current date
            newDate = newDate.afterNumberOfDays(7);

            // Increment the week counter
            week += 1;
        }

        // Calculate the date 790 days after the starting date, and print it
        SimpleDate finalDate = date.afterNumberOfDays(790);
        System.out.println("The date after 790 days from the examined Friday is " + finalDate);
    }
}

class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        // Constructor for SimpleDate class
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        // Returns a string representation of the date in the format "day.month.year"
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // Returns true if this date is before the compared date
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public SimpleDate advance() {
        // Returns a new SimpleDate object representing the day after this date
        int newDay;
        int newMonth = this.month;
        int newYear = this.year;

        if (this.day < 30) {
            newDay = this.day + 1;
        } else {
            newDay = 1;
            if (this.month < 12) {
                newMonth = this.month + 1;
            } else {
                newMonth = 1;
                newYear = this.year + 1;
            }
        }

        return new SimpleDate(newDay, newMonth, newYear);
    }

    public void advance(int howManyDays) {
        // Advances the date by the specified number of days
        int days = this.day + howManyDays;
        if (days > 30) {
            while (days >= 30) {
                int remainDays = days % 30;
                if (remainDays >= 1) {
                    if (this.month < 12) {
                        this.month += 1;
                    } else {
                        this.month = 1;
                    }
                    days = remainDays;
                } else {
                    break;
                }
            }
        } else {
            this.day += howManyDays;
        }
    }

    public SimpleDate afterNumberOfDays(int noDays) {
        // Returns a new SimpleDate object representing the date after the specified number of days
        SimpleDate newDate = this;
        for (int i = 0; i < noDays; i++) {
            newDate = newDate.advance();
        }
        return newDate;
    }
}
