package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class DN extends Ne4 {
   public BufferedImage I;
   public static Map D;
   public static long[] a;
   public static Integer[] b;

   public DN() {
      this(a(14808, 3943790025191899887L));
   }

   public DN(int var1) {
      super(var1);
      long var4 = 329170386049535157L;
      Object var3 = null;
      Ref.s(329170386049535157L, var3, var4);
      this.L(false);
      this.c(false);
      KS var2 = new KS(3, a(14435, 4717495035907064661L), 3, 3);
      this.setBorder(var2);
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object var10004 = Registry.emptyArgs();
      long var8 = 634817973682994708L;
      Object var7 = var10004;
      Ref.h(634817973682994708L, var7, var8);
      var10004 = Registry.emptyArgs();
      long var9 = 499537131214815290L;
      Object var10005 = Ref.h2(499537131214815290L, var9);

      try {
         var10005 = (Font)var10005;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var10004.setFont((Font)var10005);
   }

   @Override
   public void paint(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      super.paint(var1);
   }

   @Override
   public void paintComponent(Graphics var1) {
      label97: {
         String var10000 = com.finalshell.ui.panel.AA.z();
         Container var3 = this.getTopLevelAncestor();
         String var2 = var10000;
         int var23 = (var3 instanceof Window) ? 1 : 0;
         if (var2 == null) {
            if (var23 == 0) {
               break label97;
            }

            var23 = (((Window)var3).isOpaque()) ? 1 : 0;
         }

         if (var2 == null) {
            if (var23 != 0) {
               break label97;
            }

            var23 = this.getWidth();
         }

         int var4;
         int var5;
         Object var10002;
         label83: {
            label82: {
               var4 = var23;
               var5 = this.getHeight();
               if (var2 == null) {
                  Object var8 = 329170386049535157L;
                  if ((BufferedImage)Ref.g(329170386049535157L, var8) != null && var2 == null) {
                     Object var10 = 329170386049535157L;
                     if (((BufferedImage)Ref.g(329170386049535157L, var10)).getWidth() == var4) {
                        var10002 = this;
                        Object var12 = 329170386049535157L;
                        BufferedImage var10003 = (BufferedImage)Ref.g(329170386049535157L, var12);
                        if (var2 != null) {
                           break label83;
                        }

                        if (var10003.getHeight() == var5) {
                           break label82;
                        }
                     }
                  }
               }

               GraphicsConfiguration var6 = this.getGraphicsConfiguration();
               BufferedImage var10001 = var6.createCompatibleImage(var4, var5, 3);
               long var15 = 329170386049535157L;
               BufferedImage var14 = var10001;
               Ref.s(329170386049535157L, var14, var15);
            }

            Object var16 = 329170386049535157L;
            var10002 = (BufferedImage)Ref.g(329170386049535157L, var16);
         }

         Graphics2D var22 = var10002.createGraphics();

         try {
            super.paintComponent(var22);
         } finally {
            var22.dispose();
         }

         Object var18 = 329170386049535157L;
         this.drawImage((BufferedImage)Ref.g(329170386049535157L, var18), 0, 0, var4, var5, 0, 0, var4, var5, null);
         if (var2 == null) {
            return;
         }
      }

      super.paintComponent(var1);
   }

   public ImageIcon U(String var1) {
      Object var10001 = Registry.packArgs(this.getClass(), var1);
      long var3 = 224017843723037148L;
      Object var2 = var10001;
      var10001 = Ref.h(224017843723037148L, var2, var3);

      try {
         return (ImageIcon)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public ImageIcon q(java.lang.Class var1, String var2) {
      String var10000 = com.finalshell.ui.panel.AA.z();
      String var4 = var1.getCanonicalName() + ":" + var2;
      String var3 = var10000;
      Map var5 = (Map)Registry.lookupField(628253408435626925L).get(null);
      String var10001 = var4;
      if (var3 == null) {
         if (!var5.containsKey(var4)) {
            ((Map)Registry.lookupField(628253408435626925L).get(null)).put(var4, new ImageIcon(var1.getResource("/" + var2)));
         }

         var5 = (Map)Registry.lookupField(628253408435626925L).get(null);
         var10001 = var4;
      }

      return (ImageIcon)var5.get(var10001);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31543;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3754755697294332681L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "áh®ÀÃÐ\u0091éT³\u008cLgr\u0090V";
      int var5 = "áh®ÀÃÐ\u0091éT³\u008cLgr\u0090V".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
      D = new HashMap();
   }
}





