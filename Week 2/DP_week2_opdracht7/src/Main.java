public class Main {
    public static void main(String[] args) {
        EncryptData aesEncryption = new EncryptData(new EncryptAES());
        aesEncryption.encrypt("randomText");

        EncryptData desEncryption = new EncryptData(new EncryptDES());
        desEncryption.encrypt("randomText");

        EncryptData rsaEncryption = new EncryptData(new EncryptRSA());
        rsaEncryption.encrypt("randomText");

    }
}
