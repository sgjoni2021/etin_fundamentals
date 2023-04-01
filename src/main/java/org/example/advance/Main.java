package org.example.advance;

public class Main {
    public static void main(String[] args) {

        Primary primary =
                new Primary("naim frasheri", "aleksander goga", 100, "etieni");
        College college =
                new College("sami frasheri", "isuf ferra", 200, "sonila");



        School school = new Primary("", "", 12, "");
        School school1 = new College("", "", 11, "");

        school.register();
        school1.register();
        school.firstDayOfSchool();
        school1.firstDayOfSchool();
        primary.primarySchool();



        SchoolInterface schoolInterface = new Primary();
        SchoolInterface schoolInterface1 = new College();

        schoolInterface.method1();
        schoolInterface1.method1();


        Object object = new Primary();


    }


}
