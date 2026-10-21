package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.listener.OQ3;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.CL;
import com.finalshell.ui.panel.F8;
import java.lang.reflect.InvocationTargetException;

public class GO implements Runnable {
   public final F8 b;
   public final Ck4 v;
   public final MainFrame g;
   public final OQ3 p;

   public GO(OQ3 var1, F8 var2, Ck4 var3, MainFrame var4) {
      this.p = var1;
      this.b = var2;
      this.v = var3;
      this.g = var4;
   }

   @Override
   public void run() {
      String var1 = AA.z();
      if (var1 == null) {
         Object var3 = 290808397898617243L;
         if (Ref.g(290808397898617243L, var3) instanceof CL) {
            Object var5 = 290808397898617243L;
            CL var2 = (CL)Ref.g(290808397898617243L, var5);
            Object var7 = 508956589370960468L;
            Ref.g(508956589370960468L, var7);
            Object[] var10005 = Registry.emptyArgs();
            long var10 = 272998330038223631L;
            Object[] var9 = var10005;
            Ref.h(272998330038223631L, var9, var10);
            Object var11 = 325143752404869623L;
            Object[] var10006 = Registry.packArgs(this, Ref.g(325143752404869623L, var11));
            long var14 = 298666565248176577L;
            Object[] var13 = var10006;
            Ref.h(298666565248176577L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }
      }

      Object var15 = 325143752404869623L;
      Ref.g(325143752404869623L, var15);
      Object var17 = 508956589370960468L;
      Ref.g(508956589370960468L, var17);
      Object[] var10004 = Registry.emptyArgs();
      long var20 = 272998330038223631L;
      Object[] var19 = var10004;
      var10004 = Registry.packArgs(Ref.h(272998330038223631L, var19, var20), false);
      long var22 = 392275651608919501L;
      Object[] var21 = var10004;
      Ref.h(392275651608919501L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }
   }
}





