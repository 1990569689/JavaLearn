public class A {
    /**
     * @param args
     */
    // switch的二种方法的运用
    public static void main(String[] args) {

        GetSwitch("hh");
        GetSwitch2("hh");
    }

    public static void GetSwitch(String result) {
        switch (result) {
            case "user":
                System.out.println("user");
                break;
            case "pass":

                System.out.println("pass");
                break;
            case "mail":
                System.out.println("mail");
                break;
            default:
                System.out.println("why");
                break;

        }

    }

    public static void GetSwitch2(String result) {
        switch (result) {
            case "user" -> {
                System.out.println("user");
                break;
            }
            case "pass" -> {
                System.out.println("pass");
                break;
            }
            default -> {
                System.out.println("why");
                break;
            }

        }

    }

}
