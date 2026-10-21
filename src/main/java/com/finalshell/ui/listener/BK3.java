package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class BK3 implements ActionListener {
   public final com.finalshell.ui.frame.U I;
   public static long a;

   public BK3(com.finalshell.ui.frame.U var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.panel.F8.y();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      com.finalshell.ui.dialog.C5 var10002 = (com.finalshell.ui.dialog.C5)Ref.h2(270389152141252877L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 284609497308396758L;
      Object[] var7 = var10003;
      Ref.h(284609497308396758L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      label43: {
         Object var2 = var10002;
         var10002 = (com.finalshell.ui.dialog.C5)Registry.lookupField(222367947831078517L).get(null);
         if (var2 == null) {
            if (!var10002.isVisible()) {
               break label43;
            }

            var10002 = (com.finalshell.ui.dialog.C5)Registry.lookupField(222367947831078517L).get(null);
         }

         var10002.setVisible(false);
         if (var2 == null) {
            return;
         }
      }

      System.currentTimeMillis();
      var10003 = (Object[])Registry.lookupField(222367947831078517L).get(null);
      Object[] var10004 = Registry.emptyArgs();
      long var10 = 134055940149281481L;
      Object[] var9 = var10004;
      var10004 = Ref.h(134055940149281481L, var9, var10);

      try {
         var21 = (Long)var10004;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      long var3 = var10003 - var21;
      if (var3 > a) {
         Object var11 = 220616095453048644L;
         Ref.g(220616095453048644L, var11);
         Object[] var10005 = Registry.emptyArgs();
         long var14 = 402347743199818669L;
         Object[] var13 = var10005;
         Ref.h(402347743199818669L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7221976951569528976L;
      long var10002 = 7221976951569528938L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





