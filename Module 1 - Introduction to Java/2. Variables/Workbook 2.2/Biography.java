public class Biography {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (see the Udemy Video:
        // Workbook 2.2 to access the link).

        // name (text)
        // age (whole number)
        // country (text)
        // instrument (text)
        // hours (whole number)
        // game (text)
        // subject (text)
        // grade (character)

        String name = "Kevin";
        int age = 21;
        String country = "Viet Nam";
        String instrument = "Piano";
        int hours = 1;
        String game = "duolingo";
        String subject = "english";
        char grade = 9;

        System.out.println("My name is " + name + "." + " I'm " + age + " years old, and I'm from " + country + ".");
        System.out.println(
                "My favourite instrument is " + instrument + "." + " I play for " + hours + " hours a day" + ".");
        System.out.println("When I'm tired, I like to play " + game + ".");
        System.out.println("In school, my favourite subject was " + subject + "," + " I scored a " + grade + ".");

        // Compare your result to what's on Learn the Part.
    }
}
