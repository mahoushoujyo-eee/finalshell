package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

public class Dw2 implements KeyListener {
   public final com.finalshell.core.Km2 d;

   public Dw2(com.finalshell.core.Km2 var1) {
      this.d = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      Object var2 = 615963704623067593L;
      Ref.g(615963704623067593L, var2);
      Object var4 = 331468898228971516L;
      Ref.g(331468898228971516L, var4);
      Object[] var10003 = Registry.packArgs(var1);
      long var7 = 161648209246737663L;
      Object[] var6 = var10003;
      Ref.h(161648209246737663L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





