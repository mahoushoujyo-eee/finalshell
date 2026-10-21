public class TN {
   byte[] u;
   short n;
   private static com.ky_4[] Z;

   public byte[] c() {
      return this.u;
   }

   public static short V(byte[] var0) {
      com.ky_4[] var10000 = D();
      short var2 = -1;
      com.ky_4[] var1 = var10000;
      int var3 = var0.length;
      if (var1 != null) {
         if (var3 >= 2) {
            var2 = B8.M(var0, 0);
         }

         var3 = var2;
      }

      return (short)var3;
   }

   public static void s(com.ky_4[] var0) {
      Z = var0;
   }

   public static com.ky_4[] D() {
      return Z;
   }

   static {
      if (D() == null) {
         s(new com.ky_4[4]);
      }
   }
}





