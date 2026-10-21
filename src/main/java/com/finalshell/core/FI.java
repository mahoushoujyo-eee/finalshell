package com.finalshell.core;

public class FI {
   public static long[] a;
   public static Integer[] b;

   public static int r(float var0, float var1, float var2) {
      String[] var3 = W5.q();
      double var4;
      int var10000 = (var4 = (double)var0 - 0.0) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
      if (var3 != null) {
         if (var10000 == 0) {
            return 0;
         }

         var10000 = (int)Math.round(255.0 * Math.pow((double)(var0 * var1), (double)var2));
      }

      return var10000;
   }

   public static int O(float var0) {
      String[] var1;
      float var2;
      float var3;
      float var4;
      float var5;
      int var7;
      label122: {
         String[] var10000 = W5.q();
         var2 = 0.8F;
         var1 = var10000;
         var7 = (int)var0;
         int var11 = var7;
         int var10001 = a(8844, 5137628121142626004L);
         if (var1 != null) {
            if (var7 < var10001) {
               var3 = 0.0F;
               var4 = 0.0F;
               var5 = 0.0F;
               if (var1 != null) {
                  break label122;
               }
            }

            var11 = var7;
            var10001 = a(17438, 62383186801156175L);
         }

         if (var1 != null) {
            if (var11 < var10001) {
               var3 = -(var0 - 440.0F) / 60.0F;
               var4 = 0.0F;
               var5 = 1.0F;
               if (var1 != null) {
                  break label122;
               }
            }

            var11 = var7;
            var10001 = a(19660, 3975242917797030044L);
         }

         if (var1 != null) {
            if (var11 < var10001) {
               var3 = 0.0F;
               var4 = (var0 - 440.0F) / 50.0F;
               var5 = 1.0F;
               if (var1 != null) {
                  break label122;
               }
            }

            var11 = var7;
            var10001 = a(607, 8212496308661888515L);
         }

         if (var1 != null) {
            if (var11 < var10001) {
               var3 = 0.0F;
               var4 = 1.0F;
               var5 = -(var0 - 510.0F) / 20.0F;
               if (var1 != null) {
                  break label122;
               }
            }

            var11 = var7;
            var10001 = a(20643, 2922109993497163006L);
         }

         if (var1 != null) {
            if (var11 < var10001) {
               var3 = (var0 - 510.0F) / 70.0F;
               var4 = 1.0F;
               var5 = 0.0F;
               if (var1 != null) {
                  break label122;
               }
            }

            var11 = var7;
            var10001 = a(28957, 4154138488805938510L);
         }

         if (var1 != null) {
            if (var11 < var10001) {
               var3 = 1.0F;
               var4 = -(var0 - 645.0F) / 65.0F;
               var5 = 0.0F;
               if (var1 != null) {
                  break label122;
               }
            }

            var11 = var7;
            var10001 = a(26188, 4573357658632110617L);
         }

         if (var11 <= var10001) {
            var3 = 1.0F;
            var4 = 0.0F;
            var5 = 0.0F;
            if (var1 != null) {
               break label122;
            }
         }

         var3 = 0.0F;
         var4 = 0.0F;
         var5 = 0.0F;
      }

      float var6;
      label123: {
         int var12;
         int var13;
         var12 = a(31152, 4008044939767438826L);
         var13 = var7;
         label77:
         if (var1 != null) {
            if (var12 <= var7) {
               var12 = var7;
               var13 = a(13713, 4538452604165788099L);
               if (var1 == null) {
                  break label77;
               }

               if (var7 <= var13) {
                  var6 = 0.3F + 0.7F * (var0 - 380.0F) / 40.0F;
                  if (var1 != null) {
                     break label123;
                  }
               }
            }

            var12 = a(25735, 8425364810835804382L);
            var13 = var7;
         }

         label67:
         if (var1 != null) {
            if (var12 <= var13) {
               var12 = var7;
               var13 = a(22958, 6418612690830392817L);
               if (var1 == null) {
                  break label67;
               }

               if (var7 <= var13) {
                  var6 = 1.0F;
                  if (var1 != null) {
                     break label123;
                  }
               }
            }

            var12 = a(26756, 3163110428739325138L);
            var13 = var7;
         }

         label57: {
            if (var1 != null) {
               if (var12 > var13) {
                  break label57;
               }

               var12 = var7;
               var13 = a(14635, 8311886934848871792L);
            }

            if (var12 <= var13) {
               var6 = 0.3F + 0.7F * (780.0F - var0) / 80.0F;
               if (var1 != null) {
                  break label123;
               }
            }
         }

         var6 = 0.0F;
      }

      int var8 = r(var3, var6, var2);
      int var9 = r(var4, var6, var2);
      int var10 = r(var5, var6, var2);
      return a(2677, 7840784941401583138L) | var8 << a(26809, 2070893093255630061L) | var9 << a(5520, 3884648013084242382L) | var10;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9301;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2961814224149111313L;
      long[] var6 = new long[16];
      int var3 = 0;
      String var4 = "\u0016zl:`\u008f#\u0004fñÍ\tæT®ìBï+NfbL3ïç³Ø#L,~Þk\u0098B¸&\u0003æçrMý\n6\u008bgh\u008b\u0095\u0096\u001c\u00155Ú\u0016Ú:q4$òq\u007f¯\u007f ¬\u001f\u0014«E\u008a$®½äÅìû\u0000\u0094Á\u001aÙ\u001d\\½Ô\u000b¼pKS×%Ç¨´Ýê£k>óHN}Øå¹";
      int var5 = "\u0016zl:`\u008f#\u0004fñÍ\tæT®ìBï+NfbL3ïç³Ø#L,~Þk\u0098B¸&\u0003æçrMý\n6\u008bgh\u008b\u0095\u0096\u001c\u00155Ú\u0016Ú:q4$òq\u007f¯\u007f ¬\u001f\u0014«E\u008a$®½äÅìû\u0000\u0094Á\u001aÙ\u001d\\½Ô\u000b¼pKS×%Ç¨´Ýê£k>óHN}Øå¹"
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
                     b = new Integer[16];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "4ÈMr5ûüm]2BY/¸¾\u0087";
                  var5 = "4ÈMr5ûüm]2BY/¸¾\u0087".length();
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





