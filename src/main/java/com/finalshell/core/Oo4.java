package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class Oo4 implements Fb2 {
   final com.finalshell.ui.dialog.DU C;

   Oo4(com.finalshell.ui.dialog.DU var1) {
      this.C = var1;
   }

   @Override
   public void O(Ty4 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var5 = 542590257020999358L;
      Object[] var4 = var10001;
      var10001 = Ref.h(542590257020999358L, var4, var5);

      try {
         var18 = (Integer)var10001;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      int var2 = var18;
      if (var2 == Registry.lookupField(146259046198212012L).getInt(null)) {
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 167932056536173107L;
         Object[] var6 = var10002;
         Ref.h(167932056536173107L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         Object var8 = 241100921967448220L;
         Ref.g(241100921967448220L, var8);
         Object var10 = 550961635451839925L;
         JLabel var10004 = (JLabel)Ref.g(550961635451839925L, var10);
         String var10006 = (String)(Registry.emptyArgs());
         long var13 = 167932056536173107L;
         Object[] var12 = var10006;
         var10006 = Ref.h(167932056536173107L, var12, var13);

         try {
            var10006 = (String)var10006;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         var1.setText(var10006);
      }
   }
}





