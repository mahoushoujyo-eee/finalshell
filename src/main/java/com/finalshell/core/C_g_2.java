package com.finalshell.core;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C_g_2 extends W3_4 {
   public final Set Q = new HashSet();
   public final Map i = new HashMap();
   public final C_y_2_2 O;
   public boolean K = Boolean.getBoolean(b(-26763, -4859));
   public boolean C = this.K;
   public boolean l = this.K;
   static boolean p;
   public static String[] c;
   public static String[] d;

   public C_g_2() {
      this(ClassLoader.getSystemClassLoader());
   }

   public C_g_2(ClassLoader var1) {
      this(var1, (File[])null, null);
   }

   public C_g_2(ClassLoader var1, @C_9 File[] var2, @C_9 String var3) {
      this(var1, (J_5)(var2 == null ? new Q2_3(new File(".")) : new A_5(var2)), var3);
   }

   public C_g_2(ClassLoader var1, J_5 var2, @C_9 String var3) {
      this(var1, new C_y_2_2(var2, var3, new C_m_2(var1)));
   }

   public C_g_2(ClassLoader var1, C_y_2_2 var2) {
      super(var1);
      this.O = var2;
   }

   @Override
   public void K(File[] var1) {
      this.f(new A_5(var1));
   }

   @Override
   public void f(J_5 var1) {
      this.O.T(var1);
   }

   @Override
   public void n(Charset var1) {
      this.O.v(var1);
   }

   @Override
   public void H(boolean var1, boolean var2, boolean var3) {
      this.K = var1;
      this.C = var2;
      this.l = var3;
   }

   public void I(int var1) {
      this.O.P(var1);
   }

   public void e(@C_9 U_5 var1) {
      this.O.H(var1);
   }

   public void e$void(@C_9 Y_5 var1) {
      this.O.z(var1);
   }

   @Override
   protected java.lang.Class findClass(@C_9 String param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: getstatic com/finalshell/core/C_g_2.p Z
      // 07: ifne 2c
      // 0a: aload 1
      // 0b: aload 2
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: ifnonnull 2c
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: new java/lang/AssertionError
      // 23: dup
      // 24: invokespecial java/lang/AssertionError.<init> ()V
      // 27: athrow
      // 28: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/C_g_2.i Ljava/util/Map;
      // 30: aload 1
      // 31: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 36: checkcast [B
      // 39: astore 3
      // 3a: aload 3
      // 3b: ifnonnull b1
      // 3e: aload 0
      // 3f: aload 1
      // 40: invokevirtual com/finalshell/core/C_g_2.Q (Ljava/lang/String;)Ljava/util/Map;
      // 43: astore 4
      // 45: aload 4
      // 47: aload 2
      // 48: ifnull 77
      // 4b: ifnonnull 62
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: new java/lang/ClassNotFoundException
      // 58: dup
      // 59: aload 1
      // 5a: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;)V
      // 5d: athrow
      // 5e: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: aload 0
      // 63: getfield com/finalshell/core/C_g_2.i Ljava/util/Map;
      // 66: aload 4
      // 68: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 6d: aload 0
      // 6e: getfield com/finalshell/core/C_g_2.i Ljava/util/Map;
      // 71: aload 1
      // 72: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 77: checkcast [B
      // 7a: astore 3
      // 7b: aload 3
      // 7c: ifnonnull b1
      // 7f: new com/finalshell/core/P_5
      // 82: dup
      // 83: new java/lang/StringBuilder
      // 86: dup
      // 87: invokespecial java/lang/StringBuilder.<init> ()V
      // 8a: sipush -26761
      // 8d: sipush 29329
      // 90: invokestatic com/finalshell/core/C_g_2.b (II)Ljava/lang/String;
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 96: aload 1
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: sipush -26764
      // 9d: sipush 11266
      // a0: invokestatic com/finalshell/core/C_g_2.b (II)Ljava/lang/String;
      // a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a9: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // ac: athrow
      // ad: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: sipush -26762
      // b4: sipush 25507
      // b7: invokestatic com/finalshell/core/C_g_2.b (II)Ljava/lang/String;
      // ba: invokestatic java/lang/Boolean.getBoolean (Ljava/lang/String;)Z
      // bd: ifeq cb
      // c0: aload 3
      // c1: invokestatic com/finalshell/core/S_4.K ([B)V
      // c4: goto cb
      // c7: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ca: athrow
      // cb: aload 0
      // cc: aload 1
      // cd: aload 3
      // ce: invokespecial com/finalshell/core/C_g_2.n (Ljava/lang/String;[B)Ljava/lang/Class;
      // d1: areturn
   }

   @C_9
   protected Map Q(String var1) throws ClassNotFoundException {
      String[] var2 = RG_2.C();

      try {
         if (this.O.X(F0_2.n(var1)) == null) {
            return null;
         }
      } catch (B2_5 var9) {
         throw a(var9);
      }

      HashMap var3 = new HashMap();

      label45:
      while (true) {
         for (H3_2 var5 : this.O.V()) {
            label40: {
               label39: {
                  try {
                     if (var2 == null) {
                        break label39;
                     }

                     if (this.Q.contains(var5)) {
                        break label40;
                     }
                  } catch (B2_5 var8) {
                     throw a(var8);
                  }

                  try {
                     var5.q(this.K, this.C, this.l, new C_b_2_2(this, var3));
                  } catch (B2_5 var7) {
                     throw new ClassNotFoundException(var7.getMessage(), var7);
                  }
               }

               this.Q.add(var5);
               if (var2 != null) {
                  continue label45;
               }
            }

            if (var2 == null) {
               return var3;
            }
         }

         return var3;
      }
   }

   public java.lang.Class n(String param1, byte[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: bipush 0
      // 08: aload 2
      // 09: arraylength
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/C_g_2.X Lcom/finalshell/core/B_4;
      // 0e: aload 3
      // 0f: ifnull 27
      // 12: ifnull 33
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/finalshell/core/C_g_2.X Lcom/finalshell/core/B_4;
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/C_g_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 1
      // 28: invokestatic com/finalshell/core/Cr2_2.R (Ljava/lang/String;)Ljava/lang/String;
      // 2b: invokeinterface com/finalshell/core/B_4.S (Ljava/lang/String;)Ljava/security/ProtectionDomain; 2
      // 30: goto 34
      // 33: aconst_null
      // 34: invokevirtual com/finalshell/core/C_g_2.defineClass (Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;
      // 37: areturn
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -26762) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 201;
               break;
            case 1:
               var10000 = 72;
               break;
            case 2:
               var10000 = 221;
               break;
            case 3:
               var10000 = 191;
               break;
            case 4:
               var10000 = 155;
               break;
            case 5:
               var10000 = 163;
               break;
            case 6:
               var10000 = 226;
               break;
            case 7:
               var10000 = 97;
               break;
            case 8:
               var10000 = 192;
               break;
            case 9:
               var10000 = 32;
               break;
            case 10:
               var10000 = 106;
               break;
            case 11:
               var10000 = 230;
               break;
            case 12:
               var10000 = 12;
               break;
            case 13:
               var10000 = 184;
               break;
            case 14:
               var10000 = 57;
               break;
            case 15:
               var10000 = 193;
               break;
            case 16:
               var10000 = 135;
               break;
            case 17:
               var10000 = 36;
               break;
            case 18:
               var10000 = 175;
               break;
            case 19:
               var10000 = 69;
               break;
            case 20:
               var10000 = 171;
               break;
            case 21:
               var10000 = 144;
               break;
            case 22:
               var10000 = 159;
               break;
            case 23:
               var10000 = 125;
               break;
            case 24:
               var10000 = 205;
               break;
            case 25:
               var10000 = 173;
               break;
            case 26:
               var10000 = 215;
               break;
            case 27:
               var10000 = 62;
               break;
            case 28:
               var10000 = 115;
               break;
            case 29:
               var10000 = 146;
               break;
            case 30:
               var10000 = 189;
               break;
            case 31:
               var10000 = 103;
               break;
            case 32:
               var10000 = 24;
               break;
            case 33:
               var10000 = 46;
               break;
            case 34:
               var10000 = 147;
               break;
            case 35:
               var10000 = 18;
               break;
            case 36:
               var10000 = 45;
               break;
            case 37:
               var10000 = 90;
               break;
            case 38:
               var10000 = 74;
               break;
            case 39:
               var10000 = 121;
               break;
            case 40:
               var10000 = 200;
               break;
            case 41:
               var10000 = 234;
               break;
            case 42:
               var10000 = 44;
               break;
            case 43:
               var10000 = 77;
               break;
            case 44:
               var10000 = 59;
               break;
            case 45:
               var10000 = 95;
               break;
            case 46:
               var10000 = 246;
               break;
            case 47:
               var10000 = 197;
               break;
            case 48:
               var10000 = 83;
               break;
            case 49:
               var10000 = 139;
               break;
            case 50:
               var10000 = 117;
               break;
            case 51:
               var10000 = 177;
               break;
            case 52:
               var10000 = 15;
               break;
            case 53:
               var10000 = 232;
               break;
            case 54:
               var10000 = 148;
               break;
            case 55:
               var10000 = 65;
               break;
            case 56:
               var10000 = 211;
               break;
            case 57:
               var10000 = 143;
               break;
            case 58:
               var10000 = 130;
               break;
            case 59:
               var10000 = 254;
               break;
            case 60:
               var10000 = 242;
               break;
            case 61:
               var10000 = 49;
               break;
            case 62:
               var10000 = 203;
               break;
            case 63:
               var10000 = 208;
               break;
            case 64:
               var10000 = 82;
               break;
            case 65:
               var10000 = 145;
               break;
            case 66:
               var10000 = 50;
               break;
            case 67:
               var10000 = 209;
               break;
            case 68:
               var10000 = 37;
               break;
            case 69:
               var10000 = 157;
               break;
            case 70:
               var10000 = 151;
               break;
            case 71:
               var10000 = 160;
               break;
            case 72:
               var10000 = 140;
               break;
            case 73:
               var10000 = 178;
               break;
            case 74:
               var10000 = 138;
               break;
            case 75:
               var10000 = 122;
               break;
            case 76:
               var10000 = 111;
               break;
            case 77:
               var10000 = 131;
               break;
            case 78:
               var10000 = 73;
               break;
            case 79:
               var10000 = 101;
               break;
            case 80:
               var10000 = 2;
               break;
            case 81:
               var10000 = 253;
               break;
            case 82:
               var10000 = 183;
               break;
            case 83:
               var10000 = 141;
               break;
            case 84:
               var10000 = 68;
               break;
            case 85:
               var10000 = 123;
               break;
            case 86:
               var10000 = 179;
               break;
            case 87:
               var10000 = 236;
               break;
            case 88:
               var10000 = 93;
               break;
            case 89:
               var10000 = 3;
               break;
            case 90:
               var10000 = 21;
               break;
            case 91:
               var10000 = 196;
               break;
            case 92:
               var10000 = 9;
               break;
            case 93:
               var10000 = 165;
               break;
            case 94:
               var10000 = 127;
               break;
            case 95:
               var10000 = 22;
               break;
            case 96:
               var10000 = 238;
               break;
            case 97:
               var10000 = 43;
               break;
            case 98:
               var10000 = 239;
               break;
            case 99:
               var10000 = 170;
               break;
            case 100:
               var10000 = 240;
               break;
            case 101:
               var10000 = 219;
               break;
            case 102:
               var10000 = 31;
               break;
            case 103:
               var10000 = 64;
               break;
            case 104:
               var10000 = 217;
               break;
            case 105:
               var10000 = 53;
               break;
            case 106:
               var10000 = 63;
               break;
            case 107:
               var10000 = 1;
               break;
            case 108:
               var10000 = 6;
               break;
            case 109:
               var10000 = 5;
               break;
            case 110:
               var10000 = 42;
               break;
            case 111:
               var10000 = 120;
               break;
            case 112:
               var10000 = 110;
               break;
            case 113:
               var10000 = 108;
               break;
            case 114:
               var10000 = 20;
               break;
            case 115:
               var10000 = 16;
               break;
            case 116:
               var10000 = 75;
               break;
            case 117:
               var10000 = 251;
               break;
            case 118:
               var10000 = 194;
               break;
            case 119:
               var10000 = 114;
               break;
            case 120:
               var10000 = 210;
               break;
            case 121:
               var10000 = 225;
               break;
            case 122:
               var10000 = 137;
               break;
            case 123:
               var10000 = 181;
               break;
            case 124:
               var10000 = 107;
               break;
            case 125:
               var10000 = 128;
               break;
            case 126:
               var10000 = 220;
               break;
            case 127:
               var10000 = 28;
               break;
            case 128:
               var10000 = 198;
               break;
            case 129:
               var10000 = 228;
               break;
            case 130:
               var10000 = 176;
               break;
            case 131:
               var10000 = 52;
               break;
            case 132:
               var10000 = 100;
               break;
            case 133:
               var10000 = 229;
               break;
            case 134:
               var10000 = 87;
               break;
            case 135:
               var10000 = 79;
               break;
            case 136:
               var10000 = 172;
               break;
            case 137:
               var10000 = 255;
               break;
            case 138:
               var10000 = 199;
               break;
            case 139:
               var10000 = 112;
               break;
            case 140:
               var10000 = 13;
               break;
            case 141:
               var10000 = 91;
               break;
            case 142:
               var10000 = 41;
               break;
            case 143:
               var10000 = 104;
               break;
            case 144:
               var10000 = 105;
               break;
            case 145:
               var10000 = 0;
               break;
            case 146:
               var10000 = 213;
               break;
            case 147:
               var10000 = 116;
               break;
            case 148:
               var10000 = 23;
               break;
            case 149:
               var10000 = 235;
               break;
            case 150:
               var10000 = 164;
               break;
            case 151:
               var10000 = 136;
               break;
            case 152:
               var10000 = 244;
               break;
            case 153:
               var10000 = 33;
               break;
            case 154:
               var10000 = 185;
               break;
            case 155:
               var10000 = 34;
               break;
            case 156:
               var10000 = 84;
               break;
            case 157:
               var10000 = 167;
               break;
            case 158:
               var10000 = 129;
               break;
            case 159:
               var10000 = 109;
               break;
            case 160:
               var10000 = 206;
               break;
            case 161:
               var10000 = 247;
               break;
            case 162:
               var10000 = 150;
               break;
            case 163:
               var10000 = 134;
               break;
            case 164:
               var10000 = 231;
               break;
            case 165:
               var10000 = 202;
               break;
            case 166:
               var10000 = 187;
               break;
            case 167:
               var10000 = 8;
               break;
            case 168:
               var10000 = 35;
               break;
            case 169:
               var10000 = 158;
               break;
            case 170:
               var10000 = 250;
               break;
            case 171:
               var10000 = 153;
               break;
            case 172:
               var10000 = 60;
               break;
            case 173:
               var10000 = 237;
               break;
            case 174:
               var10000 = 39;
               break;
            case 175:
               var10000 = 89;
               break;
            case 176:
               var10000 = 124;
               break;
            case 177:
               var10000 = 92;
               break;
            case 178:
               var10000 = 169;
               break;
            case 179:
               var10000 = 180;
               break;
            case 180:
               var10000 = 152;
               break;
            case 181:
               var10000 = 38;
               break;
            case 182:
               var10000 = 119;
               break;
            case 183:
               var10000 = 99;
               break;
            case 184:
               var10000 = 214;
               break;
            case 185:
               var10000 = 243;
               break;
            case 186:
               var10000 = 80;
               break;
            case 187:
               var10000 = 54;
               break;
            case 188:
               var10000 = 252;
               break;
            case 189:
               var10000 = 30;
               break;
            case 190:
               var10000 = 96;
               break;
            case 191:
               var10000 = 223;
               break;
            case 192:
               var10000 = 58;
               break;
            case 193:
               var10000 = 248;
               break;
            case 194:
               var10000 = 249;
               break;
            case 195:
               var10000 = 186;
               break;
            case 196:
               var10000 = 71;
               break;
            case 197:
               var10000 = 102;
               break;
            case 198:
               var10000 = 7;
               break;
            case 199:
               var10000 = 51;
               break;
            case 200:
               var10000 = 222;
               break;
            case 201:
               var10000 = 224;
               break;
            case 202:
               var10000 = 29;
               break;
            case 203:
               var10000 = 66;
               break;
            case 204:
               var10000 = 27;
               break;
            case 205:
               var10000 = 47;
               break;
            case 206:
               var10000 = 78;
               break;
            case 207:
               var10000 = 17;
               break;
            case 208:
               var10000 = 182;
               break;
            case 209:
               var10000 = 55;
               break;
            case 210:
               var10000 = 227;
               break;
            case 211:
               var10000 = 162;
               break;
            case 212:
               var10000 = 94;
               break;
            case 213:
               var10000 = 4;
               break;
            case 214:
               var10000 = 195;
               break;
            case 215:
               var10000 = 61;
               break;
            case 216:
               var10000 = 216;
               break;
            case 217:
               var10000 = 67;
               break;
            case 218:
               var10000 = 161;
               break;
            case 219:
               var10000 = 11;
               break;
            case 220:
               var10000 = 154;
               break;
            case 221:
               var10000 = 126;
               break;
            case 222:
               var10000 = 98;
               break;
            case 223:
               var10000 = 132;
               break;
            case 224:
               var10000 = 142;
               break;
            case 225:
               var10000 = 56;
               break;
            case 226:
               var10000 = 204;
               break;
            case 227:
               var10000 = 190;
               break;
            case 228:
               var10000 = 149;
               break;
            case 229:
               var10000 = 26;
               break;
            case 230:
               var10000 = 81;
               break;
            case 231:
               var10000 = 40;
               break;
            case 232:
               var10000 = 113;
               break;
            case 233:
               var10000 = 88;
               break;
            case 234:
               var10000 = 19;
               break;
            case 235:
               var10000 = 70;
               break;
            case 236:
               var10000 = 25;
               break;
            case 237:
               var10000 = 85;
               break;
            case 238:
               var10000 = 118;
               break;
            case 239:
               var10000 = 133;
               break;
            case 240:
               var10000 = 48;
               break;
            case 241:
               var10000 = 233;
               break;
            case 242:
               var10000 = 168;
               break;
            case 243:
               var10000 = 86;
               break;
            case 244:
               var10000 = 14;
               break;
            case 245:
               var10000 = 212;
               break;
            case 246:
               var10000 = 166;
               break;
            case 247:
               var10000 = 156;
               break;
            case 248:
               var10000 = 188;
               break;
            case 249:
               var10000 = 174;
               break;
            case 250:
               var10000 = 218;
               break;
            case 251:
               var10000 = 241;
               break;
            case 252:
               var10000 = 10;
               break;
            case 253:
               var10000 = 76;
               break;
            case 254:
               var10000 = 207;
               break;
            default:
               var10000 = 245;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "O\u007fq^QÁ,ê«(\\\u0092\u008fÇá.\u001c\u009b_z¶¬¸Ó\u008fU\u008e\u000bºU¾tï'¤çA\r\u0015¢¥\tß\u0015\u0010~}wC\u009bà";
      int var4 = "O\u007fq^QÁ,ê«(\\\u0092\u008fÇá.\u001c\u009b_z¶¬¸Ó\u008fU\u008e\u000bºU¾tï'¤çA\r\u0015¢¥\tß\u0015\u0010~}wC\u009bà".length();
      char var1 = 6;
      int var9 = -1;

      label67:
      while (true) {
         byte var10000 = 86;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var22;
            label62: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var22 = var26;
               int var16 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label62;
                  }

                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var47 = var38[var10006];
                  byte var48;
                  switch (var6 % 7) {
                     case 0:
                        var48 = 23;
                        break;
                     case 1:
                        var48 = 106;
                        break;
                     case 2:
                        var48 = 125;
                        break;
                     case 3:
                        var48 = 69;
                        break;
                     case 4:
                        var48 = 34;
                        break;
                     case 5:
                        var48 = 30;
                        break;
                     default:
                        var48 = 10;
                  }

                  var38[var10006] = (char)(var47 ^ var34 ^ var48);
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[4];

                     label40: {
                        try {
                           if (!C_g_2.class.desiredAssertionStatus()) {
                              var11 = true;
                              break label40;
                           }
                        } catch (P_5 var7) {
                           throw a(var7);
                        }

                        var11 = false;
                     }

                     p = var11;
                     return;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label67;
                  }

                  var2 = "ê»l\u009e \u00ad`\u0086\\A¶_¦T\u0011%Ë¨\\!!21K¿3 BM\u000fl+5=p\u0011Ç¼q\b)\u009a\u0091LÝ\u001cIM>ÀÍ\u008fª\rºbK4#ÉÍ46k[\u0095lé\u0087àÑ\u0095áq\u000f";
                  var4 = "ê»l\u009e \u00ad`\u0086\\A¶_¦T\u0011%Ë¨\\!!21K¿3 BM\u000fl+5=p\u0011Ç¼q\b)\u009a\u0091LÝ\u001cIM>ÀÍ\u008fª\rºbK4#ÉÍ46k[\u0095lé\u0087àÑ\u0095áq\u000f"
                     .length();
                  var1 = 31;
                  var9 = -1;
            }

            var10000 = 13;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}





