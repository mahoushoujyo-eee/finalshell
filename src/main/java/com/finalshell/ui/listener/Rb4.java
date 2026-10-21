package com.finalshell.ui.listener;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Rb4 implements ActionListener {
   final ConnectionProperty Q;

   Rb4(ConnectionProperty var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var10000 = ConnectionProperty.y();
      ConnectHost var3 = this.Q.U.s$Fv_2().e();
      int var2 = var10000;
      ConnectHost var7 = var3;
      if (var2 == 0) {
         if (var3 == null) {
            return;
         }

         var7 = var3;
      }

      label37: {
         label27: {
            if (var2 == 0) {
               if (!var7.t$boolean()) {
                  break label27;
               }

               var7 = var3;
            }

            var7.G();
            if (var2 == 0) {
               break label37;
            }
         }

         Object[] var10001 = Registry.packArgs(this.Q.U);
         long var5 = 185296114512803953L;
         Object[] var4 = var10001;
         Ref.h(185296114512803953L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }

      this.Q.M$void();
   }
}





