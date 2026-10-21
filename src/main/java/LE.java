import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class LE extends DefaultTreeCellRenderer {
   static Border A;
   JT D;
   ImageIcon u;
   ImageIcon O;
   ImageIcon h;
   private static final String[] a;
   private static final String[] b;

   public LE() {
      Object[] var10001 = com.c.f();
      Method var6 = com.c.d(270389152141252877L);
      Object[] var28 = var10001;
      Object var19 = null;

      try {
         var10001 = (Object[])var6.invoke(var19, var28);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var19 = com.c.f();
      Method var10004 = com.c.d(182098455520953031L);
      var28 = (Object[])var19;
      var19 = var10001;
      Method var8 = var10004;

      try {
         var10001 = (Object[])var8.invoke(var19, var28);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      com.c.c(142452628824658165L).set(this, var10001);
      this.setBackgroundNonSelectionColor(new Color(0, 0, 0, 0));
      var10001 = (Object[])com.c.c(142452628824658165L).get(this);
      var19 = com.c.a(a(24372, -7601));
      var10004 = com.c.d(563115472405786955L);
      var28 = (Object[])var19;
      var19 = var10001;
      Method var11 = var10004;

      try {
         var10001 = (Object[])var11.invoke(var19, var28);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      com.c.c(357690137608688931L).set(this, var10001);
      var10001 = (Object[])com.c.c(142452628824658165L).get(this);
      var19 = com.c.a(a(24375, 7209));
      var10004 = com.c.d(563115472405786955L);
      var28 = (Object[])var19;
      var19 = var10001;
      Method var14 = var10004;

      try {
         var10001 = (Object[])var14.invoke(var19, var28);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(559455637024722630L).set(this, var10001);
      var10001 = (Object[])com.c.c(142452628824658165L).get(this);
      var19 = com.c.a(a(24373, 30374));
      var10004 = com.c.d(563115472405786955L);
      var28 = (Object[])var19;
      var19 = var10001;
      Method var17 = var10004;

      try {
         var10001 = (Object[])var17.invoke(var19, var28);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      com.c.c(476834218511181240L).set(this, var10001);
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      JLabel var10;
      File var11;
      String var12;
      boolean var13;
      Object var16;
      label204: {
         int[] var10000 = a3.I();
         boolean var9 = false;
         int[] var8 = var10000;
         var10 = (JLabel)super.getTreeCellRendererComponent(var1, var2, var9, var4, var5, var6, var7);
         var10.setBorder((Border)com.c.c(305948489245925105L).get(null));
         var10.setOpaque(false);
         var11 = null;
         var12 = "";
         var13 = true;
         boolean var14 = false;
         boolean var15 = false;
         var16 = null;
         var10000 = (int[])var2;
         if (var8 != null) {
            if (var2 == null) {
               break label204;
            }

            var10000 = (int[])var2;
         }

         var10000 = (int[])var10000.getClass();
         if (var8 != null) {
            if (!var10000.equals(DefaultMutableTreeNode.class)) {
               break label204;
            }

            var10000 = (int[])var2;
         }

         DefaultMutableTreeNode var17 = (DefaultMutableTreeNode)var10000;
         var16 = var17.getUserObject();
         var10000 = (int[])var16;
         if (var8 != null) {
            if (var16 == null) {
               break label204;
            }

            var10000 = (int[])var16;
         }

         label205: {
            boolean var40 = var10000.getClass().equals(tf_4.class);
            if (var8 != null) {
               if (var40) {
                  tf_4 var36 = (tf_4)var16;
                  Object[] var80 = com.c.f();
                  Method var119 = com.c.d(125751153336179464L);
                  Object[] var103 = var80;
                  tf_4 var81 = var36;
                  Method var52 = var119;

                  try {
                     var52.invoke(var81, var103);
                  } catch (InvocationTargetException var33) {
                     throw var33.getTargetException();
                  }

                  var80 = com.c.f();
                  var119 = com.c.d(490764181082108623L);
                  var103 = var80;
                  tf_4 var83 = var36;
                  Method var53 = var119;

                  try {
                     var54 = (Boolean)var53.invoke(var83, var103);
                  } catch (InvocationTargetException var32) {
                     throw var32.getTargetException();
                  }

                  var13 = var54;
                  var80 = com.c.f();
                  var119 = com.c.d(543633160597441792L);
                  var103 = var80;
                  tf_4 var85 = var36;
                  Method var55 = var119;

                  try {
                     var56 = (File)var55.invoke(var85, var103);
                  } catch (InvocationTargetException var31) {
                     throw var31.getTargetException();
                  }

                  var11 = var56;
                  var80 = com.c.f();
                  var119 = com.c.d(242892459251541809L);
                  var103 = var80;
                  tf_4 var87 = var36;
                  Method var57 = var119;

                  try {
                     var58 = (String)var57.invoke(var87, var103);
                  } catch (InvocationTargetException var30) {
                     throw var30.getTargetException();
                  }

                  label164: {
                     if (var8 != null) {
                        if (var58 != null) {
                           var80 = com.c.f();
                           var119 = com.c.d(242892459251541809L);
                           var103 = var80;
                           tf_4 var89 = var36;
                           Method var59 = var119;

                           try {
                              var60 = (String)var59.invoke(var89, var103);
                           } catch (InvocationTargetException var29) {
                              throw var29.getTargetException();
                           }

                           var12 = var60;
                           if (var8 != null) {
                              break label164;
                           }
                        }

                        var80 = com.c.f();
                        var119 = com.c.d(179612178163941306L);
                        var103 = var80;
                        tf_4 var91 = var36;
                        Method var61 = var119;

                        try {
                           var58 = (String)var61.invoke(var91, var103);
                        } catch (InvocationTargetException var28) {
                           throw var28.getTargetException();
                        }
                     }

                     var12 = var58;
                  }

                  label156: {
                     if (!var4) {
                        var10.setIcon((ImageIcon)com.c.c(559455637024722630L).get(this));
                        if (var8 != null) {
                           break label156;
                        }
                     }

                     var10.setIcon((ImageIcon)com.c.c(357690137608688931L).get(this));
                  }

                  var80 = com.c.f();
                  var119 = com.c.d(429314168584613002L);
                  var103 = var80;
                  tf_4 var93 = var36;
                  Method var62 = var119;

                  try {
                     var62.invoke(var93, var103);
                     break label204;
                  } catch (InvocationTargetException var27) {
                     throw var27.getTargetException();
                  }
               }

               var10000 = (int[])var16.getClass();
               if (var8 == null) {
                  break label205;
               }

               var40 = var10000.equals(ck_4.class);
            }

            if (!var40) {
               break label204;
            }

            var10000 = (int[])var16;
         }

         ck_4 var18 = (ck_4)var10000;
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(278678177125024050L);
         Object[] var10002 = var10001;
         ck_4 var69 = var18;
         Method var42 = var10003;

         try {
            var42.invoke(var69, var10002);
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(376601465768231673L);
         var10002 = var10001;
         ck_4 var71 = var18;
         Method var43 = var10003;

         try {
            var44 = (Boolean)var43.invoke(var71, var10002);
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         var13 = var44;
         var10001 = com.c.f();
         var10003 = com.c.d(272998330038223631L);
         var10002 = var10001;
         ck_4 var73 = var18;
         Method var45 = var10003;

         try {
            var46 = (File)var45.invoke(var73, var10002);
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         var11 = var46;
         var10001 = com.c.f();
         var10003 = com.c.d(580695022383982904L);
         var10002 = var10001;
         ck_4 var75 = var18;
         Method var47 = var10003;

         try {
            var48 = (String)var47.invoke(var75, var10002);
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         label173: {
            if (var8 != null) {
               if (var48 != null) {
                  var10001 = com.c.f();
                  var10003 = com.c.d(580695022383982904L);
                  var10002 = var10001;
                  ck_4 var77 = var18;
                  Method var49 = var10003;

                  try {
                     var50 = (String)var49.invoke(var77, var10002);
                  } catch (InvocationTargetException var22) {
                     throw var22.getTargetException();
                  }

                  var12 = var50;
                  if (var8 != null) {
                     break label173;
                  }
               }

               var10001 = com.c.f();
               var10003 = com.c.d(396085629172753019L);
               var10002 = var10001;
               ck_4 var79 = var18;
               Method var51 = var10003;

               try {
                  var48 = (String)var51.invoke(var79, var10002);
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }
            }

            var12 = var48;
         }

         var10.setIcon((ImageIcon)com.c.c(476834218511181240L).get(this));
      }

      var10.setText(var12);
      Object var34 = null;
      if (var13) {
         Object[] var63 = com.c.a(var11);
         Method var64 = com.c.d(479640066053387692L);
         Object[] var111 = var63;
         Object var95 = null;

         try {
            var63 = (Icon)var64.invoke(var95, var111);
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         var34 = var63;
      } else {
         Object[] var66 = com.c.a(var16);
         Method var67 = com.c.d(205466484628915359L);
         Object[] var113 = var66;
         Object var97 = null;

         try {
            var66 = (Icon)var67.invoke(var97, var113);
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         var34 = var66;
      }

      var10.setIcon((Icon)var34);
      return var10;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = " Ðá\u0088\u007fÐq\u009f¥Lë»ãèDºA\u0016ól\u008b\u001f2\"ØÔ\u009c\u008c@~«SÍ°\u008e3]\u008cVc\u0011\"\u007f±}un0]\u0081½ãXß\u0094\\5B";
      int var4 = " Ðá\u0088\u007fÐq\u009f¥Lë»ãèDºA\u0016ól\u008b\u001f2\"ØÔ\u009c\u008c@~«SÍ°\u008e3]\u008cVc\u0011\"\u007f±}un0]\u0081½ãXß\u0094\\5B".length();
      char var1 = 17;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 121;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 121;
               var10006 = var6;
            } else {
               var13 = 121;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 121;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 117;
                     break;
                  case 1:
                     var29 = 81;
                     break;
                  case 2:
                     var29 = 40;
                     break;
                  case 3:
                     var29 = 73;
                     break;
                  case 4:
                     var29 = 56;
                     break;
                  case 5:
                     var29 = 70;
                     break;
                  default:
                     var29 = 41;
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
            com.c.c(305948489245925105L).set(null, BorderFactory.createEmptyBorder(2, 0, 2, 0));
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 24373) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 127;
               break;
            case 1:
               var10000 = 176;
               break;
            case 2:
               var10000 = 11;
               break;
            case 3:
               var10000 = 105;
               break;
            case 4:
               var10000 = 16;
               break;
            case 5:
               var10000 = 149;
               break;
            case 6:
               var10000 = 215;
               break;
            case 7:
               var10000 = 234;
               break;
            case 8:
               var10000 = 4;
               break;
            case 9:
               var10000 = 53;
               break;
            case 10:
               var10000 = 25;
               break;
            case 11:
               var10000 = 33;
               break;
            case 12:
               var10000 = 1;
               break;
            case 13:
               var10000 = 139;
               break;
            case 14:
               var10000 = 233;
               break;
            case 15:
               var10000 = 131;
               break;
            case 16:
               var10000 = 244;
               break;
            case 17:
               var10000 = 137;
               break;
            case 18:
               var10000 = 129;
               break;
            case 19:
               var10000 = 10;
               break;
            case 20:
               var10000 = 69;
               break;
            case 21:
               var10000 = 82;
               break;
            case 22:
               var10000 = 38;
               break;
            case 23:
               var10000 = 206;
               break;
            case 24:
               var10000 = 210;
               break;
            case 25:
               var10000 = 42;
               break;
            case 26:
               var10000 = 116;
               break;
            case 27:
               var10000 = 214;
               break;
            case 28:
               var10000 = 238;
               break;
            case 29:
               var10000 = 47;
               break;
            case 30:
               var10000 = 165;
               break;
            case 31:
               var10000 = 182;
               break;
            case 32:
               var10000 = 168;
               break;
            case 33:
               var10000 = 220;
               break;
            case 34:
               var10000 = 110;
               break;
            case 35:
               var10000 = 240;
               break;
            case 36:
               var10000 = 157;
               break;
            case 37:
               var10000 = 136;
               break;
            case 38:
               var10000 = 236;
               break;
            case 39:
               var10000 = 203;
               break;
            case 40:
               var10000 = 242;
               break;
            case 41:
               var10000 = 140;
               break;
            case 42:
               var10000 = 73;
               break;
            case 43:
               var10000 = 114;
               break;
            case 44:
               var10000 = 55;
               break;
            case 45:
               var10000 = 134;
               break;
            case 46:
               var10000 = 226;
               break;
            case 47:
               var10000 = 128;
               break;
            case 48:
               var10000 = 106;
               break;
            case 49:
               var10000 = 150;
               break;
            case 50:
               var10000 = 99;
               break;
            case 51:
               var10000 = 103;
               break;
            case 52:
               var10000 = 158;
               break;
            case 53:
               var10000 = 86;
               break;
            case 54:
               var10000 = 138;
               break;
            case 55:
               var10000 = 115;
               break;
            case 56:
               var10000 = 253;
               break;
            case 57:
               var10000 = 41;
               break;
            case 58:
               var10000 = 20;
               break;
            case 59:
               var10000 = 163;
               break;
            case 60:
               var10000 = 49;
               break;
            case 61:
               var10000 = 0;
               break;
            case 62:
               var10000 = 152;
               break;
            case 63:
               var10000 = 37;
               break;
            case 64:
               var10000 = 119;
               break;
            case 65:
               var10000 = 217;
               break;
            case 66:
               var10000 = 141;
               break;
            case 67:
               var10000 = 243;
               break;
            case 68:
               var10000 = 142;
               break;
            case 69:
               var10000 = 9;
               break;
            case 70:
               var10000 = 125;
               break;
            case 71:
               var10000 = 164;
               break;
            case 72:
               var10000 = 113;
               break;
            case 73:
               var10000 = 183;
               break;
            case 74:
               var10000 = 88;
               break;
            case 75:
               var10000 = 228;
               break;
            case 76:
               var10000 = 61;
               break;
            case 77:
               var10000 = 111;
               break;
            case 78:
               var10000 = 71;
               break;
            case 79:
               var10000 = 13;
               break;
            case 80:
               var10000 = 19;
               break;
            case 81:
               var10000 = 209;
               break;
            case 82:
               var10000 = 62;
               break;
            case 83:
               var10000 = 18;
               break;
            case 84:
               var10000 = 50;
               break;
            case 85:
               var10000 = 63;
               break;
            case 86:
               var10000 = 94;
               break;
            case 87:
               var10000 = 15;
               break;
            case 88:
               var10000 = 8;
               break;
            case 89:
               var10000 = 45;
               break;
            case 90:
               var10000 = 250;
               break;
            case 91:
               var10000 = 97;
               break;
            case 92:
               var10000 = 56;
               break;
            case 93:
               var10000 = 143;
               break;
            case 94:
               var10000 = 147;
               break;
            case 95:
               var10000 = 181;
               break;
            case 96:
               var10000 = 241;
               break;
            case 97:
               var10000 = 65;
               break;
            case 98:
               var10000 = 117;
               break;
            case 99:
               var10000 = 58;
               break;
            case 100:
               var10000 = 120;
               break;
            case 101:
               var10000 = 7;
               break;
            case 102:
               var10000 = 189;
               break;
            case 103:
               var10000 = 175;
               break;
            case 104:
               var10000 = 245;
               break;
            case 105:
               var10000 = 154;
               break;
            case 106:
               var10000 = 191;
               break;
            case 107:
               var10000 = 177;
               break;
            case 108:
               var10000 = 91;
               break;
            case 109:
               var10000 = 212;
               break;
            case 110:
               var10000 = 29;
               break;
            case 111:
               var10000 = 70;
               break;
            case 112:
               var10000 = 5;
               break;
            case 113:
               var10000 = 200;
               break;
            case 114:
               var10000 = 231;
               break;
            case 115:
               var10000 = 107;
               break;
            case 116:
               var10000 = 132;
               break;
            case 117:
               var10000 = 161;
               break;
            case 118:
               var10000 = 205;
               break;
            case 119:
               var10000 = 118;
               break;
            case 120:
               var10000 = 23;
               break;
            case 121:
               var10000 = 207;
               break;
            case 122:
               var10000 = 184;
               break;
            case 123:
               var10000 = 145;
               break;
            case 124:
               var10000 = 54;
               break;
            case 125:
               var10000 = 251;
               break;
            case 126:
               var10000 = 199;
               break;
            case 127:
               var10000 = 123;
               break;
            case 128:
               var10000 = 79;
               break;
            case 129:
               var10000 = 252;
               break;
            case 130:
               var10000 = 35;
               break;
            case 131:
               var10000 = 84;
               break;
            case 132:
               var10000 = 179;
               break;
            case 133:
               var10000 = 229;
               break;
            case 134:
               var10000 = 232;
               break;
            case 135:
               var10000 = 213;
               break;
            case 136:
               var10000 = 112;
               break;
            case 137:
               var10000 = 195;
               break;
            case 138:
               var10000 = 52;
               break;
            case 139:
               var10000 = 68;
               break;
            case 140:
               var10000 = 57;
               break;
            case 141:
               var10000 = 59;
               break;
            case 142:
               var10000 = 193;
               break;
            case 143:
               var10000 = 188;
               break;
            case 144:
               var10000 = 151;
               break;
            case 145:
               var10000 = 169;
               break;
            case 146:
               var10000 = 12;
               break;
            case 147:
               var10000 = 78;
               break;
            case 148:
               var10000 = 44;
               break;
            case 149:
               var10000 = 130;
               break;
            case 150:
               var10000 = 166;
               break;
            case 151:
               var10000 = 40;
               break;
            case 152:
               var10000 = 153;
               break;
            case 153:
               var10000 = 108;
               break;
            case 154:
               var10000 = 172;
               break;
            case 155:
               var10000 = 248;
               break;
            case 156:
               var10000 = 104;
               break;
            case 157:
               var10000 = 109;
               break;
            case 158:
               var10000 = 2;
               break;
            case 159:
               var10000 = 187;
               break;
            case 160:
               var10000 = 174;
               break;
            case 161:
               var10000 = 22;
               break;
            case 162:
               var10000 = 198;
               break;
            case 163:
               var10000 = 95;
               break;
            case 164:
               var10000 = 100;
               break;
            case 165:
               var10000 = 66;
               break;
            case 166:
               var10000 = 90;
               break;
            case 167:
               var10000 = 211;
               break;
            case 168:
               var10000 = 76;
               break;
            case 169:
               var10000 = 75;
               break;
            case 170:
               var10000 = 24;
               break;
            case 171:
               var10000 = 43;
               break;
            case 172:
               var10000 = 225;
               break;
            case 173:
               var10000 = 194;
               break;
            case 174:
               var10000 = 171;
               break;
            case 175:
               var10000 = 162;
               break;
            case 176:
               var10000 = 144;
               break;
            case 177:
               var10000 = 92;
               break;
            case 178:
               var10000 = 60;
               break;
            case 179:
               var10000 = 254;
               break;
            case 180:
               var10000 = 170;
               break;
            case 181:
               var10000 = 160;
               break;
            case 182:
               var10000 = 135;
               break;
            case 183:
               var10000 = 192;
               break;
            case 184:
               var10000 = 6;
               break;
            case 185:
               var10000 = 124;
               break;
            case 186:
               var10000 = 148;
               break;
            case 187:
               var10000 = 39;
               break;
            case 188:
               var10000 = 77;
               break;
            case 189:
               var10000 = 121;
               break;
            case 190:
               var10000 = 21;
               break;
            case 191:
               var10000 = 249;
               break;
            case 192:
               var10000 = 81;
               break;
            case 193:
               var10000 = 218;
               break;
            case 194:
               var10000 = 133;
               break;
            case 195:
               var10000 = 34;
               break;
            case 196:
               var10000 = 89;
               break;
            case 197:
               var10000 = 83;
               break;
            case 198:
               var10000 = 196;
               break;
            case 199:
               var10000 = 178;
               break;
            case 200:
               var10000 = 202;
               break;
            case 201:
               var10000 = 80;
               break;
            case 202:
               var10000 = 237;
               break;
            case 203:
               var10000 = 14;
               break;
            case 204:
               var10000 = 85;
               break;
            case 205:
               var10000 = 235;
               break;
            case 206:
               var10000 = 224;
               break;
            case 207:
               var10000 = 46;
               break;
            case 208:
               var10000 = 101;
               break;
            case 209:
               var10000 = 223;
               break;
            case 210:
               var10000 = 221;
               break;
            case 211:
               var10000 = 197;
               break;
            case 212:
               var10000 = 159;
               break;
            case 213:
               var10000 = 3;
               break;
            case 214:
               var10000 = 74;
               break;
            case 215:
               var10000 = 32;
               break;
            case 216:
               var10000 = 126;
               break;
            case 217:
               var10000 = 51;
               break;
            case 218:
               var10000 = 93;
               break;
            case 219:
               var10000 = 230;
               break;
            case 220:
               var10000 = 31;
               break;
            case 221:
               var10000 = 67;
               break;
            case 222:
               var10000 = 239;
               break;
            case 223:
               var10000 = 26;
               break;
            case 224:
               var10000 = 96;
               break;
            case 225:
               var10000 = 17;
               break;
            case 226:
               var10000 = 102;
               break;
            case 227:
               var10000 = 190;
               break;
            case 228:
               var10000 = 155;
               break;
            case 229:
               var10000 = 180;
               break;
            case 230:
               var10000 = 48;
               break;
            case 231:
               var10000 = 201;
               break;
            case 232:
               var10000 = 27;
               break;
            case 233:
               var10000 = 219;
               break;
            case 234:
               var10000 = 30;
               break;
            case 235:
               var10000 = 72;
               break;
            case 236:
               var10000 = 64;
               break;
            case 237:
               var10000 = 156;
               break;
            case 238:
               var10000 = 227;
               break;
            case 239:
               var10000 = 98;
               break;
            case 240:
               var10000 = 28;
               break;
            case 241:
               var10000 = 216;
               break;
            case 242:
               var10000 = 167;
               break;
            case 243:
               var10000 = 186;
               break;
            case 244:
               var10000 = 122;
               break;
            case 245:
               var10000 = 247;
               break;
            case 246:
               var10000 = 255;
               break;
            case 247:
               var10000 = 204;
               break;
            case 248:
               var10000 = 87;
               break;
            case 249:
               var10000 = 173;
               break;
            case 250:
               var10000 = 146;
               break;
            case 251:
               var10000 = 208;
               break;
            case 252:
               var10000 = 36;
               break;
            case 253:
               var10000 = 222;
               break;
            case 254:
               var10000 = 246;
               break;
            default:
               var10000 = 185;
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





