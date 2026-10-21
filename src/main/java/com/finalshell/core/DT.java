package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.M9;
import com.finalshell.ui.model.Fr4;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

public class DT extends JTable {
   public Fr4 a;
   public DT I;
   public SelectDownloadFolderPanel l;
   public static long[] b;
   public static Integer[] c;

   public DT(SelectDownloadFolderPanel var1, Fr4 var2) {
      long var6 = 520595572764773303L;
      Ref.s(520595572764773303L, this, var6);
      long var8 = 129770487350982726L;
      Ref.s(129770487350982726L, var1, var8);
      long var10 = 537287653217599524L;
      Ref.s(537287653217599524L, var2, var10);
      this.setModel(var2);
      this.setOpaque(false);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.getTableHeader().setVisible(false);
      this.setTableHeader(null);
      com.finalshell.ui.panel.Ql2 var3 = new com.finalshell.ui.panel.Ql2();
      this.setDefaultRenderer(Object.class, var3);
      this.setRowHeight(a(28146, 69380773180708842L));
      this.setShowGrid(true);
      int var4 = a(24585, 6455712407774927376L);
      this.setGridColor(new Color(var4, var4, var4));
      this.addMouseListener(new M9(this, var1, var2));
   }

   public YI m(int var1) {
      Object var2 = 537287653217599524L;
      Ref.g(537287653217599524L, var2);
      Object[] var10002 = Registry.packArgs(this.convertRowIndexToModel(var1));
      long var5 = 501106210434703361L;
      Object[] var4 = var10002;
      var10002 = Ref.h(501106210434703361L, var4, var5);

      try {
         return (YI)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31256;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4616535941730501940L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u008b_\u0019¦Ð\u0006\u0012ºádÕ@æ*\u001fì";
      int var5 = "\u008b_\u0019¦Ð\u0006\u0012ºádÕ@æ*\u001fì".length();
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

      b = var6;
      c = new Integer[2];
   }
}





