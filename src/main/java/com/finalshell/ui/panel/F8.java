package com.finalshell.ui.panel;

import com.finalshell.core.KV;
import com.finalshell.core.Kj2;
import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Bj2;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;

public class F8 extends JPanel {
   Kj2 R;
   Kj2 p;
   AM H;
   T32 K;
   ConnectionProperty q;
   protected String c;
   public static String[] f;
   public static long[] cb;
   public static Integer[] db;

   public F8() {
      this.setPreferredSize(new Dimension(a(10735, 7292822211235108152L), a(18069, 523133079799642691L)));
   }

   public void q() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 356328755167951757L;
      Object[] var1 = var10001;
      Ref.h(356328755167951757L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void C(KV var1) {
   }

   public void S() {
   }

   public Kj2 i() {
      Object var1 = 480934286044834250L;
      return (Kj2)Ref.g(480934286044834250L, var1);
   }

   public void b(Kj2 var1) {
      long var3 = 480934286044834250L;
      Ref.s(480934286044834250L, var1, var3);
   }

   public Kj2 Y() {
      Object var1 = 280691565200945876L;
      return (Kj2)Ref.g(280691565200945876L, var1);
   }

   public void K(Kj2 var1) {
      long var3 = 280691565200945876L;
      Ref.s(280691565200945876L, var1, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var5 = 328920636414804414L;
      Object[] var4 = var10003;
      var10003 = Registry.packArgs(Ref.h(328920636414804414L, var4, var5));
      long var7 = 238817641764583171L;
      Object[] var6 = var10003;
      Ref.h(238817641764583171L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public AM h$aM() {
      Object var1 = 192114424962340582L;
      return (AM)Ref.g(192114424962340582L, var1);
   }

   public void C(AM var1) {
      long var3 = 192114424962340582L;
      Ref.s(192114424962340582L, var1, var3);
   }

   public T32 X() {
      Object var1 = 180652311095961139L;
      return (T32)Ref.g(180652311095961139L, var1);
   }

   public void U(T32 var1) {
      long var3 = 180652311095961139L;
      Ref.s(180652311095961139L, var1, var3);
   }

   public void o() {
   }

   public ConnectionProperty t() {
      Object var1 = 501796506201911497L;
      return (ConnectionProperty)Ref.g(501796506201911497L, var1);
   }

   public void E(ConnectionProperty var1) {
      long var3 = 501796506201911497L;
      Ref.s(501796506201911497L, var1, var3);
   }

   public String T() {
      Object var1 = 208762370948884177L;
      return (String)Ref.g(208762370948884177L, var1);
   }

   public void h(String var1) {
      long var3 = 208762370948884177L;
      Ref.s(208762370948884177L, var1, var3);
   }

   public void h$void() {
      long var2 = 480934286044834250L;
      Object var1 = null;
      Ref.s(480934286044834250L, var1, var2);
      long var4 = 280691565200945876L;
      Object var3 = null;
      Ref.s(280691565200945876L, var3, var4);
      long var6 = 192114424962340582L;
      Object var5 = null;
      Ref.s(192114424962340582L, var5, var6);
      long var8 = 180652311095961139L;
      Object var7 = null;
      Ref.s(180652311095961139L, var7, var8);
      long var10 = 501796506201911497L;
      Object var9 = null;
      Ref.s(501796506201911497L, var9, var10);
      long var12 = 208762370948884177L;
      Object var11 = null;
      Ref.s(208762370948884177L, var11, var12);
   }

   public void K() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Bj2(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static void D(String[] var0) {
      f = var0;
   }

   public static String[] y() {
      return f;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31958;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1922241311274734944L;
      long[] var6 = new long[2];
      D(null);
      int var3 = 0;
      String var4 = "V\u009c5 lª\b3³iÈ¼½£çH";
      int var5 = "V\u009c5 lª\b3³iÈ¼½£çH".length();
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

      cb = var6;
      db = new Integer[2];
   }
}





