package com.finalshell.core;

import java.awt.Color;

public class C4 extends CF_2 implements Cloneable {
   public int H;
   public int[] Y;
   public int[] J;
   public byte[] l;
   public static long[] c;
   public static Integer[] d;

   public C4() {
      this.H = b(2648, 7925312158793735278L);
      this.Y = new int[]{-1, 0, b(26186, 5441813644046790771L), b(11156, 8206837441052818853L)};
      this.J = new int[]{b(9903, 2226556094484787346L), b(9903, 2226556094484787346L), -1, -1};
      this.l = new byte[]{
         (byte)b(17186, 1660347874411107613L), (byte)b(17186, 1660347874411107613L), (byte)b(17186, 1660347874411107613L), (byte)b(17186, 1660347874411107613L)
      };
      this.E();
   }

   public C4(int[] var1) {
      this(null, var1, null);
   }

   public C4(int[] var1, int[] var2) {
      this(var1, var2, null);
   }

   public C4(int[] var1, int[] var2, byte[] var3) {
      this.H = b(7247, 1353965287522142839L);
      this.Y = new int[]{-1, 0, b(26186, 5441813644046790771L), b(11156, 8206837441052818853L)};
      this.J = new int[]{b(9903, 2226556094484787346L), b(9903, 2226556094484787346L), -1, -1};
      this.l = new byte[]{
         (byte)b(17186, 1660347874411107613L), (byte)b(17186, 1660347874411107613L), (byte)b(17186, 1660347874411107613L), (byte)b(17186, 1660347874411107613L)
      };
      this.m(var1, var2, var3);
   }

   @Override
   public Object clone() {
      C4 var1 = (C4)super.clone();
      var1.B = (int[])this.B.clone();
      var1.Y = (int[])this.Y.clone();
      var1.J = (int[])this.J.clone();
      var1.l = (byte[])this.l.clone();
      return var1;
   }

   public void H(C4 var1) {
      var1.H = this.H;
      var1.B = (int[])this.B.clone();
      var1.Y = (int[])this.Y.clone();
      var1.J = (int[])this.J.clone();
      var1.l = (byte[])this.l.clone();
   }

   @Override
   public void l(int var1, int var2) {
      String[] var10000 = W5.q();
      int var4 = this.B[0];
      int var5 = this.B[b(26186, 5441813644046790771L)];
      String[] var3 = var10000;
      int var8 = var1;
      if (var3 != null) {
         if (var1 > 0) {
            int var6 = 0;

            while (var6 < var1) {
               this.B[var6] = NM.n((float)var6 / (float)var1, var4, var2);
               var6++;
               if (var3 == null) {
                  return;
               }

               if (var3 == null) {
                  break;
               }
            }
         }

         var8 = var1;
      }

      if (var3 != null) {
         if (var8 >= b(26186, 5441813644046790771L)) {
            return;
         }

         var8 = var1;
      }

      int var7 = var8;

      while (var7 < b(11156, 8206837441052818853L)) {
         this.B[var7] = NM.n((float)(var7 - var1) / (float)(b(11156, 8206837441052818853L) - var1), var2, var5);
         var7++;
         if (var3 == null) {
            break;
         }
      }
   }

   public int D() {
      return this.H;
   }

   public void f(int var1, int var2) {
      this.J[var1] = var2;
      this.E();
   }

   public int F(int var1) {
      return this.J[var1];
   }

   public void Q(int var1, int var2) {
      this.l[var1] = (byte)(this.l[var1] & b(5652, 1111521072521642022L) | var2);
      this.E();
   }

   public int z(int var1) {
      return (byte)(this.l[var1] & 3);
   }

   public void q(int var1, int var2) {
      this.l[var1] = (byte)(this.l[var1] & b(1728, 5651828988919124203L) | var2);
      this.E();
   }

   public byte s(int var1) {
      return (byte)(this.l[var1] & b(2305, 5628376957338328891L));
   }

   public void f(int var1, int var2, int var3) {
      int[] var4 = new int[this.H + 1];
      int[] var5 = new int[this.H + 1];
      byte[] var6 = new byte[this.H + 1];
      System.arraycopy(this.Y, 0, var4, 0, this.H);
      System.arraycopy(this.J, 0, var5, 0, this.H);
      System.arraycopy(this.l, 0, var6, 0, this.H);
      this.Y = var4;
      this.J = var5;
      this.l = var6;
      this.Y[this.H] = this.Y[this.H - 1];
      this.J[this.H] = this.J[this.H - 1];
      this.l[this.H] = this.l[this.H - 1];
      this.Y[this.H - 1] = var1;
      this.J[this.H - 1] = var2;
      this.l[this.H - 1] = (byte)var3;
      this.H++;
      this.u();
      this.E();
   }

