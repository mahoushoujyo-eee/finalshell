package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.beans.ConstructorProperties;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

public class VS extends AbstractBorder {
   public static Border n;
   public static Border e;
   protected int m;
   protected Color j;
   protected boolean t;

   public static Border z() {
      String var0 = Km2.U$String();
      Border var10000 = (Border)Registry.lookupField(333992247045906415L).get(null);
      if (var0 == null) {
         if (var10000 == null) {
            Registry.lookupField(333992247045906415L).set(null, new VS(Color.black, 1));
         }

         var10000 = (Border)Registry.lookupField(333992247045906415L).get(null);
      }

      return var10000;
   }

   public static Border i() {
      String var0 = Km2.U$String();
      Border var10000 = (Border)Registry.lookupField(375346943577876783L).get(null);
      if (var0 == null) {
         if (var10000 == null) {
            Registry.lookupField(375346943577876783L).set(null, new VS(Color.gray, 1));
         }

         var10000 = (Border)Registry.lookupField(375346943577876783L).get(null);
      }

      return var10000;
   }

   public VS(Color var1) {
      this(var1, 1, false);
   }

   public VS(Color var1, int var2) {
      this(var1, var2, false);
   }

   @ConstructorProperties({"lineColor", "thickness", "roundedCorners"})
   public VS(Color var1, int var2, boolean var3) {
      long var5 = 419689797620814599L;
      Ref.s(419689797620814599L, var1, var5);
      Registry.lookupField(176342309188219212L).setInt(this, var2);
      Registry.lookupField(359212022061030172L).setBoolean(this, var3);
   }

   @Override
   public void paintBorder(Component var1, Graphics var2, int var3, int var4, int var5, int var6) {
      Graphics var12;
      label24: {
         String var7 = Km2.U$String();
         int var10000 = Registry.lookupField(176342309188219212L).getInt(this);
         if (var7 == null) {
            if (var10000 <= 0) {
               return;
            }

            var12 = var2;
            if (var7 != null) {
               break label24;
            }

            var10000 = (var2 instanceof Graphics2D) ? 1 : 0;
         }

         if (var10000 == 0) {
            return;
         }

         var12 = var2;
      }

      Graphics2D var8 = (Graphics2D)var12;
      Color var9 = var8.getColor();
      Object var10 = 419689797620814599L;
      this.setColor((Color)Ref.g(419689797620814599L, var10));
      var8.drawRect(0, 0, var5 - 1, var6 - 1);
      var8.setColor(var9);
   }

   @Override
   public Insets getBorderInsets(Component var1, Insets var2) {
      var2.set(
         Registry.lookupField(176342309188219212L).getInt(this),
         Registry.lookupField(176342309188219212L).getInt(this),
         Registry.lookupField(176342309188219212L).getInt(this),
         Registry.lookupField(176342309188219212L).getInt(this)
      );
      return var2;
   }

   public Color getJ() {
      Object var1 = 419689797620814599L;
      return (Color)Ref.g(419689797620814599L, var1);
   }

   public int getM() {
      return Registry.lookupField(176342309188219212L).getInt(this);
   }

   public boolean getT() {
      return Registry.lookupField(359212022061030172L).getBoolean(this);
   }

   @Override
   public boolean isBorderOpaque() {
      String var1 = Km2.U$String();
      boolean var10000 = Registry.lookupField(359212022061030172L).getBoolean(this);
      if (var1 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }
}





