package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.ReservedAddressAdapter2;
import com.finalshell.ui.listener.V1;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class Lw4_2 extends JTable {
   public static long[] a;
   public static Integer[] b;

   public Lw4_2() {
      this.setSelectionBackground((Color)Ref.g(623875439513009390L, null));
      this.setSelectionForeground((Color)Ref.g(513155505692963448L, null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setSelectionMode(0);
      this.addMouseListener(new V1(this));
   }

   @Override
   public void setModel(TableModel var1) {
      super.setModel(var1);
      TableColumnModel var3 = this.getColumnModel();
      int[] var10000 = com.finalshell.ui.panel.YQ.m();
      this.setPreferredScrollableViewportSize(new Dimension(a(29131, 646375044043598335L), a(4454, 8676190360003479895L)));
      int[] var2 = var10000;
      TableColumnModel var6 = var3;
      if (var2 != null) {
         if (var3.getColumnCount() <= 2) {
            return;
         }

         var3.getColumn(0).setPreferredWidth(a(6882, 8226826480149496532L));
         var3.getColumn(0).setMinWidth(a(5267, 543409159480478894L));
         var3.getColumn(0).setMaxWidth(a(7194, 2686019252591232047L));
         var3.getColumn(1).setPreferredWidth(a(29670, 6956600063648623569L));
         var3.getColumn(1).setMinWidth(a(7109, 2674958735282373623L));
         var3.getColumn(2).setPreferredWidth(a(1685, 2208406283000258213L));
         var3.getColumn(2).setMinWidth(a(29059, 3754787136993913276L));
         var3.getColumn(2).setMaxWidth(a(29059, 3754787136993913276L));
         var3.getColumn(3).setPreferredWidth(a(29059, 3754787136993913276L));
         var3.getColumn(3).setMinWidth(a(29059, 3754787136993913276L));
         var3.getColumn(3).setMaxWidth(a(29059, 3754787136993913276L));
         var3.getColumn(4).setPreferredWidth(a(32296, 2741972433358743060L));
         var6 = var3;
      }

      var6.getColumn(4).setMinWidth(a(25057, 9192055113034463698L));
      ReservedAddressAdapter2 var4 = new ReservedAddressAdapter2();
      int var5 = 0;

      while (var5 < var3.getColumnCount()) {
         var3.getColumn(var5).setCellRenderer(var4);
         var5++;
         if (var2 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6197;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 395338075383430815L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "#µVäÿåú®\u0005;|p\u0006\u008fY@mT\u009d¥ûV\u0014b\\µ\u000f\u000f\u0017|ü_\u007fÇÈ£vÇPØ/\u00adpýÜ\u0092à\u0006Á$û?õQ\u0007Ï\u001f\t}\u0010\u0098?ý\u0092\u008d\u0092HPÓír/";
      int var5 = "#µVäÿåú®\u0005;|p\u0006\u008fY@mT\u009d¥ûV\u0014b\\µ\u000f\u000f\u0017|ü_\u007fÇÈ£vÇPØ/\u00adpýÜ\u0092à\u0006Á$û?õQ\u0007Ï\u001f\t}\u0010\u0098?ý\u0092\u008d\u0092HPÓír/"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[11];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "f:Vs\u0007(\u008b\u0003x\u0082S\u00adnÐ\u0017\u001f";
                  var5 = "f:Vs\u0007(\u008b\u0003x\u0082S\u00adnÐ\u0017\u001f".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





