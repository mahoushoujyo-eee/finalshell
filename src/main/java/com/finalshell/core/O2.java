package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.io.File;

public class O2 {
   public static Ip5 R;
   public static String[] a;
   public static String[] b;
   public static long c;

   public static void main(String[] param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/O2.R ()V
      // 003: invokestatic com/finalshell/core/Zh2_2.n ()[I
      // 006: getstatic com/finalshell/core/O2.R Lcom/finalshell/core/Ip5;
      // 009: sipush -26800
      // 00c: sipush -28707
      // 00f: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 012: invokevirtual com/finalshell/core/Ip5.n (Ljava/lang/String;)Lcom/finalshell/core/C_3;
      // 015: astore 2
      // 016: astore 1
      // 017: aload 2
      // 018: getfield com/finalshell/core/C_3.w Ljava/lang/String;
      // 01b: sipush -26788
      // 01e: sipush -14743
      // 021: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 024: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 027: astore 3
      // 028: aload 2
      // 029: getfield com/finalshell/core/C_3.N Ljava/lang/String;
      // 02c: sipush -26791
      // 02f: sipush 9573
      // 032: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 035: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 038: astore 4
      // 03a: new com/finalshell/core/Zh2_2
      // 03d: dup
      // 03e: invokespecial com/finalshell/core/Zh2_2.<init> ()V
      // 041: astore 5
      // 043: aload 5
      // 045: aload 3
      // 046: bipush 1
      // 047: aaload
      // 048: aload 1
      // 049: ifnull 081
      // 04c: invokevirtual com/finalshell/core/Zh2_2.B (Ljava/lang/String;)V
      // 04f: aload 4
      // 051: bipush 0
      // 052: aaload
      // 053: ldc "0"
      // 055: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 058: ifeq 074
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 5
      // 064: ldc ""
      // 066: invokevirtual com/finalshell/core/Zh2_2.n (Ljava/lang/String;)V
      // 069: aload 1
      // 06a: ifnonnull 084
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 5
      // 076: aload 4
      // 078: bipush 0
      // 079: aaload
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: invokevirtual com/finalshell/core/Zh2_2.n (Ljava/lang/String;)V
      // 084: aload 4
      // 086: bipush 1
      // 087: aaload
      // 088: ldc "*"
      // 08a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08d: ifeq 0a2
      // 090: aload 5
      // 092: ldc ""
      // 094: invokevirtual com/finalshell/core/Zh2_2.M (Ljava/lang/String;)V
      // 097: aload 1
      // 098: ifnonnull 0b2
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: aload 5
      // 0a4: aload 4
      // 0a6: bipush 1
      // 0a7: aaload
      // 0a8: invokevirtual com/finalshell/core/Zh2_2.M (Ljava/lang/String;)V
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 5
      // 0b4: invokevirtual com/finalshell/core/Zh2_2.k ()Ljava/lang/String;
      // 0b7: aload 5
      // 0b9: invokevirtual com/finalshell/core/Zh2_2.A ()Ljava/lang/String;
      // 0bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bf: aload 1
      // 0c0: ifnull 0e3
      // 0c3: ifeq 0db
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: aload 5
      // 0cf: ldc ""
      // 0d1: invokevirtual com/finalshell/core/Zh2_2.M (Ljava/lang/String;)V
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: aload 3
      // 0dc: bipush 5
      // 0dd: aaload
      // 0de: ldc "*"
      // 0e0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e3: ifeq 0f8
      // 0e6: aload 5
      // 0e8: ldc ""
      // 0ea: invokevirtual com/finalshell/core/Zh2_2.y (Ljava/lang/String;)V
      // 0ed: aload 1
      // 0ee: ifnonnull 107
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 5
      // 0fa: aload 3
      // 0fb: bipush 5
      // 0fc: aaload
      // 0fd: invokevirtual com/finalshell/core/Zh2_2.y (Ljava/lang/String;)V
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 10a: ifnull 11a
      // 10d: bipush 2
      // 10e: newarray 10
      // 110: invokestatic com/finalshell/core/Zh2_2.T ([I)V
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: return
   }

