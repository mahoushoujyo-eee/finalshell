package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.KQ;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;

public class B02 implements WindowFocusListener {
   final KQ u;

   B02(KQ var1) {
      this.u = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      com.finalshell.ui.panel.F8.y();
      Object var3 = 502105892341583135L;
      Registry.lookupField(174659894326967944L).setLong(Ref.g(502105892341583135L, var3), System.currentTimeMillis());
      Object var5 = 502105892341583135L;
      KQ var10002 = (KQ)Ref.g(502105892341583135L, var5);
      if (this == null) {
         Registry.packArgs(var10002);
         long var7 = 609548876769159921L;
         Object var10003 = Ref.h2(609548876769159921L, var7);

         try {
            var15 = (Boolean)var10003;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         if (var15) {
            return;
         }

         Object var9 = 502105892341583135L;
         KQ var10004 = (KQ)Ref.g(502105892341583135L, var9);
      }

      Object[] var16 = Registry.packArgs(false);
      long var12 = 438941361784812150L;
      Object[] var11 = var16;
      Ref.h(438941361784812150L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }
}





