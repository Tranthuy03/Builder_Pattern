import java.io.FileWriter;
import java.io.IOException;

class NormalDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void setExtension() { 
        this.extension = ".txt"; 
    }

    @Override
    public void setEncryption() { 
        this.encryption = "None"; 
    }

    @Override
    public void saveToFile(String content) throws IOException {
        String fileName = "document" + extension;
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Saved Normal Document: " + fileName);
        }
    }
}
