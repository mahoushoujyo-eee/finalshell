public class br_4 {
   o__2 q;
   boolean R = false;
   UR E;
   private static final String a;

   br_4(UR var1) {
      this.E = var1;
      this.q = var1.e;
   }

   public int Z(byte[] param1, int param2, int param3) throws pV, InterruptedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic QI.N ()[Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 5
      // 06: aload 0
      // 07: invokevirtual br_4.N ()[B
      // 0a: astore 5
      // 0c: astore 4
      // 0e: iload 3
      // 0f: aload 4
      // 11: ifnull 3e
      // 14: aload 5
      // 16: arraylength
      // 17: if_icmpge 30
      // 1a: goto 21
      // 1d: invokestatic br_4.a (LpV;)LpV;
      // 20: athrow
      // 21: new pV
      // 24: dup
      // 25: getstatic br_4.a Ljava/lang/String;
      // 28: invokespecial pV.<init> (Ljava/lang/String;)V
      // 2b: athrow
      // 2c: invokestatic br_4.a (LpV;)LpV;
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

   public byte[] N() throws pV, InterruptedException {
      return this.q.n();
   }

   public void O() {
      String[] var1 = QI.N();
      br_4 var10000 = this;
      if (var1 != null) {
         if (this.R) {
            return;
         }

         var10000 = this;
      }

      var10000.q.F();
   }

   private static pV a(pV var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "5\u0015dB\u0016v\u00155\u0015dB\u0016v\u00155\u0015".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 102;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 102;
         var10006 = var0;
      } else {
         var6 = 102;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 102;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 33;
               break;
            case 1:
               var23 = 1;
               break;
            case 2:
               var23 = 112;
               break;
            case 3:
               var23 = 86;
               break;
            case 4:
               var23 = 2;
               break;
            case 5:
               var23 = 98;
               break;
            default:
               var23 = 1;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
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





