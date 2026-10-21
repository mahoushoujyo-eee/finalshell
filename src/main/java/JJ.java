import javax.swing.JTextField;

public class JJ {
   private static final String a;
   private static final long b;

   public static int N(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic F8.y ()[Ljava/lang/String;
      // 03: bipush 1
      // 04: istore 2
      // 05: bipush 0
      // 06: istore 3
      // 07: astore 1
      // 08: aload 0
      // 09: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0c: istore 3
      // 0d: goto 14
      // 10: astore 4
      // 12: bipush 0
      // 13: istore 2
      // 14: iload 3
      // 15: aload 1
      // 16: ifnonnull 2c
      // 19: bipush 1
      // 1a: if_icmpge 2f
      // 1d: goto 24
      // 20: invokestatic JJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: bipush 1
      // 25: goto 2c
      // 28: invokestatic JJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: goto 30
      // 2f: bipush 0
      // 30: iload 3
      // 31: aload 1
      // 32: ifnonnull 4b
      // 35: getstatic JJ.b J
      // 38: l2i
      // 39: if_icmple 4e
      // 3c: goto 43
      // 3f: invokestatic JJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 4b
      // 47: invokestatic JJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ior
      // 50: aload 1
      // 51: ifnonnull 61
      // 54: ifeq 60
      // 57: goto 5e
      // 5a: invokestatic JJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: bipush 0
      // 5f: istore 2
      // 60: iload 2
      // 61: aload 1
      // 62: ifnonnull 7f
      // 65: ifne 7e
      // 68: goto 6f
      // 6b: invokestatic JJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: new java/lang/Exception
      // 72: dup
      // 73: getstatic JJ.a Ljava/lang/String;
      // 76: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 79: athrow
      // 7a: invokestatic JJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: iload 3
      // 7f: ireturn
   }

   public static void n(JTextField var0) {
      var0.setText(var0.getText().trim());
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "窼厏桭弖锵讐8".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 90;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 90;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 9;
               break;
            case 1:
               var21 = 54;
               break;
            case 2:
               var21 = 11;
               break;
            case 3:
               var21 = 67;
               break;
            case 4:
               var21 = 118;
               break;
            case 5:
               var21 = 37;
               break;
            default:
               var21 = 67;
         }
      } else {
         var13 = 90;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 753486037508985668L;
            long var12 = -5329357860416416956L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 90;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 9;
               break;
            case 1:
               var21 = 54;
               break;
            case 2:
               var21 = 11;
               break;
            case 3:
               var21 = 67;
               break;
            case 4:
               var21 = 118;
               break;
            case 5:
               var21 = 37;
               break;
            default:
               var21 = 67;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 9;
                  break;
               case 1:
                  var21 = 54;
                  break;
               case 2:
                  var21 = 11;
                  break;
               case 3:
                  var21 = 67;
                  break;
               case 4:
                  var21 = 118;
                  break;
               case 5:
                  var21 = 37;
                  break;
               default:
                  var21 = 67;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 753486037508985668L;
               long var11 = -5329357860416416956L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 9;
                  break;
               case 1:
                  var21 = 54;
                  break;
               case 2:
                  var21 = 11;
                  break;
               case 3:
                  var21 = 67;
                  break;
               case 4:
                  var21 = 118;
                  break;
               case 5:
                  var21 = 37;
                  break;
               default:
                  var21 = 67;
            }
         }
      }
   }
}





