public class UserRegistration {

    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        String[][] users = { { "Mickey", "US" }, { "Mini", "India" } };

        for (String[] user : users) {
            System.out.println("Registering " + user[0] + " from " + user[1] + " ...");
            try {
                registration.registerUser(user[0], user[1]);
            } catch (InvalidCountryException e) {
                System.out.println("Registration failed: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
