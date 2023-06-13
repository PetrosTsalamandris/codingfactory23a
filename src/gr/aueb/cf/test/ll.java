package gr.aueb.cf.test;

public class ll {
    public static void main(String[] args) {
        class Encryption {
            public static String encrypt(String text) {
                StringBuilder encryptedText = new StringBuilder();

                for (int i = 0; i < text.length(); i++) {
                    char currentChar = text.charAt(i);
                    char encryptedChar = (char) (currentChar + 1);
                    encryptedText.append(encryptedChar);
                }

                return encryptedText.toString();
            }

            public static void main(String[] args) {
                String text = "Hello World!";
                String encryptedText = encrypt(text);
                System.out.println("Encrypted Text: " + encryptedText);
            }
        }

    }
}
