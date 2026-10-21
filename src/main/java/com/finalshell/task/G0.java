package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection5;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;

public class G0 implements Runnable {
   public final String u;
   public final Connection5 n;

   public G0(Connection5 var1, String var2) {
      this.n = var1;
      this.u = var2;
   }

   @Override
   public void run() {
      Object var2 = 160513236134927191L;
      Ref.g(160513236134927191L, var2);
      Object var4 = 604074053920059872L;
      HashMap var10002 = (HashMap)Ref.g(604074053920059872L, var4);
      Object var6 = 414267653523382186L;
      DefaultMutableTreeNode var1 = (DefaultMutableTreeNode)this.get((String)Ref.g(414267653523382186L, var6));
      Object var8 = 160513236134927191L;
      Ref.g(160513236134927191L, var8);
      Object[] var10005 = Registry.packArgs(var1);
      long var11 = 276002133797788160L;
      Object[] var10 = var10005;
      Ref.h(276002133797788160L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }
}





