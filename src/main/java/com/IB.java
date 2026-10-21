package com;

import java.io.Serializable;
import javax.swing.JComponent;

public abstract class IB {
   protected boolean k;
   protected boolean n;
   protected com.aS t;
   private static final String[] a;
   private static final String[] b;

   public IB(JComponent var1, String var2, String var3, Object var4, boolean var5, boolean var6) {
      this(new com.aS(var1, var2, var3, var4, var5, var6));
   }

   public IB(com.aS param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/cl_4.I ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokespecial java/lang/Object.<init> ()V
      // 007: astore 2
      // 008: aload 0
      // 009: bipush 0
      // 00a: putfield com/IB.k Z
      // 00d: aload 0
      // 00e: bipush 0
      // 00f: putfield com/IB.n Z
      // 012: aload 0
      // 013: aload 1
      // 014: putfield com/IB.t Lcom/aS;
      // 017: aload 2
      // 018: ifnonnull 092
      // 01b: aload 1
      // 01c: invokevirtual com/aS.G ()Z
      // 01f: ifeq 08a
      // 022: goto 029
      // 025: invokestatic com/IB.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 0
      // 02a: invokevirtual com/IB.E ()V
      // 02d: goto 08a
      // 030: astore 3
      // 031: aload 2
      // 032: ifnonnull 092
      // 035: invokestatic com/cl_4.J ()Z
      // 038: ifeq 08a
      // 03b: goto 042
      // 03e: invokestatic com/IB.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 0
      // 043: new java/lang/StringBuilder
      // 046: dup
      // 047: invokespecial java/lang/StringBuilder.<init> ()V
      // 04a: sipush 9842
      // 04d: sipush 8292
      // 050: invokestatic com/IB.a (II)Ljava/lang/String;
      // 053: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 056: aload 1
      // 057: invokevirtual com/aS.d ()Ljava/lang/String;
      // 05a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05d: sipush 9844
      // 060: sipush 28976
      // 063: invokestatic com/IB.a (II)Ljava/lang/String;
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 069: aload 1
      // 06a: invokevirtual com/aS.N ()Ljava/lang/String;
      // 06d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 070: sipush 9843
      // 073: sipush -10972
      // 076: invokestatic com/IB.a (II)Ljava/lang/String;
      // 079: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07f: aload 3
      // 080: invokestatic com/nE_3.i (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 083: goto 08a
      // 086: invokestatic com/IB.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: aload 0
      // 08b: aload 0
      // 08c: invokevirtual com/IB.b ()Ljavax/swing/JComponent;
      // 08f: invokevirtual com/IB.F (Ljavax/swing/JComponent;)V
      // 092: goto 0ef
      // 095: astore 3
      // 096: invokestatic com/cl_4.J ()Z
      // 099: aload 2
      // 09a: ifnonnull 0f3
      // 09d: ifeq 0ef
      // 0a0: goto 0a7
      // 0a3: invokestatic com/IB.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: new java/lang/StringBuilder
      // 0ab: dup
      // 0ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 0af: sipush 9846
      // 0b2: sipush 1294
      // 0b5: invokestatic com/IB.a (II)Ljava/lang/String;
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: aload 1
      // 0bc: invokevirtual com/aS.d ()Ljava/lang/String;
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: sipush 9847
      // 0c5: sipush -32742
      // 0c8: invokestatic com/IB.a (II)Ljava/lang/String;
      // 0cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ce: aload 1
      // 0cf: invokevirtual com/aS.N ()Ljava/lang/String;
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: sipush 9845
      // 0d8: sipush 6577
      // 0db: invokestatic com/IB.a (II)Ljava/lang/String;
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e4: aload 3
      // 0e5: invokestatic com/nE_3.i (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0e8: goto 0ef
      // 0eb: invokestatic com/IB.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 1
      // 0f0: invokevirtual com/aS.V ()Z
      // 0f3: ifeq 110
      // 0f6: aload 0
      // 0f7: invokevirtual com/IB.M ()Ljava/lang/String;
      // 0fa: aload 0
      // 0fb: invokevirtual com/IB.S ()Ljava/lang/String;
      // 0fe: new com/u8
      // 101: dup
      // 102: aload 0
      // 103: invokespecial com/u8.<init> (Lcom/IB;)V
      // 106: invokestatic com/cl_4.S (Ljava/lang/String;Ljava/lang/String;Lcom/R5;)V
      // 109: goto 110
      // 10c: invokestatic com/IB.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: return
   }

