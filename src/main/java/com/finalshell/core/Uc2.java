package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;

public class Uc2 {
   BufferedImage K;
   BufferedImage u;
   HashMap N;
   HashMap t;
   HashMap s;
   HashMap T;
   HashSet X;
   int F;
   int U;

   public Uc2() {
      HashMap var10001 = new HashMap();
      long var2 = 245071723849229959L;
      HashMap var1 = var10001;
      Ref.s(245071723849229959L, var1, var2);
      HashMap var10002 = new HashMap();
      long var4 = 139412945941179877L;
      HashMap var3 = var10002;
      Ref.s(139412945941179877L, var3, var4);
      HashMap var10003 = new HashMap();
      long var6 = 279324076707364922L;
      HashMap var5 = var10003;
      Ref.s(279324076707364922L, var5, var6);
      HashMap var10004 = new HashMap();
      long var8 = 137749546150850589L;
      HashMap var7 = var10004;
      Ref.s(137749546150850589L, var7, var8);
      HashSet var10005 = new HashSet();
      long var10 = 236986923043582334L;
      HashSet var9 = var10005;
      Ref.s(236986923043582334L, var9, var10);
   }

   public void q() {
      Object[] var10001 = Registry.emptyArgs();
      long var16 = 514459637192101058L;
      Object[] var15 = var10001;
      Ref.h(514459637192101058L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      BufferedImage var2;
      BufferedImage var3;
      RenderingHints var4;
      int var9;
      int var10;
      int var30;
      int var31;
      label29: {
         var2 = ConnectionProperty.z;
         var3 = ConnectionProperty.Y;
         var4 = ConnectionProperty.n;
         int var5 = var2.getWidth();
         int var6 = var2.getHeight();
         String[] var32 = com.finalshell.ui.panel.F8.y();
         float var7 = (float)var5 / (float)var6;
         String[] var1 = var32;
         float var8 = (float)Registry.lookupField(331345675446116425L).getInt(this) / (float)Registry.lookupField(224601074955414455L).getInt(this);
         boolean var11 = false;
         boolean var12 = false;
         float var34;
         int var33 = (var34 = var7 - var8) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
         if (var1 == null) {
            if (var33 > 0) {
               var10 = Registry.lookupField(224601074955414455L).getInt(this);
               var9 = (int)(var7 * (float)Registry.lookupField(224601074955414455L).getInt(this));
               var30 = -(var9 - Registry.lookupField(331345675446116425L).getInt(this)) / 2;
               var31 = 0;
               if (var1 == null) {
                  break label29;
               }
            }

            var33 = Registry.lookupField(331345675446116425L).getInt(this);
         }

         var9 = var33;
         var10 = (int)((float)Registry.lookupField(331345675446116425L).getInt(this) / var7);
         var31 = -(var10 - Registry.lookupField(224601074955414455L).getInt(this)) / 2;
         var30 = 0;
      }

      Registry.packArgs(Registry.lookupField(331345675446116425L).getInt(this), Registry.lookupField(224601074955414455L).getInt(this));
      long var17 = 401056956354921780L;
      Object var10003 = Ref.h2(401056956354921780L, var17);
      long var20 = 397735871884542340L;
      Object var19 = var10003;
      Ref.s(397735871884542340L, var19, var20);
      Object var21 = 397735871884542340L;
      Graphics2D var13 = (Graphics2D)((BufferedImage)Ref.g(397735871884542340L, var21)).getGraphics();
      var13.setRenderingHints(var4);
      var13.drawImage(var3, var30, var31, var9, var10, null);
      var13.dispose();
      Registry.packArgs(Registry.lookupField(331345675446116425L).getInt(this), Registry.lookupField(224601074955414455L).getInt(this));
      long var23 = 401056956354921780L;
      Object var10006 = Ref.h2(401056956354921780L, var23);
      long var26 = 413300341277906215L;
      Object var25 = var10006;
      Ref.s(413300341277906215L, var25, var26);
      Object var27 = 413300341277906215L;
      Graphics2D var14 = (Graphics2D)((BufferedImage)Ref.g(413300341277906215L, var27)).getGraphics();
      var14.setRenderingHints(var4);
      var14.drawImage(var2, var30, var31, var9, var10, null);
      var14.dispose();
   }

   public void E() {
      label23: {
         com.finalshell.ui.panel.F8.y();
         Object var2 = 245071723849229959L;
         ((HashMap)Ref.g(245071723849229959L, var2)).clear();
         Object var4 = 139412945941179877L;
         ((HashMap)Ref.g(139412945941179877L, var4)).clear();
         Object var6 = 279324076707364922L;
         ((HashMap)Ref.g(279324076707364922L, var6)).clear();
         Object var8 = 137749546150850589L;
         ((HashMap)Ref.g(137749546150850589L, var8)).clear();
         Object var10 = 397735871884542340L;
         Object var10005 = (BufferedImage)Ref.g(397735871884542340L, var10);
         if (this == null) {
            if (var10005 != null) {
               Object var12 = 397735871884542340L;
               ((BufferedImage)Ref.g(397735871884542340L, var12)).getGraphics().dispose();
            }

            var10005 = this;
            if (this != null) {
               break label23;
            }

            Object var14 = 413300341277906215L;
            BufferedImage var10006 = (BufferedImage)Ref.g(413300341277906215L, var14);
         }

         if (var10005 != null) {
            Object var16 = 413300341277906215L;
            ((BufferedImage)Ref.g(413300341277906215L, var16)).getGraphics().dispose();
         }

         long var19 = 397735871884542340L;
         Object var18 = null;
         Ref.s(397735871884542340L, var18, var19);
      }

      long var21 = 413300341277906215L;
      Object var20 = null;
      Ref.s(413300341277906215L, var20, var21);
   }

   public void a() {
      Object var1 = 236986923043582334L;
      ((HashSet)Ref.g(236986923043582334L, var1)).clear();
   }

   public void T(int var1) {
      Object var2 = 236986923043582334L;
      ((HashSet)Ref.g(236986923043582334L, var2)).add(var1);
   }

   public void P(int var1) {
      Object var2 = 236986923043582334L;
      ((HashSet)Ref.g(236986923043582334L, var2)).remove(var1);
   }

   public int M() {
      Object var1 = 236986923043582334L;
      return ((HashSet)Ref.g(236986923043582334L, var1)).size();
   }

   public BufferedImage V() {
      Object var1 = 397735871884542340L;
      return (BufferedImage)Ref.g(397735871884542340L, var1);
   }

   public void D(BufferedImage var1) {
      long var3 = 397735871884542340L;
      Ref.s(397735871884542340L, var1, var3);
   }

   public BufferedImage D() {
      Object var1 = 413300341277906215L;
      return (BufferedImage)Ref.g(413300341277906215L, var1);
   }

   public void s(BufferedImage var1) {
      long var3 = 413300341277906215L;
      Ref.s(413300341277906215L, var1, var3);
   }

   public HashMap S() {
      Object var1 = 245071723849229959L;
      return (HashMap)Ref.g(245071723849229959L, var1);
   }

   public HashMap g() {
      Object var1 = 139412945941179877L;
      return (HashMap)Ref.g(139412945941179877L, var1);
   }

   public HashMap u() {
      Object var1 = 279324076707364922L;
      return (HashMap)Ref.g(279324076707364922L, var1);
   }

   public HashMap o() {
      Object var1 = 137749546150850589L;
      return (HashMap)Ref.g(137749546150850589L, var1);
   }
}





