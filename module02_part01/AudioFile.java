package module02_part01;

/**
 * Created by Andrew on 28.05.2016.
 */
public class AudioFile extends File {
    private int BitRate;
    private int HzFrequency;
    private String CompressionRate;

    public int getBitRate() {
        return BitRate;
    }

    public int getHzFrequency() {
        return HzFrequency;
    }

    public String getCompressionRate() {
        return CompressionRate;
    }

    public void PlayFile() {
    }
}
