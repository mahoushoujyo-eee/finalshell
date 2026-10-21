package com.finalshell.task;

import com.finalshell.core.TM;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection5;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class XL implements Runnable {
   final DefaultMutableTreeNode q;
   final TM T;

   XL(TM var1, DefaultMutableTreeNode var2) {
      this.T = var1;
      this.q = var2;
   }

   @Override
   public void run() {
      Object var1 = 431359221943885318L;
      Ref.g(431359221943885318L, var1);
      Object var3 = 123645524365861271L;
      Ref.g(123645524365861271L, var3);
      Object var5 = 593306439561595691L;
      Connection5 var10003 = (Connection5)Ref.g(593306439561595691L, var5);
      Object var7 = 431359221943885318L;
      Ref.g(431359221943885318L, var7);
      Object var9 = 123645524365861271L;
      Ref.g(123645524365861271L, var9);
      Object var11 = 593306439561595691L;
      Ref.g(593306439561595691L, var11);
      Object var13 = 150670608442302480L;
      TreePath var10009 = (TreePath)(Registry.packArgs(Ref.g(150670608442302480L, var13)));
      long var16 = 263865946362642439L;
      Object[] var15 = var10009;
      var10009 = Ref.h(263865946362642439L, var15, var16);

      try {
         var10009 = (TreePath)var10009;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      this.setSelectionPath(var10009);
   }
}





