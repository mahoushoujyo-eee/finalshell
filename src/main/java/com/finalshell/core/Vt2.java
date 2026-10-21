package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.HashMap;

public class Vt2 extends Vb2 {
   public ArrayList L;
   public byte[] Q;
   public int Y;
   public int m;
   public int N;
   public int o;
   public int q;
   public int S;
   public int l;
   public static long[] a;
   public static Integer[] b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Vt2(long var1, ArrayList var3, int var4, HashMap var5, int var6, int var7, int var8) {
      Ky4[] var10002 = Vb2.U();
      this.Q = null;
      Ky4[] var9 = var10002;
      this.x = var8;
      this.p = var7;
      this.L = var3;
      this.Y = var4;
      int var10 = a(9016, 5994328404459824730L) + 4 * var3.size();
      this.Q = new byte[var10 + a(28510, 5123224870878439991L) + a(16934, 8215653496271816520L)];
      this.E = BN.D;
      Nb2_2.s(this.V, this.Q, 0);
      Nb2_2.s(this.E, this.Q, 2);
      CN3.P(var7, this.Q, 4);
      CN3.P(var8, this.Q, a(21768, 2705968805839196260L));
      CN3.P(var4, this.Q, a(6322, 8436200449901600215L));
      Nb2_2.s((short)var3.size(), this.Q, a(28706, 8579420013791999301L));
      int var11 = 0;
      if (var9 == null) {
         Ky4.K(new String[4]);
         int var12 = (Integer)var3.get(var11);
         CN3.P(var12, this.Q, a(11491, 6181462868340812171L) + 4 * var11 + a(21768, 2705968805839196260L));
         var11++;
      }

      while (true) {
         Object var10000;
         if (var11 >= var3.size()) {
            var11 = var6 - 2;
            CN3.P(var11, this.Q, var10 + a(21768, 2705968805839196260L));
            Fr2 var20 = (Fr2)var5.get(var11);
            int var13 = 0;
            if (var9 == null) {
               break;
            }

            var10000 = var20;
            if (var9 != null) {
               if (var20 != null) {
                  var13 = var20.R();
               }

               CN3.P(var13, this.Q, var10 + 4 + a(21768, 2705968805839196260L));
               break;
            }
         } else {
            var10000 = var3.get(var11);
         }

         int var21 = (Integer)var10000;
         CN3.P(var21, this.Q, a(11491, 6181462868340812171L) + 4 * var11 + a(21768, 2705968805839196260L));
         var11++;
      }

      int var14 = var6 - 1;
      CN3.P(var14, this.Q, var10 + a(21768, 2705968805839196260L) + a(21768, 2705968805839196260L));
      Fr2 var15 = (Fr2)var5.get(var14);
      int var16 = 0;
      if (var9 != null) {
         if (var15 != null) {
            var16 = var15.R();
         }

         CN3.P(var16, this.Q, var10 + a(6322, 8436200449901600215L) + a(21768, 2705968805839196260L));
      }

      CN3.P(var6, this.Q, var10 + a(28706, 8579420013791999301L) + a(21768, 2705968805839196260L));
      Fr2 var18 = (Fr2)var5.get(var6);
      int var19 = 0;
      if (var9 != null) {
         if (var18 != null) {
            var19 = var18.R();
         }

         CN3.P(var19, this.Q, var10 + a(18344, 6210854252616598215L) + a(21768, 2705968805839196260L));
         this.O = new DatagramPacket(this.Q, this.Q.length);
      }
   }

   public ArrayList t() {
      return this.L;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Vt2(DatagramPacket var1) {
   super();
      Ky4[] var10000 = Vb2.U();
      this.Q = null;
      this.O = var1;
      this.Q = var1.getData();
      this.V = Nb2_2.Q(this.Q, 0);
      this.E = Nb2_2.Q(this.Q, 2);
      this.p = CN3.m(this.Q, 4);
      this.x = CN3.m(this.Q, a(3746, 1652101361221536705L));
      this.Y = CN3.m(this.Q, a(412, 7203171563503977719L));
      Ky4[] var2 = var10000;
      short var3 = Nb2_2.Q(this.Q, a(11434, 8312314825262279118L));
      this.L = new ArrayList();
      int var4 = 0;
      int var5 = 0;
      if (var2 == null) {
         var4 = a(568, 1234053477104650078L) + 4 * var5;
         int var6 = CN3.m(this.Q, var4 + a(21768, 2705968805839196260L));
         this.L.add(var6);
         var5++;
      }

      while (true) {
         if (var5 >= var3) {
            var4 = a(11491, 6181462868340812171L) + 4 * var3 - 4;
            this.m = CN3.m(this.Q, var4 + 4 + a(21768, 2705968805839196260L));
            this.q = CN3.m(this.Q, var4 + a(21768, 2705968805839196260L) + a(21768, 2705968805839196260L));
            this.N = CN3.m(this.Q, var4 + a(6322, 8436200449901600215L) + a(21768, 2705968805839196260L));
            this.S = CN3.m(this.Q, var4 + a(28706, 8579420013791999301L) + a(21768, 2705968805839196260L));
            this.o = CN3.m(this.Q, var4 + a(27143, 2693644969276796778L) + a(21768, 2705968805839196260L));
            this.l = CN3.m(this.Q, var4 + a(4447, 257635185061303349L) + a(21768, 2705968805839196260L));
            if (var2 != null) {
               if (Ky4.F$arrString() != null) {
                  Vb2.x(new Ky4[1]);
               }

               return;
            }
         } else {
            var4 = a(568, 1234053477104650078L) + 4 * var5;
         }

         int var9 = CN3.m(this.Q, var4 + a(21768, 2705968805839196260L));
         this.L.add(var9);
         var5++;
      }
   }

   public int n() {
      return this.Y;
   }

   public int W() {
      return this.m;
   }

   public int O() {
      return this.o;
   }

   public int L() {
      return this.q;
   }

   public int N() {
      return this.S;
   }

   public int Z() {
      return this.l;
   }

   public int r() {
      return this.N;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1390;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5110959540831211674L;
      long[] var6 = new long[14];
      int var3 = 0;
      String var4 = "é\u0084rÀ\u0006Y\u0017Û¡\u008eýÕÒL\u0092I¿\u001b\u009enQö\u0000ö²²æfla¿ä\u009b±RÄc\u009bÄ·\u0014¿\\WîzÔa\u001d\u0096ÙÆÏ\u001bù\u001b\u0099\u009eÊeÑ\u0084ºµz±\u00117ô\u000b×Îý\u0090.¢hQ¥ÏËXX9\u0090[ùDSaé\u0003*ÃMA";
      int var5 = "é\u0084rÀ\u0006Y\u0017Û¡\u008eýÕÒL\u0092I¿\u001b\u009enQö\u0000ö²²æfla¿ä\u009b±RÄc\u009bÄ·\u0014¿\\WîzÔa\u001d\u0096ÙÆÏ\u001bù\u001b\u0099\u009eÊeÑ\u0084ºµz±\u00117ô\u000b×Îý\u0090.¢hQ¥ÏËXX9\u0090[ùDSaé\u0003*ÃMA"
         .length();
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
                     b = new Integer[14];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0000Ee}:\u007föÒTe¦~Ä/ÛS";
                  var5 = "\u0000Ee}:\u007föÒTe¦~Ä/ÛS".length();
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





