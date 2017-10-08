public class EncryptAES implements EncryptionMethod {
    @Override
    public void encrypt(String unencryptedString) {
        System.out.println(unencryptedString + " is encrypted with AES");
    }
}
