package com.finalshell.task;

import com.finalshell.core.Yo4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportExportPanel;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class CW3 implements Runnable {
   public final ImportExportPanel Y;

   public CW3(ImportExportPanel var1) {
      this.Y = var1;
   }

   @Override
   public void run() {
      Object var1 = 376877632371517990L;
      Ref.g(376877632371517990L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 574561945876230577L;
      Object[] var3 = var10002;
      Ref.h(574561945876230577L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object var5 = 376877632371517990L;
      Ref.g(376877632371517990L, var5);
      Object var7 = 571388131590801605L;
      Yo4 var10004 = (Yo4)Ref.g(571388131590801605L, var7);
      Object var9 = 376877632371517990L;
      Object var10006 = Ref.g(376877632371517990L, var9);
      Object var11 = 312919167011526763L;
      ((Yo4)var10006).nodeStructureChanged((DefaultMutableTreeNode)Ref.g(312919167011526763L, var11));
      Object var13 = 376877632371517990L;
      Registry.packArgs(Ref.g(376877632371517990L, var13));
      long var15 = 425714381873688660L;
      Ref.h2(425714381873688660L, var15);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }
}





