package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;

public class Dv2 extends Ne4 {
   ClearListDialog N;
   public static long a;

   public Dv2() {
      Object[] var10001 = Registry.packArgs(Registry.lookupField(395970988011231853L).get(null));
      long var2 = 450901685535284362L;
      Object[] var1 = var10001;
      Ref.h(450901685535284362L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      this.h(0);
   }

   @Override
   public void setFont(Font var1) {
      String[] var2 = ClearListDialog.i$arrString();
      if (var2 == null) {
         if (var1.getSize() == (int)a) {
            new Exception().printStackTrace();
         }

         super.setFont(var1);
      }
   }

   @Override
   public Font getFont() {
      return super.getFont();
   }

   public ClearListDialog u() {
      Object var1 = 478553490735199209L;
      return (ClearListDialog)Ref.g(478553490735199209L, var1);
   }

   public void A(ClearListDialog var1) {
      long var3 = 478553490735199209L;
      Ref.s(478553490735199209L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5245860697566201968L;
      long var10002 = 8015606882517239933L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





