package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.panel.CL;
import com.finalshell.ui.panel.F8;
import java.lang.reflect.InvocationTargetException;

public class Mz2 implements Runnable {
   public final MainFrame N;

   public Mz2(MainFrame var1) {
      this.N = var1;
   }

   @Override
   public void run() {
      Object var2 = 144829688074724944L;
      Ref.g(144829688074724944L, var2);
      Object var4 = 493158471773442262L;
      Ref.g(493158471773442262L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 194560825135347400L;
      Object[] var6 = var10003;
      Ref.h(194560825135347400L, var6, var7);
      F8 var10004 = (F8)(Registry.emptyArgs());
      long var9 = 424156930953488367L;
      Object var8 = var10004;
      var10004 = Ref.h(424156930953488367L, var8, var9);

      try {
         var10004 = (F8)var10004;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      F8 var1 = var10004;
      if (var1.getClass().equals(CL.class)) {
         Object var10 = 144829688074724944L;
         Ref.g(144829688074724944L, var10);
         Object[] var10006 = Registry.emptyArgs();
         long var13 = 449998053918244409L;
         Object[] var12 = var10006;
         Ref.h(449998053918244409L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }
      }
   }
}





