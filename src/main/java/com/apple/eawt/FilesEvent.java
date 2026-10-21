package com.apple.eawt;

import java.io.File;
import java.util.List;

public abstract class FilesEvent extends AppEvent {
   public FilesEvent(List<File> files) {
   }

   public List<File> getFiles() {
      return null;
   }
}





