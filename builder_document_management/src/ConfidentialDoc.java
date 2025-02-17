import java.io.FileOutputStream;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class ConfidentialDoc implements Document {
    private String extension;
    private String encryption;
    private SecretKey secretKey;

    @Override
    public void setExtension() { 
        this.extension = ".zip"; 
    }

    @Override
    public void setEncryption() { 
        this.encryption = "AES Encryption";
        try {
            this.secretKey = generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }

    private String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    @Override
    public void saveToFile(String content) throws Exception {
        String encryptedContent = encrypt(content);
        try (FileOutputStream fos = new FileOutputStream("document" + extension)) {
            fos.write(encryptedContent.getBytes());
            System.out.println("Saved Confidential Document: document" + extension);
        }
    }
}
