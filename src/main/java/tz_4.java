public class tz_4 {
   D8 T;
   boolean r = false;
   Qm_2 d;
   private static final String a;

   tz_4(Qm_2 var1) {
      this.d = var1;
      this.T = var1.j;
   }

   public int u(byte[] param1, int param2, int param3) throws fG_3, InterruptedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Qm_2.J ()[Lcom/ky_4;
      // 03: aconst_null
      // 04: astore 5
      // 06: astore 4
      // 08: aload 0
      // 09: invokevirtual tz_4.h ()[B
      // 0c: astore 5
      // 0e: iload 3
      // 0f: aload 4
      // 11: ifnull 3e
      // 14: aload 5
      // 16: arraylength
      // 17: if_icmpge 30
      // 1a: goto 21
      // 1d: invokestatic tz_4.a (LfG_3;)LfG_3;
      // 20: athrow
      // 21: new fG_3
      // 24: dup
      // 25: getstatic tz_4.a Ljava/lang/String;
      // 28: invokespecial fG_3.<init> (Ljava/lang/String;)V
      // 2b: athrow
      // 2c: invokestatic tz_4.a (LfG_3;)LfG_3;
      // 2f: athrow
      // 30: aload 5
      // 32: bipush 0
      // 33: aload 1
      // 34: iload 2
      // 35: aload 5
      // 37: arraylength
      // 38: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3b: aload 5
      // 3d: arraylength
      // 3e: ireturn
   }

   public byte[] h() throws fG_3, InterruptedException {
      return this.T.e();
   }

   public void X() {
      com.ky_4[] var1 = Qm_2.J();
      tz_4 var10000 = this;
      if (var1 != null) {
         if (this.r) {
            return;
         }

         var10000 = this;
      }

      var10000.T.g();
   }

   private static fG_3 a(fG_3 var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0001s\u0012\u0010$.".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 126;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 126;
         var10006 = var0;
      } else {
         var6 = 126;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 126;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 26;
            case 1 -> 127;
            case 2 -> 30;
            case 3 -> 1;
            case 4 -> 40;
            case 5 -> 101;
            default -> 88;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





