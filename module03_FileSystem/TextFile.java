package module03_FileSystem;

import module02_part01.*;

/**
 * Created by Andrew on 28.05.2016.
 */
public class TextFile extends module02_part01.File {
    private String Encoding;
    private int CharNumber;

    public String getEncoding() {
        return Encoding;
    }

    public int getCharNumber() {
        return CharNumber;
    }
}
