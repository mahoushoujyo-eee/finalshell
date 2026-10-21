package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.Proxy;
import com.finalshell.ui.listener.Jh2;
import com.finalshell.ui.model.C62;
import com.finalshell.ui.panel.Edit;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class Yy2 extends JTable {
   Edit n;
   C62 f;
   public static long[] a;
   public static Integer[] b;

   Yy2(Edit var1, C62 var2) {
      short var10000 = 24765;
      super();
      long var10001 = 747603782168300477L;
      Ky4[] var10002 = Edit.t();
      long var8 = 567473403098937361L;
      Ref.s(567473403098937361L, var1, var8);
      long var10 = 578695750651372926L;
      Ref.s(578695750651372926L, var2, var10);
      this.setModel(var2);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionMode(0);
      Proxy var4 = new Proxy();
      this.setDefaultRenderer(LD3_2.class, var4);
      this.setShowGrid(false);
      int var5 = a((int)var10002, (long)this);
      this.setGridColor(new Color(var5, var5, var5));
      this.addMouseListener(new Jh2(this, var2, var1));
      TableColumnModel var6 = this.getColumnModel();
      TableColumnModel var11 = var6;
      if (this == null) {
         if (var6.getColumnCount() <= 2) {
            return;
         }

         var6.getColumn(0).setPreferredWidth(a(12745, 2358495401579289288L));
         var6.getColumn(1).setPreferredWidth(a(15196, 3767527622567366751L));
         var6.getColumn(2).setPreferredWidth(a(2467, 7554511668053484198L));
         var6.getColumn(3).setPreferredWidth(a(31650, 2918051882401878182L));
         var11 = var6;
      }

      var11.getColumn(4).setPreferredWidth(a(3960, 5802092705360422010L));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11009;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6163276181693750193L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "Þ\u0082\u00885\u0001ýÁQ3^ôºª\u009a\u0010Ä¥Ï\u008c\u0081>âË\u0096ÊææUF\u009fÿù";
      int var5 = "Þ\u0082\u00885\u0001ýÁQ3^ôºª\u009a\u0010Ä¥Ï\u008c\u0081>âË\u0096ÊææUF\u009fÿù".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ô\u009e\u009cvO¤y+P¬\u0092Y\u0098Â\u000b·";
                  var5 = "Ô\u009e\u009cvO¤y+P¬\u0092Y\u0098Â\u000b·".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
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