   public static synchronized void R() {
      if (R == null) {
         String var0 = (String)Registry.lookupField(417253634927399276L).get(null) + File.separator + a(-26794, 30242);

         try {
            R = new Ip5(var0);
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }
   }

   public static Zh2_2 w(String var0) {
      int[] var1;
      Zh2_2 var2;
      String[] var4;
      String[] var5;
      label41: {
         int[] var10000 = Zh2_2.n();
         R();
         var2 = new Zh2_2();
         var1 = var10000;
         C_3 var3 = R.n(var0);
         var4 = var3.w.split(a(-26791, 9573));
         var5 = var3.N.split(a(-26791, 9573));
         Zh2_2 var6 = var2;
         String var10001 = var4[1];
         if (var1 != null) {
            var2.B(var10001);
            if (var5[0].equals("*")) {
               var2.n("");
               if (var1 != null) {
                  break label41;
               }

               Ky4.K(new String[1]);
            }

            var6 = var2;
            var10001 = var5[0];
         }

         var6.n(var10001);
      }

      label33: {
         if (var5[1].equals("*")) {
            var2.M("");
            if (var1 != null) {
               break label33;
            }
         }

         var2.M(var5[1]);
      }

      boolean var7 = var2.k().equals(var2.A());
      if (var1 != null) {
         if (var7) {
            var2.M("");
         }

         var7 = var4[5].equals("*");
      }

      if (var7) {
         var2.y("");
         if (var1 != null) {
            return var2;
         }
      }

      var2.y(var4[5]);
      return var2;
   }

   public static Zh2_2 F(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Zh2_2.n ()[I
      // 003: new com/finalshell/core/Zh2_2
      // 006: dup
      // 007: invokespecial com/finalshell/core/Zh2_2.<init> ()V
      // 00a: astore 2
      // 00b: astore 1
      // 00c: bipush 0
      // 00d: istore 3
      // 00e: aconst_null
      // 00f: astore 4
      // 011: aconst_null
      // 012: astore 5
      // 014: aconst_null
      // 015: astore 6
      // 017: aconst_null
      // 018: astore 7
      // 01a: bipush 0
      // 01b: istore 8
      // 01d: iload 8
      // 01f: bipush 2
      // 020: if_icmpge 16f
      // 023: new com/finalshell/ui/model/O0
      // 026: dup
      // 027: invokespecial com/finalshell/ui/model/O0.<init> ()V
      // 02a: astore 9
      // 02c: aload 9
      // 02e: sipush -26799
      // 031: sipush -25365
      // 034: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 037: sipush -26787
      // 03a: sipush 30332
      // 03d: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 040: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 043: pop
      // 044: aload 9
      // 046: sipush -26790
      // 049: sipush -17120
      // 04c: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 04f: aload 0
      // 050: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 053: pop
      // 054: aload 9
      // 056: ldc2_w 279993414668031362
      // 059: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 05c: aconst_null
      // 05d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 060: ldc2_w 620693334424877816
      // 063: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 066: aconst_null
      // 067: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 06a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 06d: ldc2_w 339907473838616993
      // 070: astore 13
      // 072: ldc2_w 339907473838616993
      // 075: aload 13
      // 077: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 07a: checkcast com/finalshell/ui/model/O0
      // 07d: goto 084
      // 080: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 083: athrow
      // 084: astore 10
      // 086: aload 10
      // 088: astore 11
      // 08a: aload 10
      // 08c: sipush -26789
      // 08f: sipush -31032
      // 092: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 095: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 098: istore 12
      // 09a: iload 12
      // 09c: aload 1
      // 09d: ifnull 0c0
      // 0a0: bipush 1
      // 0a1: if_icmpne 146
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: aload 11
      // 0ad: sipush -26792
      // 0b0: sipush -31740
      // 0b3: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 0b6: invokevirtual com/finalshell/ui/model/O0.containsKey (Ljava/lang/Object;)Z
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: aload 1
      // 0c1: ifnull 11d
      // 0c4: ifeq 14a
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 11
      // 0d0: sipush -26797
      // 0d3: sipush -28077
      // 0d6: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 0d9: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 0dc: astore 4
      // 0de: aload 11
      // 0e0: sipush -26786
      // 0e3: sipush -11391
      // 0e6: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 0e9: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 0ec: astore 5
      // 0ee: aload 5
      // 0f0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f3: ldc2_w 482569859794861816
      // 0f6: astore 15
      // 0f8: ldc2_w 482569859794861816
      // 0fb: aload 15
      // 0fd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 100: checkcast java/lang/String
      // 103: goto 10a
      // 106: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 109: athrow
      // 10a: astore 5
      // 10c: aload 11
      // 10e: sipush -26798
      // 111: sipush -29956
      // 114: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 117: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 11a: astore 6
      // 11c: bipush 1
      // 11d: istore 3
      // 11e: aload 2
      // 11f: aload 4
      // 121: invokevirtual com/finalshell/core/Zh2_2.B (Ljava/lang/String;)V
      // 124: aload 2
      // 125: aload 5
      // 127: invokevirtual com/finalshell/core/Zh2_2.M (Ljava/lang/String;)V
      // 12a: aload 2
      // 12b: aload 6
      // 12d: invokevirtual com/finalshell/core/Zh2_2.n (Ljava/lang/String;)V
      // 130: aload 2
      // 131: aload 11
      // 133: sipush -26785
      // 136: sipush 32467
      // 139: invokestatic com/finalshell/core/O2.a (II)Ljava/lang/String;
      // 13c: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 13f: invokevirtual com/finalshell/core/Zh2_2.y (Ljava/lang/String;)V
      // 142: aload 1
      // 143: ifnonnull 16f
      // 146: aload 1
      // 147: ifnonnull 16f
      // 14a: goto 16f
      // 14d: invokestatic com/finalshell/core/O2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: astore 9
      // 153: aload 9
      // 155: invokevirtual java/lang/Exception.printStackTrace ()V
      // 158: getstatic com/finalshell/core/O2.c J
      // 15b: invokestatic java/lang/Thread.sleep (J)V
      // 15e: goto 168
      // 161: astore 10
      // 163: aload 10
      // 165: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 168: iinc 8 1
      // 16b: aload 1
      // 16c: ifnonnull 01d
      // 16f: aload 2
      // 170: areturn
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -26790) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 193;
               break;
            case 1:
               var10000 = 106;
               break;
            case 2:
               var10000 = 231;
               break;
            case 3:
               var10000 = 161;
               break;
            case 4:
               var10000 = 166;
               break;
            case 5:
               var10000 = 158;
               break;
            case 6:
               var10000 = 223;
               break;
            case 7:
               var10000 = 81;
               break;
            case 8:
               var10000 = 91;
               break;
            case 9:
               var10000 = 99;
               break;
            case 10:
               var10000 = 244;
               break;
            case 11:
               var10000 = 86;
               break;
            case 12:
               var10000 = 1;
               break;
            case 13:
               var10000 = 132;
               break;
            case 14:
               var10000 = 185;
               break;
            case 15:
               var10000 = 181;
               break;
            case 16:
               var10000 = 20;
               break;
            case 17:
               var10000 = 139;
               break;
            case 18:
               var10000 = 180;
               break;
            case 19:
               var10000 = 236;
               break;
            case 20:
               var10000 = 173;
               break;
            case 21:
               var10000 = 29;
               break;
            case 22:
               var10000 = 116;
               break;
            case 23:
               var10000 = 190;
               break;
            case 24:
               var10000 = 228;
               break;
            case 25:
               var10000 = 21;
               break;
            case 26:
               var10000 = 111;
               break;
            case 27:
               var10000 = 23;
               break;
            case 28:
               var10000 = 82;
               break;
            case 29:
               var10000 = 149;
               break;
            case 30:
               var10000 = 220;
               break;
            case 31:
               var10000 = 73;
               break;
            case 32:
               var10000 = 137;
               break;
            case 33:
               var10000 = 219;
               break;
            case 34:
               var10000 = 227;
               break;
            case 35:
               var10000 = 101;
               break;
            case 36:
               var10000 = 178;
               break;
            case 37:
               var10000 = 254;
               break;
            case 38:
               var10000 = 230;
               break;
            case 39:
               var10000 = 167;
               break;
            case 40:
               var10000 = 157;
               break;
            case 41:
               var10000 = 122;
               break;
            case 42:
               var10000 = 239;
               break;
            case 43:
               var10000 = 11;
               break;
            case 44:
               var10000 = 134;
               break;
            case 45:
               var10000 = 174;
               break;
            case 46:
               var10000 = 235;
               break;
            case 47:
               var10000 = 103;
               break;
            case 48:
               var10000 = 154;
               break;
            case 49:
               var10000 = 152;
               break;
            case 50:
               var10000 = 93;
               break;
            case 51:
               var10000 = 155;
               break;
            case 52:
               var10000 = 96;
               break;
            case 53:
               var10000 = 22;
               break;
            case 54:
               var10000 = 118;
               break;
            case 55:
               var10000 = 177;
               break;
            case 56:
               var10000 = 65;
               break;
            case 57:
               var10000 = 145;
               break;
            case 58:
               var10000 = 249;
               break;
            case 59:
               var10000 = 37;
               break;
            case 60:
               var10000 = 186;
               break;
            case 61:
               var10000 = 226;
               break;
            case 62:
               var10000 = 216;
               break;
            case 63:
               var10000 = 26;
               break;
            case 64:
               var10000 = 85;
               break;
            case 65:
               var10000 = 72;
               break;
            case 66:
               var10000 = 0;
               break;
            case 67:
               var10000 = 182;
               break;
            case 68:
               var10000 = 133;
               break;
            case 69:
               var10000 = 211;
               break;
            case 70:
               var10000 = 127;
               break;
            case 71:
               var10000 = 140;
               break;
            case 72:
               var10000 = 184;
               break;
            case 73:
               var10000 = 246;
               break;
            case 74:
               var10000 = 79;
               break;
            case 75:
               var10000 = 128;
               break;
            case 76:
               var10000 = 124;
               break;
            case 77:
               var10000 = 43;
               break;
            case 78:
               var10000 = 188;
               break;
            case 79:
               var10000 = 129;
               break;
            case 80:
               var10000 = 238;
               break;
            case 81:
               var10000 = 64;
               break;
            case 82:
               var10000 = 192;
               break;
            case 83:
               var10000 = 94;
               break;
            case 84:
               var10000 = 40;
               break;
            case 85:
               var10000 = 215;
               break;
            case 86:
               var10000 = 16;
               break;
            case 87:
               var10000 = 109;
               break;
            case 88:
               var10000 = 59;
               break;
            case 89:
               var10000 = 55;
               break;
            case 90:
               var10000 = 17;
               break;
            case 91:
               var10000 = 38;
               break;
            case 92:
               var10000 = 74;
               break;
            case 93:
               var10000 = 66;
               break;
            case 94:
               var10000 = 119;
               break;
            case 95:
               var10000 = 221;
               break;
            case 96:
               var10000 = 229;
               break;
            case 97:
               var10000 = 34;
               break;
            case 98:
               var10000 = 90;
               break;
            case 99:
               var10000 = 135;
               break;
            case 100:
               var10000 = 9;
               break;
            case 101:
               var10000 = 83;
               break;
            case 102:
               var10000 = 53;
               break;
            case 103:
               var10000 = 46;
               break;
            case 104:
               var10000 = 206;
               break;
            case 105:
               var10000 = 102;
               break;
            case 106:
               var10000 = 75;
               break;
            case 107:
               var10000 = 95;
               break;
            case 108:
               var10000 = 237;
               break;
            case 109:
               var10000 = 115;
               break;
            case 110:
               var10000 = 69;
               break;
            case 111:
               var10000 = 187;
               break;
            case 112:
               var10000 = 30;
               break;
            case 113:
               var10000 = 5;
               break;
            case 114:
               var10000 = 7;
               break;
            case 115:
               var10000 = 210;
               break;
            case 116:
               var10000 = 24;
               break;
            case 117:
               var10000 = 179;
               break;
            case 118:
               var10000 = 209;
               break;
            case 119:
               var10000 = 240;
               break;
            case 120:
               var10000 = 146;
               break;
            case 121:
               var10000 = 242;
               break;
            case 122:
               var10000 = 71;
               break;
            case 123:
               var10000 = 160;
               break;
            case 124:
               var10000 = 142;
               break;
            case 125:
               var10000 = 113;
               break;
            case 126:
               var10000 = 100;
               break;
            case 127:
               var10000 = 189;
               break;
            case 128:
               var10000 = 198;
               break;
            case 129:
               var10000 = 125;
               break;
            case 130:
               var10000 = 67;
               break;
            case 131:
               var10000 = 76;
               break;
            case 132:
               var10000 = 87;
               break;
            case 133:
               var10000 = 68;
               break;
            case 134:
               var10000 = 19;
               break;
            case 135:
               var10000 = 197;
               break;
            case 136:
               var10000 = 70;
               break;
            case 137:
               var10000 = 208;
               break;
            case 138:
               var10000 = 78;
               break;
            case 139:
               var10000 = 148;
               break;
            case 140:
               var10000 = 191;
               break;
            case 141:
               var10000 = 52;
               break;
            case 142:
               var10000 = 203;
               break;
            case 143:
               var10000 = 12;
               break;
            case 144:
               var10000 = 176;
               break;
            case 145:
               var10000 = 57;
               break;
            case 146:
               var10000 = 39;
               break;
            case 147:
               var10000 = 156;
               break;
            case 148:
               var10000 = 63;
               break;
            case 149:
               var10000 = 2;
               break;
            case 150:
               var10000 = 104;
               break;
            case 151:
               var10000 = 80;
               break;
            case 152:
               var10000 = 31;
               break;
            case 153:
               var10000 = 241;
               break;
            case 154:
               var10000 = 255;
               break;
            case 155:
               var10000 = 207;
               break;
            case 156:
               var10000 = 202;
               break;
            case 157:
               var10000 = 35;
               break;
            case 158:
               var10000 = 175;
               break;
            case 159:
               var10000 = 214;
               break;
            case 160:
               var10000 = 89;
               break;
            case 161:
               var10000 = 120;
               break;
            case 162:
               var10000 = 105;
               break;
            case 163:
               var10000 = 6;
               break;
            case 164:
               var10000 = 153;
               break;
            case 165:
               var10000 = 163;
               break;
            case 166:
               var10000 = 3;
               break;
            case 167:
               var10000 = 97;
               break;
            case 168:
               var10000 = 54;
               break;
            case 169:
               var10000 = 164;
               break;
            case 170:
               var10000 = 25;
               break;
            case 171:
               var10000 = 49;
               break;
            case 172:
               var10000 = 253;
               break;
            case 173:
               var10000 = 196;
               break;
            case 174:
               var10000 = 143;
               break;
            case 175:
               var10000 = 4;
               break;
            case 176:
               var10000 = 138;
               break;
            case 177:
               var10000 = 243;
               break;
            case 178:
               var10000 = 183;
               break;
            case 179:
               var10000 = 212;
               break;
            case 180:
               var10000 = 47;
               break;
            case 181:
               var10000 = 28;
               break;
            case 182:
               var10000 = 172;
               break;
            case 183:
               var10000 = 98;
               break;
            case 184:
               var10000 = 162;
               break;
            case 185:
               var10000 = 41;
               break;
            case 186:
               var10000 = 147;
               break;
            case 187:
               var10000 = 123;
               break;
            case 188:
               var10000 = 247;
               break;
            case 189:
               var10000 = 194;
               break;
            case 190:
               var10000 = 234;
               break;
            case 191:
               var10000 = 159;
               break;
            case 192:
               var10000 = 121;
               break;
            case 193:
               var10000 = 213;
               break;
            case 194:
               var10000 = 151;
               break;
            case 195:
               var10000 = 108;
               break;
            case 196:
               var10000 = 48;
               break;
            case 197:
               var10000 = 15;
               break;
            case 198:
               var10000 = 51;
               break;
            case 199:
               var10000 = 169;
               break;
            case 200:
               var10000 = 45;
               break;
            case 201:
               var10000 = 112;
               break;
            case 202:
               var10000 = 36;
               break;
            case 203:
               var10000 = 18;
               break;
            case 204:
               var10000 = 222;
               break;
            case 205:
               var10000 = 251;
               break;
            case 206:
               var10000 = 117;
               break;
            case 207:
               var10000 = 225;
               break;
            case 208:
               var10000 = 114;
               break;
            case 209:
               var10000 = 170;
               break;
            case 210:
               var10000 = 248;
               break;
            case 211:
               var10000 = 42;
               break;
            case 212:
               var10000 = 205;
               break;
            case 213:
               var10000 = 13;
               break;
            case 214:
               var10000 = 84;
               break;
            case 215:
               var10000 = 56;
               break;
            case 216:
               var10000 = 250;
               break;
            case 217:
               var10000 = 224;
               break;
            case 218:
               var10000 = 107;
               break;
            case 219:
               var10000 = 88;
               break;
            case 220:
               var10000 = 171;
               break;
            case 221:
               var10000 = 50;
               break;
            case 222:
               var10000 = 165;
               break;
            case 223:
               var10000 = 27;
               break;
            case 224:
               var10000 = 33;
               break;
            case 225:
               var10000 = 195;
               break;
            case 226:
               var10000 = 199;
               break;
            case 227:
               var10000 = 77;
               break;
            case 228:
               var10000 = 200;
               break;
            case 229:
               var10000 = 126;
               break;
            case 230:
               var10000 = 168;
               break;
            case 231:
               var10000 = 252;
               break;
            case 232:
               var10000 = 58;
               break;
            case 233:
               var10000 = 144;
               break;
            case 234:
               var10000 = 131;
               break;
            case 235:
               var10000 = 8;
               break;
            case 236:
               var10000 = 233;
               break;
            case 237:
               var10000 = 92;
               break;
            case 238:
               var10000 = 217;
               break;
            case 239:
               var10000 = 10;
               break;
            case 240:
               var10000 = 61;
               break;
            case 241:
               var10000 = 232;
               break;
            case 242:
               var10000 = 14;
               break;
            case 243:
               var10000 = 245;
               break;
            case 244:
               var10000 = 201;
               break;
            case 245:
               var10000 = 62;
               break;
            case 246:
               var10000 = 136;
               break;
            case 247:
               var10000 = 204;
               break;
            case 248:
               var10000 = 130;
               break;
            case 249:
               var10000 = 60;
               break;
            case 250:
               var10000 = 150;
               break;
            case 251:
               var10000 = 110;
               break;
            case 252:
               var10000 = 141;
               break;
            case 253:
               var10000 = 218;
               break;
            case 254:
               var10000 = 32;
               break;
            default:
               var10000 = 44;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var7 = new String[13];
      int var5 = 0;
      String var4 = "Ev\u0004íî\u009aP\u0007®kãëW\u009d2\u0002\u0001¨\u0004&\u000bó6\u00034°þ\u0002,æ\b\u0016Sq  \rNæ\b\u001eÃ\u009eX¼ìë\u009e\u0007`ê:Ûl\u009bU\rÚmªí\t\u0010\u001e\u0014\nßË§g";
      int var6 = "Ev\u0004íî\u009aP\u0007®kãëW\u009d2\u0002\u0001¨\u0004&\u000bó6\u00034°þ\u0002,æ\b\u0016Sq  \rNæ\b\u001eÃ\u009eX¼ìë\u009e\u0007`ê:Ûl\u009bU\rÚmªí\t\u0010\u001e\u0014\nßË§g"
         .length();
      char var3 = 2;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 55;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 124;
                        break;
                     case 1:
                        var50 = 53;
                        break;
                     case 2:
                        var50 = 18;
                        break;
                     case 3:
                        var50 = 29;
                        break;
                     case 4:
                        var50 = 23;
                        break;
                     case 5:
                        var50 = 67;
                        break;
                     default:
                        var50 = 104;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[13];
                     long var0 = 6972385050631036090L;
                     long var27 = 6972385050631036754L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     R = null;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "q\u0085¾\u008bLPE\nÄ JÏïZÌ\u0019DM";
                  var6 = "q\u0085¾\u008bLPE\nÄ JÏïZÌ\u0019DM".length();
                  var3 = 7;
                  var10 = -1;
            }

            var10000 = 42;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





