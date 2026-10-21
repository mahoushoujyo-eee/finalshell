package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XStreamAlias("Dictionary")
public final class oj_4 implements Serializable {
   @XStreamAsAttribute
   private String k;
   @XStreamAsAttribute
   private String Y;
   @XStreamAsAttribute
   private String Z;
   @XStreamAsAttribute
   private String n;
   @XStreamAsAttribute
   private String S;
   @XStreamAsAttribute
   private String i;
   @XStreamImplicit(
      itemFieldName = "record"
   )
   private List E;
   @XStreamImplicit(
      itemFieldName = "Dictionary"
   )
   private List C;
   @XStreamAlias("LanguageInfo")
   private List v;
   private static final String[] a;
   private static final String[] b;

   public oj_4() {
      this.r();
   }

   public oj_4(String var1) {
      this.r();
      this.z(var1);
   }

   public oj_4(String var1, String var2) {
      this.r();
      this.z(var1);
      this.D(var2);
   }

   public oj_4(String var1, String var2, String var3) {
      this.r();
      this.z(var1);
      this.D(var2);
      this.h(var3);
   }

   public oj_4(String var1, String var2, String var3, String var4) {
      this.r();
      this.z(var1);
      this.D(var2);
      this.h(var3);
      this.q(var4);
   }

   public oj_4(String var1, String var2, String var3, String var4, String var5) {
      this.r();
      this.z(var1);
      this.D(var2);
      this.h(var3);
      this.q(var4);
      this.f(var5);
   }

   public String o() {
      int[] var1 = G9.J();
      String var10000 = this.k;
      if (var1 != null) {
         if (this.k == null) {
            this.r();
         }

         var10000 = this.k;
      }

      return var10000;
   }

   public void r() {
      this.k = NE.E(a(-18818, 8900));
   }

   public void n(String var1) {
      this.k = var1;
   }

   public String C() {
      return this.Y;
   }

   public void D(String var1) {
      this.Y = var1;
   }

   public String N() {
      return this.Z;
   }

   public void z(String var1) {
      this.Z = var1;
   }

   public String G() {
      return this.n;
   }

   public void h(String var1) {
      this.n = var1;
   }

   public String p() {
      return this.S;
   }

   public void q(String var1) {
      this.S = var1;
   }

   public String z() {
      return this.i;
   }

   public void f(String var1) {
      this.i = var1;
   }

   public List I() {
      return this.E;
   }

   public void k(List var1) {
      this.E = var1;
   }

   public List j() {
      return this.C;
   }

   public void y(List var1) {
      this.C = var1;
   }

   public List n() {
      return this.v;
   }

   public void P(List var1) {
      this.v = var1;
   }

   public IJ b(String var1) {
      int[] var2 = G9.J();
      List var10000 = this.v;
      if (var2 != null) {
         if (this.v == null) {
            return null;
         }

         var10000 = this.v;
      }

      for (IJ var4 : var10000) {
         if (var2 == null) {
            return var4;
         }

         if (var4.k().equals(var1)) {
            return var4;
         }

         if (var2 == null) {
            break;
         }
      }

      return null;
   }

