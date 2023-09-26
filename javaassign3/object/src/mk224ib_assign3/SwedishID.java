package mk224ib_assign3;

public class SwedishID {
    private String id;
    private int checksum;
    private boolean valid;

    public SwedishID(String id) {
        this.id = id;
        this.valid = calculateChecksum();
    }

    public String showID() {
        return id;
    }

    public boolean isFemale() {
        char genderChar = id.charAt(10); // Get the character at index 10 (0-based)
        return genderChar % 2 == 0;
    }

    public int comparedTo(SwedishID otherID) {
        return id.compareTo(otherID.showID());
    }

    public boolean validID() {
        return valid;
    }

    private boolean calculateChecksum() {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(id.charAt(i));
            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }
        int calculatedChecksum = (10 - (sum % 10)) % 10;
        int providedChecksum = Character.getNumericValue(id.charAt(9));

        return calculatedChecksum == providedChecksum;

    }
}
