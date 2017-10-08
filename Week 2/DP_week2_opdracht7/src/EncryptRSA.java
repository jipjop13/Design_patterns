public class EncryptRSA implements EncryptionMethod {
    @Override
    public void encrypt(String unencryptedString) {
        System.out.println(unencryptedString + " is encrypted with RSA");
    }
}
