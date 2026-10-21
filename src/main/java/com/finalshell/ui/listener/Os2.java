package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Os2 implements ActionListener {
   final ImportPanel x;

   Os2(ImportPanel var1) {
      this.x = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 587689868050151523L;
      Ref.g(587689868050151523L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 457204009113929650L;
      Object[] var5 = var10002;
      var10002 = Ref.h(457204009113929650L, var5, var6);

      try {
         var10002 = (com.finalshell.core.LN3)var10002;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      com.finalshell.core.LN3 var2 = var10002;
      if (var2 != null) {
         Object var7 = 587689868050151523L;
         Ref.g(587689868050151523L, var7);
         Object[] var10004 = Registry.packArgs(var2);
         long var10 = 306838697711798482L;
         Object[] var9 = var10004;
         Ref.h(306838697711798482L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }
   }
}





