package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class X62 extends WindowAdapter {
   public final com.finalshell.ui.frame.U J;

   public X62(com.finalshell.ui.frame.U var1) {
      this.J = var1;
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      super.windowActivated(var1);
      Object var2 = 450503380664452479L;
      Ref.g(450503380664452479L, var2);
      Object var4 = 493158471773442262L;
      Ref.g(493158471773442262L, var4);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var7 = 230171768324088030L;
      Object[] var6 = var10003;
      var10003 = Ref.h(230171768324088030L, var6, var7);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      if (var10003.size() > 0) {
         Registry.emptyArgs();
         long var8 = 270389152141252877L;
         Ref.h2(270389152141252877L, var8);
         Object[] var10005 = Registry.emptyArgs();
         long var11 = 284609497308396758L;
         Object[] var10 = var10005;
         Ref.h(284609497308396758L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
      }
   }

   @Override
   public void windowDeactivated(WindowEvent var1) {
      super.windowDeactivated(var1);
   }

   @Override
   public void windowIconified(WindowEvent var1) {
      super.windowIconified(var1);
   }
}





