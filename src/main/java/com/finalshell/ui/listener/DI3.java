package com.finalshell.ui.listener;

import com.finalshell.core.Ty2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Refresh;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class DI3 implements ActionListener {
   final Ty2 f;
   final Refresh h;

   DI3(Refresh var1, Ty2 var2) {
      this.h = var1;
      this.f = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = Refresh.K();
      if (var2 != null) {
         Object var3 = 355739198731336221L;
         Ref.g(355739198731336221L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 121632250293569146L;
         Object[] var5 = var10002;
         Ref.h(121632250293569146L, var5, var6);
         Object[] var10003 = Registry.emptyArgs();
         long var8 = 209547680018014679L;
         Object[] var7 = var10003;
         var10003 = Ref.h(209547680018014679L, var7, var8);

         try {
            var20 = (Long)var10003;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         if (var20 <= 0L) {
            return;
         }
      }

      Object var9 = 506915673809516939L;
      Ref.g(506915673809516939L, var9);
      Object var11 = 355739198731336221L;
      Ref.g(355739198731336221L, var11);
      Object[] var10004 = Registry.emptyArgs();
      long var14 = 121632250293569146L;
      Object[] var13 = var10004;
      var10004 = Registry.packArgs(Ref.h(121632250293569146L, var13, var14));
      long var16 = 540897424776196125L;
      Object[] var15 = var10004;
      Ref.h(540897424776196125L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }
}





