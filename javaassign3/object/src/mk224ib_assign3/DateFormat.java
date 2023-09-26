package mk224ib_assign3;

public class DateFormat {private int year;
    private int month;
    private int day;
    private char punctuation;
    private char format;

    public DateFormat(int year, int month, int day, char punctuation, char format) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.punctuation = punctuation;
        this.format = format;
    }

    // Getter and setter methods for year, month, day, punctuation, and format

    public String getDate(boolean fullYear) {
        if (!isValidDate()) {
            return "Invalid date";
        }

        String yearString = fullYear ? String.format("%04d", year) : String.format("%02d", year % 100);
        String monthString = String.format("%02d", month);
        String dayString = String.format("%02d", day);

        StringBuilder dateBuilder = new StringBuilder();
        if (format == 'b') {
            dateBuilder.append(yearString).append(punctuation).append(monthString).append(punctuation).append(dayString);
        } else if (format == 'l') {
            dateBuilder.append(dayString).append(punctuation).append(monthString).append(punctuation).append(yearString);
        } else if (format == 'm') {
            dateBuilder.append(monthString).append(punctuation).append(dayString).append(punctuation).append(yearString);
        }

        return dateBuilder.toString();
    }

    private boolean isValidDate() {
        if (year < 1900 || year > 2100 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29; // Leap year, February has 29 days
        }

        return day <= daysInMonth[month];
    }
}
