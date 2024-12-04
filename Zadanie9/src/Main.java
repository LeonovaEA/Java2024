public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        userManager.addUser("john_doe", "john.doe@example.com");
        userManager.addUser("jane_smith", "jane.smith@example.com");
        userManager.startSession("john_doe");
        userManager.startSession("jane_smith");
        System.out.println(userManager.getSession("john_doe"));
        System.out.println(userManager.getSession("jane_smith"));
        userManager.endSession("john_doe");
        userManager.endSession("jane_smith");
        System.out.println(userManager.getSession("john_doe"));
        System.out.println(userManager.getSession("jane_smith"));
    }
}
