package com.codeclan.file.filemanager.models;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class folder {

  private String title;
  private List<File> files;

    public folder(String title,) {
        this.title = title;
        this.files = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
