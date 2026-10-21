package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.D92;
import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

public class Vn2 extends JTable {
   public int K;
   public int q;
   public com.finalshell.ui.panel.CL I;
   public static String r;
   public static long[] a;
   public static Integer[] b;

   public Vn2(com.finalshell.ui.panel.CL var1) {
      Registry.lookupField(244753811008757660L).setInt(this, -1);
      Registry.lookupField(506848354576877670L).setInt(this, -1);
      long var4 = 383013460463859310L;
      Ref.s(383013460463859310L, var1, var4);
      this.setOpaque(false);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.getTableHeader().setVisible(false);
      this.setTableHeader(null);
      com.finalshell.ui.panel.AS var2 = new com.finalshell.ui.panel.AS();
      this.setDefaultRenderer(Object.class, var2);
      this.setShowGrid(false);
      this.setGridColor(new Color(a(2765, 8526025809660217061L), a(19248, 8220591915562714906L), a(19248, 8220591915562714906L)));
      this.setRowHeight(a(3430, 3791341709877084495L));
      this.addMouseMotionListener(new com.finalshell.ui.listener.Db2(this));
      this.addMouseListener(new D92(this));
   }

   public void H() {
      Registry.packArgs(this);
      long var1 = 242617331513341262L;
      Ref.h2(242617331513341262L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void e(File var1, com.finalshell.ui.frame.U var2) {
      C();
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 303756590022481369L;
      Object[] var7 = var10002;
      Ref.h(303756590022481369L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Object var9 = 383013460463859310L;
      Ref.g(383013460463859310L, var9);
      Object[] var10003 = Registry.emptyArgs();
      long var12 = 494133230614533268L;
      Object[] var11 = var10003;
      Ref.h(494133230614533268L, var11, var12);
      Object[] var10004 = Registry.emptyArgs();
      long var14 = 328118709254946779L;
      Object[] var13 = var10004;
      var10004 = Ref.h(328118709254946779L, var13, var14);

      try {
         var38 = (Integer)var10004;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      int var5 = var38;
      Registry.emptyArgs();
      long var15 = 270389152141252877L;
      Ref.h2(270389152141252877L, var15);
      Object[] var10006 = Registry.emptyArgs();
      long var18 = 410905379772103887L;
      Object[] var17 = var10006;
      Ref.h(410905379772103887L, var17, var18);
      Object[] var10007 = Registry.packArgs(var1.getPath());
      long var20 = 489768706953623433L;
      Object[] var19 = var10007;
      Ref.h(489768706953623433L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      if (var2 == null) {
         Object[] var10008 = Registry.emptyArgs();
         long var22 = 402271797068414482L;
         Object[] var21 = var10008;
         var10008 = Ref.h(402271797068414482L, var21, var22);

         try {
            var40 = (Integer)var10008;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         if (var40 == Registry.lookupField(590765520000496083L).getInt(null)) {
            Object var23 = 383013460463859310L;
            Ref.g(383013460463859310L, var23);
            Object[] var10011 = Registry.emptyArgs();
            long var26 = 494133230614533268L;
            Object[] var25 = var10011;
            var10011 = Registry.packArgs(Ref.h(494133230614533268L, var25, var26));
            long var28 = 437885926058325865L;
            Object[] var27 = var10011;
            Ref.h(437885926058325865L, var27, var28);

            try {
               ;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }
         }

         Object[] var10009 = Registry.packArgs(var1, true, var5);
         long var30 = 303258325573791200L;
         Object[] var29 = var10009;
         Ref.h(303258325573791200L, var29, var30);

         try {
            ;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }
      }
   }

   public void q() {
      String var10000 = C();
      Point var2 = this.getMousePosition();
      String var1 = var10000;
      if (var2 != null) {
         int var3 = this.rowAtPoint(var2);
         int var4 = this.convertRowIndexToModel(var3);
         if (var1 == null) {
            if (var4 != Registry.lookupField(244753811008757660L).getInt(this)) {
               Registry.lookupField(506848354576877670L).setInt(this, var4);
               this.repaint();
            }

            Registry.lookupField(244753811008757660L).setInt(this, var4);
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10001 = Registry.packArgs(new com.finalshell.task.X2(this), a(7652, 3611851308453532111L));
         long var6 = 266288712085965362L;
         Object[] var5 = var10001;
         Ref.h(266288712085965362L, var5, var6);
      }
   }

   public int v() {
      return Registry.lookupField(506848354576877670L).getInt(this);
   }

   public void T(int var1) {
      Registry.lookupField(506848354576877670L).setInt(this, var1);
   }

   public static void X(String var0) {
      r = var0;
   }

   public static String C() {
      return r;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3113;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2228943107703638312L;
      long[] var6 = new long[4];
      X(null);
      int var3 = 0;
      String var4 = "ö£\u001eDðc\u0088~_´N³}§\u000f2";
      int var5 = "ö£\u001eDðc\u0088~_´N³}§\u000f2".length();
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
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "3¨ÌÆ\u0082Ü\u0018/º\u0095@e\u0085«NÍ";
                  var5 = "3¨ÌÆ\u0082Ü\u0018/º\u0095@e\u0085«NÍ".length();
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





