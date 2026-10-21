package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.JF;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class LQ extends JTable {
   public SwitchTabCommand m;
   public com.finalshell.ui.model.Oa4 O;
   public static long[] a;
   public static Integer[] b;

   public LQ(SwitchTabCommand var1, com.finalshell.ui.model.Oa4 var2) {
      long var8 = 461718445990442402L;
      Ref.s(461718445990442402L, var1, var8);
      long var10 = 556189680979940906L;
      Ref.s(556189680979940906L, var2, var10);
      this.setModel(var2);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionMode(0);
      com.finalshell.ui.adapter.XM var4 = new com.finalshell.ui.adapter.XM();
      this.setDefaultRenderer(ZG_2.class, var4);
      String[] var10002 = SwitchTabCommand.B();
      this.setShowGrid(false);
      int var5 = a(4664, 6672082193902842022L);
      this.setGridColor(new Color(var5, var5, var5));
      this.addMouseListener(new JF(this, var2, var1));
      String[] var3 = var10002;
      TableColumnModel var6 = this.getColumnModel();
      TableColumnModel var11 = var6;
      if (var3 != null) {
         if (var6.getColumnCount() <= 1) {
            return;
         }

         var6.getColumn(0).setPreferredWidth(a(19387, 7183216449445751078L));
         var11 = var6;
      }

      var11.getColumn(1).setPreferredWidth(a(21734, 5361513782989223545L));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8863;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2137019640573185596L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "üëKîg\u000b9iW\u0003\u0088jÝ¬~RDYìÛ\u0007\u0091'~";
      int var5 = "üëKîg\u000b9iW\u0003\u0088jÝ¬~RDYìÛ\u0007\u0091'~".length();
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
      b = new Integer[3];
   }
}





