public class bo_4 {
   String i;
   String g;
   String J;
   public static int f;
   public static int q;
   public static int p;
   public static int e;
   public static int E;
   public static int B;
   int r;
   boolean R;
   boolean n;
   boolean Q;
   String A;

   bo_4(String var1, String var2, String var3) {
      this(var1, var2, var3, null);
   }

   public bo_4(String var1, String var2, String var3, String var4) {
      String var10000 = W2.F();
      super();
      String var5 = var10000;
      com.c.c(441230096973232620L).setInt(this, 0);
      com.c.c(195748561367902473L).setBoolean(this, false);
      com.c.c(305641141513071189L).setBoolean(this, false);
      com.c.c(588368480142043900L).setBoolean(this, false);
      com.c.c(203055800283390440L).set(this, var1);
      com.c.c(606241115808562000L).set(this, var2);
      com.c.c(252837156333601103L).set(this, var3);
      int var6 = var1.lastIndexOf("/");
      int var8 = var6;
      if (var5 != null) {
         if (var6 > -1) {
            var2 = var1.substring(var6);
         }

         var8 = var3.startsWith("d");
      }

      label72: {
         if (var5 != null) {
            if (var8 != 0) {
               com.c.c(441230096973232620L).setInt(this, com.c.c(565021139729850169L).getInt(null));
               com.c.c(195748561367902473L).setBoolean(this, true);
               if (var5 != null) {
                  break label72;
               }
            }

            var8 = var3.startsWith("l");
         }

         if (var5 != null) {
            if (var8 != 0) {
               com.c.c(441230096973232620L).setInt(this, com.c.c(542137494819116319L).getInt(null));
               com.c.c(305641141513071189L).setBoolean(this, true);
               com.c.c(407914632857802381L).set(this, var4);
               if (var5 != null) {
                  break label72;
               }
            }

            var8 = var3.startsWith("-");
         }

         if (var5 != null) {
            if (var8 != 0) {
               com.c.c(441230096973232620L).setInt(this, com.c.c(280278024323397611L).getInt(null));
               if (var5 != null) {
                  break label72;
               }
            }

            var8 = var3.startsWith("s");
         }

         if (var5 != null) {
            if (var8 != 0) {
               com.c.c(441230096973232620L).setInt(this, com.c.c(365044829646503437L).getInt(null));
               if (var5 != null) {
                  break label72;
               }
            }

            var8 = var3.startsWith("c");
         }

         if (var5 != null) {
            if (var8 != 0) {
               com.c.c(441230096973232620L).setInt(this, com.c.c(554335396504449933L).getInt(null));
               if (var5 != null) {
                  break label72;
               }
            }

            var8 = var3.startsWith("b");
         }

         if (var8 != 0) {
            com.c.c(441230096973232620L).setInt(this, com.c.c(383882141393946944L).getInt(null));
         }
      }

      if (com.ky_4.F() != null) {
         W2.d("yD84Kc");
      }
   }

   public String X() {
      return (String)com.c.c(606241115808562000L).get(this);
   }

   public String U() {
      return (String)com.c.c(203055800283390440L).get(this);
   }

   public String B() {
      return (String)com.c.c(252837156333601103L).get(this);
   }

   public void T(String var1) {
      com.c.c(252837156333601103L).set(this, var1);
   }

   public boolean n() {
      return com.c.c(195748561367902473L).getBoolean(this);
   }

   public boolean Y(boolean var1) {
      com.c.c(195748561367902473L).setBoolean(this, var1);
      return var1;
   }

   public int P() {
      return com.c.c(441230096973232620L).getInt(this);
   }

   public void R(int var1) {
      com.c.c(441230096973232620L).setInt(this, var1);
   }

   public String i() {
      return (String)com.c.c(407914632857802381L).get(this);
   }

   public boolean t() {
      return com.c.c(588368480142043900L).getBoolean(this);
   }

   public void N(boolean var1) {
      com.c.c(588368480142043900L).setBoolean(this, var1);
   }

   static {
      long var1 = 5935041026846809866L;
      long[] var0 = new long[5];
      int var4 = 0;
      String var5 = "\u0004y×ìd\u0092ß\t¯\u00adbÃd\u0092ß\u000eÿ8Ó#d\u0092ß\u000f";
      int var6 = "\u0004y×ìd\u0092ß\t¯\u00adbÃd\u0092ß\u000eÿ8Ó#d\u0092ß\u000f".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
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
                     com.c.c(280278024323397611L).setInt(null, 1);
                     com.c.c(565021139729850169L).setInt(null, (int)var0[3]);
                     com.c.c(542137494819116319L).setInt(null, (int)var0[0]);
                     com.c.c(365044829646503437L).setInt(null, (int)var0[1]);
                     com.c.c(554335396504449933L).setInt(null, (int)var0[2]);
                     com.c.c(383882141393946944L).setInt(null, (int)var0[4]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "h¾c¦d\u0092ß\bÎiC\nd\u0092ß\u000f";
                  var6 = "h¾c¦d\u0092ß\bÎiC\nd\u0092ß\u000f".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes("ISO-8859-1");
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





