package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;

public class Bu4 implements Runnable {
   public final boolean i;
   public final ConnectionInfoPanel r;
   public static long a;

   public Bu4(ConnectionInfoPanel var1, boolean var2) {
      this.r = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      ConnectionInfoPanel.I();
      Object var6 = 481550355343873241L;
      Object var10002 = Ref.g(481550355343873241L, var6);
      Rectangle var10003 = (Rectangle)(Registry.emptyArgs());
      long var9 = 519181782535843793L;
      Object var8 = var10003;
      var10003 = Ref.h(519181782535843793L, var8, var9);

      try {
         var10003 = (Rectangle)var10003;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Rectangle var2 = var10003;
      Object var1 = var10002;
      Object var10 = 481550355343873241L;
      Rectangle var3 = ((ConnectionInfoPanel)Ref.g(481550355343873241L, var10)).getBounds();
      Object var12 = 481550355343873241L;
      Object var10004 = ((ConnectionInfoPanel)Ref.g(481550355343873241L, var12)).getParent();
      if (var1 != null) {
         if (var10004 == null) {
            return;
         }

         var10004 = this;
         Object var14 = 481550355343873241L;
         ((ConnectionInfoPanel)Ref.g(481550355343873241L, var14)).getParent();
      }

      label48: {
         Rectangle var4 = var10004.getBounds();
         int var5 = (int)a;
         Rectangle var21 = var4;
         if (var1 != null) {
            if (var4 == null) {
               break label48;
            }

            var21 = var2;
         }

         if (var1 != null) {
            if (var21 == null) {
               break label48;
            }

            var21 = var4;
         }

         if (var21.height - var2.y < var5) {
         }
      }

      if (Registry.lookupField(234151530419687938L).getBoolean(this) && var2 != null) {
         Object var16 = 481550355343873241L;
         ((ConnectionInfoPanel)Ref.g(481550355343873241L, var16)).scrollRectToVisible(var2);
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7446380712253550142L;
      long var10002 = -2700192281428660616L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





