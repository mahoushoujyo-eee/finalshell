package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.KeyEventDispatcher;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.SwingUtilities;

public class Oz2 implements KeyEventDispatcher {
   public final PG_2 G;

   public Oz2(PG_2 var1) {
      this.G = var1;
   }

   @Override
   public boolean dispatchKeyEvent(KeyEvent var1) {
      Object var6 = 349843220842867282L;
      Ref.g(349843220842867282L, var6);
      Object[] var10002 = Registry.packArgs(var1);
      long var9 = 225144652801197158L;
      Object[] var8 = var10002;
      Ref.h(225144652801197158L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Window var3 = SwingUtilities.getWindowAncestor(var1.getComponent());
      ZG_2.Z();
      Object var10 = 349843220842867282L;
      Z var10004 = (Z)Ref.g(349843220842867282L, var10);
      Object var12 = 297544026394429738L;
      Iterator var4 = ((ArrayList)Ref.g(297544026394429738L, var12)).iterator();
      Object var2 = var10004;

      while (true) {
         if (var4.hasNext()) {
            label53: {
               Qh2 var5 = (Qh2)var4.next();
               var10004 = var5;
               if (var2 == null) {
                  Window var10005 = (Window)(Registry.emptyArgs());
                  long var15 = 466015795722654385L;
                  Object[] var14 = var10005;
                  var10005 = Ref.h(466015795722654385L, var14, var15);

                  try {
                     var10005 = (Window)var10005;
                  } catch (InvocationTargetException var18) {
                     throw var18.getTargetException();
                  }

                  boolean var24 = var10005.equals(var3);
                  if (var2 != null) {
                     break;
                  }

                  if (!var24) {
                     break label53;
                  }
               }

               Object[] var25 = Registry.packArgs(var1);
               long var17 = 554259894036820476L;
               Object[] var16 = var25;
               Ref.h(554259894036820476L, var16, var17);

               try {
                  ;
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         var10004 = false;
         break;
      }

      return (boolean)var10004;
   }
}





