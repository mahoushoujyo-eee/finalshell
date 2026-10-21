package com.finalshell.core;

import com.finalshell.ui.model.Es2;
import com.finalshell.ui.model.K6;
import com.finalshell.ui.panel.Oj2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.View;

public final class EI implements SwingConstants {
   public static Comparator J;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static void F(com.finalshell.ui.panel.Yy2 var0, List var1) {
      var1.clear();
      int var10000 = (Oj2.V()) ? 1 : 0;
      List var3 = var0.J();
      boolean var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      Collections.sort(var3, J);
      String var4 = var0.getText();
      String var14 = var4;
      if (!var2) {
         if (var4 == null) {
            return;
         }

         var14 = var4;
      }

      var10000 = var14.length();
      if (!var2) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = 0;
      }

      int var5 = var10000;

      int var10001;
      label60: {
         for (LS3 var7 : var3) {
            var10000 = var5;
            var10001 = var4.length();
            if (var2) {
               break label60;
            }

            if (!var2) {
               if (var5 >= var10001 && !var2) {
                  break;
               }

               var10000 = var7.H();
               var10001 = var5;
            }

            if (!var2) {
               if (var10000 > var10001) {
                  String var8 = var4.substring(var5, Math.min(var7.H(), var4.length()));
                  LS3 var9 = new LS3(var5, var7.H() - var5, new K6[0]);
                  G(var8, var9, var1);
                  var5 = var7.H();
               }

               var10000 = var7.H();
               var10001 = var5;
            }

            label76: {
               if (!var2) {
                  if (var10000 != var10001) {
                     break label76;
                  }

                  var10000 = var7.F();
                  var10001 = -1;
               }

               if (var10000 == var10001) {
                  String var12 = var4.substring(var5);
                  G(var12, var7, var1);
                  var5 = var4.length();
                  if (!var2) {
                     break label76;
                  }
               }

               String var13 = var4.substring(var5, Math.min(var5 + var7.F(), var4.length()));
               G(var13, var7, var1);
               var5 += var7.F();
            }

            if (var2) {
               break;
            }
         }

         var10000 = var5;
         var10001 = var4.length();
      }

