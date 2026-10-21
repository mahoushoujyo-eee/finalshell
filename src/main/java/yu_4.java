public enum yu_4 {
   BIN32, BIN, HEX;
   private int E;
   private DZ s;
   private x9 Z;
   private static final yu_4[] r;
   private static com.ky_4[] g;

   public static yu_4 O(byte var0) {
      com.ky_4[] var10000 = c();
      yu_4[] var2 = values();
      com.ky_4[] var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while (var4 < var3) {
         yu_4 var5 = var2[var4];
         if (var1 == null) {
            if (var5.T() == var0) {
               return var5;
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }

      return null;
   }

   private yu_4(int var3, DZ var4, x9 var5) {
      this.E = var3;
      this.s = var4;
      this.Z = var5;
   }

   public DZ s() {
      return this.s;
   }

   public byte T() {
      return this.Z.r();
   }

   public int c() {
      return this.E;
   }

   public boolean d() {
      return this == HEX;
   }

   private static yu_4[] r() {
      return new yu_4[]{BIN32, BIN, HEX};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "0Ze\u0005:Vs)J\u0003:Vs";
      int var5 = "0Ze\u0005:Vs)J\u0003:Vs".length();
      r(null);
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 115;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 115;
               var10006 = var6;
            } else {
               var13 = 115;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 115;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 11;
                     break;
                  case 1:
                     var29 = 108;
                     break;
                  case 2:
                     var29 = 78;
                     break;
                  case 3:
                     var29 = 105;
                     break;
                  case 4:
                     var29 = 11;
                     break;
                  case 5:
                     var29 = 117;
                     break;
                  default:
                     var29 = 118;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            r = r();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   public static void r(com.ky_4[] var0) {
      g = var0;
   }

   public static com.ky_4[] c$comky_4() {
      return g;
   }
}






