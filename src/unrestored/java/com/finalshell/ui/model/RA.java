package com.finalshell.ui.model;

import com.finalshell.core.AL_2;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public final class RA extends RK {
   public RA(String var1, int var2) {
      super(var1, var2, null);
   }

   @Override
   public List I() {
      return AL_2.e(FileSystemView.getFileSystemView().getRoots());
   }
}