      if (var10000 < var10001) {
         String var10 = var4.substring(var5, var4.length());
         LS3 var11 = new LS3(var5, var4.length() - var5, new K6[0]);
         G(var10, var11, var1);
      }
   }

   public static void G(String var0, LS3 var1, List var2) {
      int var10000 = (Oj2.V()) ? 1 : 0;
      var1 = new LS3(var1);
      int var4 = var0.indexOf(a(9869, 408594966773347042L));
      int var5 = var0.indexOf(a(15537, 1662597904632588508L));
      boolean var3 = (((((boolean)var10000) != 0) != 0) != 0) != 0;

      label87: {
         do {
            label84: {
               if (var4 < 0) {
                  var10000 = var5;
                  if (var3) {
                     break label84;
                  }

                  if (var3) {
                     break label87;
                  }

                  if (var5 < 0) {
                     break;
                  }
               }

               var10000 = var4;
            }

            if (!var3) {
               var10000 = var10000 >= 0 ? var4 : -1;
            }

            int var6;
            label93: {
               var6 = var10000;
               var10000 = var5;
               if (!var3) {
                  if (var5 < 0) {
                     break label93;
                  }

                  var10000 = var5;
               }

               label72:
               if (!var3) {
                  if (var10000 >= var4) {
                     var10000 = var6;
                     if (var3) {
                        break label72;
                     }

                     if (var6 >= 0) {
                        break label93;
                     }
                  }

                  var10000 = var5;
               }

               var6 = var10000;
            }

            String var7 = var0.substring(0, var6);
            LS3 var8 = new LS3(var1);
            var8.H(var1.H());
            var8.w(var6);
            var2.add(new C8_2(var7, var8));
            int var9 = 1;
            var10000 = var0.charAt(var6);
            label59:
            if (!var3) {
               if (var10000 == a(9869, 408594966773347042L)) {
                  var10000 = var6 + 1;
                  if (var3) {
                     break label59;
                  }

                  if (var10000 < var0.length()) {
                     var10000 = var0.charAt(var6 + 1);
                     if (var3) {
                        break label59;
                     }

                     if (var10000 == a(15537, 1662597904632588508L)) {
                        var9++;
                     }
                  }
               }

               var8 = new LS3(var1);
               var8.H(var1.H() + var6);
               var8.w(var9);
               var2.add(new C8_2(var0.substring(var6, var6 + var9), var8));
               var0 = var0.substring(var6 + var9);
               var1.H(var1.H() + var6 + var9);
               var1.w(var1.F() - var6 - var9);
               var4 = var0.indexOf(a(9869, 408594966773347042L));
               var10000 = var0.indexOf(a(15537, 1662597904632588508L));
            }

            var5 = var10000;
         } while (!var3);

         var10000 = var0.length();
      }

      if (!var3 && var10000 > 0) {
         var2.add(new C8_2(var0, var1));
      }
   }

   public static Font s(com.finalshell.ui.panel.Yy2 var0) {
      boolean var10000 = Oj2.V();
      Font var2 = var0.getFont();
      boolean var1 = var10000;
      Font var3 = var2;
      if (!var1) {
         if (var2 == null) {
            var2 = UIManager.getFont(a(14546, 26064));
         }

         var3 = var2;
      }

      return var3;
   }

   public static int j(String var0, int var1) {
      boolean var2 = Oj2.g();
      int var10000 = var1;
      if (var2) {
         var10000 = var1 < 0 ? 1 : 0;
      }

      int var3 = var10000;
      int var4 = var1 + 1;

      while (true) {
         if (var4 < var0.length()) {
            char var5 = var0.charAt(var4);
            var10000 = var5;
            if (!var2) {
               break;
            }

            label54: {
               label53:
               if (var2) {
                  if (var5 != a(19255, 3641229676422029147L)) {
                     var10000 = var5;
                     if (!var2) {
                        break label53;
                     }

                     if (var5 != a(11801, 456213457870862963L)) {
                        var10000 = var5;
                        if (!var2) {
                           break label53;
                        }

                        if (var5 != a(26363, 6113360339356316306L)) {
                           var10000 = var5;
                           if (!var2) {
                              break label53;
                           }

                           if (var5 != a(6728, 6661894428686028320L)) {
                              if (!var2) {
                                 return var3;
                              }

                              if (var3 == 0) {
                                 return var4;
                              }
                              break label54;
                           }
                        }
                     }
                  }

                  var10000 = 0;
               }

               var3 = var10000;
            }

            var4++;
            if (var2) {
               continue;
            }
         }

         var10000 = var0.length();
         break;
      }

      return var10000;
   }

   public static int h(String var0) {
      char var2 = 0;
      int var10000 = (Oj2.V()) ? 1 : 0;
      int var3 = var0.length() - 1;
      boolean var1 = (((((boolean)var10000) != 0) != 0) != 0) != 0;

      while (true) {
         if (var3 >= 0) {
            char var4 = var0.charAt(var3);
            var10000 = var2;
            if (var1) {
               break;
            }

            label88: {
               if (!var1) {
                  if (var2 == 0) {
      String var6;
                     var6 = var4;
                     label72:
                     if (!var1) {
                        if (var4 != a(31619, 7846944831991345128L)) {
                           var6 = var4;
                           if (var1) {
                              break label72;
                           }

                           if (var4 != a(2954, 6102690886178185188L)) {
                              var6 = var4;
                              if (var1) {
                                 break label72;
                              }

                              if (var4 != a(9869, 408594966773347042L)) {
                                 var6 = var4;
                                 if (var1) {
                                    break label72;
                                 }

                                 if (var4 != a(15537, 1662597904632588508L)) {
                                    break label88;
                                 }
                              }
                           }
                        }

                        var6 = 1;
                     }

                     var2 = var6;
                     if (!var1) {
                        break label88;
                     }
                  }

                  var10000 = var4;
               }

               int var10001 = a(31619, 7846944831991345128L);
               if (!var1) {
                  if (var10000 == var10001) {
                     break label88;
                  }

                  var10000 = var4;
                  var10001 = a(2954, 6102690886178185188L);
               }

               if (!var1) {
                  if (var10000 == var10001) {
                     break label88;
                  }

                  var10000 = var4;
                  var10001 = a(9869, 408594966773347042L);
               }

               if (!var1) {
                  if (var10000 == var10001) {
                     break label88;
                  }

                  var10000 = var4;
                  if (var1) {
                     return var4;
                  }

                  var10001 = a(15537, 1662597904632588508L);
               }

               if (var10000 != var10001) {
                  return var3;
               }
            }

            var3--;
            if (!var1) {
               continue;
            }
         }

         var10000 = -1;
         break;
      }

      return var10000;
   }

   public static String r(
      com.finalshell.ui.panel.Yy2 var0,
      String var1,
      Icon var2,
      int var3,
      int var4,
      int var5,
      int var6,
      Rectangle var7,
      Rectangle var8,
      Rectangle var9,
      int var10
   ) {
      boolean var11;
      byte var12;
      int var13;
      int var16;
      label80: {
         label83: {
            boolean var10000 = Oj2.g();
            var12 = 1;
            var11 = var10000;
            var13 = var4;
            com.finalshell.ui.panel.Yy2 var15 = var0;
            if (var11) {
               if (var0 == null) {
                  break label83;
               }

               var15 = var0;
            }

            var16 = (var15.getComponentOrientation().isLeftToRight()) ? 1 : 0;
            if (!var11) {
               break label80;
            }

            if (var16 == 0) {
               var12 = 0;
            }
         }

         var16 = var4;
      }

      if (var11) {
         switch (var16) {
            case 10:
               var16 = var12;
               if (var11) {
                  var16 = var12 != 0 ? 2 : 4;
               }

               var13 = var16;
               if (var11) {
                  break;
               }
            case 11:
               var16 = var12;
               if (var11) {
                  var16 = var12 != 0 ? 4 : 2;
               }

               var13 = var16;
         }

         var16 = var6;
      }

      label85: {
         if (var11) {
            switch (var16) {
               case 10:
                  var16 = var12;
                  break;
               case 11:
                  break label85;
               default:
                  return D(var0, var1, var2, var3, var13, var5, var6, var7, var8, var9, var10);
            }
         }

         if (var11) {
            var16 = var16 != 0 ? 2 : 4;
         }

         int var14 = var16;
         if (var11) {
            return D(var0, var1, var2, var3, var13, var5, var14, var7, var8, var9, var10);
         }
      }

      var16 = var12;
      if (var11) {
         var16 = var12 != 0 ? 4 : 2;
      }

      int var20 = var16;
      return D(var0, var1, var2, var3, var13, var5, var20, var7, var8, var9, var10);
   }

   public static String l(String var0, Icon var1, int var2, int var3, int var4, int var5, Rectangle var6, Rectangle var7, Rectangle var8, int var9) {
      return D(null, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static String D(
      com.finalshell.ui.panel.Yy2 var0,
      String var1,
      Icon var2,
      int var3,
      int var4,
      int var5,
      int var6,
      Rectangle var7,
      Rectangle var8,
      Rectangle var9,
      int var10
   ) {
      boolean var11;
      label244: {
         label243: {
            var11 = Oj2.g();
            if (var11) {
               if (var2 == null) {
                  break label243;
               }

               var8.width = var2.getIconWidth();
               var8.height = var2.getIconHeight();
            }

            if (var11) {
               break label244;
            }
         }

         var8.width = var8.height = 0;
      }

      byte var28;
      label235: {
         label247: {
            String var10000 = var1;
            if (var11) {
               if (var1 == null) {
                  break label247;
               }

               var10000 = var1;
            }

            var28 = (var10000.equals("")) ? 1 : 0;
            if (!var11) {
               break label235;
            }

            if (var28 == 0) {
               var28 = 0;
               break label235;
            }
         }

         var28 = 1;
      }

      int var14;
      label248: {
         label223: {
            byte var12 = (byte)var28;
            boolean var13 = false;
            var28 = var12;
            if (var11) {
               if (var12 == 0) {
                  break label223;
               }

               var9.width = var9.height = 0;
               var1 = "";
               var28 = (byte)0;
            }

            var14 = var28;
            if (var11) {
               break label248;
            }
         }

         int var16;
         label214: {
            var14 = var2 == null ? 0 : var10;
            var28 = var6;
            if (var11) {
               if (var6 == 0) {
                  var16 = var7.width;
                  if (var11) {
                     break label214;
                  }
               }

               var28 = var7.width - (var8.width + var14);
            }

            var16 = var28;
         }

         label207: {
            Object var31 = var0;
            if (var11) {
               if (var0 == null) {
                  var32 = null;
                  break label207;
               }

               var31 = var0.getClientProperty(a(14556, -17820));
            }

            var32 = (View)var31;
         }

         View var15 = var32;
         if (var11) {
            if (var15 == null) {
               break label248;
            }

            var9.width = Math.min(var16, (int)var15.getPreferredSpan(0));
         }

         var9.height = (int)var15.getPreferredSpan(1);
      }

      label249: {
         var28 = var5;
         if (var11) {
            if (var5 == 1) {
               if (var6 != 0) {
                  var9.y = 0;
                  if (var11) {
                     break label249;
                  }
               }

               var9.y = -(var9.height + var14);
               if (var11) {
                  break label249;
               }
            }

            var28 = var5;
         }

         if (var11) {
            if (var28 == 0) {
               var9.y = var8.height / 2 - var9.height / 2;
               if (var11) {
                  break label249;
               }
            }

            var28 = var6;
         }

         if (var28 != 0) {
            var9.y = var8.height - var9.height;
            if (var11) {
               break label249;
            }
         }

         var9.y = var8.height + var14;
      }

      label250: {
         var28 = var6;
         if (var11) {
            if (var6 == 2) {
               var9.x = -(var9.width + var14);
               if (var11) {
                  break label250;
               }
            }

            var28 = var6;
         }

         if (var28 == 0) {
            var9.x = var8.width / 2 - var9.width / 2;
            if (var11) {
               break label250;
            }
         }

         var9.x = var8.width + var14;
      }

      int var17;
      int var21;
      int var26;
      label251: {
         var26 = Math.min(var8.x, var9.x);
         var17 = Math.max(var8.x + var8.width, var9.x + var9.width) - var26;
         int var18 = Math.min(var8.y, var9.y);
         int var19 = Math.max(var8.y + var8.height, var9.y + var9.height) - var18;
         var28 = var3;
         if (var11) {
            if (var3 == 1) {
               var21 = var7.y - var18;
               if (var11) {
                  break label251;
               }
            }

            var28 = var3;
         }

         if (var11) {
            if (var28 == 0) {
               var21 = var7.y + var7.height / 2 - (var18 + var19 / 2);
               if (var11) {
                  break label251;
               }
            }

            var28 = var7.y + var7.height - (var18 + var19);
         }

         var21 = var28;
      }

      int var20;
      label252: {
         var28 = var4;
         int var10001 = 2;
         if (var11) {
            if (var4 == 2) {
               var20 = var7.x - var26;
               if (var11) {
                  break label252;
               }
            }

            var28 = var4;
            var10001 = 4;
         }

         if (var11) {
            if (var28 == var10001) {
               var20 = var7.x + var7.width - (var26 + var17);
               if (var11) {
                  break label252;
               }
            }

            var28 = var7.x + var7.width / 2;
            var10001 = var26 + var17 / 2;
         }

         var20 = var28 - var10001;
      }

      int var22;
      Insets var23;
      label253: {
         var9.x += var20;
         var9.y += var21;
         var8.x += var20;
         var8.y += var21;
         var22 = var7.height / 2;
         var23 = var0.getInsets();
         int var24 = var7.x;
         int var25 = var7.width;
         var25 -= var8.width;
         var28 = var6;
         if (var11) {
            if (var6 == 0) {
               Rectangle var38 = var7;
               if (var11) {
                  if (var7.width < var9.width) {
                     var8.x = (var24 + var25) / 2;
                     if (var11) {
                        break label253;
                     }
                  }

                  var38 = var8;
               }

               var38.x = var9.x + (var9.width - var8.width) / 2;
               if (var11) {
                  break label253;
               }
            }

            var28 = var8.x;
         }

         int var40 = var24;
         if (var11) {
            if (var28 < var24) {
               var9.x = var9.x + (var24 - var8.x);
               var8.x = var24;
               if (var11) {
                  break label253;
               }
            }

            var28 = var8.x;
            var40 = var25;
         }

         if (var11) {
            if (var28 <= var40) {
               break label253;
            }

            var28 = var4;
            var40 = 2;
         }

         if (var28 != var40) {
            var8.x = var25;
            var9.x = var9.x - (var8.x - var25);
         }
      }

      if (var23 != null) {
         var22 -= (var23.bottom + var23.top) / 2;
      }

      if (var2 != null) {
         var22 -= var2.getIconHeight() / 2;
      }

      var28 = var3;
      byte var41 = 1;
      if (var11) {
         if (var3 == 1) {
            var8.y = Math.min(var22, var8.y);
            if (var11) {
               return var1;
            }
         }

         var28 = var3;
         var41 = 3;
      }

      if (var28 == var41) {
         var8.y = Math.max(var22, var8.y);
      }

      return var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String C(String var0, List var1) {
      boolean var2;
      String var3;
      label60: {
         int var10000 = (Oj2.g()) ? 1 : 0;
         var3 = ("") != null;
         var2 = ((((boolean)var10000) != 0) != 0) != 0;
         String var4 = var0;
         int var5 = V(var0, "{", 0);
         var10000 = var5;
         byte var10001 = -1;
         if (var2) {
            if (var5 == -1) {
               return var0;
            }

            var10000 = var5;
            var10001 = -1;
         }

         while (var10000 != var10001) {
            int var6 = V(var4, "}", var5 + 1);
            if (!var2) {
               break label60;
            }

            label51: {
               if (var6 != -1) {
                  label48: {
                     label47: {
                        C8_2 var7 = s(var4.substring(var5 + 1, var6));
                        C8_2 var9 = var7;
                        if (var2) {
                           if (var7 == null) {
                              break label47;
                           }

                           var3 = var3 + var4.substring(0, var5);
                           var9 = var7;
                        }

                        var9.h().H(var3.length());
                        var1.add(var7.h());
                        var3 = var3 + var7.K();
                        if (var2) {
                           break label48;
                        }
                     }

                     var3 = var3 + var4;
                  }

                  var4 = var4.substring(var6 + 1);
                  var5 = V(var4, "{", 0);
                  if (var2) {
                     break label51;
                  }
               }

               var3 = var3 + var4;
            }

            if (!var2) {
               var3 = var3 + var4;
               break label60;
            }

            var10000 = var5;
            var10001 = -1;
         }

         var3 = var3 + var4;
      }

      if (!var2) {
         var3 = var0;
      }

      return var3;
   }

   public static int V(String var0, String var1, int var2) {
      return var0.indexOf(var1, var2);
   }

   public static C8_2 s(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Oj2.V ()Z
      // 003: aload 0
      // 004: ldc_w ":"
      // 007: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 00a: istore 2
      // 00b: istore 1
      // 00c: iload 2
      // 00d: bipush -1
      // 00e: if_icmpeq 4e7
      // 011: aload 0
      // 012: bipush 0
      // 013: iload 2
      // 014: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 017: astore 3
      // 018: bipush 0
      // 019: istore 4
      // 01b: bipush 0
      // 01c: istore 5
      // 01e: bipush 0
      // 01f: istore 6
      // 021: aconst_null
      // 022: astore 7
      // 024: aconst_null
      // 025: astore 8
      // 027: new java/util/ArrayList
      // 02a: dup
      // 02b: invokespecial java/util/ArrayList.<init> ()V
      // 02e: astore 9
      // 030: aload 0
      // 031: iload 2
      // 032: bipush 1
      // 033: iadd
      // 034: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 037: astore 10
      // 039: new java/util/StringTokenizer
      // 03c: dup
      // 03d: aload 10
      // 03f: ldc_w ";"
      // 042: bipush 0
      // 043: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 046: astore 11
      // 048: aload 11
      // 04a: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 04d: ifeq 43b
      // 050: aload 11
      // 052: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 055: astore 12
      // 057: aload 12
      // 059: ldc_w "p"
      // 05c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05f: iload 1
      // 060: ifne 43d
      // 063: iload 1
      // 064: ifne 09c
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: ifne 09b
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 12
      // 07a: sipush 14549
      // 07d: sipush 7759
      // 080: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 083: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 086: iload 1
      // 087: ifne 0b1
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: ifeq 0a2
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: bipush 1
      // 09c: istore 4
      // 09e: iload 1
      // 09f: ifeq 437
      // 0a2: aload 12
      // 0a4: ldc_w "b"
      // 0a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: iload 1
      // 0b2: ifne 0e3
      // 0b5: ifne 0e2
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aload 12
      // 0c1: sipush 14544
      // 0c4: sipush -10645
      // 0c7: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 0ca: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cd: iload 1
      // 0ce: ifne 0f8
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: ifeq 0e9
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: bipush 1
      // 0e3: istore 5
      // 0e5: iload 1
      // 0e6: ifeq 437
      // 0e9: aload 12
      // 0eb: ldc_w "i"
      // 0ee: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: iload 1
      // 0f9: ifne 12a
      // 0fc: ifne 129
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: aload 12
      // 108: sipush 14555
      // 10b: sipush 22952
      // 10e: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 111: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 114: iload 1
      // 115: ifne 13f
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: ifeq 130
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: bipush 1
      // 12a: istore 6
      // 12c: iload 1
      // 12d: ifeq 437
      // 130: aload 12
      // 132: ldc_w "u"
      // 135: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: iload 1
      // 140: ifne 181
      // 143: ifne 170
      // 146: goto 14d
      // 149: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 12
      // 14f: sipush 14553
      // 152: sipush -29417
      // 155: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 158: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15b: iload 1
      // 15c: ifne 19b
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: ifeq 186
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: aload 9
      // 172: getstatic com/finalshell/ui/model/K6.underlined Lcom/finalshell/ui/model/K6;
      // 175: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 180: athrow
      // 181: pop
      // 182: iload 1
      // 183: ifeq 437
      // 186: aload 12
      // 188: sipush 14557
      // 18b: sipush 25656
      // 18e: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 191: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19a: athrow
      // 19b: iload 1
      // 19c: ifne 200
      // 19f: ifne 1ef
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: aload 12
      // 1ab: sipush 14559
      // 1ae: sipush 5834
      // 1b1: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 1b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b7: iload 1
      // 1b8: ifne 200
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: ifne 1ef
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: aload 12
      // 1ce: sipush 14545
      // 1d1: sipush 11434
      // 1d4: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 1d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1da: iload 1
      // 1db: ifne 21a
      // 1de: goto 1e5
      // 1e1: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: ifeq 205
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: aload 9
      // 1f1: getstatic com/finalshell/ui/model/K6.superscript Lcom/finalshell/ui/model/K6;
      // 1f4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: pop
      // 201: iload 1
      // 202: ifeq 437
      // 205: aload 12
      // 207: sipush 14550
      // 20a: sipush 14937
      // 20d: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 210: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 213: goto 21a
      // 216: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 219: athrow
      // 21a: iload 1
      // 21b: ifne 27f
      // 21e: ifne 26e
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 227: athrow
      // 228: aload 12
      // 22a: sipush 14554
      // 22d: sipush -17376
      // 230: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 233: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 236: iload 1
      // 237: ifne 27f
      // 23a: goto 241
      // 23d: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: ifne 26e
      // 244: goto 24b
      // 247: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24a: athrow
      // 24b: aload 12
      // 24d: sipush 14547
      // 250: sipush 4099
      // 253: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 256: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 259: iload 1
      // 25a: ifne 293
      // 25d: goto 264
      // 260: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 263: athrow
      // 264: ifeq 284
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26d: athrow
      // 26e: aload 9
      // 270: getstatic com/finalshell/ui/model/K6.subscript Lcom/finalshell/ui/model/K6;
      // 273: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: pop
      // 280: iload 1
      // 281: ifeq 437
      // 284: aload 12
      // 286: ldc_w "s"
      // 289: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28c: goto 293
      // 28f: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 292: athrow
      // 293: iload 1
      // 294: ifne 2d5
      // 297: ifne 2c4
      // 29a: goto 2a1
      // 29d: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a0: athrow
      // 2a1: aload 12
      // 2a3: sipush 14537
      // 2a6: sipush -8368
      // 2a9: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 2ac: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2af: iload 1
      // 2b0: ifne 2ef
      // 2b3: goto 2ba
      // 2b6: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b9: athrow
      // 2ba: ifeq 2da
      // 2bd: goto 2c4
      // 2c0: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c3: athrow
      // 2c4: aload 9
      // 2c6: getstatic com/finalshell/ui/model/K6.strikeThrough Lcom/finalshell/ui/model/K6;
      // 2c9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2ce: goto 2d5
      // 2d1: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d4: athrow
      // 2d5: pop
      // 2d6: iload 1
      // 2d7: ifeq 437
      // 2da: aload 12
      // 2dc: sipush 14548
      // 2df: sipush -25687
      // 2e2: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 2e5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2e8: goto 2ef
      // 2eb: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ee: athrow
      // 2ef: iload 1
      // 2f0: ifne 331
      // 2f3: ifne 320
      // 2f6: goto 2fd
      // 2f9: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fc: athrow
      // 2fd: aload 12
      // 2ff: sipush 14536
      // 302: sipush 29708
      // 305: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 308: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 30b: iload 1
      // 30c: ifne 350
      // 30f: goto 316
      // 312: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 315: athrow
      // 316: ifeq 336
      // 319: goto 320
      // 31c: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31f: athrow
      // 320: aload 9
      // 322: getstatic com/finalshell/ui/model/K6.doubleStrikeThrough Lcom/finalshell/ui/model/K6;
      // 325: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 32a: goto 331
      // 32d: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 330: athrow
      // 331: pop
      // 332: iload 1
      // 333: ifeq 437
      // 336: aload 12
      // 338: iload 1
      // 339: ifne 3b8
      // 33c: goto 343
      // 33f: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 342: athrow
      // 343: ldc_w "c"
      // 346: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 349: goto 350
      // 34c: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34f: athrow
      // 350: ifne 3b6
      // 353: aload 12
      // 355: iload 1
      // 356: ifne 3b8
      // 359: goto 360
      // 35c: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35f: athrow
      // 360: sipush 14551
      // 363: sipush 26161
      // 366: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 369: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 36c: ifne 3b6
      // 36f: goto 376
      // 372: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 375: athrow
      // 376: aload 12
      // 378: iload 1
      // 379: ifne 3b8
      // 37c: goto 383
      // 37f: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 382: athrow
      // 383: ldc_w "f"
      // 386: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 389: ifne 3b6
      // 38c: goto 393
      // 38f: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 392: athrow
      // 393: aload 12
      // 395: sipush 14558
      // 398: sipush 3950
      // 39b: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 39e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 3a1: iload 1
      // 3a2: ifne 3ef
      // 3a5: goto 3ac
      // 3a8: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ab: athrow
      // 3ac: ifeq 3d5
      // 3af: goto 3b6
      // 3b2: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b5: athrow
      // 3b6: aload 12
      // 3b8: invokestatic com/finalshell/core/EI.p (Ljava/lang/String;)Ljava/awt/Color;
      // 3bb: astore 13
      // 3bd: aload 13
      // 3bf: iload 1
      // 3c0: ifne 3cf
      // 3c3: ifnull 3d1
      // 3c6: goto 3cd
      // 3c9: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cc: athrow
      // 3cd: aload 13
      // 3cf: astore 7
      // 3d1: iload 1
      // 3d2: ifeq 437
      // 3d5: aload 12
      // 3d7: iload 1
      // 3d8: ifne 41e
      // 3db: goto 3e2
      // 3de: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e1: athrow
      // 3e2: ldc_w "b"
      // 3e5: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 3e8: goto 3ef
      // 3eb: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ee: athrow
      // 3ef: ifne 415
      // 3f2: aload 12
      // 3f4: iload 1
      // 3f5: ifne 41e
      // 3f8: goto 3ff
      // 3fb: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fe: athrow
      // 3ff: sipush 14552
      // 402: sipush -31536
      // 405: invokestatic com/finalshell/core/EI.a (II)Ljava/lang/String;
      // 408: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 40b: ifeq 437
      // 40e: goto 415
      // 411: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 414: athrow
      // 415: aload 12
      // 417: goto 41e
      // 41a: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41d: athrow
      // 41e: invokestatic com/finalshell/core/EI.p (Ljava/lang/String;)Ljava/awt/Color;
      // 421: astore 13
      // 423: aload 13
      // 425: iload 1
      // 426: ifne 435
      // 429: ifnull 437
      // 42c: goto 433
      // 42f: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 432: athrow
      // 433: aload 13
      // 435: astore 8
      // 437: iload 1
      // 438: ifeq 048
      // 43b: iload 5
      // 43d: iload 1
      // 43e: ifne 46c
      // 441: ifeq 46a
      // 444: goto 44b
      // 447: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44a: athrow
      // 44b: iload 6
      // 44d: iload 1
      // 44e: ifne 46c
      // 451: goto 458
      // 454: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 457: athrow
      // 458: ifeq 46a
      // 45b: goto 462
      // 45e: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 461: athrow
      // 462: bipush 3
      // 463: goto 4af
      // 466: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 469: athrow
      // 46a: iload 5
      // 46c: iload 1
      // 46d: ifne 484
      // 470: ifeq 482
      // 473: goto 47a
      // 476: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 479: athrow
      // 47a: bipush 1
      // 47b: goto 4af
      // 47e: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 481: athrow
      // 482: iload 6
      // 484: iload 1
      // 485: ifne 49c
      // 488: ifeq 49a
      // 48b: goto 492
      // 48e: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 491: athrow
      // 492: bipush 2
      // 493: goto 4af
      // 496: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 499: athrow
      // 49a: iload 4
      // 49c: iload 1
      // 49d: ifne 4ab
      // 4a0: ifeq 4ae
      // 4a3: goto 4aa
      // 4a6: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a9: athrow
      // 4aa: bipush 0
      // 4ab: goto 4af
      // 4ae: bipush -1
      // 4af: istore 12
      // 4b1: aload 9
      // 4b3: aload 9
      // 4b5: invokeinterface java/util/List.size ()I 1
      // 4ba: anewarray 86
      // 4bd: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 4c2: checkcast [Lcom/finalshell/ui/model/K6;
      // 4c5: astore 13
      // 4c7: new com/finalshell/core/C8_2
      // 4ca: dup
      // 4cb: aload 3
      // 4cc: new com/finalshell/core/LS3
      // 4cf: dup
      // 4d0: bipush 0
      // 4d1: aload 3
      // 4d2: invokevirtual java/lang/String.length ()I
      // 4d5: iload 12
      // 4d7: aload 7
      // 4d9: aload 8
      // 4db: aload 13
      // 4dd: invokespecial com/finalshell/core/LS3.<init> (IIILjava/awt/Color;Ljava/awt/Color;[Lcom/finalshell/ui/model/K6;)V
      // 4e0: invokespecial com/finalshell/core/C8_2.<init> (Ljava/lang/String;Lcom/finalshell/core/LS3;)V
      // 4e3: areturn
      // 4e4: astore 3
      // 4e5: aconst_null
      // 4e6: areturn
      // 4e7: aconst_null
      // 4e8: areturn
   }

   public static Color p(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/Oj2.g ()Z
      // 03: aload 0
      // 04: ldc_w "("
      // 07: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0a: istore 2
      // 0b: aload 0
      // 0c: ldc_w ")"
      // 0f: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 12: istore 3
      // 13: istore 1
      // 14: iload 2
      // 15: bipush -1
      // 16: iload 1
      // 17: ifeq 2d
      // 1a: if_icmpeq 44
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: iload 3
      // 25: bipush -1
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/EI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: if_icmpeq 44
      // 30: aload 0
      // 31: iload 2
      // 32: bipush 1
      // 33: iadd
      // 34: iload 3
      // 35: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 38: astore 4
      // 3a: aload 4
      // 3c: invokestatic com/finalshell/core/Pb2.f (Ljava/lang/String;)Ljava/awt/Color;
      // 3f: areturn
      // 40: astore 4
      // 42: aconst_null
      // 43: areturn
      // 44: aconst_null
      // 45: areturn
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 14553) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 13;
               break;
            case 1:
               var10000 = 114;
               break;
            case 2:
               var10000 = 127;
               break;
            case 3:
               var10000 = 243;
               break;
            case 4:
               var10000 = 175;
               break;
            case 5:
               var10000 = 6;
               break;
            case 6:
               var10000 = 26;
               break;
            case 7:
               var10000 = 85;
               break;
            case 8:
               var10000 = 47;
               break;
            case 9:
               var10000 = 159;
               break;
            case 10:
               var10000 = 252;
               break;
            case 11:
               var10000 = 156;
               break;
            case 12:
               var10000 = 160;
               break;
            case 13:
               var10000 = 56;
               break;
            case 14:
               var10000 = 35;
               break;
            case 15:
               var10000 = 2;
               break;
            case 16:
               var10000 = 138;
               break;
            case 17:
               var10000 = 74;
               break;
            case 18:
               var10000 = 109;
               break;
            case 19:
               var10000 = 117;
               break;
            case 20:
               var10000 = 199;
               break;
            case 21:
               var10000 = 241;
               break;
            case 22:
               var10000 = 66;
               break;
            case 23:
               var10000 = 189;
               break;
            case 24:
               var10000 = 249;
               break;
            case 25:
               var10000 = 1;
               break;
            case 26:
               var10000 = 184;
               break;
            case 27:
               var10000 = 214;
               break;
            case 28:
               var10000 = 172;
               break;
            case 29:
               var10000 = 206;
               break;
            case 30:
               var10000 = 133;
               break;
            case 31:
               var10000 = 72;
               break;
            case 32:
               var10000 = 193;
               break;
            case 33:
               var10000 = 46;
               break;
            case 34:
               var10000 = 28;
               break;
            case 35:
               var10000 = 121;
               break;
            case 36:
               var10000 = 177;
               break;
            case 37:
               var10000 = 94;
               break;
            case 38:
               var10000 = 92;
               break;
            case 39:
               var10000 = 87;
               break;
            case 40:
               var10000 = 113;
               break;
            case 41:
               var10000 = 123;
               break;
            case 42:
               var10000 = 225;
               break;
            case 43:
               var10000 = 238;
               break;
            case 44:
               var10000 = 99;
               break;
            case 45:
               var10000 = 227;
               break;
            case 46:
               var10000 = 155;
               break;
            case 47:
               var10000 = 90;
               break;
            case 48:
               var10000 = 195;
               break;
            case 49:
               var10000 = 205;
               break;
            case 50:
               var10000 = 93;
               break;
            case 51:
               var10000 = 187;
               break;
            case 52:
               var10000 = 12;
               break;
            case 53:
               var10000 = 48;
               break;
            case 54:
               var10000 = 247;
               break;
            case 55:
               var10000 = 134;
               break;
            case 56:
               var10000 = 67;
               break;
            case 57:
               var10000 = 203;
               break;
            case 58:
               var10000 = 65;
               break;
            case 59:
               var10000 = 60;
               break;
            case 60:
               var10000 = 79;
               break;
            case 61:
               var10000 = 164;
               break;
            case 62:
               var10000 = 236;
               break;
            case 63:
               var10000 = 190;
               break;
            case 64:
               var10000 = 173;
               break;
            case 65:
               var10000 = 104;
               break;
            case 66:
               var10000 = 253;
               break;
            case 67:
               var10000 = 110;
               break;
            case 68:
               var10000 = 37;
               break;
            case 69:
               var10000 = 228;
               break;
            case 70:
               var10000 = 41;
               break;
            case 71:
               var10000 = 63;
               break;
            case 72:
               var10000 = 25;
               break;
            case 73:
               var10000 = 219;
               break;
            case 74:
               var10000 = 135;
               break;
            case 75:
               var10000 = 201;
               break;
            case 76:
               var10000 = 129;
               break;
            case 77:
               var10000 = 30;
               break;
            case 78:
               var10000 = 100;
               break;
            case 79:
               var10000 = 20;
               break;
            case 80:
               var10000 = 174;
               break;
            case 81:
               var10000 = 115;
               break;
            case 82:
               var10000 = 122;
               break;
            case 83:
               var10000 = 220;
               break;
            case 84:
               var10000 = 242;
               break;
            case 85:
               var10000 = 45;
               break;
            case 86:
               var10000 = 62;
               break;
            case 87:
               var10000 = 244;
               break;
            case 88:
               var10000 = 10;
               break;
            case 89:
               var10000 = 81;
               break;
            case 90:
               var10000 = 186;
               break;
            case 91:
               var10000 = 226;
               break;
            case 92:
               var10000 = 139;
               break;
            case 93:
               var10000 = 183;
               break;
            case 94:
               var10000 = 197;
               break;
            case 95:
               var10000 = 147;
               break;
            case 96:
               var10000 = 202;
               break;
            case 97:
               var10000 = 136;
               break;
            case 98:
               var10000 = 176;
               break;
            case 99:
               var10000 = 204;
               break;
            case 100:
               var10000 = 149;
               break;
            case 101:
               var10000 = 128;
               break;
            case 102:
               var10000 = 71;
               break;
            case 103:
               var10000 = 16;
               break;
            case 104:
               var10000 = 40;
               break;
            case 105:
               var10000 = 76;
               break;
            case 106:
               var10000 = 0;
               break;
            case 107:
               var10000 = 9;
               break;
            case 108:
               var10000 = 131;
               break;
            case 109:
               var10000 = 157;
               break;
            case 110:
               var10000 = 96;
               break;
            case 111:
               var10000 = 178;
               break;
            case 112:
               var10000 = 75;
               break;
            case 113:
               var10000 = 216;
               break;
            case 114:
               var10000 = 36;
               break;
            case 115:
               var10000 = 213;
               break;
            case 116:
               var10000 = 70;
               break;
            case 117:
               var10000 = 163;
               break;
            case 118:
               var10000 = 19;
               break;
            case 119:
               var10000 = 132;
               break;
            case 120:
               var10000 = 254;
               break;
            case 121:
               var10000 = 171;
               break;
            case 122:
               var10000 = 8;
               break;
            case 123:
               var10000 = 111;
               break;
            case 124:
               var10000 = 224;
               break;
            case 125:
               var10000 = 3;
               break;
            case 126:
               var10000 = 200;
               break;
            case 127:
               var10000 = 215;
               break;
            case 128:
               var10000 = 150;
               break;
            case 129:
               var10000 = 69;
               break;
            case 130:
               var10000 = 209;
               break;
            case 131:
               var10000 = 231;
               break;
            case 132:
               var10000 = 245;
               break;
            case 133:
               var10000 = 124;
               break;
            case 134:
               var10000 = 140;
               break;
            case 135:
               var10000 = 218;
               break;
            case 136:
               var10000 = 235;
               break;
            case 137:
               var10000 = 107;
               break;
            case 138:
               var10000 = 82;
               break;
            case 139:
               var10000 = 77;
               break;
            case 140:
               var10000 = 33;
               break;
            case 141:
               var10000 = 239;
               break;
            case 142:
               var10000 = 251;
               break;
            case 143:
               var10000 = 55;
               break;
            case 144:
               var10000 = 144;
               break;
            case 145:
               var10000 = 17;
               break;
            case 146:
               var10000 = 162;
               break;
            case 147:
               var10000 = 89;
               break;
            case 148:
               var10000 = 130;
               break;
            case 149:
               var10000 = 7;
               break;
            case 150:
               var10000 = 112;
               break;
            case 151:
               var10000 = 246;
               break;
            case 152:
               var10000 = 44;
               break;
            case 153:
               var10000 = 64;
               break;
            case 154:
               var10000 = 52;
               break;
            case 155:
               var10000 = 145;
               break;
            case 156:
               var10000 = 43;
               break;
            case 157:
               var10000 = 31;
               break;
            case 158:
               var10000 = 54;
               break;
            case 159:
               var10000 = 4;
               break;
            case 160:
               var10000 = 11;
               break;
            case 161:
               var10000 = 103;
               break;
            case 162:
               var10000 = 98;
               break;
            case 163:
               var10000 = 108;
               break;
            case 164:
               var10000 = 97;
               break;
            case 165:
               var10000 = 83;
               break;
            case 166:
               var10000 = 120;
               break;
            case 167:
               var10000 = 208;
               break;
            case 168:
               var10000 = 59;
               break;
            case 169:
               var10000 = 21;
               break;
            case 170:
               var10000 = 233;
               break;
            case 171:
               var10000 = 58;
               break;
            case 172:
               var10000 = 61;
               break;
            case 173:
               var10000 = 78;
               break;
            case 174:
               var10000 = 57;
               break;
            case 175:
               var10000 = 126;
               break;
            case 176:
               var10000 = 153;
               break;
            case 177:
               var10000 = 151;
               break;
            case 178:
               var10000 = 234;
               break;
            case 179:
               var10000 = 237;
               break;
            case 180:
               var10000 = 137;
               break;
            case 181:
               var10000 = 142;
               break;
            case 182:
               var10000 = 166;
               break;
            case 183:
               var10000 = 210;
               break;
            case 184:
               var10000 = 188;
               break;
            case 185:
               var10000 = 194;
               break;
            case 186:
               var10000 = 230;
               break;
            case 187:
               var10000 = 88;
               break;
            case 188:
               var10000 = 125;
               break;
            case 189:
               var10000 = 86;
               break;
            case 190:
               var10000 = 141;
               break;
            case 191:
               var10000 = 106;
               break;
            case 192:
               var10000 = 95;
               break;
            case 193:
               var10000 = 118;
               break;
            case 194:
               var10000 = 143;
               break;
            case 195:
               var10000 = 196;
               break;
            case 196:
               var10000 = 211;
               break;
            case 197:
               var10000 = 80;
               break;
            case 198:
               var10000 = 51;
               break;
            case 199:
               var10000 = 250;
               break;
            case 200:
               var10000 = 53;
               break;
            case 201:
               var10000 = 102;
               break;
            case 202:
               var10000 = 223;
               break;
            case 203:
               var10000 = 169;
               break;
            case 204:
               var10000 = 68;
               break;
            case 205:
               var10000 = 14;
               break;
            case 206:
               var10000 = 24;
               break;
            case 207:
               var10000 = 191;
               break;
            case 208:
               var10000 = 146;
               break;
            case 209:
               var10000 = 248;
               break;
            case 210:
               var10000 = 38;
               break;
            case 211:
               var10000 = 18;
               break;
            case 212:
               var10000 = 255;
               break;
            case 213:
               var10000 = 22;
               break;
            case 214:
               var10000 = 232;
               break;
            case 215:
               var10000 = 84;
               break;
            case 216:
               var10000 = 116;
               break;
            case 217:
               var10000 = 34;
               break;
            case 218:
               var10000 = 229;
               break;
            case 219:
               var10000 = 39;
               break;
            case 220:
               var10000 = 170;
               break;
            case 221:
               var10000 = 152;
               break;
            case 222:
               var10000 = 198;
               break;
            case 223:
               var10000 = 15;
               break;
            case 224:
               var10000 = 182;
               break;
            case 225:
               var10000 = 29;
               break;
            case 226:
               var10000 = 32;
               break;
            case 227:
               var10000 = 185;
               break;
            case 228:
               var10000 = 207;
               break;
            case 229:
               var10000 = 27;
               break;
            case 230:
               var10000 = 148;
               break;
            case 231:
               var10000 = 101;
               break;
            case 232:
               var10000 = 221;
               break;
            case 233:
               var10000 = 23;
               break;
            case 234:
               var10000 = 179;
               break;
            case 235:
               var10000 = 180;
               break;
            case 236:
               var10000 = 73;
               break;
            case 237:
               var10000 = 240;
               break;
            case 238:
               var10000 = 50;
               break;
            case 239:
               var10000 = 161;
               break;
            case 240:
               var10000 = 217;
               break;
            case 241:
               var10000 = 119;
               break;
            case 242:
               var10000 = 42;
               break;
            case 243:
               var10000 = 5;
               break;
            case 244:
               var10000 = 154;
               break;
            case 245:
               var10000 = 222;
               break;
            case 246:
               var10000 = 167;
               break;
            case 247:
               var10000 = 168;
               break;
            case 248:
               var10000 = 212;
               break;
            case 249:
               var10000 = 91;
               break;
            case 250:
               var10000 = 49;
               break;
            case 251:
               var10000 = 165;
               break;
            case 252:
               var10000 = 158;
               break;
            case 253:
               var10000 = 181;
               break;
            case 254:
               var10000 = 105;
               break;
            default:
               var10000 = 192;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5227;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[18];
      int var11 = 0;
      String var10 = "/\u009b\u008bHÔõL`\u009a\u001a\nI§µ/áÈ[\u0001µN\u0006:µ³Ým`\u0003\u009aÙý\u0002²D\u0004î¥\u0004ß\u0003!Ò\u0098\n@\u0089\u0001+D\u0087ïè#s\u000b\u001e¿\u007f´ÜuG\u0090¼\u008fZ\u0004¦eG·\tÚ\u008eõ\u0084Ì¦|É\u008d\nLýÿj\u0082óT«|R\u0005é\u0005óÕb\u0002Z^\u0005â\u0094î\u0082q\u0002§ö";
      int var12 = "/\u009b\u008bHÔõL`\u009a\u001a\nI§µ/áÈ[\u0001µN\u0006:µ³Ým`\u0003\u009aÙý\u0002²D\u0004î¥\u0004ß\u0003!Ò\u0098\n@\u0089\u0001+D\u0087ïè#s\u000b\u001e¿\u007f´ÜuG\u0090¼\u008fZ\u0004¦eG·\tÚ\u008eõ\u0084Ì¦|É\u008d\nLýÿj\u0082óT«|R\u0005é\u0005óÕb\u0002Z^\u0005â\u0094î\u0082q\u0002§ö"
         .length();
      char var9 = '\n';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 124;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 106;
                        break;
                     case 1:
                        var65 = 75;
                        break;
                     case 2:
                        var65 = 111;
                        break;
                     case 3:
                        var65 = 103;
                        break;
                     case 4:
                        var65 = 33;
                        break;
                     case 5:
                        var65 = 70;
                        break;
                     default:
                        var65 = 84;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[18];
                     long var0 = 6529028561496559547L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "òû¨æ\u009a\u008f séòò\u007fbDõÁ AoøÛ*½$u½OO \u009dÁ\u0091bF$ùsè}TÆ\b\u0092«dËÐV";
                     int var5 = "òû¨æ\u009a\u008f séòò\u007fbDõÁ AoøÛ*½$u½OO \u009dÁ\u0091bF$ùsè}TÆ\b\u0092«dËÐV".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[8];
                                    J = new Es2();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\b\u0003;\u000f-\u008eçm!Z\u00857(ß\u0010À";
                                 var5 = "\b\u0003;\u000f-\u008eçm!Z\u00857(ß\u0010À".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "Z\u008b\u0096|Ù\u0094\f\u001c\u008e¬¯~\u0084½\u001f\u0089Âø%";
                  var12 = "Z\u008b\u0096|Ù\u0094\f\u001c\u008e¬¯~\u0084½\u001f\u0089Âø%".length();
                  var9 = 6;
                  var17 = -1;
            }

            var10000 = 127;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