   public com.aS U() {
      return this.t;
   }

   public JComponent b() {
      return this.t.l();
   }

   public String M() {
      return this.t.d();
   }

   public String S() {
      return this.t.N();
   }

   public Serializable Y() {
      return (Serializable)this.t.L();
   }

   public final void E() {
      IB var2;
      label24: {
         String var1 = com.cl_4.I();
         boolean var10000 = this.k;
         if (var1 == null) {
            if (this.k) {
               return;
            }

            var2 = this;
            if (var1 != null) {
               break label24;
            }

            var10000 = this.n;
         }

         if (var10000) {
            return;
         }

         this.k = true;
         this.s(this.b());
         var2 = this;
      }

      var2.k = false;
   }

   public final void M$void() {
      this.r(true);
   }

   public final void r(boolean var1) {
      String var2;
      boolean var10000;
      var2 = com.cl_4.I();
      var10000 = var1;
      label37:
      if (var2 == null) {
         if (var1) {
            var10000 = com.cl_4.X();
            if (var2 != null) {
               break label37;
            }

            if (!var10000) {
               return;
            }
         }

         var10000 = this.k;
      }

      label40: {
         if (var2 == null) {
            if (var10000) {
               return;
            }

            var3 = this;
            if (var2 != null) {
               break label40;
            }

            var10000 = this.n;
         }

         if (var10000) {
            return;
         }

         this.n = true;
         this.T(this.b());
         var3 = this;
      }

      var3.n = false;
   }

   public final void c() {
      this.r(this.b());
      this.t = null;
   }

   protected Serializable o() {
      return (Serializable)com.cl_4.v(this.M(), this.S(), this.Y());
   }

   protected void J(Serializable var1) {
      com.cl_4.A(this.M(), this.S(), var1);
   }

   protected abstract void F(JComponent var1);

   protected abstract void r(JComponent var1);

   protected abstract void s(JComponent var1);

