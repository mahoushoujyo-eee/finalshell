package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.LoginDialog;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

public class Y1 implements KeyListener {
   public final LoginDialog Q;
   public static long a;

   public Y1(LoginDialog var1) {
      this.Q = var1;
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
         Object var3 = 383322541628621626L;
         Ref.g(383322541628621626L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 335130564152588696L;
         Object[] var5 = var10002;
         Ref.h(335130564152588696L, var5, var6);

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
      long var0 = 4344079865247896734L;
      long var10002 = 4969939445899269268L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





