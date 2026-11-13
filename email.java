
import java.util.Scanner;

public class email {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student email address: ");
        String email = sc.nextLine();

        // 1. Find length
        System.out.println("Length: " + email.length());

        // 2. Extract username
        int pos = email.indexOf('@');
        String username = email.substring(0, pos);
        System.out.println("Username: " + username);

        // 3. Extract domain and compare
        String domain = email.substring(pos + 1);
        System.out.println("Domain: " + domain);

        if (domain.equalsIgnoreCase("bmsce.ac.in")) {
            System.out.println("Belongs to BMSCE institution");
        } else {
            System.out.println("Does not belong to BMSCE institution");
        }

        // 4. Convert to lowercase
        String lower = email.toLowerCase();
        System.out.println("Lowercase Email: " + lower);

        // 5. Check starting prefix
        System.out.print("Enter registration number prefix: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix)) {
            System.out.println("Email starts with the given prefix");
        } else {
            System.out.println("Email does not start with the given prefix");
        }

        // 6. Check ending domain
        if (email.toLowerCase().endsWith("bmsce.ac.in")) {
            System.out.println("Email ends with valid domain");
        } else {
            System.out.println("Email does not end with valid domain");
        }

        // 7. Replace domain
        String updated = lower.replace(
            "bmsce.ac.in", "cse.bmsce.ac.in"
        );
        System.out.println("Updated Email: " + updated);

        // 8. Check character or sequence
        System.out.print("Enter sequence to search: ");
        String sequence = sc.nextLine();

        if (email.contains(sequence)) {
            System.out.println("Email contains " + sequence);
        } else {
            System.out.println("Email does not contain " + sequence);
        }

        // 9. Remove leading and trailing spaces
        String trimmed = email.trim();
        System.out.println("Trimmed Email: " + trimmed);

        // 10. Compare two email addresses
        System.out.print("Enter another email address: ");
        String email2 = sc.nextLine();

        if (trimmed.equalsIgnoreCase(email2.trim())) {
            System.out.println("Both email addresses are identical");
        } else {
            System.out.println("Email addresses are different");
        }

        sc.close();
    }
}
