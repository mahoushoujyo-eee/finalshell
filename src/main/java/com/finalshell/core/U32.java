package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class U32 implements Fb2 {
   public final com.finalshell.ui.dialog.AW l;

   public U32(com.finalshell.ui.dialog.AW var1) {
      this.l = var1;
   }

   @Override
   public void O(Ty4 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 542590257020999358L;
      Object[] var3 = var10001;
      var10001 = Ref.h(542590257020999358L, var3, var4);

      try {
         var14 = (Integer)var10001;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      int var2 = var14;
      if (var2 == Registry.lookupField(146259046198212012L).getInt(null)) {
         Object var5 = 309155166021927691L;
         Ref.g(309155166021927691L, var5);
         Object var7 = 281854482764394826L;
         JLabel var10003 = (JLabel)Ref.g(281854482764394826L, var7);
         String var10005 = (String)(Registry.emptyArgs());
         long var10 = 167932056536173107L;
         Object[] var9 = var10005;
         var10005 = Ref.h(167932056536173107L, var9, var10);

         try {
            var10005 = (String)var10005;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var1.setText(var10005);
      }
   }
}





