public class skillsDemo {
    public static String gradingScale(int percentage) {
        if (percentage >= 90) {
            return "You got an A";
        }
        else if (percentage < 90 && percentage >= 80) {
            return "You got a B";
        }
        else if (percentage < 80 && percentage >= 70) {
            return "You got a C";
        }
        else if (percentage < 70 && percentage >= 60) {
            return "You got a D";
        }
        else {
            return "You got an F";
        }

    }
}
