package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection5;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class OE implements Runnable {
   public final DefaultMutableTreeNode n;
   public final Connection5 t;

   public OE(Connection5 var1, DefaultMutableTreeNode var2) {
      this.t = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      Object var1 = 326519614582835010L;
      Ref.g(326519614582835010L, var1);
      Object var3 = 499259076160994603L;
      Object[] var10003 = Registry.packArgs(Ref.g(499259076160994603L, var3));
      long var6 = 276002133797788160L;
      Object[] var5 = var10003;
      Ref.h(276002133797788160L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





