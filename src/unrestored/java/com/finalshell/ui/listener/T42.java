package com.finalshell.ui.listener;

import com.finalshell.core.LQ;
import com.finalshell.core.ZG_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class T42 implements ActionListener {
   public final SwitchTabCommand f;

   public T42(SwitchTabCommand var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var4 = 529030908603876050L;
      Ref.g(529030908603876050L, var4);
      Object var6 = 240160579628937511L;
      int var2 = ((LQ)Ref.g(240160579628937511L, var6)).getSelectedRow();
      if (var2 > -1) {
         Object var8 = 529030908603876050L;
         Ref.g(529030908603876050L, var8);
         Object var10 = 356807177375621845L;
         Ref.g(356807177375621845L, var10);
         ZG_2 var10005 = (ZG_2)(Registry.packArgs(var2));
         long var13 = 274266531369243862L;
         Object var12 = var10005;
         var10005 = Ref.h(274266531369243862L, var12, var13);

         try {
            var10005 = (ZG_2)var10005;
         } catch (InvocationTargetException var19) {
            throw new RuntimeException(var19.getTargetException());
         }

         ZG_2 var3 = var10005;
         Object var14 = 529030908603876050L;
         Ref.g(529030908603876050L, var14);
         Object[] var10007 = Registry.packArgs(var3);
         long var17 = 536313935565337962L;
         Object[] var16 = var10007;
         Ref.h(536313935565337962L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw new RuntimeException(var18.getTargetException());
         }
      }
   }
}





