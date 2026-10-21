package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.Connection5;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Mb2 implements Runnable {
   public final DefaultMutableTreeNode z;
   public final Connection5 k;

   public Mb2(Connection5 var1, DefaultMutableTreeNode var2) {
      this.k = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      Object var1 = 378334503934228454L;
      Connection5 var10001 = (Connection5)Ref.g(378334503934228454L, var1);
      TreePath var10002;
      Object var3 = 248562327588639967L;
      super(((DefaultMutableTreeNode)Ref.g(248562327588639967L, var3)).getPath());
      var10002.scrollPathToVisible(var10002);
   }
}