   public void k(int var1) {
      C4 var3;
      label33: {
         label34: {
            String[] var2 = W5.q();
            var10000 = this.H;
            int var10001 = 4;
            if (var2 != null) {
               if (this.H <= 4) {
      C4 var10000;
      C4 var10000;
                  return;
               }

               var10000 = var1;
               if (var2 == null) {
                  break label34;
               }

               var10001 = this.H - 1;
            }

            if (var10000 < var10001) {
               System.arraycopy(this.Y, var1 + 1, this.Y, var1, this.H - var1 - 1);
               System.arraycopy(this.J, var1 + 1, this.J, var1, this.H - var1 - 1);
               System.arraycopy(this.l, var1 + 1, this.l, var1, this.H - var1 - 1);
            }

            this.H--;
            var3 = this;
            if (var2 == null) {
               break label33;
            }

            var10000 = this.Y[1];
         }

         if (var10000 > 0) {
            this.Y[1] = 0;
         }

         var3 = this;
      }

      var3.E();
   }

   public void m(int[] var1, int[] var2, byte[] var3) {
      String[] var4;
      label59: {
         label62: {
            label57: {
               String[] var10000 = W5.q();
               this.H = var2.length + 2;
               var4 = var10000;
               this.Y = new int[this.H];
               this.J = new int[this.H];
               this.l = new byte[this.H];
               int[] var7 = var1;
               if (var4 != null) {
                  if (var1 == null) {
                     break label57;
                  }

                  var7 = var1;
               }

               System.arraycopy(var7, 0, this.Y, 1, this.H - 2);
               if (var4 != null) {
                  break label62;
               }
            }

            int var5 = 1;

            while (var5 > this.H - 1) {
               this.Y[var5] = b(26186, 5441813644046790771L) * var5 / (this.H - 2);
               var5++;
               if (var4 == null) {
                  break label59;
               }

               if (var4 == null) {
                  break;
               }
            }
         }

         System.arraycopy(var2, 0, this.J, 1, this.H - 2);
      }

      label64: {
         label38: {
            byte[] var8 = var3;
            if (var4 != null) {
               if (var3 == null) {
                  break label38;
               }

               var8 = var3;
            }

            System.arraycopy(var8, 0, this.l, 1, this.H - 2);
            if (var4 != null) {
               break label64;
            }
         }

         int var6 = 0;

         while (var6 > this.H) {
            this.l[var6] = (byte)b(498, 2506686638782584774L);
            var6++;
            if (var4 == null) {
               return;
            }

            if (var4 == null) {
               break;
            }
         }
      }

      this.u();
      this.E();
   }

   public void o(int[] var1, int[] var2, byte[] var3, int var4, int var5) {
      this.H = var5;
      this.Y = new int[this.H];
      this.J = new int[this.H];
      this.l = new byte[this.H];
      System.arraycopy(var1, var4, this.Y, 0, this.H);
      System.arraycopy(var2, var4, this.J, 0, this.H);
      System.arraycopy(var3, var4, this.l, 0, this.H);
      this.u();
      this.E();
   }

   public void p(int var1) {
      int var2 = (this.Y[var1] + this.Y[var1 + 1]) / 2;
      this.f(var2, this.D((float)var2 / 256.0F), this.l[var1]);
      this.E();
   }

   public void L(int var1, int var2) {
      this.Y[var1] = NM.L(var2, 0, b(32458, 7652395783863036153L));
      this.u();
      this.E();
   }

   public int J(int var1) {
      return this.Y[var1];
   }

   public int O(int var1) {
      String[] var10000 = W5.q();
      int var3 = 1;
      String[] var2 = var10000;

      while (true) {
         if (var3 < this.H - 1) {
            var4 = this.Y[var3 + 1];
            if (var2 == null) {
               break;
            }

            if (var2 == null) {
               return var4;
            }

            if (var4 > var1) {
               return var3;
            }

            var3++;
            if (var2 != null) {
               continue;
            }
         }

         var4 = 1;
         break;
      }

      return var4;
   }

