package com.finalshell.ui.listener;

import com.finalshell.core.Dv2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Dr2;
import com.finalshell.ui.panel.Address;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

public class BV implements KeyListener {
   final Address n;
   public static long a;

   BV(Address var1) {
      this.n = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      boolean var2 = Address.i();
      if (var1.getKeyCode() == (int)a) {
         Object var6 = 300671885637670350L;
         Ref.g(300671885637670350L, var6);
         Object var8 = 426888588741823559L;
         String var3 = ((Dv2)Ref.g(426888588741823559L, var8)).getText().trim();
         boolean var4 = false;

         label29: {
            while (var3.endsWith("/")) {
               var3 = var3.substring(0, var3.length() - 1);
               var4 = true;
               if (!var2) {
                  break label29;
               }

               if (!var2) {
                  break;
               }
            }

            if (var4) {
               Object var10 = 300671885637670350L;
               Ref.g(300671885637670350L, var10);
               Object var12 = 426888588741823559L;
               ((Dv2)Ref.g(426888588741823559L, var12)).setText(var3);
            }
         }

         Object var14 = 300671885637670350L;
         Ref.g(300671885637670350L, var14);
         Object var16 = 426888588741823559L;
         Dv2 var10004 = (Dv2)Ref.g(426888588741823559L, var16);
         Object var18 = 300671885637670350L;
         Object var10006 = Ref.g(300671885637670350L, var18);
         Object var20 = 426888588741823559L;
         ((Dv2)var10006).setCaretPosition(((Dv2)Ref.g(426888588741823559L, var20)).getDocument().getLength());
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10007 = Registry.packArgs(new Dr2(this, var3));
         long var23 = 434592463220957006L;
         Object[] var22 = var10007;
         Ref.h(434592463220957006L, var22, var23);

         try {
            ;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8841734958257816143L;
      long var10002 = -3849329549525630395L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