   protected abstract void T(JComponent var1);

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "D\u0086!=-û¼`1KõKu{\u009e\tÒµ\u0001U²Þ\u001a±±{E-.&~:@£\u0085¢\nÔ÷-i\u0018üò®Þ¨ùvã\u0006þP\u0004=ä\u009a¯Pú;zõ9»XãóÐ\b¤AyJ6\u009aR\u0010ÁøåÓ\u0006ê\u009c\u0001ï\u001e\u009aÊÿ¯RÑm/®¼8\t\u0003\u0002,\u0084\u0096]l\u009d\u009a± \u008aÜÌS\u0096\u001e³\u000b%J\r¤¨È\f\u0006'\u00877";
      int var4 = "D\u0086!=-û¼`1KõKu{\u009e\tÒµ\u0001U²Þ\u001a±±{E-.&~:@£\u0085¢\nÔ÷-i\u0018üò®Þ¨ùvã\u0006þP\u0004=ä\u009a¯Pú;zõ9»XãóÐ\b¤AyJ6\u009aR\u0010ÁøåÓ\u0006ê\u009c\u0001ï\u001e\u009aÊÿ¯RÑm/®¼8\t\u0003\u0002,\u0084\u0096]l\u009d\u009a± \u008aÜÌS\u0096\u001e³\u000b%J\r¤¨È\f\u0006'\u00877"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 45;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 25;
                        break;
                     case 1:
                        var46 = 51;
                        break;
                     case 2:
                        var46 = 5;
                        break;
                     case 3:
                        var46 = 73;
                        break;
                     case 4:
                        var46 = 8;
                        break;
                     case 5:
                        var46 = 126;
                        break;
                     default:
                        var46 = 19;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[6];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "¼K\u0085!£¾í|\u0000hS-Ð8è}°Ü\u0016\u0013kÞ Ùr\u00188²Í\u00895Z\u008fÅ)\u0007\u000f\u0005¼\u008c]f~-\r(G_Ü¢×ë2wÔ¼f\u0004GphÓ©gÝ\u00892ëÅð\u0005¯/nÉ\u0005\u0082eglE\u0018CF";
                  var4 = "¼K\u0085!£¾í|\u0000hS-Ð8è}°Ü\u0016\u0013kÞ Ùr\u00188²Í\u00895Z\u008fÅ)\u0007\u000f\u0005¼\u008c]f~-\r(G_Ü¢×ë2wÔ¼f\u0004GphÓ©gÝ\u00892ëÅð\u0005¯/nÉ\u0005\u0082eglE\u0018CF"
                     .length();
                  var1 = 30;
                  var8 = -1;
            }

            var10000 = 48;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 9847) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 239;
               break;
            case 1:
               var10000 = 45;
               break;
            case 2:
               var10000 = 85;
               break;
            case 3:
               var10000 = 23;
               break;
            case 4:
               var10000 = 103;
               break;
            case 5:
               var10000 = 185;
               break;
            case 6:
               var10000 = 65;
               break;
            case 7:
               var10000 = 95;
               break;
            case 8:
               var10000 = 80;
               break;
            case 9:
               var10000 = 232;
               break;
            case 10:
               var10000 = 63;
               break;
            case 11:
               var10000 = 60;
               break;
            case 12:
               var10000 = 69;
               break;
            case 13:
               var10000 = 83;
               break;
            case 14:
               var10000 = 100;
               break;
            case 15:
               var10000 = 21;
               break;
            case 16:
               var10000 = 201;
               break;
            case 17:
               var10000 = 253;
               break;
            case 18:
               var10000 = 96;
               break;
            case 19:
               var10000 = 217;
               break;
            case 20:
               var10000 = 54;
               break;
            case 21:
               var10000 = 76;
               break;
            case 22:
               var10000 = 174;
               break;
            case 23:
               var10000 = 27;
               break;
            case 24:
               var10000 = 199;
               break;
            case 25:
               var10000 = 228;
               break;
            case 26:
               var10000 = 113;
               break;
            case 27:
               var10000 = 133;
               break;
            case 28:
               var10000 = 77;
               break;
            case 29:
               var10000 = 73;
               break;
            case 30:
               var10000 = 35;
               break;
            case 31:
               var10000 = 188;
               break;
            case 32:
               var10000 = 108;
               break;
            case 33:
               var10000 = 171;
               break;
            case 34:
               var10000 = 116;
               break;
            case 35:
               var10000 = 161;
               break;
            case 36:
               var10000 = 153;
               break;
            case 37:
               var10000 = 145;
               break;
            case 38:
               var10000 = 215;
               break;
            case 39:
               var10000 = 243;
               break;
            case 40:
               var10000 = 70;
               break;
            case 41:
               var10000 = 79;
               break;
            case 42:
               var10000 = 230;
               break;
            case 43:
               var10000 = 131;
               break;
            case 44:
               var10000 = 57;
               break;
            case 45:
               var10000 = 166;
               break;
            case 46:
               var10000 = 176;
               break;
            case 47:
               var10000 = 111;
               break;
            case 48:
               var10000 = 135;
               break;
            case 49:
               var10000 = 241;
               break;
            case 50:
               var10000 = 49;
               break;
            case 51:
               var10000 = 168;
               break;
            case 52:
               var10000 = 204;
               break;
            case 53:
               var10000 = 34;
               break;
            case 54:
               var10000 = 115;
               break;
            case 55:
               var10000 = 221;
               break;
            case 56:
               var10000 = 94;
               break;
            case 57:
               var10000 = 56;
               break;
            case 58:
               var10000 = 44;
               break;
            case 59:
               var10000 = 90;
               break;
            case 60:
               var10000 = 104;
               break;
            case 61:
               var10000 = 43;
               break;
            case 62:
               var10000 = 178;
               break;
            case 63:
               var10000 = 24;
               break;
            case 64:
               var10000 = 38;
               break;
            case 65:
               var10000 = 250;
               break;
            case 66:
               var10000 = 122;
               break;
            case 67:
               var10000 = 148;
               break;
            case 68:
               var10000 = 195;
               break;
            case 69:
               var10000 = 128;
               break;
            case 70:
               var10000 = 177;
               break;
            case 71:
               var10000 = 184;
               break;
            case 72:
               var10000 = 151;
               break;
            case 73:
               var10000 = 235;
               break;
            case 74:
               var10000 = 11;
               break;
            case 75:
               var10000 = 172;
               break;
            case 76:
               var10000 = 213;
               break;
            case 77:
               var10000 = 155;
               break;
            case 78:
               var10000 = 190;
               break;
            case 79:
               var10000 = 72;
               break;
            case 80:
               var10000 = 89;
               break;
            case 81:
               var10000 = 12;
               break;
            case 82:
               var10000 = 118;
               break;
            case 83:
               var10000 = 20;
               break;
            case 84:
               var10000 = 147;
               break;
            case 85:
               var10000 = 97;
               break;
            case 86:
               var10000 = 248;
               break;
            case 87:
               var10000 = 74;
               break;
            case 88:
               var10000 = 102;
               break;
            case 89:
               var10000 = 93;
               break;
            case 90:
               var10000 = 146;
               break;
            case 91:
               var10000 = 18;
               break;
            case 92:
               var10000 = 186;
               break;
            case 93:
               var10000 = 207;
               break;
            case 94:
               var10000 = 29;
               break;
            case 95:
               var10000 = 236;
               break;
            case 96:
               var10000 = 202;
               break;
            case 97:
               var10000 = 40;
               break;
            case 98:
               var10000 = 164;
               break;
            case 99:
               var10000 = 117;
               break;
            case 100:
               var10000 = 114;
               break;
            case 101:
               var10000 = 101;
               break;
            case 102:
               var10000 = 208;
               break;
            case 103:
               var10000 = 64;
               break;
            case 104:
               var10000 = 210;
               break;
            case 105:
               var10000 = 181;
               break;
            case 106:
               var10000 = 150;
               break;
            case 107:
               var10000 = 5;
               break;
            case 108:
               var10000 = 183;
               break;
            case 109:
               var10000 = 42;
               break;
            case 110:
               var10000 = 234;
               break;
            case 111:
               var10000 = 67;
               break;
            case 112:
               var10000 = 200;
               break;
            case 113:
               var10000 = 136;
               break;
            case 114:
               var10000 = 86;
               break;
            case 115:
               var10000 = 62;
               break;
            case 116:
               var10000 = 14;
               break;
            case 117:
               var10000 = 254;
               break;
            case 118:
               var10000 = 187;
               break;
            case 119:
               var10000 = 203;
               break;
            case 120:
               var10000 = 88;
               break;
            case 121:
               var10000 = 179;
               break;
            case 122:
               var10000 = 46;
               break;
            case 123:
               var10000 = 162;
               break;
            case 124:
               var10000 = 252;
               break;
            case 125:
               var10000 = 149;
               break;
            case 126:
               var10000 = 130;
               break;
            case 127:
               var10000 = 75;
               break;
            case 128:
               var10000 = 224;
               break;
            case 129:
               var10000 = 16;
               break;
            case 130:
               var10000 = 244;
               break;
            case 131:
               var10000 = 218;
               break;
            case 132:
               var10000 = 157;
               break;
            case 133:
               var10000 = 28;
               break;
            case 134:
               var10000 = 251;
               break;
            case 135:
               var10000 = 139;
               break;
            case 136:
               var10000 = 182;
               break;
            case 137:
               var10000 = 17;
               break;
            case 138:
               var10000 = 66;
               break;
            case 139:
               var10000 = 193;
               break;
            case 140:
               var10000 = 152;
               break;
            case 141:
               var10000 = 222;
               break;
            case 142:
               var10000 = 99;
               break;
            case 143:
               var10000 = 205;
               break;
            case 144:
               var10000 = 141;
               break;
            case 145:
               var10000 = 48;
               break;
            case 146:
               var10000 = 169;
               break;
            case 147:
               var10000 = 91;
               break;
            case 148:
               var10000 = 92;
               break;
            case 149:
               var10000 = 109;
               break;
            case 150:
               var10000 = 71;
               break;
            case 151:
               var10000 = 227;
               break;
            case 152:
               var10000 = 144;
               break;
            case 153:
               var10000 = 225;
               break;
            case 154:
               var10000 = 255;
               break;
            case 155:
               var10000 = 39;
               break;
            case 156:
               var10000 = 247;
               break;
            case 157:
               var10000 = 134;
               break;
            case 158:
               var10000 = 238;
               break;
            case 159:
               var10000 = 32;
               break;
            case 160:
               var10000 = 81;
               break;
            case 161:
               var10000 = 249;
               break;
            case 162:
               var10000 = 211;
               break;
            case 163:
               var10000 = 160;
               break;
            case 164:
               var10000 = 61;
               break;
            case 165:
               var10000 = 1;
               break;
            case 166:
               var10000 = 98;
               break;
            case 167:
               var10000 = 229;
               break;
            case 168:
               var10000 = 212;
               break;
            case 169:
               var10000 = 78;
               break;
            case 170:
               var10000 = 112;
               break;
            case 171:
               var10000 = 41;
               break;
            case 172:
               var10000 = 25;
               break;
            case 173:
               var10000 = 50;
               break;
            case 174:
               var10000 = 37;
               break;
            case 175:
               var10000 = 6;
               break;
            case 176:
               var10000 = 9;
               break;
            case 177:
               var10000 = 26;
               break;
            case 178:
               var10000 = 246;
               break;
            case 179:
               var10000 = 198;
               break;
            case 180:
               var10000 = 10;
               break;
            case 181:
               var10000 = 196;
               break;
            case 182:
               var10000 = 154;
               break;
            case 183:
               var10000 = 206;
               break;
            case 184:
               var10000 = 2;
               break;
            case 185:
               var10000 = 245;
               break;
            case 186:
               var10000 = 163;
               break;
            case 187:
               var10000 = 137;
               break;
            case 188:
               var10000 = 59;
               break;
            case 189:
               var10000 = 191;
               break;
            case 190:
               var10000 = 125;
               break;
            case 191:
               var10000 = 159;
               break;
            case 192:
               var10000 = 7;
               break;
            case 193:
               var10000 = 121;
               break;
            case 194:
               var10000 = 143;
               break;
            case 195:
               var10000 = 36;
               break;
            case 196:
               var10000 = 19;
               break;
            case 197:
               var10000 = 192;
               break;
            case 198:
               var10000 = 240;
               break;
            case 199:
               var10000 = 120;
               break;
            case 200:
               var10000 = 167;
               break;
            case 201:
               var10000 = 105;
               break;
            case 202:
               var10000 = 31;
               break;
            case 203:
               var10000 = 165;
               break;
            case 204:
               var10000 = 124;
               break;
            case 205:
               var10000 = 173;
               break;
            case 206:
               var10000 = 119;
               break;
            case 207:
               var10000 = 220;
               break;
            case 208:
               var10000 = 129;
               break;
            case 209:
               var10000 = 8;
               break;
            case 210:
               var10000 = 52;
               break;
            case 211:
               var10000 = 107;
               break;
            case 212:
               var10000 = 158;
               break;
            case 213:
               var10000 = 242;
               break;
            case 214:
               var10000 = 127;
               break;
            case 215:
               var10000 = 142;
               break;
            case 216:
               var10000 = 58;
               break;
            case 217:
               var10000 = 82;
               break;
            case 218:
               var10000 = 13;
               break;
            case 219:
               var10000 = 231;
               break;
            case 220:
               var10000 = 237;
               break;
            case 221:
               var10000 = 209;
               break;
            case 222:
               var10000 = 223;
               break;
            case 223:
               var10000 = 123;
               break;
            case 224:
               var10000 = 30;
               break;
            case 225:
               var10000 = 214;
               break;
            case 226:
               var10000 = 47;
               break;
            case 227:
               var10000 = 0;
               break;
            case 228:
               var10000 = 55;
               break;
            case 229:
               var10000 = 175;
               break;
            case 230:
               var10000 = 87;
               break;
            case 231:
               var10000 = 216;
               break;
            case 232:
               var10000 = 106;
               break;
            case 233:
               var10000 = 33;
               break;
            case 234:
               var10000 = 194;
               break;
            case 235:
               var10000 = 15;
               break;
            case 236:
               var10000 = 68;
               break;
            case 237:
               var10000 = 51;
               break;
            case 238:
               var10000 = 132;
               break;
            case 239:
               var10000 = 156;
               break;
            case 240:
               var10000 = 189;
               break;
            case 241:
               var10000 = 180;
               break;
            case 242:
               var10000 = 233;
               break;
            case 243:
               var10000 = 4;
               break;
            case 244:
               var10000 = 84;
               break;
            case 245:
               var10000 = 3;
               break;
            case 246:
               var10000 = 219;
               break;
            case 247:
               var10000 = 22;
               break;
            case 248:
               var10000 = 226;
               break;
            case 249:
               var10000 = 170;
               break;
            case 250:
               var10000 = 138;
               break;
            case 251:
               var10000 = 126;
               break;
            case 252:
               var10000 = 140;
               break;
            case 253:
               var10000 = 53;
               break;
            case 254:
               var10000 = 110;
               break;
            default:
               var10000 = 197;
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
}





