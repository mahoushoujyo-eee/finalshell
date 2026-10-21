package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class rb_4 implements ActionListener {
   final _y_2 Q;

   rb_4(_y_2 var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var10000 = _y_2.y();
      com.DI var3 = this.Q.U.s().e();
      int var2 = var10000;
      com.DI var5 = var3;
      if (var2 == 0) {
         if (var3 == null) {
            return;
         }

         var5 = var3;
      }

      label37: {
         label27: {
            if (var2 == 0) {
               if (!var5.t()) {
                  break label27;
               }

               var5 = var3;
            }

            var5.G();
            if (var2 == 0) {
               break label37;
            }
         }

         U var6 = this.Q.kD;
         Object[] var10001 = com.c.a(this.Q.U);
         Method var10003 = com.c.d(185296114512803953L);
         Object[] var10002 = var10001;
         U var8 = var6;
         Method var7 = var10003;

         try {
            var7.invoke(var8, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }

      this.Q.M();
   }
}





