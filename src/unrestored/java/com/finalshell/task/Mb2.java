package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ImportExportPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Mb2 implements Runnable {
   public final DefaultMutableTreeNode z;
   public final ImportExportPanel k;

   public Mb2(ImportExportPanel var1, DefaultMutableTreeNode var2) {
      this.k = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      Object var1 = 378334503934228454L;
      ImportExportPanel var10001 = (ImportExportPanel)Ref.g(378334503934228454L, var1);
      TreePath var10002;
      Object var3 = 248562327588639967L;
      // [VF-super] super(((DefaultMutableTreeNode)Ref.g(248562327588639967L, var3)).getPath());
      var10002.scrollPathToVisible(var10002);
   }
}





