package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Kb2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class QN implements ActionListener {
   public final Kb2 B;

   public QN(Kb2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Object var3 = 191575800978898401L;
         Ref.g(191575800978898401L, var3);
         Object var5 = 191575800978898401L;
         Ref.g(191575800978898401L, var5);
         Object var7 = 473641348993414305L;
         Object[] var10004 = Registry.packArgs(Ref.g(473641348993414305L, var7), true);
         long var10 = 235982160539264686L;
         Object[] var9 = var10004;
         Ref.h(235982160539264686L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }
   }
}