   public void E() {
      String[] var10000 = W5.q();
      this.Y[0] = -1;
      String[] var1 = var10000;
      this.Y[this.H - 1] = b(16335, 1526711618533632500L);
      this.J[0] = this.J[1];
      this.J[this.H - 1] = this.J[this.H - 2];
      boolean var2 = false;
      int var3 = 1;

      label105:
      while (true) {
         int var18 = var3;

         label103:
         while (var18 < this.H - 1) {
            float var4 = (float)(this.Y[var3 + 1] - this.Y[var3]);
            int var5 = this.Y[var3 + 1];
            int var19 = var3;
            if (var1 != null) {
               if (var3 == this.H - 2) {
                  var5++;
               }

               var19 = this.Y[var3];
            }

            int var6 = var19;

            while (var6 < var5) {
               int var7 = this.J[var3];
               int var8 = this.J[var3 + 1];
               float[] var9 = Color.RGBtoHSB(
                  var7 >> b(13158, 9030665985492067665L) & b(26186, 5441813644046790771L),
                  var7 >> b(22821, 1326911240337051417L) & b(26186, 5441813644046790771L),
                  var7 & b(26186, 5441813644046790771L),
                  null
               );
               float[] var10 = Color.RGBtoHSB(
                  var8 >> b(10692, 976770218173579258L) & b(26186, 5441813644046790771L),
                  var8 >> b(9108, 8653444720448222628L) & b(26186, 5441813644046790771L),
                  var8 & b(26186, 5441813644046790771L),
                  null
               );
               float var11 = (float)(var6 - this.Y[var3]) / var4;
               int var12 = this.z(var3);
               byte var13 = this.s(var3);
               if (var1 != null) {
                  var18 = var6;
                  if (var1 == null) {
                     continue label103;
                  }

                  label66:
                  if (var6 >= 0) {
                     int var20 = var6;
                     if (var1 != null) {
                        if (var6 > b(26186, 5441813644046790771L)) {
                           break label66;
                        }

                        var20 = var13;
                     }

                     if (var1 != null) {
                        switch (var20) {
                           case 80:
                              var11 = 0.0F;
                              if (var1 != null) {
                                 break;
                              }
                           case 16:
                              if (var1 != null) {
                                 break;
                              }
                           case 32:
                              var11 = NM.k(0.15F, 0.85F, var11);
                              if (var1 != null) {
                                 break;
                              }
                           case 48:
                              var11--;
                              var11 = (float)Math.sqrt((double)(1.0F - var11 * var11));
                              if (var1 != null) {
                                 break;
                              }
                           case 64:
                              var11 = 1.0F - (float)Math.sqrt((double)(1.0F - var11 * var11));
                        }

                        var20 = var12;
                     }

                     switch (var20) {
                        case 0:
                           this.B[var6] = NM.n(var11, var7, var8);
                           if (var1 != null) {
                              break label66;
                           }
                        case 1:
                        case 2:
                           break;
                        default:
                           break label66;
                     }

                     float var10001;
                     label81: {
                        label80: {
                           int var21 = var12;
                           if (var1 != null) {
                              if (var12 == 1) {
                                 var22 = var10[0];
                                 var10001 = var9[0];
                                 if (var1 == null) {
                                    break label81;
                                 }

                                 if (!(var22 <= var10001)) {
                                    break label80;
                                 }

                                 var10[0]++;
                                 if (var1 != null) {
                                    break label80;
                                 }
                              }

                              var22 = var9[0];
                              var10001 = var10[1];
                              if (var1 == null) {
                                 break label81;
                              }

                              float var23;
                              var21 = (var23 = var22 - var10001) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
                           }

                           if (var21 <= 0) {
                              var9[0]++;
                           }
                        }

                        var22 = NM.J(var11, var9[0], var10[0]);
                        var10001 = (float) (Math.PI * 2);
                     }

                     float var14 = var22 % var10001;
                     float var15 = NM.J(var11, var9[1], var10[1]);
                     float var16 = NM.J(var11, var9[2], var10[2]);
                     this.B[var6] = b(10633, 6844175676481912764L) | Color.HSBtoRGB(var14, var15, var16);
                  }

                  var6++;
               }

               if (var1 == null) {
                  break;
               }
            }

            var3++;
            if (var1 == null) {
               return;
            }
            continue label105;
         }

         return;
      }
   }

