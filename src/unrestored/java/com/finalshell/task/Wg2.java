package com.finalshell.task;

import com.finalshell.core.RemoteProcessManager;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.F8;
import java.lang.reflect.InvocationTargetException;

public class Wg2 implements Runnable {
   public final ConnectionProperty C;
   public final MainFrame h;

   public Wg2(MainFrame var1, ConnectionProperty var2) {
      this.h = var1;
      this.C = var2;
   }

   @Override
   public void run() {
      F8.y();
      Object var4 = 249265836943574937L;
      RemoteProcessManager var2 = ((ConnectionProperty)Ref.g(249265836943574937L, var4)).M$Ty_2();
      RemoteProcessManager var10001 = var2;
      if (this == null) {
         if (var2 != null) {
            Object[] var10002 = Registry.emptyArgs();
            long var7 = 211078057503611761L;
            Object[] var6 = var10002;
            Ref.h(211078057503611761L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var15) {
               throw new RuntimeException(var15.getTargetException());
            }
         }

         var10001 = null;
         Object var8 = 249265836943574937L;
         // [VF-super] super((ConnectionProperty)Ref.g(249265836943574937L, var8));
      }

      RemoteProcessManager var3 = var10001;
      Object var10 = 249265836943574937L;
      ((ConnectionProperty)Ref.g(249265836943574937L, var10)).V(var3);
      Object[] var10003 = Registry.emptyArgs();
      long var13 = 148323203103408090L;
      Object[] var12 = var10003;
      Ref.h(148323203103408090L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw new RuntimeException(var14.getTargetException());
      }
   }
}





