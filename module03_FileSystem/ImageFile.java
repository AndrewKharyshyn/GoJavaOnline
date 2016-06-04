package module03_FileSystem;

import module02_part01.*;

/**
 * Created by Andrew on 28.05.2016.
 */
public class ImageFile extends module02_part01.File {
    public int FileResolution;
    public String ColorScheme;
    public boolean IsColored;

    public void setFileResolution(int FileResolution)
    {
        this.FileResolution = FileResolution;
    }

    public void setColorScheme(String ColorScheme) {
       this.ColorScheme = ColorScheme;
    }

    public int getFileResolution() {
        return FileResolution;
    }

    public String getColorScheme() {
        return ColorScheme;
    }

    public boolean getIsColored() {
        return IsColored;
    }

    public void CreateImage() {
    }
}
