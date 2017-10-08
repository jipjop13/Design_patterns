public class EncryptData {
    private EncryptionMethod method;

    public EncryptData(EncryptionMethod encryptionMethod) {
        this.method = encryptionMethod;
    }

    public void encrypt(String text){
        method.encrypt(text);
    }
}
