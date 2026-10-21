package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class YA3_2 {
   public int w;
   public String G;
   public int b;
   public String r;
   public int d;
   public int v;
   public static int h;
   public static int m;
   public int z;
   public static int f;
   public static int R;
   public int F;
   public long N;
   public long J;
   public String K;

   public YA3_2() {
      Ref.setInt(190631636615254067L, this, ((Integer)Ref.g(606321257807092289L, null)).intValue());
   }

   public int q() {
      return ((Integer)Ref.g(203927142057231837L, this)).intValue();
   }

   public void c(int var1) {
      Ref.s(203927142057231837L, this, var1);
   }

   public String n() {
      Object var1 = 173987575155143635L;
      return (String)Ref.g(173987575155143635L, var1);
   }

   public void Q(String var1) {
      long var3 = 173987575155143635L;
      Ref.s(173987575155143635L, var1, var3);
   }

   public int y() {
      return ((Integer)Ref.g(326209523526236338L, this)).intValue();
   }

   public void o(int var1) {
      Ref.s(326209523526236338L, this, var1);
   }

   public String M$String() {
      Object var1 = 242348268510296517L;
      return (String)Ref.g(242348268510296517L, var1);
   }

   public void H(String var1) {
      long var3 = 242348268510296517L;
      Ref.s(242348268510296517L, var1, var3);
   }

   public int I() {
      return ((Integer)Ref.g(587427225248275913L, this)).intValue();
   }

   public void R(int var1) {
      Ref.s(587427225248275913L, this, var1);
   }

   public int g() {
      return ((Integer)Ref.g(178355047146999337L, this)).intValue();
   }

   public void N(int var1) {
      Ref.s(178355047146999337L, this, var1);
   }

   public int Z() {
      return ((Integer)Ref.g(190631636615254067L, this)).intValue();
   }

   public void Z(int var1) {
      Ref.s(190631636615254067L, this, var1);
   }

   public int Y() {
      return ((Integer)Ref.g(557081315461020878L, this)).intValue();
   }

   public void J(int var1) {
      Ref.s(557081315461020878L, this, var1);
   }

   public long M$long() {
      return ((Long)Ref.g(318590379172931789L, this)).longValue();
   }

   public void m(long var1) {
      Ref.s(318590379172931789L, this, var1);
   }

   public long c() {
      return ((Long)Ref.g(138650901611643706L, this)).longValue();
   }

   public void n(long var1) {
      Ref.s(138650901611643706L, this, var1);
   }

   public String Q() {
      Object var1 = 282773297054131278L;
      return (String)Ref.g(282773297054131278L, var1);
   }

   public void X(String var1) {
      long var3 = 282773297054131278L;
      Ref.s(282773297054131278L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 3859183971698752689L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "\u0003¾Ì\u0000\u001bü<»ÄS\u0099£\u001bü<»";
      int var6 = "\u0003¾Ì\u0000\u001bü<»ÄS\u0099£\u001bü<»".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var0;
         var10001 = var4++;
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
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     Ref.setInt(606321257807092289L, null, (int)var0[1]);
                     Ref.setInt(231643372335201848L, null, (int)var0[2]);
                     Ref.setInt(252289193443733586L, null, (int)var0[0]);
                     Ref.setInt(591847900175052583L, null, (int)var0[3]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "4Â\u0017H\u001bü<ºº\u001bt.\u001bü<º";
                  var6 = "4Â\u0017H\u001bü<ºº\u001bt.\u001bü<º".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var0;
            var10001 = var4++;
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





