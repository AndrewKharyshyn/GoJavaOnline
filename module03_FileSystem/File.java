package module03_FileSystem;

/**
 * Created by Andrew on 28.05.2016.
 */
public class File {
    public String FileName;
    public String FileType;
    public int FileSize;

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public String getFileName() {
        return FileName;
    }

    public int getFileSize() {
        return FileSize;
    }

    public String getFileType() {
        return FileType;
    }
}
