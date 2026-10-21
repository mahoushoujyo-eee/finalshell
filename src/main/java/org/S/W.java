package org.s;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

public final class W {
   public static final Reader c;
   private static String w;
   private static final long a;

   private W() {
   }

   public static Reader v(Reader var0, Runnable var1) {
      return new org.s.P(var0, var1);
   }

   public static Reader Q(Reader var0, org.T.n_2 var1) {
      return new k_3(var0, var1);
   }

   public static Reader u(Reader[] var0) {
      return H(Arrays.asList(var0));
   }

   public static Reader H(Iterable var0) {
      return new K_2(var0);
   }

   public static Reader e(Reader var0, Writer var1, boolean var2) {
      return new org.s.Q(var0, var1, var2);
   }

   public static String s(Reader var0) throws IOException {
      StringWriter var1 = new StringWriter();
      S(var0, var1);
      return var1.toString();
   }

   public static void S(Reader var0, Writer var1) throws IOException {
      String var10000 = v();
      char[] var3 = new char[(int)a];
      String var2 = var10000;

      do {
         int var4 = var0.read(var3);
         if (var4 == -1) {
            break;
         }

         var1.write(var3, 0, var4);
      } while (var2 != null);
   }

   static {
      if (v() == null) {
         i("WMZKm");
      }

      long var0 = 1203860507337268925L;
      long var10002 = 8000981552764141245L ^ var0;
      byte var10001 = -1;
      a = var10002;
      c = new StringReader("");
   }

   public static void i(String var0) {
      w = var0;
   }

   public static String v() {
      return w;
   }
}





