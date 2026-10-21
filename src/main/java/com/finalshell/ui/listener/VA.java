package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.PasswordDialog;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

public class VA implements KeyListener {
   public final PasswordDialog z;
   public static long a;

   public VA(PasswordDialog var1) {
      this.z = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 == (int)a) {
         Object var3 = 406797138190014770L;
         Ref.g(406797138190014770L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 506035368637771784L;
         Object[] var5 = var10002;
         Ref.h(506035368637771784L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 817576603889992812L;
      long var10002 = 5874228539922351206L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