   public void N(IJ var1) {
      int[] var2 = G9.J();
      List var10000 = this.v;
      if (var2 != null) {
         if (this.v == null) {
            this.v = new ArrayList(1);
         }

         var10000 = this.v;
      }

      Iterator var3 = var10000.iterator();

      while (true) {
         label34:
         if (var3.hasNext()) {
            label32: {
               IJ var4 = (IJ)var3.next();
               if (var2 != null) {
                  boolean var5 = var4.k().equals(var1.k());
                  if (var2 == null) {
                     break;
                  }

                  if (!var5) {
                     break label32;
                  }

                  var3.remove();
               }

               if (var2 != null) {
                  break label34;
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         this.v.add(var1);
         break;
      }
   }

   private void S() {
      int[] var1 = G9.J();
      com.oj_4 var10000 = this;
      if (var1 != null) {
         if (this.E != null) {
            return;
         }

         var10000 = this;
      }

      var10000.E = new ArrayList(1);
   }

   public R9 w(String var1, String var2, String var3) {
      return this.H(var1, new G9[]{new G9(var2, var3)});
   }

   public R9 I(String var1, String var2, Character var3, String var4) {
      return this.H(var1, new G9[]{new G9(var2, var3, var4)});
   }

   public R9 H(String var1, G9[] var2) {
      return this.v(new R9(var1, var2));
   }

   public R9 P(String var1, List var2) {
      return this.v(new R9(var1, var2));
   }

   public R9 v(R9 var1) {
      this.S();
      int[] var10000 = G9.J();
      Iterator var3 = this.E.iterator();
      int[] var2 = var10000;

      R9 var4;
      label73: {
         while (var3.hasNext()) {
            var4 = (R9)var3.next();
            String var7 = var4.h();
            if (var2 != null) {
               boolean var8 = var7.equals(var1.h());
               if (var2 == null) {
                  return var1;
               }

               if (!var8) {
                  if (var2 != null) {
                     continue;
                  }
                  break;
               }

               var9 = var1;
               if (var2 == null) {
                  break label73;
               }

               var7 = var1.U();
            }

            if (var7 == null) {
               var1.v(var4.U());
            }

            var9 = var4;
            break label73;
         }

         this.E.add(var1);
         return var1;
      }

      Iterator var5 = var9.A().iterator();

      while (true) {
         if (var5.hasNext()) {
            G9 var6 = (G9)var5.next();
            var10 = var1;
            if (var2 == null) {
               break;
            }

            label36: {
               G9 var10001 = var6;
               if (var2 != null) {
                  if (var1.X(var6.I())) {
                     break label36;
                  }

                  var10 = var1;
                  var10001 = var6;
               }

               var10.s(var10001);
            }

            if (var2 != null) {
               continue;
            }
         }

         var10 = var4;
         break;
      }

      return var10;
   }

   public void M(R9 var1) {
      int[] var2 = G9.J();
      List var10000 = this.E;
      if (var2 != null) {
         if (this.E == null) {
            return;
         }

         var10000 = this.E;
      }

      var10000.remove(var1);
   }

   public void t(String var1) {
      int[] var2 = G9.J();
      if (this.E != null) {
         int var3 = 0;

         while (var3 < this.E.size()) {
            label22: {
               String var10000 = ((R9)this.E.get(var3)).h();
               if (var2 != null) {
                  if (!var10000.equals(var1)) {
                     break label22;
                  }

                  this.E.remove(var3);
               }

               if (var2 != null) {
                  break;
               }
            }

            var3++;
            if (var2 == null) {
               break;
            }
         }
      }
   }

   public void G(String var1) {
      int[] var2 = G9.J();
      List var10000 = this.E;
      if (var2 != null) {
         if (this.E == null) {
            return;
         }

         var10000 = this.E;
      }

      int var3 = var10000.size() - 1;

      while (var3 >= 0) {
         ((R9)this.E.get(var3)).p(var1);
         if (var2 != null) {
            if (((R9)this.E.get(var3)).E() == 0) {
               this.E.remove(var3);
            }

            var3--;
         }

         if (var2 == null) {
            break;
         }
      }
   }

   public void m() {
      int[] var1 = G9.J();
      List var10000 = this.E;
      if (var1 != null) {
         if (this.E == null) {
            return;
         }

         var10000 = this.E;
      }

      var10000.clear();
   }

   public int J() {
      int[] var1 = G9.J();
      List var10000 = this.E;
      if (var1 != null) {
         if (this.E == null) {
            return 0;
         }

         var10000 = this.E;
      }

      return var10000.size();
   }

   public void H(com.oj_4 var1) {
      this.C();
      this.C.add(var1);
   }

   private void C$void() {
      int[] var1 = G9.J();
      com.oj_4 var10000 = this;
      if (var1 != null) {
         if (this.C != null) {
            return;
         }

         var10000 = this;
      }

      var10000.C = new ArrayList();
   }

   public void M(com.oj_4 var1) {
      int[] var2 = G9.J();
      List var10000 = this.C;
      if (var2 != null) {
         if (this.C == null) {
            return;
         }

         var10000 = this.C;
      }

      var10000.remove(var1);
   }

   public int G$int() {
      int[] var1 = G9.J();
      List var10000 = this.C;
      if (var1 != null) {
         if (this.C == null) {
            return 0;
         }

         var10000 = this.C;
      }

      return var10000.size();
   }

   public List G$List() {
      return this.x(new ArrayList());
   }

   public List x(List var1) {
      int[] var2 = G9.J();
      List var10000 = this.E;
      if (var2 != null) {
         if (this.E != null) {
            for (R9 var4 : this.E) {
               var4.H(var1);
               if (var2 == null) {
                  return var1;
               }

               if (var2 == null) {
                  break;
               }
            }
         }

         var10000 = this.C;
      }

      if (var2 == null) {
         return var10000;
      } else {
         if (var10000 != null) {
            for (com.oj_4 var6 : this.C) {
               var10000 = var6.x(var1);
               if (var2 == null) {
                  return var10000;
               }

               if (var2 == null) {
                  break;
               }
            }
         }

         return var1;
      }
   }

   @Override
   public boolean equals(Object var1) {
      int[] var2 = G9.J();
      Object var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      boolean var3 = var10000 instanceof com.oj_4;
      if (var2 != null) {
         if (!var3) {
            return false;
         }

         var3 = ((com.oj_4)var1).o().equals(this.o());
      }

      return var2 == null ? var3 : var3;
   }

   @Override
   public String toString() {
      int[] var1 = G9.J();
      StringBuilder var10000 = new StringBuilder();
      String var10001 = this.Y;
      if (var1 != null) {
         var10001 = this.Y != null ? this.Y + " " : "";
      }

      return var10000.append(var10001)
         .append(this.J() > 0 ? a(-18820, 27777) + this.J() + ")" : "")
         .append(this.G() > 0 ? a(-18819, 3850) + this.G() + ")" : "")
         .toString();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ì\tûBv\u008a=y\u0017Íô\u0013éüZìbF\u0085\u008d\u007fçQ\u0080\u00adO_Oì1ö\u0003\u0017|]";
      int var4 = "ì\tûBv\u008a=y\u0017Íô\u0013éüZìbF\u0085\u008d\u007fçQ\u0080\u00adO_Oì1ö\u0003\u0017|]".length();
      char var1 = 11;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 14;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 14;
               var10006 = var6;
            } else {
               var13 = 14;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 14;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 77;
                     break;
                  case 1:
                     var29 = 85;
                     break;
                  case 2:
                     var29 = 86;
                     break;
                  case 3:
                     var29 = 78;
                     break;
                  case 4:
                     var29 = 83;
                     break;
                  case 5:
                     var29 = 98;
                     break;
                  default:
                     var29 = 43;
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
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[3];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -18820) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 96;
               break;
            case 1:
               var10000 = 249;
               break;
            case 2:
               var10000 = 8;
               break;
            case 3:
               var10000 = 6;
               break;
            case 4:
               var10000 = 118;
               break;
            case 5:
               var10000 = 63;
               break;
            case 6:
               var10000 = 217;
               break;
            case 7:
               var10000 = 17;
               break;
            case 8:
               var10000 = 161;
               break;
            case 9:
               var10000 = 49;
               break;
            case 10:
               var10000 = 167;
               break;
            case 11:
               var10000 = 204;
               break;
            case 12:
               var10000 = 107;
               break;
            case 13:
               var10000 = 157;
               break;
            case 14:
               var10000 = 185;
               break;
            case 15:
               var10000 = 66;
               break;
            case 16:
               var10000 = 159;
               break;
            case 17:
               var10000 = 69;
               break;
            case 18:
               var10000 = 239;
               break;
            case 19:
               var10000 = 171;
               break;
            case 20:
               var10000 = 137;
               break;
            case 21:
               var10000 = 188;
               break;
            case 22:
               var10000 = 203;
               break;
            case 23:
               var10000 = 193;
               break;
            case 24:
               var10000 = 111;
               break;
            case 25:
               var10000 = 132;
               break;
            case 26:
               var10000 = 182;
               break;
            case 27:
               var10000 = 120;
               break;
            case 28:
               var10000 = 117;
               break;
            case 29:
               var10000 = 89;
               break;
            case 30:
               var10000 = 129;
               break;
            case 31:
               var10000 = 33;
               break;
            case 32:
               var10000 = 148;
               break;
            case 33:
               var10000 = 114;
               break;
            case 34:
               var10000 = 131;
               break;
            case 35:
               var10000 = 41;
               break;
            case 36:
               var10000 = 1;
               break;
            case 37:
               var10000 = 212;
               break;
            case 38:
               var10000 = 211;
               break;
            case 39:
               var10000 = 79;
               break;
            case 40:
               var10000 = 216;
               break;
            case 41:
               var10000 = 70;
               break;
            case 42:
               var10000 = 163;
               break;
            case 43:
               var10000 = 56;
               break;
            case 44:
               var10000 = 81;
               break;
            case 45:
               var10000 = 32;
               break;
            case 46:
               var10000 = 196;
               break;
            case 47:
               var10000 = 53;
               break;
            case 48:
               var10000 = 45;
               break;
            case 49:
               var10000 = 153;
               break;
            case 50:
               var10000 = 178;
               break;
            case 51:
               var10000 = 68;
               break;
            case 52:
               var10000 = 151;
               break;
            case 53:
               var10000 = 130;
               break;
            case 54:
               var10000 = 170;
               break;
            case 55:
               var10000 = 176;
               break;
            case 56:
               var10000 = 237;
               break;
            case 57:
               var10000 = 122;
               break;
            case 58:
               var10000 = 54;
               break;
            case 59:
               var10000 = 35;
               break;
            case 60:
               var10000 = 134;
               break;
            case 61:
               var10000 = 101;
               break;
            case 62:
               var10000 = 253;
               break;
            case 63:
               var10000 = 2;
               break;
            case 64:
               var10000 = 208;
               break;
            case 65:
               var10000 = 184;
               break;
            case 66:
               var10000 = 221;
               break;
            case 67:
               var10000 = 36;
               break;
            case 68:
               var10000 = 22;
               break;
            case 69:
               var10000 = 241;
               break;
            case 70:
               var10000 = 44;
               break;
            case 71:
               var10000 = 136;
               break;
            case 72:
               var10000 = 83;
               break;
            case 73:
               var10000 = 214;
               break;
            case 74:
               var10000 = 195;
               break;
            case 75:
               var10000 = 181;
               break;
            case 76:
               var10000 = 238;
               break;
            case 77:
               var10000 = 77;
               break;
            case 78:
               var10000 = 99;
               break;
            case 79:
               var10000 = 244;
               break;
            case 80:
               var10000 = 165;
               break;
            case 81:
               var10000 = 201;
               break;
            case 82:
               var10000 = 222;
               break;
            case 83:
               var10000 = 179;
               break;
            case 84:
               var10000 = 180;
               break;
            case 85:
               var10000 = 84;
               break;
            case 86:
               var10000 = 5;
               break;
            case 87:
               var10000 = 73;
               break;
            case 88:
               var10000 = 255;
               break;
            case 89:
               var10000 = 4;
               break;
            case 90:
               var10000 = 206;
               break;
            case 91:
               var10000 = 133;
               break;
            case 92:
               var10000 = 51;
               break;
            case 93:
               var10000 = 150;
               break;
            case 94:
               var10000 = 91;
               break;
            case 95:
               var10000 = 76;
               break;
            case 96:
               var10000 = 245;
               break;
            case 97:
               var10000 = 119;
               break;
            case 98:
               var10000 = 250;
               break;
            case 99:
               var10000 = 82;
               break;
            case 100:
               var10000 = 248;
               break;
            case 101:
               var10000 = 210;
               break;
            case 102:
               var10000 = 15;
               break;
            case 103:
               var10000 = 190;
               break;
            case 104:
               var10000 = 59;
               break;
            case 105:
               var10000 = 55;
               break;
            case 106:
               var10000 = 235;
               break;
            case 107:
               var10000 = 164;
               break;
            case 108:
               var10000 = 168;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 7;
               break;
            case 111:
               var10000 = 19;
               break;
            case 112:
               var10000 = 115;
               break;
            case 113:
               var10000 = 46;
               break;
            case 114:
               var10000 = 141;
               break;
            case 115:
               var10000 = 121;
               break;
            case 116:
               var10000 = 147;
               break;
            case 117:
               var10000 = 80;
               break;
            case 118:
               var10000 = 156;
               break;
            case 119:
               var10000 = 207;
               break;
            case 120:
               var10000 = 126;
               break;
            case 121:
               var10000 = 227;
               break;
            case 122:
               var10000 = 100;
               break;
            case 123:
               var10000 = 23;
               break;
            case 124:
               var10000 = 95;
               break;
            case 125:
               var10000 = 40;
               break;
            case 126:
               var10000 = 194;
               break;
            case 127:
               var10000 = 87;
               break;
            case 128:
               var10000 = 106;
               break;
            case 129:
               var10000 = 246;
               break;
            case 130:
               var10000 = 139;
               break;
            case 131:
               var10000 = 252;
               break;
            case 132:
               var10000 = 65;
               break;
            case 133:
               var10000 = 145;
               break;
            case 134:
               var10000 = 110;
               break;
            case 135:
               var10000 = 191;
               break;
            case 136:
               var10000 = 173;
               break;
            case 137:
               var10000 = 86;
               break;
            case 138:
               var10000 = 140;
               break;
            case 139:
               var10000 = 187;
               break;
            case 140:
               var10000 = 192;
               break;
            case 141:
               var10000 = 138;
               break;
            case 142:
               var10000 = 232;
               break;
            case 143:
               var10000 = 14;
               break;
            case 144:
               var10000 = 160;
               break;
            case 145:
               var10000 = 72;
               break;
            case 146:
               var10000 = 24;
               break;
            case 147:
               var10000 = 169;
               break;
            case 148:
               var10000 = 240;
               break;
            case 149:
               var10000 = 219;
               break;
            case 150:
               var10000 = 3;
               break;
            case 151:
               var10000 = 224;
               break;
            case 152:
               var10000 = 94;
               break;
            case 153:
               var10000 = 105;
               break;
            case 154:
               var10000 = 21;
               break;
            case 155:
               var10000 = 215;
               break;
            case 156:
               var10000 = 52;
               break;
            case 157:
               var10000 = 112;
               break;
            case 158:
               var10000 = 233;
               break;
            case 159:
               var10000 = 97;
               break;
            case 160:
               var10000 = 199;
               break;
            case 161:
               var10000 = 218;
               break;
            case 162:
               var10000 = 186;
               break;
            case 163:
               var10000 = 231;
               break;
            case 164:
               var10000 = 20;
               break;
            case 165:
               var10000 = 57;
               break;
            case 166:
               var10000 = 25;
               break;
            case 167:
               var10000 = 47;
               break;
            case 168:
               var10000 = 29;
               break;
            case 169:
               var10000 = 98;
               break;
            case 170:
               var10000 = 128;
               break;
            case 171:
               var10000 = 205;
               break;
            case 172:
               var10000 = 11;
               break;
            case 173:
               var10000 = 174;
               break;
            case 174:
               var10000 = 251;
               break;
            case 175:
               var10000 = 242;
               break;
            case 176:
               var10000 = 243;
               break;
            case 177:
               var10000 = 64;
               break;
            case 178:
               var10000 = 104;
               break;
            case 179:
               var10000 = 38;
               break;
            case 180:
               var10000 = 142;
               break;
            case 181:
               var10000 = 108;
               break;
            case 182:
               var10000 = 189;
               break;
            case 183:
               var10000 = 166;
               break;
            case 184:
               var10000 = 10;
               break;
            case 185:
               var10000 = 61;
               break;
            case 186:
               var10000 = 229;
               break;
            case 187:
               var10000 = 146;
               break;
            case 188:
               var10000 = 88;
               break;
            case 189:
               var10000 = 93;
               break;
            case 190:
               var10000 = 172;
               break;
            case 191:
               var10000 = 0;
               break;
            case 192:
               var10000 = 230;
               break;
            case 193:
               var10000 = 152;
               break;
            case 194:
               var10000 = 12;
               break;
            case 195:
               var10000 = 78;
               break;
            case 196:
               var10000 = 75;
               break;
            case 197:
               var10000 = 9;
               break;
            case 198:
               var10000 = 149;
               break;
            case 199:
               var10000 = 234;
               break;
            case 200:
               var10000 = 90;
               break;
            case 201:
               var10000 = 162;
               break;
            case 202:
               var10000 = 71;
               break;
            case 203:
               var10000 = 175;
               break;
            case 204:
               var10000 = 124;
               break;
            case 205:
               var10000 = 62;
               break;
            case 206:
               var10000 = 13;
               break;
            case 207:
               var10000 = 92;
               break;
            case 208:
               var10000 = 127;
               break;
            case 209:
               var10000 = 197;
               break;
            case 210:
               var10000 = 135;
               break;
            case 211:
               var10000 = 102;
               break;
            case 212:
               var10000 = 28;
               break;
            case 213:
               var10000 = 236;
               break;
            case 214:
               var10000 = 103;
               break;
            case 215:
               var10000 = 43;
               break;
            case 216:
               var10000 = 213;
               break;
            case 217:
               var10000 = 60;
               break;
            case 218:
               var10000 = 74;
               break;
            case 219:
               var10000 = 27;
               break;
            case 220:
               var10000 = 16;
               break;
            case 221:
               var10000 = 202;
               break;
            case 222:
               var10000 = 48;
               break;
            case 223:
               var10000 = 18;
               break;
            case 224:
               var10000 = 158;
               break;
            case 225:
               var10000 = 144;
               break;
            case 226:
               var10000 = 39;
               break;
            case 227:
               var10000 = 37;
               break;
            case 228:
               var10000 = 247;
               break;
            case 229:
               var10000 = 30;
               break;
            case 230:
               var10000 = 177;
               break;
            case 231:
               var10000 = 143;
               break;
            case 232:
               var10000 = 34;
               break;
            case 233:
               var10000 = 50;
               break;
            case 234:
               var10000 = 225;
               break;
            case 235:
               var10000 = 42;
               break;
            case 236:
               var10000 = 113;
               break;
            case 237:
               var10000 = 58;
               break;
            case 238:
               var10000 = 116;
               break;
            case 239:
               var10000 = 254;
               break;
            case 240:
               var10000 = 67;
               break;
            case 241:
               var10000 = 85;
               break;
            case 242:
               var10000 = 154;
               break;
            case 243:
               var10000 = 209;
               break;
            case 244:
               var10000 = 223;
               break;
            case 245:
               var10000 = 109;
               break;
            case 246:
               var10000 = 220;
               break;
            case 247:
               var10000 = 198;
               break;
            case 248:
               var10000 = 200;
               break;
            case 249:
               var10000 = 183;
               break;
            case 250:
               var10000 = 226;
               break;
            case 251:
               var10000 = 123;
               break;
            case 252:
               var10000 = 31;
               break;
            case 253:
               var10000 = 26;
               break;
            case 254:
               var10000 = 228;
               break;
            default:
               var10000 = 125;
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





