package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

public class Ym2 implements KeyListener {
   public final AppendCarriageReturnCRPanel O;
   public static long a;

   public Ym2(AppendCarriageReturnCRPanel var1) {
      this.O = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var19;
      int[] var2 = AppendCarriageReturnCRPanel.Y();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10002;
      Ref.h(306266403902896148L, var7, var8);
      Object var10003 = Registry.emptyArgs();
      long var10 = 257025344649675398L;
      Object var9 = var10003;
      var10003 = Ref.h(257025344649675398L, var9, var10);

      try {
         var18 = (Integer)var10003;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      if (var2 == null) {
         var18 = var18 == Registry.lookupField(616402908672951906L).getInt(null) ? 1 : 0;
      }

      int var3 = var18;
      int var4 = 0;
      var19 = var1.getKeyCode();
      label66:
      if (var2 == null) {
         label64:
         if (var19 == (int)a) {
            int var20 = var3;
            if (var2 == null) {
               if (var3 != 0) {
                  byte var21 = (byte)((var1.isControlDown()) ? 1 : 0);
                  if (var2 == null) {
                     if (var21 == 0) {
                        var19 = (var1.isMetaDown()) ? 1 : 0;
                        if (var2 != null) {
                           break label66;
                        }

                        if (var19 == 0) {
                           break label64;
                        }
                     }

                     var21 = 1;
                  }

                  var4 = var21;
                  if (var2 == null) {
                     break label64;
                  }
               }

               var20 = 1;
            }

            var4 = var20;
         }

         var19 = var4;
      }

      if (var19 != 0) {
         var1.consume();
         Object var11 = 295876503051881517L;
         Ref.g(295876503051881517L, var11);
         Object[] var10005 = Registry.emptyArgs();
         long var14 = 525165286654267194L;
         Object[] var13 = var10005;
         Ref.h(525165286654267194L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 786026515552509834L;
      long var10002 = 8956478253116923776L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
   private static Object var18;
}





