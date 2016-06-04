package module03_FileSystem;


import module02_part01.*;

import java.util.List;

public class Directory {
    public List<module02_part01.File> FileSpisok;

    public List getFile (List<module02_part01.File> FileSpisok) {
        return FileSpisok;
    }

    public void setFileSpisok(List<module02_part01.File> File) {
        this.FileSpisok = File;
    }

}