   public void u() {
      String[] var10000 = W5.q();
      int var2 = 1;
      String[] var1 = var10000;

      label39:
      while (true) {
         int var7 = var2;
         int var10001 = this.H - 1;

         label37:
         while (var7 < var10001) {
            int var3 = 1;

            while (var3 < var2) {
               label31: {
                  var7 = this.Y[var2];
                  if (var1 != null) {
                     var10001 = this.Y[var3];
                     if (var1 == null) {
                        continue label37;
                     }

                     if (var7 >= var10001) {
                        break label31;
                     }

                     var7 = this.Y[var2];
                  }

                  int var4 = var7;
                  this.Y[var2] = this.Y[var3];
                  this.Y[var3] = var4;
                  var4 = this.J[var2];
                  this.J[var2] = this.J[var3];
                  this.J[var3] = var4;
                  byte var5 = this.l[var2];
                  this.l[var2] = this.l[var3];
                  this.l[var3] = var5;
               }

               var3++;
               if (var1 == null) {
                  break;
               }
            }

            var2++;
            if (var1 == null) {
               return;
            }
            continue label39;
         }

         return;
      }
   }

   public void z() {
      this.u();
      this.E();
   }

   public void V() {
      String[] var10000 = W5.q();
      this.H = 4 + (int)(6.0 * Math.random());
      String[] var1 = var10000;
      this.Y = new int[this.H];
      this.J = new int[this.H];
      this.l = new byte[this.H];
      int var2 = 0;

      while (true) {
         if (var2 < this.H) {
            this.Y[var2] = (int)(255.0 * Math.random());
            this.J[var2] = b(9903, 2226556094484787346L)
               | (int)(255.0 * Math.random()) << b(10692, 976770218173579258L)
               | (int)(255.0 * Math.random()) << b(9108, 8653444720448222628L)
               | (int)(255.0 * Math.random());
            this.l[var2] = (byte)b(17186, 1660347874411107613L);
            var2++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         this.Y[0] = -1;
         this.Y[1] = 0;
         this.Y[this.H - 2] = b(26186, 5441813644046790771L);
         this.Y[this.H - 1] = b(11156, 8206837441052818853L);
         this.u();
         this.E();
         break;
      }
   }

   public void s(float var1) {
      String[] var10000 = W5.q();
      int var3 = 0;
      String[] var2 = var10000;

      while (true) {
         if (var3 < this.H) {
            int var4 = this.J[var3];
            int var5 = var4 >> b(10692, 976770218173579258L) & b(26186, 5441813644046790771L);
            int var6 = var4 >> b(9108, 8653444720448222628L) & b(26186, 5441813644046790771L);
            int var7 = var4 & b(26186, 5441813644046790771L);
            var5 = Iw4.e((int)((double)var5 + (double)(var1 * 255.0F) * (Math.random() - 0.5)));
            var6 = Iw4.e((int)((double)var6 + (double)(var1 * 255.0F) * (Math.random() - 0.5)));
            var7 = Iw4.e((int)((double)var7 + (double)(var1 * 255.0F) * (Math.random() - 0.5)));
            this.J[var3] = b(9903, 2226556094484787346L) | var5 << b(10692, 976770218173579258L) | var6 << b(9108, 8653444720448222628L) | var7;
            this.l[var3] = (byte)b(17186, 1660347874411107613L);
            var3++;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         this.u();
         this.E();
         break;
      }
   }

   public static C4 W() {
      C4 var0 = new C4();
      var0.V();
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5691;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7296981975822963827L;
      long[] var6 = new long[17];
      int var3 = 0;
      String var4 = "\u009eL/Gøs¼\u0087ÿ]\u001d\u0005\u009d~\u000b8ù\u0083¶ÔJ\u0013dÿèó!£I¬\u009e\u0000ª\u001e\u0002º`\u0082ANºc!`°1«\u0099ì(HÖJd$á-ê_Å\u0001\u0098[bã~§Øð\u0081|u]\"±\u0016\u0016§k©µ²=\u0093ê\u000f(Ö·=ÙZ<\u0090¡ßé5à\u000f/.12H>MX?§\b\u0019\u001a\u0089/4ßI«Ï";
      int var5 = "\u009eL/Gøs¼\u0087ÿ]\u001d\u0005\u009d~\u000b8ù\u0083¶ÔJ\u0013dÿèó!£I¬\u009e\u0000ª\u001e\u0002º`\u0082ANºc!`°1«\u0099ì(HÖJd$á-ê_Å\u0001\u0098[bã~§Øð\u0081|u]\"±\u0016\u0016§k©µ²=\u0093ê\u000f(Ö·=ÙZ<\u0090¡ßé5à\u000f/.12H>MX?§\b\u0019\u001a\u0089/4ßI«Ï"
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
                     c = var6;
                     d = new Integer[17];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "6Í\bÓ¢\u0081\u0083\u0095\u001d\u009aG¨\u0099c{\u0017";
                  var5 = "6Í\bÓ¢\u0081\u0083\u0095\u001d\u009aG¨\u0099c{\u0017".length();
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






