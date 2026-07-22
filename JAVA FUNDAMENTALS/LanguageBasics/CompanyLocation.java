public class CompanyLocation {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments: company name and location.");
            System.out.println("Example: java CompanyLocation Wipro Bangalore");
            return;
        }
        String company = args[0];
        String location = args[1];
        System.out.println(company + " Technologies " + location);
    }
}
