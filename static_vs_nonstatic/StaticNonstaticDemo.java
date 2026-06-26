package static_vs_nonstatic;

public class StaticNonstaticDemo {

    // Static Variable
    static String companyName = "OpenAI";

    // Non-Static Variable
    String employeeName = "Venkat";

    // Static Method
    public static void staticMethod() {
        System.out.println("Static Method Called");
    }

    // Non-Static Method
    public void nonStaticMethod() {
        System.out.println("Non-Static Method Called");
    }

    // Non-Static Method
    public void testNonStaticAccess() {

        System.out.println("Inside Non-Static Method");

        // Non-Static -> Static
        System.out.println(companyName);
        staticMethod();

        // Non-Static -> Non-Static
        System.out.println(employeeName);
        nonStaticMethod();
    }

    // Static Method
    public static void testStaticAccess() {

        System.out.println("Inside Static Method");

        // Static -> Static
        System.out.println(companyName);
        staticMethod();

        /*
        // Static -> Non-Static (Compilation Error)

        System.out.println(employeeName);

        nonStaticMethod();
        */
    }

    public static void main(String[] args) {

        StaticNonstaticDemo obj =
                new StaticNonstaticDemo();

        obj.testNonStaticAccess();

        System.out.println("----------------");

        testStaticAccess();
    }
}