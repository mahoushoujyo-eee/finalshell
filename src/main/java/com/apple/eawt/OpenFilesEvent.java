package com.apple.eawt;

import java.io.File;
import java.util.List;

public class OpenFilesEvent extends FilesEvent {
   OpenFilesEvent(List<File> files, String s) {
      super(files);
   }

   public String getSearchTerm() {
      return null;
   }
}





